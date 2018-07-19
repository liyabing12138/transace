package com.transce.wcl.message.serviceImpl;


import org.springframework.web.bind.annotation.RestController;

import com.transce.wcl.message.entity.RpTransactionMessage;
import com.transce.wcl.message.exceptions.MessageBizException;
import com.transce.wcl.message.service.RpTransactionMessageService;

@RestController
public class RpTransactionMessageServiceImpl implements RpTransactionMessageService {

	@Override
	public int saveMessageWaitingConfirm(RpTransactionMessage rpTransactionMessage) throws MessageBizException {
		
		
		return 0;
	}

}
