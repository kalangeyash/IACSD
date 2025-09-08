package com.accounts;
/*Create subclasses:

CurrentAccount ->  add overdraftLimit field and method useOverdraftFacility().

CurrentAccount -> should  allow any negative balance, in withdraw operation .
It should not fail till it exceeds the overdraft limit. After overdraft limit is exceeded then withdraw operation should fail.
*/


public class CurrentAccount extends BankAccount {
	private  double overdraftLimit;
	
	CurrentAccount(int accountNumber, double balance, String name, String phoneNo,double overdraftLimit){
		super(accountNumber,balance,name,phoneNo);
		this.overdraftLimit = overdraftLimit;
	}

	public double withdraw(double amount)
	{	
		double balance = getBalance();
		if((balance+overdraftLimit)<amount)
		{
			System.out.println("Amount exceeding balance and overdraft limit");
			return -1;
		}
		else {
			balance -= amount;
			setBalance(balance);
		}
		
		return getBalance();
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
	
}
