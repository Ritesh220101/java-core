package com.aurionpro.model;

public class StackTraceRuntimeException {
	public static void main(String[] args) {
		method1();
		System.out.println("End of main");
	}

	private static void method1() {
		try {
			method2();
		} catch (RuntimeException e) {
			
			e.printStackTrace();
		}
		System.out.println("End of method 1");
		
	}

	private static void method2() {
		method3();
		System.out.println("End of method 2");
		
	}

	private static void method3() {
		throw new RuntimeException("Error in method 3");
		
	}

	
}
