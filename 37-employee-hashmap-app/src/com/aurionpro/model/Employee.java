package com.aurionpro.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;

	public Employee(int employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ "]";
	}
	
}
