
package com.banking.tester;

import com.banking.core.BankAccount;
import com.banking.core.CurrentAccount;
import com.banking.core.SavingAccount;

public class TestBanking {
	public static void main(String[] args) {

		BankAccount[] accounts = { new SavingAccount(101, 10000, "Rama Sethi", "9988123456", 5),
				new CurrentAccount(102, 5000, "Kiran Patil", "7988123456", 3000) };

		try {
			for (BankAccount acc : accounts) {
				System.out.println(acc);
				// Run time polymorphism - withdraw
				acc.withdraw(6000);
				// Subclass-specific logic (downcasting)
				if (acc instanceof SavingAccount) {
					SavingAccount sa = (SavingAccount) acc;
					sa.applyInterest();
				} else if (acc instanceof CurrentAccount) {
					CurrentAccount ca = (CurrentAccount) acc;
					ca.increaseOverdraftLimit(200);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
