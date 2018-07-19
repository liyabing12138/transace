package com.transce.wcl.message.service;

import com.transce.wcl.message.entity.RpTransactionMessage;
import com.transce.wcl.message.exceptions.MessageBizException;

public interface RpTransactionMessageService {

	/**
	 * 预存储消息. 
	 */
	public int saveMessageWaitingConfirm(RpTransactionMessage rpTransactionMessage) throws MessageBizException;
	
}
