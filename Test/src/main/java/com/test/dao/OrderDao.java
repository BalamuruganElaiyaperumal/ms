package com.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.entity.Order;
import com.test.repository.OrderRepository;

@Repository
public class OrderDao {
	@Autowired
	
	OrderRepository or;

	public String setAll(Order a) {
     or.save(a);
     return "import success";
	}
	

}
