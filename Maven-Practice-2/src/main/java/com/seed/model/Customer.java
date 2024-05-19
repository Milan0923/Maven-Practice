package com.seed.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cust")
@Scope("prototype")
public class Customer {

	int custId;
	String custName;
	Address custAdd;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Customer(int custId, String custName, Address custAdd) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAdd = custAdd;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAdd=" + custAdd + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getCustAdd() {
		return custAdd;
	}

	public void setCustAdd(Address custAdd) {
		this.custAdd = custAdd;
	}

//	public void execute() {
//		System.out.println("customer");
//		
//	}
	
}
