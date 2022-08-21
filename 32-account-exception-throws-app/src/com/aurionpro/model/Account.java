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

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance)
			// by using throw we can throw the exception or we can also create
			// custom exceptions
			throw new InsufficientBalanceException("Insufficient balance");
		balance -= amount;
	}

	public void deposit(double amount) {
		if (amount < 0)
//			throw new InvalidAmountException("Insufficient amount");
		balance = balance + amount;
	}

}
