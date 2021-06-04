package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quantity {
	@Id
	int slno;
	Products product;
	int quantity;

}
