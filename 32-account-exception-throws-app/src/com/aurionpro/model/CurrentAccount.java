package com.aurionpro.model;

public class CurrentAccount extends Account {
	private static final double overDraft = 50000;

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (this.getBalance() - amount < -overDraft)
			System.out.println("Insufficient balance");
		else{
			this.setBalance(this.getBalance() - amount);
		}
	}

}
