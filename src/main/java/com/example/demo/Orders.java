package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity

public class Orders {
	
	
	@Id
	int slno;
	Customer Customer;
	@OneToMany
	ArrayList<Quantity> TotalProducts;
	int Total;
}
 class CustomerTotal{
	private Customer customers;
	@Autowired
	public void setCustomers(Customer customers) {
		this.customers = customers;
	}
}

