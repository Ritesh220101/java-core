package com.aurionpro.test;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Example of string tokenizer");
		System.out.println("Number of tokens: "+str.countTokens());
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		System.out.println("---------------------");
		StringTokenizer s1 = new StringTokenizer("ewen,eowngow iwgiwn", ",");
		System.out.println("Number of tokens: "+s1.countTokens());
		while(s1.hasMoreTokens()) {
			System.out.println(s1.nextToken());
		}
		System.out.println("---------------------");
		StringTokenizer s2 = new StringTokenizer("ewen,eowngow,iwgiwn", ",",true);
		System.out.println("Number of tokens: "+s2.countTokens());
		while(s2.hasMoreTokens()) {
			System.out.println(s2.nextToken());
		}

	}

}
