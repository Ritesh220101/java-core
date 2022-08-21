package com.aurionpro.model;

public class SavingAccount extends Account {
	private static final double minBalance = 5000;

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (this.getBalance() - amount < minBalance)
			System.out.println("Insufficient balance");
		else{
			this.setBalance(this.getBalance() - amount);
		}
	}
}
