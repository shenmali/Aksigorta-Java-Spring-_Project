package org.egitim.spring.configuration;

import org.egitim.spring.system.SecurityController;
import org.egitim.spring.system.SystemConstants;
import org.egitim.spring.system.UserValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SystemConfiguration {
	
	@Bean
	@Scope("singleton")
	public SystemConstants getSystemConstants() {
		
		return new SystemConstants();
	}
	
	@Bean
	public SecurityController getSecurityController() {
		return new SecurityController(getUserValidator());
	}
	
	public UserValidator getUserValidator() {
		
		return new UserValidator();	}
	

}
