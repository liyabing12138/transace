package com.transce.wcl.trade.hystrix;

import org.springframework.stereotype.Component;

import com.transce.wcl.trade.service.RpPayWayServiceInterface;
import com.transce.wcl.user.entity.RpPayWay;
import com.transce.wcl.user.exceptions.PayBizException;
@Component
public class RpPayWayServiceFallBack implements RpPayWayServiceInterface{

	@Override
	public RpPayWay getByPayWayTypeCode(String payProductCode, String payWayCode, String rpTypeCode)
			throws PayBizException {
		return new RpPayWay();
	}

}
