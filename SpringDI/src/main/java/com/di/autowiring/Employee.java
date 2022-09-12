package com.di.autowiring;

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
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phoneList=" + phoneList + "]";
	}

}
