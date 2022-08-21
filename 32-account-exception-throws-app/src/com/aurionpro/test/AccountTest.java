package com.aurionpro.test;

import com.aurionpro.model.Account;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.InsufficientBalanceException;
import com.aurionpro.model.SavingAccount;
import com.aurionpro.model.InsufficientBalanceException;
public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(101, "ritz", 5000);
		try {
			acc.withdraw(10000);
		}
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
