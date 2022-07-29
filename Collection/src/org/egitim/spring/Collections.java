package org.egitim.spring;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collections {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		System.out.println("CONTEXT : " + context);

		SystemManager systemManager = context.getBean("systemManager", SystemManager.class);

		System.out.println("+++++++++++++++++++++++");

		System.out.println("server name : " + systemManager.getServerName());

		System.out.println("printer List");

		for (String printer : systemManager.getPrinterList()) {
			System.out.println(printer);
		}

		System.out.println("Router List");

		for (String router : systemManager.getRouterSet()) {
			System.out.println(router);
		}
		
		System.out.println("Security Properties");
		Set<Object> entrySet = systemManager.getSecurityProperties().keySet();
		for (Object entry : entrySet) {
			System.out.println(entry.toString() + ":"+systemManager.getSecurityProperties().getProperty(entry.toString()));
		}
		
		System.out.println("Allowed Clients");
		//Set<Object> entrySet = systemManager.getSecurityProperties().keySet();
		for (Map.Entry<String,String>  entry: systemManager.getAllowedClientMap().entrySet()) {
			System.out.println(entry.getKey() + ":"+ entry.getValue());
		}

	}

}
