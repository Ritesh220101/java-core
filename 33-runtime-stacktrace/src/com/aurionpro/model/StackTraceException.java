package com.aurionpro.model;

public class StackTraceException {
	public static void main(String[] args) throws Exception {
		method1();
		System.out.println("End of main");
	}

	private static void method1() throws Exception {
		try {
			method2();
		} catch (Exception e) {
			
//			e.printStackTrace();
		}
		System.out.println("End of method 1");
		
	}

	private static void method2() throws Exception {
		method3();
		System.out.println("End of method 2");
		
	}

	private static void method3() throws Exception {
		throw new Exception("Error in method 3");
		
	}
}
