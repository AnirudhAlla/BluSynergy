package com.example.demo;

import java.util.ArrayList;

import org.apache.catalina.Session;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sun.tracing.dtrace.ModuleAttributes;

@Repository
public interface Productservice extends JpaRepository<Orders, Integer>{
	ArrayList fetchAll(){
		ArrayList a=session.createQuery("Select * from Orders",Orders.class).getResultList();
		return a;		
				
	}	
	@Modifying
	@Query("insert into Orders (customer,Quantity,price) select :customer, :Quantity , :price from Orders")
	public int modifyingQueryInsert(@Param("customer")String customer,@Param("Quantity")Quantity v,@Param("price")Integer price);

	
	
}
