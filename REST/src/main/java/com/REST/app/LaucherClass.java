package com.REST.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages="com.REST.app.repository")
@SpringBootApplication
public class LaucherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(LaucherClass.class, args);
	}

}
