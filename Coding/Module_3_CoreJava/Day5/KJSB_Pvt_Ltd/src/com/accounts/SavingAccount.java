package com.accounts;
/*Create subclasses:

SavingAccount -> add interestRate field and method applyInterest().


SavingAccount -> should not allow any negative balance in  withdraw operation .It should fail in such case.


*/
public class SavingAccount extends BankAccount {
	
	private float roi;
	
	public SavingAccount(int accountNumber, double balance, String name, String phoneNo,float roi)
	{
		super(accountNumber,balance,name,phoneNo);
		this.roi = roi;
	}
	
	public double withdraw(double amount) {
		double res = super.withdraw(amount);
		return res;
	}
	
	double applyInterest() {
		setBalance(getBalance() * roi);
		return getBalance();
	}
	
	
	
	
}
