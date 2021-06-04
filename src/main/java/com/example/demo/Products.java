package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	String name;
	String descr;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDesc(String descr) {
		this.descr = descr;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
