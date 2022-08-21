package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"ritzzzzz",50000));
		list.add(new Employee(2,"zitrrrr",100000));
		list.add(new Employee(3,"jtipt",60000));
		list.add(new Employee(4,"tpitj",75000));
		list.add(new Employee(5,"catou",30000));
		
		Optional<Employee> min = list.stream()
				.min(Comparator.comparingDouble(a->a.getSalary()));
		min.ifPresent(System.out::println);
		Optional<Employee> max = list.stream()
				.max(Comparator.comparingDouble(a->a.getSalary()));
		max.ifPresent(System.out::println);
		
		list.stream()
			.filter(n->n.getName().length()>6)
			.forEach(System.out::println);
		
		double sum = list.stream()
					.mapToDouble(n->n.getSalary())
					.sum();
		System.out.println("Total salary: "+sum);
	}

}
