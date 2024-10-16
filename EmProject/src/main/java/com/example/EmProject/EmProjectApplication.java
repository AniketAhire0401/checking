package com.example.EmProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.EmProject.Repository") 
public class EmProjectApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(EmProjectApplication.class, args);
	}
}
