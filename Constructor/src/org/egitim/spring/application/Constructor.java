package org.egitim.spring.application;

//import org.egitim.spring.domain.DbManager;
import org.egitim.spring.domain.Kisi;
import org.egitim.spring.domain.KisiController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constructor {

	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("context.xml");
		KisiController kisiController = context.getBean("kisiController", KisiController.class);

		//KisiController kisiController = new KisiController();
		System.out.println(kisiController.insertKisi(new Kisi()));
		
		//ApplicationContext context  = new ClassPathXmlApplicationContext("context.xml");
		//DbManager dbmanager = context.getBean("dbmanager", DbManager.class);
		
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		DbManager dbmanager = context.getBean("dbmanager", DbManager.class);
		System.out.println(dbmanager);
		
		DbManager dbmanager2 = context.getBean("dbmanager", DbManager.class);
		System.out.println(dbmanager2);*/
		

	}

}
