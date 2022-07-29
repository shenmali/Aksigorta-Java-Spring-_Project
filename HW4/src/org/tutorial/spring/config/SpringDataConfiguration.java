package org.tutorial.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.tutorial.spring.model.service.KisiService;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "org.tutorial.spring.model.data.repository")
public class SpringDataConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

		localContainerEntityManagerFactoryBean.setDataSource(dataSource());
		localContainerEntityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		localContainerEntityManagerFactoryBean.setPackagesToScan("org.tutorial.spring.model.data.entity");
		localContainerEntityManagerFactoryBean.setJpaProperties(hibernateProperties());

		return localContainerEntityManagerFactoryBean;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/TutorialDB");
		dataSource.setUsername("postgres");
		dataSource.setPassword("12345");
		return dataSource;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
//		properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
//		properties.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/TutorialDB");
//		properties.setProperty("hibernate.connection.username", "postgres");
//		properties.setProperty("hibernate.connection.password", "12345");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.setProperty("hbm2ddl.auto", "none");
		return properties;
	}

	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}

	@Bean
	public KisiService getPersonService() {
		return new KisiService();
	}

}
