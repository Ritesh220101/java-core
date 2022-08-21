package com.aurionpro.test;

import java.util.ArrayList;

import java.util.Collections;

import com.aurionpro.model.Employee;
import com.aurionpro.model.NameCompare;
import com.aurionpro.model.SalaryCompare;

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "ritz", 85000));
		employees.add(new Employee(2, "zitr", 55000));
		employees.add(new Employee(3, "jtipt", 35000));
		employees.add(new Employee(4, "tpitj", 105000));
		NameCompare name = new NameCompare();
		Collections.sort(employees,name);
		System.out.println("Sorting by name");
		for(Employee e:employees)
			System.out.println(e);
		System.out.println("-----------------------------------------------------");
		SalaryCompare salary = new SalaryCompare();
		Collections.sort(employees,salary);
		System.out.println("Sorting by salary");
		for(Employee e:employees)
			System.out.println(e);

	}

}
