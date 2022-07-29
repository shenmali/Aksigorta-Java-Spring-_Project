package org.egitim.spring.configuration;

import org.egitim.spring.domain.DateUtility;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.egitim.spring.domain")
public class AnnotationConfiguration {

	
	@Bean
	public DateUtility getDateUtility(){
		return new DateUtility();
		}
	

}
