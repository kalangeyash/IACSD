package com.accounts;
/*Create subclasses:

CurrentAccount ->  add overdraftLimit field and method useOverdraftFacility().

CurrentAccount -> should  allow any negative balance, in withdraw operation .
It should not fail till it exceeds the overdraft limit. After overdraft limit is exceeded then withdraw operation should fail.
*/


public class CurrentAccount extends BankAccount {
	private static double overdraftLimit;
	
	CurrentAccount(int accountNumber, double balance, String name, String phoneNo){
		super(accountNumber,balance,name,phoneNo);
	}
	
	
	
}
