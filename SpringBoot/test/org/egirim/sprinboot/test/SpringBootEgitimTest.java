package org.egirim.sprinboot.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.egitim.springboot.application.Application;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.restassured.RestAssured;
import io.restassured.response.Response;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SpringBootEgitimTest {

	
private static final String BASE_URI = "http://localhost:8086/egitim/kisi";
	
	@BeforeAll
	public static void setup() {
		RestAssured.baseURI = BASE_URI;
	}
	
	
	@Test
	void testFindByTcKimlikNo() {
		//ApplicationContext context  = new AnnotationConfigApplicationContext(SpringDataConfiguration.class);
		//System.out.println("Context :" + context);
		
		
		/*KisiService kisiService = context.getBean(KisiService.class);
		System.out.println("KisiService  :" + kisiService);
		
		List<Kisi> kisiList = kisiService.findByTcKimlikNo("0000000003");
		
		for(Kisi kisi : kisiList) {
			System.out.println(kisi.getViewString());
		}
	*/
		
		
		Response response = RestAssured.get();
		
		assertEquals(HttpStatus.OK.value(), response.getStatusCode());
	}

}
