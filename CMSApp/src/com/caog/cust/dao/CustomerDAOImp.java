package com.caog.cust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.capg.cust.bean.Cust;

public class CustomerDAOImp implements IcustomerDAO {

	
	Connection conn=DBUtil.getDBConnection();
	int count=0;
	
	@Override
	public int addcustomer(Cust c) {
		
		
		try {
			PreparedStatement pstmt=conn.prepareStatement(IQueryMapper.INSERT_CUST_QUERY);
			//count=pstmt.executeUpdate();
			pstmt.setInt(1, c.getId());
			pstmt.setString(2, c.getName());
			pstmt.setDouble(3, c.getAmount());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
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

}
