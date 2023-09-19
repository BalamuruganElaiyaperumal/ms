package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Order;
import com.test.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService os;
	
	@PostMapping(value="/setAll")
	public String setAll(@RequestBody Order a) {
		return os.setAll(a);
	}
	

}
