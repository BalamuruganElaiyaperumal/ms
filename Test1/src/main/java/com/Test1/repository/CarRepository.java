package com.Test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Test1.entity.Car;

public interface CarRepository  extends JpaRepository<Car, Integer>{

}
