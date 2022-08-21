package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager manager = new Manager(1, "ritz", 30000);
		printSalarySlip(manager);
		Developer developer = new Developer(2, "zitr", 40000);
		printSalarySlip(developer);
		Accountant accountant = new Accountant(3, "jtipt", 50000);
		printSalarySlip(accountant);
	}

	private static void printSalarySlip(Employee employee) {
		employee.printEmployeeSalaryDetails();	
		System.out.println("------------------------");
	}

	

}
