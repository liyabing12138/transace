package com.transce.wcl.user.service;


import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.user.entity.RpUserInfo;
import com.transce.wcl.user.exceptions.PayBizException;

/**
 * RpUserInfoService接口
 */
@RequestMapping("/transaction-userInfo")
public interface RpUserInfoService <T, PK extends Serializable> {

	/**
	 * 根据商户编号获取商户信息
	 * @param merchantNo
	 * @return
	 */
	@RequestMapping(value = "/getDataByMerchentNo", method = RequestMethod.GET)
	RpUserInfo getDataByMerchentNo(@RequestParam("merchantNo")String merchantNo) throws PayBizException;
	
	
}
