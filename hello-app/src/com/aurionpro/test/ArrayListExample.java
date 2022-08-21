package com.aurionpro.test;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println(arr);
		arr.remove(0);
		System.out.println("After removing: "+arr);
		System.out.println("Size of arraylist: "+arr.size());
		System.out.println("Does arraylist contains 2: "+arr.contains(2));
		System.out.println(arr);
		System.out.println("Is arraylist empty?: "+arr.isEmpty());
		System.out.println("Element at index 3: "+arr.indexOf(3));
		arr.set(0, 1);
		System.out.println(arr);

	}

}
