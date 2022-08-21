package com.aurionpro.test;

import com.aurionpro.model.IAddable;

public class IAddableTest {
	public static void main(String[] args) {
		
		IAddable i = new IAddable() {

			@Override
			public int addIntegers(int a, int b) {
				return a + b;
			}
		};
		System.out.println("Using anonymous class: "+i.addIntegers(1, 2));

		IAddable i1 = (a, b) -> {
			return a + b;
		};
		System.out.println("Using lambda function: "+i1.addIntegers(3, 4));

		IAddable i2 = IAddableTest::addNumbers;
		System.out.println("Using static reference: "+i2.addIntegers(10, 20));

	}

	public static int addNumbers(int x, int y) {
		return x + y;
	}
}
