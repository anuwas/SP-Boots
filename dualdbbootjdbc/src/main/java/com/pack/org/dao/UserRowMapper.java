/**
 * 
 */
package com.pack.org.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pack.org.model.User;

/**
 * @author Anupam Biswas
 * 2020-07-05 22:19:40.355
 */
public class UserRowMapper implements RowMapper{
	 @Override
	  public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	   User user = new User();
	   user.setUsername(rs.getString("username"));
	   user.setEmail(rs.getString("email"));
	   
	   return user;
	  }
}
