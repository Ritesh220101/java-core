package com.aurionpro.model;

public class Accountant extends Employee {
	private double perks;

	public Accountant(int employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);
		this.perks = getBasicSalary() * 0.5;
	}

	public double getPerks() {
		return perks;
	}

	@Override
	public double calculateAnnualCTC() {
		return (this.getBasicSalary() + getPerks()) * 12;

	}

	@Override
	public void printEmployeeSalaryDetails() {
		super.printDetails();
		System.out.println("Perks :" + perks);
		System.out.println("Annual CTC :" + calculateAnnualCTC());
	}

}
