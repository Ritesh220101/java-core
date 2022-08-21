package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;

import com.aurionpro.model.Employee;

public class EmployeHashMapTest {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "ritz", 35000));
		employees.add(new Employee(102, "zitr", 40000));
		employees.add(new Employee(103, "jtipt", 45000));
		employees.add(new Employee(104, "kat", 50000));
		employees.add(new Employee(105, "catou", 55555));
		HashMap<Integer,Employee> map = new HashMap<Integer,Employee>();
		for(Employee employee:employees)
			map.put(employee.getEmployeeId(), employee);
		
		System.out.println(map);
	}

}
