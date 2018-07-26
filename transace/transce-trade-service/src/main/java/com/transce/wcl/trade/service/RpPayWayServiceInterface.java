package com.transce.wcl.trade.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.trade.hystrix.RpPayWayServiceFallBack;
import com.transce.wcl.user.entity.RpPayWay;
import com.transce.wcl.user.exceptions.PayBizException;

@FeignClient(name = "transce-user-service",fallback=RpPayWayServiceFallBack.class)
public interface RpPayWayServiceInterface {

	/**
	 * 根据支付方式、渠道编码获取数据
	 * @param rpTypeCode
	 * @return
	 */
	@RequestMapping(value = "/transaction-payWay/getByPayWayTypeCode", method = RequestMethod.GET)
	RpPayWay getByPayWayTypeCode(@RequestParam("payProductCode")String payProductCode, @RequestParam("payWayCode")String payWayCode, @RequestParam("rpTypeCode")String rpTypeCode) throws PayBizException;
	
}
