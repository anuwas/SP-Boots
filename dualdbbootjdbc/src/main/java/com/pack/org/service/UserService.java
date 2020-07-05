/**
 * 
 */
package com.pack.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.org.dao.UserDaoImpl;
import com.pack.org.model.User;

/**
 * @author Anupam Biswas
 * 2020-07-05 22:21:14.861
 */
@Service
public class UserService {
	@Autowired
	 private UserDaoImpl userDao;
	 
	 public List<User> getAllUser() {
	  return userDao.getAllUser();
	 }
}
