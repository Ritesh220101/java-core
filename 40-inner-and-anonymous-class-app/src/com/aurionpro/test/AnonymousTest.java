package com.aurionpro.test;

import com.aurionpro.model.AnonymousClassExample;

class AnonymousTest {
	public static void main(String[] args) {
		AnonymousClassExample a = new AnonymousClassExample() {
			public void print() {
				super.print();
				System.out.println("Inside anonymous class");
			}
		};
		a.print();
	}

}