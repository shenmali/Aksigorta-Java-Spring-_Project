package org.hw4.spring.test;


import java.util.List;

import org.hw4.spring.config.SpringDataConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.spring.model.data.entity.Kisi;
import org.tutorial.spring.model.service.KisiService;
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class SpringTest {

	@Test
	@Disabled
	void testFindByTcKimlikNo() {
		ApplicationContext context  = new AnnotationConfigApplicationContext(SpringDataConfig.class);
		System.out.println("Context :" + context);
		
		
		KisiService kisiService = context.getBean(KisiService.class);
		System.out.println("KisiService  :" + kisiService);
		
		List<Kisi> kisiList = (List<Kisi>) kisiService.findByTcKimlikNo("0000000003");
		
		for(Kisi kisi : kisiList) {
			System.out.println(kisi.getViewString());
		}
	}
	
	private static ApplicationContext applicationContext;
	private static KisiService kisiService;

	@BeforeAll
	@Test
	public static void prepareBeans() {
		applicationContext = new AnnotationConfigApplicationContext(SpringDataConfig.class);
		kisiService = applicationContext.getBean(KisiService.class);
	}

	@Test
	@Order(1)
	public void testFindPersonByNationalIdentity() {
		Kisi kisi = kisiService.findByTcKimlikNo("00000000003");
		System.out.println(kisi.getViewString());
	}

	@Test
	@Order(2)
	public void testTumKisileriBul() {
		List<Kisi> kisiler = kisiService.findAll();
		for (Kisi kisi : kisiler) {
			System.out.println(kisi.getViewString());
		}
	}

}
