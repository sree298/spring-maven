package com.prokarma.app.service;

import com.prokarma.app.dto.UserLoginDO;

public interface UserLoginService {
	public boolean getUserDetails(final UserLoginDO loginDO);
}
