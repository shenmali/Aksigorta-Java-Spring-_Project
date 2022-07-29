package org.egitim.spring.configuration;

import org.egitim.spring.domain.BirimController;
import org.egitim.spring.domain.PersonelController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfiguration {
	
	@Bean
	public BirimController getBirimController(){
		return new BirimController();
	}
	
	@Bean
	public PersonelController getPersonelController() {
		PersonelController personelController = new PersonelController();
		
		personelController.setEntityName("Personel");
		
		return personelController;
	}
}
