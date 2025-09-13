package com.bank.tester;
import java.util.ArrayList;

import com.bank.core.BankAccount;
import com.bank.custom_exception.BankingException;
import com.banking.validations.BankingValidations;


public class AccountTypeTester {

	public static void main(String[] args) throws BankingException{
		// TODO Auto-gpackage com.bank.tester;
	
//						ArrayList<BankAccount> list = new ArrayList<>();
//						list.add(new BankAccount(101,1000,"abc",null ,null, null));
//						list.add(new BankAccount(102,1000,"abc",null ,null, null));
//						list.add(new BankAccount(103,1000,"abc",null ,null, null));
//						
//						for(BankAccount x : list)
//						{
//							System.out.println(x);
//						}
//						
						System.out.println(BankingValidations.validateAccountType("SAVING_ACCOUNT"));
					}
					
					
				

			}

