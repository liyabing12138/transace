package com.transce.wcl.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.consumer.hystrix.RpTransactionMessageServiceFallBack;
import com.transce.wcl.message.entity.RpTransactionMessage;
import com.transce.wcl.message.exceptions.MessageBizException;

@FeignClient(name = "transce-message-service",fallback=RpTransactionMessageServiceFallBack.class)
public interface RpTransactionMessageServiceInterface {

	

	/**
	 * 预存储消息. 
	 */
	@RequestMapping(value = "/transaction-message/saveMessageWaitingConfirm", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public int saveMessageWaitingConfirm(@RequestBody RpTransactionMessage rpTransactionMessage) throws MessageBizException;
	
	
	/**
	 * 确认并发送消息.
	 */
	@RequestMapping(value = "/transaction-message/confirmAndSendMessage", method = RequestMethod.POST)
	public void confirmAndSendMessage(@RequestParam("messageId") String messageId  ) throws MessageBizException;
	
}
