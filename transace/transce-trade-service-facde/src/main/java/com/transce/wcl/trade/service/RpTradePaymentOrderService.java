package com.transce.wcl.trade.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.trade.exceptions.TradeBizException;
import com.transce.wcl.trade.vo.ScanPayResultVo;

/**
 * RpTradePaymentOrderService接口
 */
@RequestMapping("/transaction-trade")
public interface RpTradePaymentOrderService <T, PK extends Serializable> {

	
    /**
     * 初始化直连扫码支付数据,直连扫码支付初始化方法规则
     * 1:根据(商户编号 + 商户订单号)确定订单是否存在
     * 1.1:如果订单不存在,创建支付订单
     * 2:创建支付记录
     * 3:根据相应渠道方法
     * 4:调转到相应支付渠道扫码界面
     * @param payKey    商户支付Key
     * @param productName   产品名称
     * @param orderNo   商户订单号
     * @param orderDate 下单日期
     * @param orderTime 下单时间
     * @param orderPrice    订单金额(元)
     * @param payWayCode    支付方式
     * @param orderIp   下单IP
     * @param orderPeriod   订单有效期(分钟)
     * @param returnUrl 支付结果页面通知地址
     * @param notifyUrl 支付结果后台通知地址
     * @param remark    支付备注
     * @param field1    扩展字段1
     * @param field2    扩展字段2
     * @param field3    扩展字段3
     * @param field4    扩展字段4
     * @param field5    扩展字段5
     */
	@RequestMapping(value = "/initDirectScanPay", method = RequestMethod.GET)
    public ScanPayResultVo initDirectScanPay(@RequestParam("payKey")String payKey, @RequestParam("productName")String productName, @RequestParam("orderNo")String orderNo,@RequestParam("orderDate") Date orderDate, @RequestParam("orderTime")Date orderTime, @RequestParam("orderPrice")BigDecimal orderPrice,@RequestParam("payWayCode") String payWayCode,@RequestParam("orderIp") String orderIp, @RequestParam("orderPeriod")Integer orderPeriod, @RequestParam("returnUrl")String returnUrl
            , @RequestParam("notifyUrl")String notifyUrl, @RequestParam("remark")String remark) throws TradeBizException;

	
	
	
}
