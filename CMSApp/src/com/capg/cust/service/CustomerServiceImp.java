package com.capg.cust.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.caog.cust.dao.CustomerDAOImp;
import com.caog.cust.dao.DBUtil;
import com.caog.cust.dao.IcustomerDAO;
import com.capg.cust.bean.Cust;

public class CustomerServiceImp implements ICustomerService {
	IcustomerDAO dao=new CustomerDAOImp();
	@Override
	public int addcustomer(Cust c) {
		
		return dao.addcustomer(c);
	}

	@Override
	public int updateCustomer(Cust c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cust getCustomerById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomerbyId(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}
@Override
public List<Cust> getAllCustomers() {
	// TODO Auto-generated method stub
	return null;
}
public static boolean isValidId(int Id)
{
	boolean flag=false;
	if(Id!=0 && (Id>99 && Id<1000))
	{
		flag=true;
	}
	return flag;
}
public static boolean isValidname(String name)
{
	
	boolean flag=false;
	if(name.length()>=3)
	{
		flag=true;
	}
	return flag;
}

public static boolean userValidations(Cust c)

{
	boolean flag=false;
	if(isValidId(c.getId())&&isValidname(c.getName()))
	{
		flag=true;
	}
	return flag;
}


}
