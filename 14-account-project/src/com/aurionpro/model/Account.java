package com.aurionpro.model;

public class Account {
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

	public boolean withdraw(double amount) {
		int minimumBalance = 1000;
		if (balance - amount >= minimumBalance) {
			balance -= amount;
			return true;
		}
		return false;

	}

	public boolean deposit(double amount) {
		if(amount > 0 ) {
			balance += amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

	

}
