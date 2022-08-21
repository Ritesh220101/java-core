package com.aurionpro.case2;

public class A {
	private int foo;
	public A(int foo) {
		this.foo = foo;
//		System.out.println("Foo is: "+foo);
	}
	
	public A() {
		this(1);
	}
	
	public int getFoo() {
		return foo;
	}
}
