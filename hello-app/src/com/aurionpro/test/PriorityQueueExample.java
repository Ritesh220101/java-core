package com.aurionpro.test;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(4);
		p.add(3);
		p.add(1);
		System.out.println(p);
		p.remove();
		System.out.println(p);
		p.poll();
		System.out.println(p);
		System.out.println(p.peek());
	}

}
