package com.capg.cust.service;

import java.util.List;

import com.capg.cust.bean.Cust;

public interface ICustomerService {

	int addcustomer(Cust c);

	int updateCustomer(Cust c);

	Cust getCustomerById(int cid);

	int deleteCustomerbyId(int cid);

	List<Cust> getAllCustomers();

}
