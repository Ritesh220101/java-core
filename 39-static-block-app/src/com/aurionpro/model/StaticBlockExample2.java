package com.aurionpro.model;

public class StaticBlockExample2 extends StaticBlockExample1{

	public StaticBlockExample2() {
		super();
		System.out.println("Constructor of child class");
	}
	static {
		System.out.println("Static block of child class");
	}
}
