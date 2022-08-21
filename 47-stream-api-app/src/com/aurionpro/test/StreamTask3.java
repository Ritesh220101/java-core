package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTask3 {

	public static void main(String[] args) {
		String[] names = { "Jay", "Nimesh", "Mark", "Mahesh", "Ramesh" };
		List<String> name = Arrays.asList(names);
		
		name.stream()
			.sorted()
			.limit(3)
			.forEach(System.out::println);
		System.out.println("-------------------");
		
		name.stream()
			.filter(n -> n.toLowerCase().contains("a"))
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		name.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		name.stream()
			.map(n -> n.substring(0, 3))
			.sorted()
			.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		name.stream()
			.filter(n -> n.length() <= 4)
			.forEach(System.out::println);
		
	}

}
