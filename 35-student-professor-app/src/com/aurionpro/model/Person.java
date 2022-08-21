package com.aurionpro.model;

public class Person {
	private int id;
	private String address;
	private String dob;
	public Person(int id, String address, String dob) {
		super();
		this.id = id;
		this.address = address;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public String getDob() {
		return dob;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", dob=" + dob + "]";
	}
	
	
}
