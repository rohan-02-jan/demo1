package com.pack.demoCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCicdApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return  "Hello to CICD pipeline";
	}
}
