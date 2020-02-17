package com.capg.cust.bean;

import java.sql.Date;

public class Cust {
 
	private int id;
	private String name;
	private double Amount;
	private Date DOP;
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
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public Date getDOP() {
		return DOP;
	}
	public void setDOP(Date dOP) {
		DOP = dOP;
	}
	@Override
	public String toString() {
		return "Cust [id=" + id + ", name=" + name + ", Amount=" + Amount + ", DOP=" + DOP + "]";
	}
	
	
	
	
	
	
	
	
}
