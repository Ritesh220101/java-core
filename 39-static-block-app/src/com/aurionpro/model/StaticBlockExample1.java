package com.aurionpro.model;

public class StaticBlockExample1 {

	public StaticBlockExample1() {
		System.out.println("Constructor of parent class");
	}
	static {
		System.out.println("Static block of parent class");
	}
}
