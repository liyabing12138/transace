package com.transce.wcl.consumer.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.transce.wcl.consumer.service.RpTransactionMessageServiceInterface;

/**
 * 创建订单
 *  
 */
@Controller
@RequestMapping(value = "/scanPay")
public class ScanPayController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScanPayController.class);

    @Resource
   	private RpTransactionMessageServiceInterface messageServiceInterface;
	
    
    
    
}
