package com.transce.wcl.trade.serviceImpl;

import java.math.BigDecimal;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pay.common.core.enums.PayTypeEnum;
import com.pay.common.core.enums.PayWayEnum;
import com.pay.common.core.enums.TrxTypeEnum;
import com.pay.common.core.utils.DateUtils;
import com.pay.common.core.utils.StringUtil;
import com.pay.common.core.utils.WeixinConfigUtil;
import com.transce.wcl.trade.entity.RpTradePaymentOrder;
import com.transce.wcl.trade.entity.RpTradePaymentRecord;
import com.transce.wcl.trade.enums.OrderFromEnum;
import com.transce.wcl.trade.enums.TradeStatusEnum;
import com.transce.wcl.trade.exceptions.TradeBizException;
import com.transce.wcl.trade.mapper.RpTradePaymentOrderMapper;
import com.transce.wcl.trade.mapper.RpTradePaymentRecordMapper;
import com.transce.wcl.trade.service.RpPayWayServiceInterface;
import com.transce.wcl.trade.service.RpTradePaymentOrderService;
import com.transce.wcl.trade.service.RpUserInfoServiceInterface;
import com.transce.wcl.trade.service.RpUserPayConfigServiceInterface;
import com.transce.wcl.trade.utils.TradeUtil;
import com.transce.wcl.trade.vo.ScanPayResultVo;
import com.transce.wcl.user.entity.RpPayWay;
import com.transce.wcl.user.entity.RpUserInfo;
import com.transce.wcl.user.entity.RpUserPayConfig;
import com.transce.wcl.user.exceptions.UserBizException;

/**
 * 基本CURD操作在MybatisBaseServiceImpl中实现 否则自行声明接口，实现方法
 */
@RestController
public class RpTradePaymentOrderServiceImpl  implements RpTradePaymentOrderService {
	private static final Logger LOG = LoggerFactory.getLogger(RpTradePaymentOrderServiceImpl.class);
	
    @Autowired
    private RpTradePaymentOrderMapper paymentOrderMapper;    
	
    @Autowired
    private RpTradePaymentRecordMapper paymentRecordMapper;
    
    @Autowired
    private RpPayWayServiceInterface payWayServiceInterface;
    
    @Autowired
    private RpUserInfoServiceInterface pUserInfoServiceInterface;
    
    @Autowired
    private RpUserPayConfigServiceInterface pUserPayConfigServiceInterface;
    
	@Override
	public ScanPayResultVo initDirectScanPay(String payKey, String productName, String orderNo, Date orderDate,
			Date orderTime, BigDecimal orderPrice, String payWayCode, String orderIp, Integer orderPeriod,
			String returnUrl, String notifyUrl, String remark) throws TradeBizException {
		
		LOG.info("接收到订单数据{}", orderNo);
		RpUserPayConfig rpUserPayConfig = pUserPayConfigServiceInterface.getByPayKey(payKey);
		if (rpUserPayConfig == null) {
			throw new UserBizException(UserBizException.USER_PAY_CONFIG_ERRPR, "用户支付配置有误");
		}

		String merchantNo = rpUserPayConfig.getUserNo();// 商户编号
		RpUserInfo rpUserInfo = pUserInfoServiceInterface.getDataByMerchentNo(merchantNo);
		if (rpUserInfo == null) {
			LOG.error("用户不存在");
			throw new UserBizException(UserBizException.USER_IS_NULL, "用户不存在");
		}

		// 先判断支付订单是否已存在
		RpTradePaymentOrder pTradePaymentOrder = new RpTradePaymentOrder();
		pTradePaymentOrder.setMerchantNo(merchantNo);
		pTradePaymentOrder.setMerchantOrderNo(orderNo);
		RpTradePaymentOrder rpTradePaymentOrder = (RpTradePaymentOrder) paymentOrderMapper.getByParams(pTradePaymentOrder);
		if (rpTradePaymentOrder == null) {
			// 订单不存在则创建
			rpTradePaymentOrder = sealRpTradePaymentOrder(merchantNo, rpUserInfo.getUserName(), productName, orderNo,
					orderDate, orderTime, orderPrice, payWayCode, PayWayEnum.getEnum(payWayCode).getDesc(),
					rpUserPayConfig.getFundIntoType(), orderIp, orderPeriod, returnUrl, notifyUrl, remark);
			paymentOrderMapper.save(rpTradePaymentOrder);
			LOG.info("订单创建完成，orderNo:" + orderNo);
			
		} else {
			// 订单存在
			if (rpTradePaymentOrder.getOrderAmount().compareTo(orderPrice.longValue()) != 0) {
				throw new TradeBizException(TradeBizException.TRADE_ORDER_ERROR, "错误的订单");
			}

			if (TradeStatusEnum.SUCCESS.name().equals(rpTradePaymentOrder.getStatus())) {
				throw new TradeBizException(TradeBizException.TRADE_ORDER_ERROR, "订单已支付成功,无需重复支付");
			}
		}

		// 根据支付产品及支付方式获取费率
		RpPayWay payWay = payWayServiceInterface.getByPayWayTypeCode(rpUserPayConfig.getProductCode(), payWayCode,
				PayTypeEnum.TEST_PAY_HTTP_CLIENT.name());
		if (payWay == null) {
			LOG.error("用户支付配置有误");
			throw new UserBizException(UserBizException.USER_PAY_CONFIG_ERRPR, "用户支付配置有误");
		}
		// 通过支付订单及商户费率生成支付记录		
		return getScanPayResultVo(rpTradePaymentOrder, payWay);
	}

	
	/**
	 * 支付订单实体封装
	 * @param merchantNo 商户编号
	 * @param merchantName 商户名称
	 * @param productName 产品名称
	 * @param orderNo 商户订单号
	 * @param orderDate 下单日期
	 * @param orderTime 下单时间
	 * @param orderPrice 订单金额
	 * @param payWay 支付方式
	 * @param payWayName 支付方式名称
	 * @param fundIntoType 资金流入类型
	 * @param orderIp 下单IP
	 * @param orderPeriod 订单有效期
	 * @param returnUrl 页面通知地址
	 * @param notifyUrl 后台通知地址
	 * @param remark 支付备注
	 * @return
	 */
	private RpTradePaymentOrder sealRpTradePaymentOrder(String merchantNo, String merchantName, String productName,
			String orderNo, Date orderDate, Date orderTime, BigDecimal orderPrice, String payWay, String payWayName,
			String fundIntoType, String orderIp, Integer orderPeriod, String returnUrl, String notifyUrl,
			String remark) {

		LOG.info("sealRpTradePaymentOrder封装数据开始");
		RpTradePaymentOrder rpTradePaymentOrder = new RpTradePaymentOrder();
		rpTradePaymentOrder.setProductName(productName);// 商品名称
		
		if (StringUtil.isEmpty(orderNo)) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "订单号错误");
		}
		rpTradePaymentOrder.setMerchantOrderNo(orderNo);// 订单号

		if (orderPrice == null || orderPrice.doubleValue() <= 0) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "订单金额错误");
		}
		rpTradePaymentOrder.setOrderAmount(orderPrice.longValue());// 订单金额

		if (StringUtil.isEmpty(merchantName)) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "商户名称错误");
		}
		rpTradePaymentOrder.setMerchantName(merchantName);// 商户名称

		if (StringUtil.isEmpty(merchantNo)) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "商户编号错误");
		}
		rpTradePaymentOrder.setMerchantNo(merchantNo);// 商户编号

		if (orderDate == null) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "下单日期错误");
		}
		rpTradePaymentOrder.setOrderDate(orderDate);// 下单日期

		if (orderTime == null) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "下单时间错误");
		}
		rpTradePaymentOrder.setOrderTime(orderTime);// 下单时间
		
		rpTradePaymentOrder.setOrderIp(orderIp);// 下单IP
		rpTradePaymentOrder.setOrderRefererUrl("");// 下单前页面

		if (StringUtil.isEmpty(returnUrl)) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "页面通知错误");
		}
		rpTradePaymentOrder.setReturnUrl(returnUrl);// 页面通知地址

		if (StringUtil.isEmpty(notifyUrl)) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "后台通知错误");
		}
		rpTradePaymentOrder.setNotifyUrl(notifyUrl);// 后台通知地址

		if (orderPeriod == null || orderPeriod <= 0) {
			throw new TradeBizException(TradeBizException.TRADE_PARAM_ERROR, "订单有效期错误");
		}
		rpTradePaymentOrder.setOrderPeriod(orderPeriod);// 订单有效期

		Date expireTime = DateUtils.addMinute(orderTime, orderPeriod);// 订单过期时间
		rpTradePaymentOrder.setExpireTime(expireTime);// 订单过期时间
		rpTradePaymentOrder.setPayWayCode(payWay);// 支付通道编码
		rpTradePaymentOrder.setPayWayName(payWayName);// 支付通道名称
		rpTradePaymentOrder.setStatus(TradeStatusEnum.WAITING_PAYMENT.name());// 订单状态 等待支付

		rpTradePaymentOrder.setPayTypeCode(PayTypeEnum.TEST_PAY_HTTP_CLIENT.name());// 支付类型
		rpTradePaymentOrder.setPayTypeName(PayTypeEnum.TEST_PAY_HTTP_CLIENT.getDesc());// 支付方式
		rpTradePaymentOrder.setFundIntoType(fundIntoType);// 资金流入方向

		rpTradePaymentOrder.setRemark(remark);// 支付备注
		LOG.info("sealRpTradePaymentOrder封装数据结束");
		return rpTradePaymentOrder;
	}

	
	/**
	 * 通过支付订单及商户费率生成支付记录
	 * 
	 * @param rpTradePaymentOrder 支付订单
	 * @param payWay 商户支付配置
	 * @return
	 */
	private ScanPayResultVo getScanPayResultVo(RpTradePaymentOrder rpTradePaymentOrder, RpPayWay payWay) {

		ScanPayResultVo scanPayResultVo = new ScanPayResultVo();

		// 创建支付记录
		RpTradePaymentRecord rpTradePaymentRecord = sealRpTradePaymentRecord(rpTradePaymentOrder.getMerchantNo(),
				rpTradePaymentOrder.getMerchantName(), rpTradePaymentOrder.getProductName(),
				rpTradePaymentOrder.getMerchantOrderNo(), rpTradePaymentOrder.getOrderAmount().longValue(), payWay.getPayWayCode(),
				payWay.getPayWayName(), rpTradePaymentOrder.getFundIntoType(), BigDecimal.valueOf(payWay.getPayRate()),
				rpTradePaymentOrder.getOrderIp(), rpTradePaymentOrder.getReturnUrl(),
				rpTradePaymentOrder.getNotifyUrl(), rpTradePaymentOrder.getRemark());
		paymentRecordMapper.save(rpTradePaymentRecord);
		LOG.info("支付记录创建完成,流水号:" + rpTradePaymentRecord.getBankTrxNo());
		return scanPayResultVo;
	}
	
	
	
	/**
	 * 封装支付流水记录实体
	 * 
	 * @param merchantNo 商户编号
	 * @param merchantName 商户名称
	 * @param productName 产品名称
	 * @param orderNo 商户订单号
	 * @param orderPrice 订单金额
	 * @param payWay 支付方式编码
	 * @param payWayName 支付方式名称
	 * @param fundIntoType 资金流入方向
	 * @param feeRate 支付费率
	 * @param orderIp 订单IP
	 * @param returnUrl 页面通知地址
	 * @param notifyUrl 后台通知地址
	 * @param remark 备注
	 * @return
	 */
	private RpTradePaymentRecord sealRpTradePaymentRecord(String merchantNo, String merchantName, String productName,
			String orderNo, BigDecimal orderPrice, String payWay, String payWayName, String fundIntoType,
			BigDecimal feeRate, String orderIp, String returnUrl, String notifyUrl, String remark) {

		LOG.info("sealRpTradePaymentRecord封装数据开始");
		RpTradePaymentRecord rpTradePaymentRecord = new RpTradePaymentRecord();
		rpTradePaymentRecord.setProductName(productName);// 产品名称
		rpTradePaymentRecord.setMerchantOrderNo(orderNo);// 产品编号

		String trxNo = TradeUtil.buildTrxNo();
		rpTradePaymentRecord.setTrxNo(trxNo);// 支付流水号

		String bankOrderNo = TradeUtil.buildBankOrderNo();
		
		// 通过httpclient模拟的支付，让银行订单号与商户订单号相同，方便做处理
		bankOrderNo = orderNo;
		
		rpTradePaymentRecord.setBankOrderNo(bankOrderNo);// 银行订单号
		rpTradePaymentRecord.setMerchantName(merchantName);
		rpTradePaymentRecord.setMerchantNo(merchantNo);// 商户编号
		rpTradePaymentRecord.setOrderIp(orderIp);// 下单IP
		rpTradePaymentRecord.setOrderRefererUrl("");// 下单前页面
		rpTradePaymentRecord.setReturnUrl(returnUrl);// 页面通知地址
		rpTradePaymentRecord.setNotifyUrl(notifyUrl);// 后台通知地址
		rpTradePaymentRecord.setPayWayCode(payWay);// 支付通道编码
		rpTradePaymentRecord.setPayWayName(payWayName);// 支付通道名称
		rpTradePaymentRecord.setTrxType(TrxTypeEnum.EXPENSE.name());// 交易类型
		rpTradePaymentRecord.setOrderFrom(OrderFromEnum.USER_EXPENSE.name());// 订单来源
		rpTradePaymentRecord.setOrderAmount(orderPrice.longValue());// 订单金额
		rpTradePaymentRecord.setStatus(TradeStatusEnum.WAITING_PAYMENT.name());// 等待支付

		rpTradePaymentRecord.setPayTypeCode(PayTypeEnum.TEST_PAY_HTTP_CLIENT.name());// 支付类型
		rpTradePaymentRecord.setPayTypeName(PayTypeEnum.TEST_PAY_HTTP_CLIENT.getDesc());// 支付方式
		
		rpTradePaymentRecord.setFundIntoType(fundIntoType);// 资金流入方向

		BigDecimal orderAmount = new BigDecimal(rpTradePaymentRecord.getOrderAmount());// 订单金额
		// 平台收入 = 订单金额 * 支付费率(设置的费率除以100为真实费率)
		BigDecimal platIncome = orderAmount.multiply(feeRate).divide(BigDecimal.valueOf(100), 2,
				BigDecimal.ROUND_HALF_UP); 
		
		// 平台成本 =订单金额 * 微信费率(设置的费率除以100为真实费率)
		BigDecimal platCost = orderAmount
				.multiply(BigDecimal.valueOf(Double.valueOf(WeixinConfigUtil.readConfig("pay_rate"))))
				.divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_HALF_UP);
		BigDecimal platProfit = platIncome.subtract(platCost);// 平台利润 = 平台收入- 平台成本

		rpTradePaymentRecord.setFeeRate(feeRate.longValue());// 费率
		rpTradePaymentRecord.setPlatCost(platCost.longValue());// 平台成本
		rpTradePaymentRecord.setPlatIncome(platIncome.longValue());// 平台收入
		rpTradePaymentRecord.setPlatProfit(platProfit.longValue());// 平台利润

		LOG.info("sealRpTradePaymentRecord封装数据结束");
		return rpTradePaymentRecord;
	}
	
}
