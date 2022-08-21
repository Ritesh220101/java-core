package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
		System.out.println("Does set contains 4: "+set.contains(4));
		set.add(4);
		set.add(1);
		set.add(2);
		System.out.println("After adding 1,2,4: "+set);
		set.remove(3);
		System.out.println("After removing 3 from set: "+set);
		System.out.println("Size of set: "+set.size());
		set.clear();
		System.out.println("Set after clearing: "+set);
		System.out.println("Does set is empty: "+set.isEmpty());
	}

}
