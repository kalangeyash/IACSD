	package com.bank.comparator;
	import java.util.Comparator;

import com.bank.*;
import com.bank.core.BankAccount;
	
	public class SortByAccountTypeandBalance implements Comparator<BankAccount> {

		@Override
		public int compare(BankAccount o1, BankAccount o2) {
			// TODO Auto-generated method stub
			int type  =  o1.getAccType().compareTo(o2.getAccType());
			if(type == 0)
			{
				return Double.compare(o1.getBalance(),o2.getBalance());
				
			}
			return type;
		}
		
		
	}
