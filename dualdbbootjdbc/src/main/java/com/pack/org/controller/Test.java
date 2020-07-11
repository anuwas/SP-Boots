/**
 * 
 */
package com.pack.org.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.org.dto.MailTemplate;
import com.pack.org.dto.User;
import com.pack.org.service.UserService;

/**
 * @author Anupam Biswas
 * 2020-07-06 01:10:05.742
 */
@RestController
@RequestMapping(value="/api")
public class Test {
	
	@Autowired
	 private UserService userService;

	@GetMapping("/user")
	public List<User> getAllApplicationUserList() {
		
		 return userService.getAllUser();
	}
	
	@GetMapping("/mail")
	public MailTemplate getMailTemplate() {
		return userService.getMailTemplate();
	}
}
