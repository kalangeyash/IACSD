package com.task.ui;

import java.util.Scanner;

import com.task.exception.MyTaskException;
import com.task.service.TaskService;
import com.task.service.TaskServiceImplementation;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc  = new Scanner(System.in))
		{
			TaskService service = new TaskServiceImplementation();
			
			boolean exit = false; 
			System.out.println("hello and welcome to task manager");
			System.out.println("1. Add New Task                       \n"
					+ "2. Delete a task                         \n"
					+ "3. Update task status               \n"
					+ "4. Display all pending tasks     \n"
					+ "5. Display all pending tasks for today           \n"
					+ "6  Display all tasks sorted by taskDate      ");
			while(!exit)
			{
				System.out.println("\t\t\tEnter choice\n");
				
				try {
//			
					switch(sc.nextInt())
						{
						case 1:
							sc.nextLine();
							
						    System.out.println( " taskName ");
						    String taskName = sc.nextLine();
						    System.out.println( " description");
						    String description = sc.nextLine();
						    System.out.println(" taskDate : ");
						    String taskDate = sc.nextLine();
						    System.out.println("status : ");
						    String status = sc.nextLine();// remove spaces/newlines
						    



	
						    String s = service.addNewTask(taskName, description, taskDate, status);
					    System.out.println("[Status] : " + s);
					    break;
					case 2:
						System.out.println("enter taskId which you want to delete");
						service.deleteTask(sc.nextInt());
							
					case 4:
						System.out.println("\t\tDisplaying all Tasks....\n");
						service.displayAllTask();
						break;
					}
					
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
		}

	}

}
