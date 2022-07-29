package org.tutorial.spring.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.spring.config.SpringDataConfiguration;
import org.tutorial.spring.model.data.entity.Kisi;
import org.tutorial.spring.model.service.KisiService;

class SpringDataTest {

	@Test
	void testFindByTcKimlikNo() {
		ApplicationContext context  = new AnnotationConfigApplicationContext(SpringDataConfiguration.class);
		System.out.println("Context :" + context);
		
		
		KisiService kisiService = context.getBean(KisiService.class);
		System.out.println("KisiService  :" + kisiService);
		
		List<Kisi> kisiList = (List<Kisi>) kisiService.findByTcKimlikNo("0000000003");
		
		for(Kisi kisi : kisiList) {
			System.out.println(kisi.getViewString());
		}
	}

}


/*package org.tutorial.spring.test;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.spring.config.SpringDataConfiguration;
import org.tutorial.spring.model.data.entity.Person;
import org.tutorial.spring.model.service.PersonService;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class SprinDataTest {

	private static ApplicationContext applicationContext;
	private static PersonService personService;

	@BeforeAll
	@Test
	public static void prepareBeans() {
		applicationContext = new AnnotationConfigApplicationContext(SpringDataConfiguration.class);
		personService = applicationContext.getBean(PersonService.class);
	}

	@Test
	@Order(1)
	public void testFindPersonByNationalIdentity() {
		Person person = personService.findByNationalIdentity("00000000003");
		System.out.println(person.getViewString());
	}

	@Test
	@Order(2)
	public void testFindAllPersons() {
		List<Person> persons = personService.findAll();
		for (Person person : persons) {
			System.out.println(person.getViewString());
		}
	}
}*/
