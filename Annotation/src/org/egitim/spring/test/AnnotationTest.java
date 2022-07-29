package org.egitim.spring.test;

import org.egitim.spring.configuration.AnnotationConfiguration;
import org.egitim.spring.domain.DatabaseOperator;
import org.egitim.spring.domain.DateUtility;
import org.egitim.spring.domain.KisiController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AnnotationTest {

	@Test
	void test() {
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class)
		System.out.println("context:"+context);
		
		KisiController kisiController = context.getBean(KisiController.class);
		
		System.out.println("KisiController:"+kisiController);
		
		DatabaseOperator databaseOperator = context.getBean(DatabaseOperator.class);
		System.out.println("Database Operator:"+ databaseOperator);
		System.out.println("Database Operator (KisiController):"+kisiController.getDatabaseOperator());
		
		System.out.println("DateUtility (KisiController):" + kisiController.getDateUtility());
		DateUtility dateUtility = context.getBean(DateUtility.class);
	}

}
