package com.prokarma.app.bd.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prokarma.app.bd.UserLoginBD;
import com.prokarma.app.dto.UserLoginDO;
import com.prokarma.app.service.UserLoginService;
import com.prokarma.app.vo.UserLoginVO;

@Component
public class UserLoginBDImpl implements UserLoginBD {

	@Autowired
	private UserLoginService userLoginService;

	public boolean getUserDetails(UserLoginVO loginVO) {
		UserLoginDO userLoginDO = new UserLoginDO();
		BeanUtils.copyProperties(loginVO, userLoginDO);
		return userLoginService.getUserDetails(userLoginDO);
	}

}
