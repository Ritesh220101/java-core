package com.aurionpro.model;

public class Student extends Person {
	private BranchType branch;
	public Student(int id, String address, String dob) {
		super(id, address, dob);
		this.branch = BranchType.SCIENCE;
	}
	public BranchType getBranch() {
		return branch;
	}
	
}
