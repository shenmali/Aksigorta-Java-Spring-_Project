package org.egitim.spring.system;

public class SecurityController {
	
	private UserValidator userValidator;
	
	

	public SecurityController(UserValidator userValidator) {
		this.userValidator = userValidator;
	}

	public UserValidator getUserValidator() {
		return userValidator;
	}

	public void setUserValidator(UserValidator userValidator) {
		this.userValidator = userValidator;
	}
	
	

}
