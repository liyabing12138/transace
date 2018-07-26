package com.transce.wcl.user.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pay.common.core.enums.PublicStatusEnum;
import com.transce.wcl.user.entity.RpUserInfo;
import com.transce.wcl.user.exceptions.PayBizException;
import com.transce.wcl.user.mapper.RpUserInfoMapper;
import com.transce.wcl.user.service.RpUserInfoService;

/**
 * 基本CURD操作在MybatisBaseServiceImpl中实现 否则自行声明接口，实现方法
 */
@RestController
public class RpUserInfoServiceImpl  implements RpUserInfoService {

	 @Autowired
	 private RpUserInfoMapper userInfoMapper;
	
	@Override
	public RpUserInfo getDataByMerchentNo(String merchantNo) throws PayBizException {
			RpUserInfo pUserInfo = new RpUserInfo();
			pUserInfo.setUserNo(merchantNo);
			pUserInfo.setStatus(PublicStatusEnum.ACTIVE.name());
		return (RpUserInfo) userInfoMapper.getByParams(pUserInfo);
	}

}
