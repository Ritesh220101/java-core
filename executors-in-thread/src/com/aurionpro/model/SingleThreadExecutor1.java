package com.aurionpro.model;

public class SingleThreadExecutor1 extends Thread{
	public void run() {
		System.out.println("Task 1 started");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Task 1 ended");
	}
}
