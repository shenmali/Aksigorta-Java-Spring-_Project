package org.egitim.spring.application;

//import org.egitim.spring.domain.DbManager;
import org.egitim.spring.domain.Kisi;
import org.egitim.spring.domain.KisiController;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.egitim.spring.domain.DbManager;
import org.egitim.spring.domain.TransactionManager;

public class InitDestroyScope {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		KisiController kisiController = context.getBean("kisiController", KisiController.class);

		// KisiController kisiController = new KisiController();
		System.out.println(kisiController.insertKisi(new Kisi()));
		System.out.println("KisiController 1 :" + kisiController);

		KisiController kisiController2 = context.getBean("kisiController", KisiController.class);
		System.out.println("KisiController 2 :" + kisiController2);

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("context.xml");
		// DbManager dbmanager = context.getBean("dbmanager", DbManager.class);

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("context.xml");
		 * 
		 * DbManager dbmanager = context.getBean("dbmanager", DbManager.class);
		 * System.out.println(dbmanager);
		 * 
		 * DbManager dbmanager2 = context.getBean("dbmanager", DbManager.class);
		 * System.out.println(dbmanager2);
		 */

		System.out.println("===================================");
		DbManager dbmanager = context.getBean("dbmanagerBean", DbManager.class);

		System.out.println("DBManager: " + dbmanager);
		System.out.println("Transaction Manager DBManager" + dbmanager.getTransactionManager());

		//transaction manager not available in spring context
		TransactionManager transactionManager = context.getBean("transactionManager", TransactionManager.class);
		System.out.println("TrasactionManager: " + transactionManager);
		
		
		context.registerShutdownHook();

	}

}
