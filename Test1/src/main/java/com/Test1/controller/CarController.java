package com.Test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Test1.entity.Car;
import com.Test1.service.CarService;

@RestController
public class CarController {

	@Autowired
	CarService cs;
	
	@PostMapping(value="/set")
	public String set(@RequestBody Car a) {
		return cs.set(a);
	}
}
