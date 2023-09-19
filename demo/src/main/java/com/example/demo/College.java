package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class College {
	
	@GetMapping(value="/principal")
	public String principal() {
		return "Welcome Principle";
	}
	@GetMapping(value="/teacher")
	public String teacher() {
		return "Welcome Teacher";
	}
	@GetMapping(value="/student")
	public String student() {
		return "Welcome Student";
	}
}
