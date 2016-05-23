package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoitliveApplication {

	@RequestMapping (method = RequestMethod.GET, value = "/hi")
	String hi () {
		return "Hi";
	}

	public static void main(String[] args) {
		SpringApplication.run(DoitliveApplication.class, args);
	}
}
