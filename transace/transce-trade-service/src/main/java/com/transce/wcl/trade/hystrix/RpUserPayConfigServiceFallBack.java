package com.transce.wcl.trade.hystrix;

import org.springframework.stereotype.Component;

import com.transce.wcl.trade.service.RpUserPayConfigServiceInterface;
import com.transce.wcl.user.entity.RpUserPayConfig;
import com.transce.wcl.user.exceptions.PayBizException;
@Component
public class RpUserPayConfigServiceFallBack implements RpUserPayConfigServiceInterface{

	@Override
	public RpUserPayConfig getByPayKey(String payKey) throws PayBizException {
		return new RpUserPayConfig();
	}

}
