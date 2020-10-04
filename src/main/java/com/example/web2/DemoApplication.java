package com.example.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		System.out.println("BEGINS...");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("ENDS....");
	}
}
