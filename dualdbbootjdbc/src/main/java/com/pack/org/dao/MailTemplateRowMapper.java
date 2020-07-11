/**
 * 
 */
package com.pack.org.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pack.org.dto.MailTemplate;

/**
 * @author Anupam Biswas
 * 2020-07-11 21:31:42.127
 */
public class MailTemplateRowMapper implements RowMapper<MailTemplate>{

	@Override
	public MailTemplate mapRow(ResultSet rs, int rowNum) throws SQLException {
		MailTemplate mailTemplate = new MailTemplate();
		mailTemplate.setMailTemplateId(rs.getInt("mail_template_id"));
		mailTemplate.setMailType(rs.getString("mail_type"));
		mailTemplate.setMailSubject(rs.getString("mail_subject"));
		mailTemplate.setMailBody(rs.getString("mail_body"));
		mailTemplate.setMailToRecepient(rs.getString("mail_to_recepient"));
		mailTemplate.setMailCcRecepient(rs.getString("mail_cc_recepient"));
		return mailTemplate;
	}

}
