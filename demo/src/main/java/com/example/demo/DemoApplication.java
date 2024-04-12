package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "employee CRUD Application",
		version = "1.0.0",
		description = "Swagger is a powerful tool for documenting APIs, providing a clear and structured way"
				+ " to describe endpoints, request/response formats, and authentication methods. With Swagger,"
				+ " developers can easily understand, test, and interact with APIs, streamlining "
				+ "the development process and promoting better collaboration between teams. "
				+ "Its intuitive interface and comprehensive featuresmake it a popular choice for "
				+ "API documentation in modern software development.",
		contact = @Contact(
				 name= "ashfaq adeni",
				 email = "ashfaqadeni786@gmail.com"
				)
		
		))
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
