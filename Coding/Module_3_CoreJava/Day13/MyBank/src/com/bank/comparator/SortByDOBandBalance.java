package com.bank.comparator;

import java.util.Comparator;

import com.bank.core.BankAccount;

public class SortByDOBandBalance implements Comparator<BankAccount>{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		int type =  o1.getDob().compareTo(o2.getDob());
		
		if(type == 0)
		{
			return Double.compare(o1.getBalance(), o2.getBalance());
		}
		return type;
	}
	
	

}
