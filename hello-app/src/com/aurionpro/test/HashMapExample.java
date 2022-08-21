package com.aurionpro.test;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "ritz");
		map.put(2, "zitr");
		map.put(3, "jtipt");
		map.put(4, "kat");
		System.out.println(map);
		map.put(4, "cat");
		System.out.println("After adding a new value with the same key: " + map);
		System.out.println("HashMap size: " + map.size());

		System.out.println("Value of key=2: " + map.get(2));
		System.out.println("Value of key=5: " + map.get(5));
		map.remove(2);
		System.out.println("After removing the key 2: " + map);
		map.replace(4, "dsp");
		System.out.println("After replacing: " + map);
		map.put(null, "ztr");
		System.out.println(map);
		System.out.println("Types of keys in map: " + map.keySet());
		System.out.println("Types of values in map: " + map.entrySet());
	}

}
