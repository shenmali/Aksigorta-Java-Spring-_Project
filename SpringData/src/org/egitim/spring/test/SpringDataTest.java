package org.egitim.spring.test;

import java.util.List;

import org.egitim.spring.configuration.SpringDataConfiguration;
import org.egitim.spring.model.data.entity.Kisi;
import org.egitim.spring.model.service.KisiService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class SpringDataTest {

	@Test
	void testFindByTcKimlikNo() {
		ApplicationContext context  = new AnnotationConfigApplicationContext(SpringDataConfiguration.class);
		System.out.println("Context :" + context);
		
		
		KisiService kisiService = context.getBean(KisiService.class);
		System.out.println("KisiService  :" + kisiService);
		
		List<Kisi> kisiList = kisiService.findByTcKimlikNo("0000000003");
		
		for(Kisi kisi : kisiList) {
			System.out.println(kisi.getViewString());
		}
	}

}
