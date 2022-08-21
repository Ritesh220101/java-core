package com.aurionpro.model;

public class Developer extends Employee {
	private double pa;
	private double ot;

	public Developer(int employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);
		this.pa = getBasicSalary() * 0.3;
		this.ot = getBasicSalary() * 0.2;
	}

	public double getPa() {
		return pa;
	}

	public double getOt() {
		return ot;
	}

	@Override
	public double calculateAnnualCTC() {
		return (this.getBasicSalary() + getPa() + getOt()) * 12;

	}

	@Override
	public void printEmployeeSalaryDetails() {
		super.printDetails();
		System.out.println("PA :" + pa);
		System.out.println("OT :" + ot);
		System.out.println("Annual CTC :" + calculateAnnualCTC());
	}

}
