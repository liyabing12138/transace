package com.transce.wcl.trade.hystrix;

import org.springframework.stereotype.Component;

import com.transce.wcl.trade.service.RpUserInfoServiceInterface;
import com.transce.wcl.user.entity.RpUserInfo;
import com.transce.wcl.user.exceptions.PayBizException;
@Component
public class RpUserInfoServiceFallBack implements RpUserInfoServiceInterface{

	@Override
	public RpUserInfo getDataByMerchentNo(String merchantNo) throws PayBizException {
		return new RpUserInfo();
	}

}
