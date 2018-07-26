package com.transce.wcl.user.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pay.common.core.enums.PublicStatusEnum;
import com.transce.wcl.user.entity.RpPayWay;
import com.transce.wcl.user.exceptions.PayBizException;
import com.transce.wcl.user.mapper.RpPayWayMapper;
import com.transce.wcl.user.service.RpPayWayService;

/**
 * 基本CURD操作在MybatisBaseServiceImpl中实现 否则自行声明接口，实现方法
 */
@RestController
public class RpPayWayServiceImpl implements RpPayWayService {

	 @Autowired
	 private RpPayWayMapper payWayMapper;
	
	@Override
	public RpPayWay getByPayWayTypeCode(String payProductCode, String payWayCode, String rpTypeCode)
			throws PayBizException {
		RpPayWay pPayWay = new RpPayWay();
		pPayWay.setPayProductCode(payProductCode);
		pPayWay.setPayTypeCode(rpTypeCode);
		pPayWay.setPayWayCode(payWayCode);
		pPayWay.setStatus(PublicStatusEnum.ACTIVE.name());
		return (RpPayWay) payWayMapper.getByParams(pPayWay);
	}

}
