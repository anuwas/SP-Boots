/**
 * 
 */
package com.pack.org.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Anupam Biswas
 * 2020-07-05 22:14:42.505
 */
@Configuration
public class DBConfig {
	
	 @Bean(name = "DD-LOCAL")
	 @ConfigurationProperties(prefix = "spring.datasource")
	 public DataSource dataSourceLocal() {
	  return DataSourceBuilder.create().build();
	 }

	 @Bean(name = "jdbcTemplateLocal")
	 public JdbcTemplate jdbcTemplateLocal(@Qualifier("DD-LOCAL") DataSource ds) {
	  return new JdbcTemplate(ds);
	 }
	 
	 @Bean(name = "DD-PRD")
	 @ConfigurationProperties(prefix = "spring.second-db")
	 public DataSource dataSourcePrd() {
	  return  DataSourceBuilder.create().build();
	 }

	 @Bean(name = "jdbcTemplatePrd")
	 public JdbcTemplate jdbcTemplatePrd(@Qualifier("DD-PRD") DataSource ds) {
	  return new JdbcTemplate(ds);
	 }
}
