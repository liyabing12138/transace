package com.transce.wcl.consumer.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.transce.wcl.consumer.common.BaseController;
import com.transce.wcl.consumer.service.RpTransactionMessageServiceInterface;

/**
 * 支付平台异步通知
 *  
 */
@Controller
@RequestMapping(value = "/scanPayNotify")
public class ScanPayNotifyController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScanPayNotifyController.class);

    @Resource
   	private RpTransactionMessageServiceInterface messageServiceInterface;
}
