package com.kodewala.bean.annotation_type_1.bean_annotation_type_1;

public class Employee {

	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	
	public Employee(String firstName, String lastName, String email /*, Address address*/) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
//		this.address = address;
	}
	
	public void setAddress(Address _address)
	{
		this.address = _address;
	}
}
