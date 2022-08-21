package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(1, "rtsh", 3000);
		printWithdrawTransaction(acc, acc.withdraw(1500));

		printDepositTransaction(acc, acc.deposit(0));

		Account acc1 = new Account(2, "ztr", 5000);
		printWithdrawTransaction(acc, acc.withdraw(4000));

		printDepositTransaction(acc1, acc1.deposit(10000));

	}

	private static void printDepositTransaction(Account acc, boolean deposit) {
		if (deposit) {
			System.out.println("Succesfully deposited");
			printAccountDetails(acc);
		} else
			System.out.println("Transaction failed: Could not deposit");

	}

	private static void printWithdrawTransaction(Account acc, boolean withdraw) {
		if (withdraw) {
			System.out.println("Successfully withdrawn");
			printAccountDetails(acc);
		}

		else
			System.out.println("Transaction failed: Could not withdraw");

	}

	private static void printAccountDetails(Account acc) {
		System.out.println("Account Number : " + acc.getAccountNumber());
		System.out.println("Account holder name: " + acc.getName());
		System.out.println("Account balance: " + acc.getBalance());
	}
}
