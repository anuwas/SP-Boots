/**
 * 
 */
package com.pack.org.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



/**
 * @author Anupam Biswas
 * 2020-07-05 22:18:03.055
 */
@Transactional
@Repository
public class UserDaoImpl {
	

	@Autowired
	@Qualifier("jdbcTemplateLocal")
	private JdbcTemplate jdbcTemplateLocal;
	 
	@Autowired
	@Qualifier("jdbcTemplatePrd")
	private JdbcTemplate jdbcTemplatePrd;

	 public List getAllUser() {
	  String sql1 = "select username,email from user1";
	  //get users list from db1
	  List list1 = jdbcTemplateLocal.query(sql1, new UserRowMapper());
	  
	  String sql2 = "select username,email from user2";
	  //get users list from db2
	  List list2 = jdbcTemplatePrd.query(sql2, new UserRowMapper());
	  
	  List listAll = (List) Stream.concat(list1.stream(), list2.stream())
	       .collect(Collectors.toList());
	  return listAll;
	 }
}
