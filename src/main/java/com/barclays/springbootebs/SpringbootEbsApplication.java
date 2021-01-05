package com.barclays.springbootebs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootEbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEbsApplication.class, args);
	}
	
	@GetMapping("/test")
	public String get() {
		return "Hello Test";
	}
	
	@GetMapping("/test/{name}")
	public String getName(@PathVariable String name) {
		return "Hello "+name;
	}

}
