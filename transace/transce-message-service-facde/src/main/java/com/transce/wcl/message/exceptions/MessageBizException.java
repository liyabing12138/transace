/*
 * ====================================================================
 * 《分布式事务解决方案的设计与实现》视频教程 
 * 讲师：长海，邮箱 563169405@qq.com，qq交流群 731882431
 * 课程地址：https://edu.csdn.net/course/detail/7567?pre_view=1
 * ====================================================================
 */
package com.transce.wcl.message.exceptions;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.common.core.exception.BizException;

public class MessageBizException extends BizException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3536909333010163563L;

	/** 保存的消息为空 **/
	public static final int SAVA_MESSAGE_IS_NULL = 8001;
	
	/** 消息的消费队列为空 **/
	public static final int MESSAGE_CONSUMER_QUEUE_IS_NULL = 8002;

	private static final Log LOG = LogFactory.getLog(MessageBizException.class);

	public MessageBizException() {
	}

	public MessageBizException(int code, String msgFormat, Object... args) {
		super(code, msgFormat, args);
	}

	public MessageBizException(int code, String msg) {
		super(code, msg);
	}

	public MessageBizException print() {
		LOG.info("==>BizException, code:" + this.code + ", msg:" + this.msg);
		return this;
	}
}
