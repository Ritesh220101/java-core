package com.aurionpro.test;

import java.util.LinkedList;

public class LinkedlistExample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		System.out.println(list);
		System.out.println("First element in the list: "+list.getFirst());
		System.out.println("Last element in the list: "+list.getLast());;
		System.out.println("Element of a given index in the list: "+list.get(1));
		list.addFirst(0);
		System.out.println("After adding 0: "+list);
		System.out.println("Index of a specific element: "+list.indexOf(5));
		list.add(1);
		list.add(1);
		System.out.println("Last occurence index of a specific element: "+list.lastIndexOf(1));
		System.out.println(list.peek());
		System.out.println(list.peekLast());
		list.poll();
		System.out.println("After poll the list: "+list);
		list.pollLast();
		System.out.println("After poll the list: "+list);
		list.set(4, 2);
		System.out.println("After set the list: "+list);
		list.push(4);
		System.out.println("After push the list: "+list);
		System.out.println("Size of linkedlist: "+list.size());
	}

}
