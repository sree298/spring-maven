/**
 * 
 */
package com.prokarma.app.dao;

import com.prokarma.app.dto.UserLoginDO;

/**
 * @author Amara Subramanyam
 *
 */
public interface UserLoginDAO {

	public UserLoginDO getUserDetails(final UserLoginDO loginDO);

}
