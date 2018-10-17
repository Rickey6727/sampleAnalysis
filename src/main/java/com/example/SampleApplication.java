package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages={"com.example.sample"})
@RestController
public class SampleApplication {
	
	@RequestMapping("/")
	String hello() {
		return "やあやあ世界！!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
}
