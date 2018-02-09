package io.pivotal.demo.firstgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class FirstGroupApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstGroupApplication.class, args);
	}

	@RequestMapping("/")
	String getInfo() {
		return "This is my first application on pcf!";
	}
}
