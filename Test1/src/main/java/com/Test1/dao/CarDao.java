package com.Test1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Test1.entity.Car;
import com.Test1.repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository cr;

	public String set(Car a) {
		cr.save(a);
		return "successfully";
	}

}
