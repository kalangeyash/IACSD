package com.banking.validations;
import com.bank.core.*;
import com.bank.custom_exception.BankingException;

import java.time.LocalDate;
import java.util.*;

public class BankingValidations {
	public static BankAccount validateAllInputs(int accountNumber, double balance, String name, String phoneNo,String accType, String dob,double rateOrLimit,List<BankAccount> accounts) throws BankingException
	{

		checkForDup(accountNumber, accounts);
		BankAccountTypes type = validateAccountType(accType);
		LocalDate birthDay = LocalDate.parse(dob);
		if(type.equals(BankAccountTypes.SAVING_ACCOUNT))
		{
			//accountNumber, balance, name, phoneNo,accType,dob
			return new SavingAccount(accountNumber,balance,name,phoneNo,type,birthDay,rateOrLimit);
		}else {
			return new CurrentAccount(accountNumber,balance,name,phoneNo,type,birthDay,rateOrLimit);
		}
		
//		return new BankAccount(accountNumber,balance,name,phoneNo,type,dob);
		
	}
	
	public static void checkForDup(int accountNumber, List<BankAccount> accountList) throws BankingException
	{
		BankAccount tmp = new BankAccount(accountNumber);
		if(accountList.contains(tmp))
		{
			throw new BankingException("Account Already exists with this account number");
		}
		
	}
	
	public static BankAccountTypes validateAccountType(String accType) throws BankingException
	{
		return BankAccountTypes.valueOf(accType.toUpperCase()); //saving
	}
}
