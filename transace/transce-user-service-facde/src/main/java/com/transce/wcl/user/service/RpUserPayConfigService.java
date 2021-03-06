package com.transce.wcl.user.service;


import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.user.entity.RpUserPayConfig;
import com.transce.wcl.user.exceptions.PayBizException;


/**
 * RpUserPayConfigService接口
 */
@RequestMapping("/transaction-payConfig")
public interface RpUserPayConfigService <T, PK extends Serializable> {

	/**
	 * 根据商户key获取已生效的支付配置
	 * @param payKey
	 * @return
	 */
	@RequestMapping(value = "/getByPayKey", method = RequestMethod.GET)
	RpUserPayConfig getByPayKey(@RequestParam("payKey") String payKey) throws PayBizException;
	
	
}
