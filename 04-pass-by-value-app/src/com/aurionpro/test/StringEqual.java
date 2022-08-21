package com.aurionpro.test;

public class StringEqual {

	public static void main(String[] args) {
		String s = "ritz";
		System.out.println(s.hashCode());
		String s1 = "ritesh";
		System.out.println(s1.hashCode());
		String s2 = new String("ritesh").intern();
		System.out.println(s2.hashCode());
		
		if(s1==s2)
			System.out.println("Equal");
		else System.out.println("Not Equal");
	}

}
