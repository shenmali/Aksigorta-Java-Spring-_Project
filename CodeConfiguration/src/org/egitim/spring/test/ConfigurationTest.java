package org.egitim.spring.test;

import org.egitim.spring.configuration.DomainConfiguration;
import org.egitim.spring.configuration.SystemConfiguration;
import org.egitim.spring.domain.BirimController;
import org.egitim.spring.domain.PersonelController;
import org.egitim.spring.system.SecurityController;
import org.egitim.spring.system.SystemConstants;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ConfigurationTest {

	@Test
	void test() {
		//ApplicationContext context = new AnnotationConfigApplicationContext(DomainConfiguration.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(DomainConfiguration.class);
		context.register(SystemConfiguration.class);
		context.refresh();//spring context bu satirda olustu
		
		System.out.println("context : "+context);
		
		BirimController birimController = context.getBean(BirimController.class);
		System.out.println("BirimController:"+ birimController);
		System.out.println("Birim Entity Name:"+ birimController.getEntityName());
		
		
		PersonelController personelController = context.getBean(PersonelController.class);
		System.out.println("PersonelController:"+ personelController);
		System.out.println("PersonelEntity Name:"+ personelController.getEntityName());
		
		SystemConstants systemConstants = context.getBean(SystemConstants.class);
		System.out.println("SystemContstants Max Number:"+ systemConstants.MAX_USER);
		
		SecurityController securityController= context.getBean(SecurityController.class);
		System.out.println("SecurtyController :"+ securityController);
		System.out.println("User Validator (Security Controller) :"+ securityController.getUserValidator());
		
	}

}
