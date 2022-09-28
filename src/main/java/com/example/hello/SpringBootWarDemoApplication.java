package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWarDemoApplication {

	@GetMapping("/greeting")
	public String greeting() {
		return "Spring Boot war devtools 3 ";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarDemoApplication.class, args);
	}
	

}
