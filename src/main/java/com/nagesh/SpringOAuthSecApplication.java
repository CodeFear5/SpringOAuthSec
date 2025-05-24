package com.nagesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOAuthSecApplication {

	public static void main(String[] args) {
		
		System.out.println("app running");
		SpringApplication.run(SpringOAuthSecApplication.class, args);
	}

}
