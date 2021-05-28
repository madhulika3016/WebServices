package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRest1Application.class, args);
		System.out.println("Database Connected");
	}

}
