package com.Test1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test1.dao.CarDao;
import com.Test1.entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao cd;

	public String set(Car a) {
		return cd.set(a);
	}

}
