package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(1,"abcd",10000);
		printAccountDetails(saving);
		saving.deposit(5000);
		printAccountDetails(saving);
		saving.withdraw(10000);
		printAccountDetails(saving);
		
		CurrentAccount current = new CurrentAccount(501,"xyz",100);
		current.withdraw(30000);
		printAccountDetails(current);
		current.withdraw(25000);
		printAccountDetails(current);
		
		

	}

	public static void printAccountDetails(Account account) {
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
	}

}
