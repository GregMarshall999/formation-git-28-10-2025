package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new PrintWelcome();

		System.out.println("Test, 2");
		System.out.println("Un autre message");
		System.out.println("Commit avant checkout vers dev");

		//SpringApplication.run(DemoApplication.class, args);
	}

}
