package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;

import com.aurionpro.model.Employee;

public class ComparableTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(100, "ritz", 85000));
		employees.add(new Employee(20, "zitr", 55000));
		employees.add(new Employee(3, "jtipt", 15000));
		employees.add(new Employee(400, "tpitj", 105000));
		
		Collections.sort(employees);
		for(Employee e:employees)
			System.out.println(e);
			
	}
	
	
	
	
}
