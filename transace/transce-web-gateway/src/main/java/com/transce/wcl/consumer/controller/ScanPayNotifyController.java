package com.transce.wcl.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 支付平台异步通知
 *  
 */
@Controller
@RequestMapping(value = "/scanPayNotify")
public class ScanPayNotifyController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScanPayNotifyController.class);

}
