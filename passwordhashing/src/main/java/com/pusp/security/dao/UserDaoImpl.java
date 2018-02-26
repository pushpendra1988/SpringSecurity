package com.pusp.security.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.pusp.security.dto.User;
import com.pusp.security.util.UserServiceUtil;

public class UserDaoImpl implements UserDao{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertUser(User user) {
		String sql = "INSERT INTO CHETAKUSER(NAME,PASSWORD)VALUES(?,?)";
		String enCodedPassword =  UserServiceUtil.enCodedPassword(user.getPassword());
		return jdbcTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, user.getUser());
				pstmt.setString(2, enCodedPassword);
			}
		});
	}

}
