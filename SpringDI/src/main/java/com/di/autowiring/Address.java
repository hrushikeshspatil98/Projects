package com.di.autowiring;

public class Address {
	
	private String city;
	private String state;
	private String zip;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
}
