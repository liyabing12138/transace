package com.transce.wcl.message.service;

import java.io.Serializable;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.message.entity.RpTransactionMessage;
import com.transce.wcl.message.exceptions.MessageBizException;

@RequestMapping("/transaction-message")
public interface RpTransactionMessageService<T, PK extends Serializable> {

	/**
	 * 预存储消息. 
	 */
	@RequestMapping(value = "/saveMessageWaitingConfirm", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public int saveMessageWaitingConfirm(@RequestBody RpTransactionMessage rpTransactionMessage) throws MessageBizException;
	
	
	/**
	 * 确认并发送消息.
	 */
	@RequestMapping(value = "/confirmAndSendMessage", method = RequestMethod.POST)
	public void confirmAndSendMessage(@RequestParam("messageId") String messageId  ) throws MessageBizException;

}
