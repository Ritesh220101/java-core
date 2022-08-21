package com.aurionpro.model;

public class FixedThreadPool extends Thread{
	private int number;
	
	public FixedThreadPool(int number) {
		super();
		this.number = number;
	}

	public void run() {
		System.out.println("Task "+ number +" started");
		for(int i=number;i<=20;i++) {
			System.out.println(i);
		}
		System.out.println("Task "+ number +" ended");
	}
}
