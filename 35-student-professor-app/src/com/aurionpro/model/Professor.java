package com.aurionpro.model;

public class Professor extends Person implements ISalary{
	private double basicSalary;
	public Professor(int id, String address, String dob) {
		super(id, address, dob);
		this.basicSalary = 45000;
	}

	@Override
	public double calculateSalary() {
		return basicSalary*12;
		
	}

}
