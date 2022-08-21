package com.aurionpro.model;

public class Man implements IMannerable, IEmotionable {//a class can implement multiple interfaces

	@Override
	public void cry() {
		System.out.println("Man is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Man is laughing");
	}

	@Override
	public void greet() {
		System.out.println("Man is saying hello");
	}

	@Override
	public void depart() {
		System.out.println("Man is saying bye");
	}

}
