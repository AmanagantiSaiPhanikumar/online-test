package com.capg.cust.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.cust.bean.Cust;
import com.capg.cust.service.CustomerServiceImp;
import com.capg.cust.service.ICustomerService;

class CustomerServiceImpTest {

static ICustomerService service;
@BeforeAll
	public static void setUp() {
	
	service=new CustomerServiceImp();
	
}
	
	
	
	
	@Test
	void testAddcustomer() {
		
		Cust cust= new Cust();
cust.setId(505);
cust.setName("sai");
cust.setAmount(9000);
cust.setDOP(new Date(2020,2,10));

assertEquals(1, service.addcustomer(cust));
	}

	@Test
	void testIsValidId() {
		
	}

	@Test
	void testIsValidname() {
		
	}

	@Test
	void testUserValidations() {
	
	}

}
