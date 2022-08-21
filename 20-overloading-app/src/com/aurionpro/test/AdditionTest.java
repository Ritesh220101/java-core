package com.aurionpro.test;

import com.aurionpro.model.AddNumbers;

public class AdditionTest {

	public static void main(String[] args) {
		AddNumbers obj = new AddNumbers();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2, 3));
		System.out.println(obj.add(1.5, 2.5));
		System.out.println(obj.add(1.5, 2.5, 3.5));

	}

}
