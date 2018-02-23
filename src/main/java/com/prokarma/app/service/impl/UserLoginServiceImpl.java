package com.prokarma.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prokarma.app.dao.UserLoginDAO;
import com.prokarma.app.dto.UserLoginDO;
import com.prokarma.app.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginDAO userLoginDAO;

	public boolean getUserDetails(UserLoginDO loginDO) {
		boolean flag = false;
		UserLoginDO userDetails = userLoginDAO.getUserDetails(loginDO);
		if (userDetails != null && userDetails.getFirstname() != null && !userDetails.getFirstname().equals("")) {
			flag = true;
		}
		return flag;
	}

}
