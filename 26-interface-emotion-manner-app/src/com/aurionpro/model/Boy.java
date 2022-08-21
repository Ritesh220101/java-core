package com.aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greet() {
		System.out.println("Boy is saying hello");
	}

	@Override
	public void depart() {
		System.out.println("Boy is saying bye");
	}

}
