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
						
						System.out.println(bankServicer.openAccount(102, 7008, "Sohel", "8530815940", "CURRENT_ACCOUNT", "2003-10-11",1000));
						System.out.println(bankServicer.openAccount(103, 7007, "NIkhil", "8530815940", "CURRENT_ACCOUNT", "2003-10-11",1000));
						System.out.println(bankServicer.openAccount(152, 7093739, "tejas", "8530815940", "Saving_ACCOUNT", "2003-10-11",1000));
						System.out.println(bankServicer.openAccount(112, 70, "Chetan", "8530815940", "CURRENT_ACCOUNT", "2003-10-11",1000));
						System.out.println(bankServicer.openAccount(101, 7007, "Yash", "8530815940", "SAVING_ACCOUNT", "2003-10-11",10));
						System.out.println(bankServicer.openAccount(129, 40, "Kaustabh", "8530815940", "CURRENT_ACCOUNT", "2003-10-11",1000));
						System.out.println(bankServicer.openAccount(55, 8403333, "Jethalal", "8888888888", "CURRENT_ACCOUNT", "2000-05-15",2999));
						System.out.println(bankServicer.openAccount(115, 5000, "rajan", "9876543210", "SAVING_ACCOUNT", "2001-05-20", 500));
						System.out.println(bankServicer.openAccount(120, 2500, "Aarav", "9123456780", "CURRENT_ACCOUNT", "2000-12-15", 2000));
						System.out.println(bankServicer.openAccount(108, 10000, "Kavya", "9988776655", "SAVING_ACCOUNT", "2003-10-11", 50));
						System.out.println(bankServicer.openAccount(132, 1500, "Rohit", "9090909090", "CURRENT_ACCOUNT", "2002-07-07", 300));
						System.out.println(bankServicer.openAccount(140, 7500, "Meera", "9191919191", "SAVING_ACCOUNT", "2001-05-20", 100));


						
						break;
					case 2:
						System.out.println("Display the user \n\t Enter accoutn name");
						System.out.println(bankServicer.getSummary(sc.nextInt()));
						break;
					case 0:
						System.out.println("Print all");
						bankServicer.getAllAcc();
						break;
						
					case 3: 
						System.out.println("Withdraw \n\t Enter accoutn number");
//						bankServicer.withdraw(101, 5000);
						bankServicer.withdraw(102, 7500);
						break;
						
					case 4:
						System.out.println("Depoiting ");
						bankServicer.deposit(101, 50000);
						break;
					case 5: 
						System.out.println("Closing account: ");
						bankServicer.closeAccount(101);
						System.out.println("List after deleteing");
						bankServicer.getAllAcc();
						
						break;
						
					case 6 :
						System.out.println("Before Sorting");
						bankServicer.getAllAcc();
						System.out.println(" after sortByAccountNumber");
						bankServicer.sortByAccountNumber();
						bankServicer.getAllAcc();
						break;
					case 7:
						System.out.println("Before Sorting");
						bankServicer.getAllAcc();
						System.out.println(" after sortByAccType and Balance");
						bankServicer.sortByAccTypeandBalance();
						bankServicer.getAllAcc();
						break;
					case 8:
						System.out.println("Before Sorting");
						bankServicer.getAllAcc();
						System.out.println(" after sortByDOB and Balance");
						bankServicer.sortByDOBandBalance();
						bankServicer.getAllAcc();
						break;
					case 9:
						System.out.println("Before Deeleting");
						bankServicer.getAllAcc();
						System.out.println(" after Deleting with less balance");
						bankServicer.delAccWithLessBalance(5000);
						bankServicer.getAllAcc();
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
