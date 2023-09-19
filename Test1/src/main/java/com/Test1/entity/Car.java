package com.Test1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="car-details")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private int price;
	
	@OneToMany(targetEntity = Tyre.class,cascade = CascadeType.ALL)
	@JoinColumn(name="order-Id",referencedColumnName = "id")
	private List<Tyre>tyre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Tyre> getTyre() {
		return tyre;
	}

	public void setTyre(List<Tyre> tyre) {
		this.tyre = tyre;
	}
	
	



}
