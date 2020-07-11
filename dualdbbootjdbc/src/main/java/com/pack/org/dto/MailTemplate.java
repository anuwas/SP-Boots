/**
 * 
 */
package com.pack.org.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anupam Biswas
 * 2020-07-11 21:23:15.883
 */

@Component
@Setter
@Getter
public class MailTemplate {
	private int mailTemplateId;
	private String mailType;
	private String mailSubject;
	private String mailBody;
	private String mailToRecepient;
	private String mailCcRecepient;
}
