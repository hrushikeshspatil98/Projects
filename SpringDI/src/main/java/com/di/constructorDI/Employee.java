package com.di.constructorDI;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	private List<String> phoneList;
	
	public void getEmpDetails()
	{
		System.out.println("Id: "+id+ " Name: "+name+  "Address: "+address+ " Phone No's: "+phoneList);
	}

	public Employee(int id, String name, Address address, List<String> phoneList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneList = phoneList;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phoneList=" + phoneList + "]";
	}

	
	
	
	

}
