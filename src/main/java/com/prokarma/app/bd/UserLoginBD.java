package com.prokarma.app.bd;

import com.prokarma.app.vo.UserLoginVO;

public interface UserLoginBD {
	public boolean getUserDetails(UserLoginVO loginVO);
}
