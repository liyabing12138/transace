package com.transce.wcl.trade.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.trade.hystrix.RpUserPayConfigServiceFallBack;
import com.transce.wcl.user.entity.RpUserPayConfig;
import com.transce.wcl.user.exceptions.PayBizException;

@FeignClient(name = "transce-user-service",fallback=RpUserPayConfigServiceFallBack.class)
public interface RpUserPayConfigServiceInterface {
	/**
	 * 根据商户key获取已生效的支付配置
	 * @param payKey
	 * @return
	 */
	@RequestMapping(value = "/transaction-payConfig/getByPayKey", method = RequestMethod.GET)
	RpUserPayConfig getByPayKey(@RequestParam("payKey") String payKey) throws PayBizException;
}
