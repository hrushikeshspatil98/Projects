package com.di.setterDI;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phoneList=" + phoneList + "]";
	}

	
	
	
	

}
