package org.egitim.application;

import org.egitim.domain.MessageGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstBean {

	public static void main(String[] args) {
		/*MessageGenerator messageGenerator = new MessageGenerator();
		messageGenerator.setMesaj("java Object!");
		messageGenerator.getMesaj();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		MessageGenerator messageGenerator = (MessageGenerator) context.getBean("messageGenerator");
		messageGenerator.getMesaj();
		
				
	}

}
