/**
 * 
 */
package com.pack.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.org.dao.DaoImplQueryRepository;
import com.pack.org.dao.UserDaoImpl;
import com.pack.org.dto.MailTemplate;
import com.pack.org.dto.User;

/**
 * @author Anupam Biswas
 * 2020-07-05 22:21:14.861
 */
@Service
public class UserService {
	
	@Autowired
	 private UserDaoImpl userDao;
	
	@Autowired
	private DaoImplQueryRepository daoImplQueryRepository;
	 
	 public List<User> getAllUserB() {
	  return userDao.getAllUser();
	 }
	 
	 public List<User> getAllUser(){
		 daoImplQueryRepository.insertLocalUser("anupam", "a@a.com");
		 return daoImplQueryRepository.getLocalUser();
	 }
	 
	 public MailTemplate getMailTemplate() {
		 return daoImplQueryRepository.getMailTemplate("job");
	 }
}
