package com.aurionpro.model;

public class Manager extends Employee {
	private double hra;
	private double da;
	private double ta;

	public Manager(int employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);
		this.hra = getBasicSalary() * 0.3;
		this.da = getBasicSalary() * 0.2;
		this.ta = getBasicSalary() * 0.1;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}

	@Override
	public double calculateAnnualCTC() {
		return (this.getBasicSalary() + getHra() + getDa() + getTa()) * 12;

	}

	@Override
	public void printEmployeeSalaryDetails() {
		super.printDetails();
		System.out.println("HRA :" + hra);
		System.out.println("DA :" + da);
		System.out.println("TA :" + ta);
		System.out.println("Annual CTC :" + calculateAnnualCTC());
	}

}
