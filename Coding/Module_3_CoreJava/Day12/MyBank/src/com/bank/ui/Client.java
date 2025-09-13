package com.bank.ui;

import java.util.Scanner;

import com.bank.core.BankAccount;
import com.bank.service.BankImplementation;
import com.bank.service.BankService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			BankService bankServicer = new BankImplementation();
			boolean exit = false;
			System.out.println("Welcome to MyBank\n1.Register User");
			
			while(!exit )
			{
				try {
					switch(sc.nextInt()){
					case 1 :
						System.out.println("Enter User Details");
						System.out.println("AccountNumber , Balance , Name, PhoneNo, AccTpe(SAVING/CURRENT) , DOB,Rate of Interest if Saving account or Overdraft Limit if Current account");
//						System.out.println(bankServicer.openAccount(sc.nextInt(), sc.nextDouble(), sc.next(),  sc.next(), sc.next(), sc.next(),sc.nextDouble()));
						System.out.println(bankServicer.openAccount(101, 7007, "Yash", "8530815940", "SAVING_ACCOUNT", "2003-10-11",10));
						System.out.println(bankServicer.openAccount(102, 7000, "Sohel", "8530815940", "CURRENT_ACCOUNT", "2003-10-11",1000));
						break;
					case 2:
						System.out.println("Display the user \n\t Enter accoutn name");
						System.out.println(bankServicer.getSummary(sc.nextInt()));
						break;
						
					case 3: 
						System.out.println("Withdraw \n\t Enter accoutn number");
//						bankServicer.withdraw(101, 5000);
						bankServicer.withdraw(102, 7500);
						break;
					default:
						System.out.println("Invalid Choice");
					}

				}
				catch(Exception e)
				{
					
				}

			}
			

		}
	

	}

}
