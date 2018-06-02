package org.ownsbson.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/sayHello")
	@ResponseBody
	public String sayHello() {
		return "Hello Spring Boot";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class);
	}
	
}
