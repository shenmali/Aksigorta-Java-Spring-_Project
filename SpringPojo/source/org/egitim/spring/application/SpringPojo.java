package org.egitim.spring.application;

import org.egitim.spring.domain.Ogrenci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPojo {

	public static void main(String[] args) {
		Ogrenci ogrenciPojo = new Ogrenci();
		System.out.println("Ogrenci POJO: "+ ogrenciPojo);
		System.out.println("ogrenci ad:"+ ogrenciPojo.getAd());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");
		
		System.out.println("Context : " + context);
		Ogrenci ogrenciBean = context.getBean("ogrenci", Ogrenci.class);
		System.out.println("ogrenci bean:" + ogrenciBean);
		System.out.println("ogrenci ad: "+ ogrenciBean.getAd());
	}

}
