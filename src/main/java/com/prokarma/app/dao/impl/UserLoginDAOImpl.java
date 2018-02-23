package com.prokarma.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prokarma.app.dao.UserLoginDAO;
import com.prokarma.app.dto.UserLoginDO;

@Repository
public class UserLoginDAOImpl implements UserLoginDAO {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public UserLoginDO getUserDetails(UserLoginDO loginDO) {
		try {
			final String query = "select userId, lastname, firstname, age, password from users where "
					+ "firstname = :firstname and password = :password";

			MapSqlParameterSource parameterSource = new MapSqlParameterSource();
			parameterSource.addValue("firstname", loginDO.getFirstname());
			parameterSource.addValue("password", loginDO.getPassword());
			return namedParameterJdbcTemplate.queryForObject(query, parameterSource,
					new BeanPropertyRowMapper<UserLoginDO>(UserLoginDO.class));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

}
