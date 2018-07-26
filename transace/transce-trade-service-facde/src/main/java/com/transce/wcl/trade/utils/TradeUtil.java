package com.transce.wcl.trade.utils;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pay.common.core.exception.BizException;
import com.pay.common.core.utils.DateUtils;

public class TradeUtil {

	
	private static final Logger LOG = LoggerFactory.getLogger(TradeUtil.class);

	/** 银行订单号 **/
	private static final String BANK_ORDER_NO_PREFIX = "6666";
	
	/** 支付流水号前缀 **/
	private static final String TRX_NO_PREFIX = "7777";
	
	
	/**
	 * 获取支付流水号
	 **/
	public static String buildTrxNo() {
		
		// 获取编号序列
		String trxNoSeq = null;
		String trxNo = null;
		
		try {
			// 获取用户编号序列，这里为了简化使用了时间戳，存在并发问题，实际使用时可以换成redis
			trxNoSeq = String.valueOf(System.currentTimeMillis());
			String dateString = DateUtils.toString(new Date(), "yyyyMMdd");
			trxNo = TRX_NO_PREFIX + dateString + trxNoSeq;
		} catch (Exception e) {
			LOG.error("生成用户编号异常：", e);
			throw BizException.DB_GET_SEQ_NEXT_VALUE_ERROR;
		}
		if (StringUtils.isEmpty(trxNo)) {
			throw BizException.DB_GET_SEQ_NEXT_VALUE_ERROR;
		}
		
		return trxNo;
	}
	
	/**
	 * 获取银行订单号
	 **/
	public static String buildBankOrderNo() {
		// 获取编号序列
		String bankOrderNoSeq = null;
		String bankOrderNo = null;
		
		try {			
//			bankOrderNoSeq = super.getSqlSession().selectOne(getStatement("buildBankOrderNoSeq"));
			
			// 这里为了简化使用了时间戳，存在并发问题，实际开发中可以使用redis实现
			bankOrderNoSeq = String.valueOf(System.currentTimeMillis());
			String dateString = DateUtils.toString(new Date(), "yyyyMMdd");
			bankOrderNo = BANK_ORDER_NO_PREFIX + dateString + bankOrderNoSeq;
		} catch (Exception e) {
			LOG.error("生成用户编号异常：", e);
			throw BizException.DB_GET_SEQ_NEXT_VALUE_ERROR;
		}
		
		if (StringUtils.isEmpty(bankOrderNo)) {
			throw BizException.DB_GET_SEQ_NEXT_VALUE_ERROR;
		}
		
		return bankOrderNo;
	}
	
	
}
