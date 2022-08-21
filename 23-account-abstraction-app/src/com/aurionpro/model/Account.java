package com.aurionpro.model;

public abstract class Account {//if we declare class abstract we cannot make object of that class
	private int accountNumber;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void withdraw(double amount);//the withdraw method has been declared abstract because the withdraw method was never called as account can be savings/current in general there cannot be an Account account.

	public void deposit(double amount) {
		if(amount>0)
			balance = balance + amount;
	}



	

}
