package com.transce.wcl.user.service;


import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transce.wcl.user.entity.RpPayWay;
import com.transce.wcl.user.exceptions.PayBizException;

/**
 * RpPayWayService接口
 */
@RequestMapping("/transaction-payWay")
public interface RpPayWayService <T, PK extends Serializable> {

	/**
	 * 根据支付方式、渠道编码获取数据
	 * @param rpTypeCode
	 * @return
	 */
	@RequestMapping(value = "/getByPayWayTypeCode", method = RequestMethod.GET)
	RpPayWay getByPayWayTypeCode(@RequestParam("payProductCode")String payProductCode, @RequestParam("payWayCode")String payWayCode, @RequestParam("rpTypeCode")String rpTypeCode) throws PayBizException;
	
	
}
