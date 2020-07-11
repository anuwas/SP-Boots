/**
 * 
 */
package com.pack.org.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anupam Biswas
 * 2020-07-05 22:16:33.026
 */
@Component
@Setter
@Getter
public class User {
	
	private Integer id;
	private String username;
	private String email;
}
