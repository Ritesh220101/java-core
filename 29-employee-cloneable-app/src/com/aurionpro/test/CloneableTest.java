package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class CloneableTest {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "ritz", 50000);
		
		try {
			Employee emp = (Employee) employee.clone();
			System.out.println(employee);
			System.out.println("Cloned "+emp);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
