package com.transce.wcl.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pay.common.core.enums.PublicEnum;
import com.pay.common.core.enums.PublicStatusEnum;
import com.transce.wcl.user.entity.RpUserPayConfig;
import com.transce.wcl.user.exceptions.PayBizException;
import com.transce.wcl.user.mapper.RpUserPayConfigMapper;
import com.transce.wcl.user.service.RpUserPayConfigService;

/**
 * 基本CURD操作在MybatisBaseServiceImpl中实现 否则自行声明接口，实现方法
 */
@RestController
public class RpUserPayConfigServiceImpl  implements RpUserPayConfigService {

	 @Autowired
	 private RpUserPayConfigMapper payConfigMapper;
	
	@Override
	public RpUserPayConfig getByPayKey(String payKey) throws PayBizException {
		RpUserPayConfig pUserPayConfig = new  RpUserPayConfig();
		pUserPayConfig.setPayKey(payKey);
		pUserPayConfig.setStatus(PublicStatusEnum.ACTIVE.name());
		pUserPayConfig.setAuditStatus(PublicEnum.YES.name());
		return (RpUserPayConfig) payConfigMapper.getByParams(pUserPayConfig);
	}

}
