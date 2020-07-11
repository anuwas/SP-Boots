/**
 * 
 */
package com.pack.org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pack.org.dto.MailTemplate;
import com.pack.org.dto.User;

/**
 * @author Anupam Biswas
 * 2020-07-11 19:21:10.134
 */
@Transactional
@Repository
public class DaoImplQueryRepository {
	
	private static final String PRD_USER = "select username,email from dd_prd_user";
	private static final String LOCAL_USER = "select username,email from dd_local_user";
	private static final String LOCAL_USER_INSERT = "insert into dd_local_user (username,email) values(?,?)";
	private static final String MAIL_TEMPLATE_BY_TYPE = "select mail_template_id,mail_type,mail_subject,mail_body,mail_to_recepient,mail_cc_recepient "
			+ "from mail_template where mail_type = ?";

	@Autowired
	@Qualifier("jdbcTemplateLocal")
	private JdbcTemplate jdbcTemplateLocal;
	 
	@Autowired
	@Qualifier("jdbcTemplatePrd")
	private JdbcTemplate jdbcTemplatePrd;
	
	public List<User> getPrdUser(){
		return this.jdbcTemplatePrd.query(PRD_USER, new Object[] {}, new UserRowMapper());
	}
	
	public List<User> getLocalUser(){
		return this.jdbcTemplateLocal.query(LOCAL_USER, new Object[] {}, new UserRowMapper());
	}
	
	public MailTemplate getMailTemplate(String mailType) {
		return this.jdbcTemplateLocal.queryForObject(MAIL_TEMPLATE_BY_TYPE, new Object[] {mailType}, new MailTemplateRowMapper());
	}
	
	public void insertLocalUser(String username, String email) {
		try {
			int rowCount = this.jdbcTemplateLocal.update(new PreparedStatementCreator() {
				@Override
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement statement = con.prepareStatement(LOCAL_USER_INSERT);
					statement.setString(1, username);
					statement.setString(2, email);
					return statement;
				}
			});

		}
		catch (Exception ex) {
		}
	}

}
