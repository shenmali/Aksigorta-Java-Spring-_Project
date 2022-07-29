package org.egitim.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories("org.egitim.springboot.data.repository")
@EntityScan(basePackages = {"org.egitim.springboot.data.entity"})
@ComponentScan(basePackages = {"org.egitim.springboot.controller", "org.egitim.springboot.service"})


public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
