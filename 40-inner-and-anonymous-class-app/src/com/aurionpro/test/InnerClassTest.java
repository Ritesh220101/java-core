package com.aurionpro.test;

import com.aurionpro.model.Outer;

public class InnerClassTest {

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.print();

	}

}
