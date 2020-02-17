package com.caog.cust.dao;

import java.util.List;

import com.capg.cust.bean.Cust;

public interface IcustomerDAO {

	
	int addcustomer(Cust c);

	int updateCustomer(Cust c);

	Cust getCustomerById(int cid);

	int deleteCustomerbyId(int cid);

	List<Cust> getAllCustomers();

	
	
}
