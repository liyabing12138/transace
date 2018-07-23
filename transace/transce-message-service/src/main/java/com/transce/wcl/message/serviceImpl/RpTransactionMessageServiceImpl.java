package com.transce.wcl.message.serviceImpl;


import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pay.common.core.enums.PublicEnum;
import com.pay.common.core.utils.StringUtil;
import com.transce.wcl.message.entity.RpTransactionMessage;
import com.transce.wcl.message.enums.MessageStatusEnum;
import com.transce.wcl.message.exceptions.MessageBizException;
import com.transce.wcl.message.mapper.RpTransactionMessageMapper;
import com.transce.wcl.message.service.RpTransactionMessageService;

@RestController
public class RpTransactionMessageServiceImpl implements RpTransactionMessageService {
	
    @Autowired
    private RpTransactionMessageMapper pTransactionMessageMapper;
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${mq.config.exchange}")
	private String exchange;
    
    
	@Override
	public int saveMessageWaitingConfirm(@RequestBody RpTransactionMessage message) throws MessageBizException {
		if (message == null) {
			throw new MessageBizException(MessageBizException.SAVA_MESSAGE_IS_NULL, "保存的消息为空");
		}
		
		if (StringUtil.isEmpty(message.getConsumerQueue())) {
			throw new MessageBizException(MessageBizException.MESSAGE_CONSUMER_QUEUE_IS_NULL, "消息的消费队列不能为空 ");
		}
		
		message.setEditTime(new Date());
		message.setStatus(MessageStatusEnum.WAITING_CONFIRM.name());
		message.setAreadlyDead(PublicEnum.NO.name());
		message.setMessageSendTimes(0);
		return pTransactionMessageMapper.save(message);
	}

	@Override
	public void confirmAndSendMessage(String messageId) throws MessageBizException {
		RpTransactionMessage message = (RpTransactionMessage) pTransactionMessageMapper.getByMessageId(messageId);
		
		if (message == null) {
			throw new MessageBizException(MessageBizException.SAVA_MESSAGE_IS_NULL, "根据消息id查找的消息为空");
		}
		message.setStatus(MessageStatusEnum.SENDING.name());
		message.setEditTime(new Date());
		pTransactionMessageMapper.update(message);
		this.rabbitTemplate.convertAndSend(this.exchange,message.getConsumerQueue(),message.getMessageBody());
	}

}
