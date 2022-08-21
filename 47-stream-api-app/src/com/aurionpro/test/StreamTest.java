package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
//		Stream<Integer> stream = Stream.of(10,20,30,40,50);
//		stream.forEach(n->System.out.println(n));
//		//If you try to run stream more than 1 time than it will show throw the exception java.lang.IllegalStateException.
////		stream.forEach(n->System.out.println(n));
//		
//		Stream<String> stream1 = Stream.of("ritz","zitr","jtipt","cat");
//		stream1.forEach(n->System.out.println(n));
//		
//		List<String> players = Arrays.asList("dhoni","sachin","sehwag","anil");
//		players.stream().forEach(n->System.out.println(n));
//		
//		Stream<String> str = Stream.generate(
//				()->"sometext").limit(7);
//		str.forEach(n->System.out.println(n));

		List<Integer> list = Arrays.asList(10, 20, 20, 20, 23, 34, 45, 66, 76, 77);
//		Set<Integer> set = new HashSet<Integer>();
//		for(int i:list) {
//			if(i%2==0) {
//				System.out.println(i);
////				set.add(i);
//			}	
//		}
//		System.out.println(set);
//		list.stream()
//			.filter(n -> n % 2 == 0)
//			.distinct()
//			.limit(5)
//			.forEach(System.out::println);

		List<Integer> evenList = list.stream()
									.filter(n -> n % 2 == 0)
									.distinct()
									.limit(5)
									.collect(Collectors.toList());
		evenList.forEach(System.out::println);

	}

}
