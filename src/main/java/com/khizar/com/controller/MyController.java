package com.khizar.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome to AWS Cloud";
	}

}
