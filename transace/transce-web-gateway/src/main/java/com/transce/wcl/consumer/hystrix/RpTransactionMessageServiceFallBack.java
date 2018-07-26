package com.transce.wcl.consumer.hystrix;

import org.springframework.stereotype.Component;

import com.transce.wcl.consumer.service.RpTransactionMessageServiceInterface;
import com.transce.wcl.message.entity.RpTransactionMessage;
import com.transce.wcl.message.exceptions.MessageBizException;
@Component
public class RpTransactionMessageServiceFallBack implements RpTransactionMessageServiceInterface {

	@Override
	public int saveMessageWaitingConfirm(RpTransactionMessage rpTransactionMessage) throws MessageBizException {
		return 0;
	}

	@Override
	public void confirmAndSendMessage(String messageId) throws MessageBizException {
		
	}

}
