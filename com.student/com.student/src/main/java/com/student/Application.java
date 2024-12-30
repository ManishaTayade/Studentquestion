package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.student", "com.controller", "com.dao", "com.model", "com.services,com.exception"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages = "com.dao") // For JPA repositories if needed
@EnableMongoRepositories(basePackages = "com.dao") // For MongoDB repositories
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.print("Application Started ");
	}

}
