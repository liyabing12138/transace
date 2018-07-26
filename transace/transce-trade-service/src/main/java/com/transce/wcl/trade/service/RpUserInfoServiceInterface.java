package com.transce.wcl.trade.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.trade.hystrix.RpUserInfoServiceFallBack;
import com.transce.wcl.user.entity.RpUserInfo;
import com.transce.wcl.user.exceptions.PayBizException;

@FeignClient(name = "transce-user-service",fallback=RpUserInfoServiceFallBack.class)
public interface RpUserInfoServiceInterface {

	
	/**
	 * 根据商户编号获取商户信息
	 * @param merchantNo
	 * @return
	 */
	@RequestMapping(value = "/transaction-userInfo/getDataByMerchentNo", method = RequestMethod.GET)
	RpUserInfo getDataByMerchentNo(@RequestParam("merchantNo")String merchantNo) throws PayBizException;
	
	
}
