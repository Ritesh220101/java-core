package com.aurionpro.model;

public class Kid extends Man {
	@Override //by adding @Override annotation we cannot change the method name as it is being derived from the parent class
	public void read() {
		System.out.println("Kid is reading");
	}
	
	@Override
	public void play() {
		System.out.println("Kid is playing");
	}
}
