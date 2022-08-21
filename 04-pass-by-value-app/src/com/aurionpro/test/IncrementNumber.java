package com.aurionpro.test;

public class IncrementNumber {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		incrementNumberByOne(num);
		System.out.println(num);
		
	}
	public static void incrementNumberByOne(int num) {
		num+=1;
	}
}
