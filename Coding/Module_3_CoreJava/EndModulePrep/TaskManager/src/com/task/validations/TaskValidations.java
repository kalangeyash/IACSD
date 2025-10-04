package com.task.validations;

import java.time.LocalDate;

import com.task.core.TaskManager;
import com.task.core.TaskStatus;
import com.task.exception.MyTaskException;



public class TaskValidations {
		public static TaskManager  validateInput(String taskName, String description, String taskDate, String status) throws MyTaskException
		{	
//			LocalDate parsedDate = LocalDate.parse(taskDate);
			LocalDate parsedDate = validateDate(taskDate);
			
//			 TaskStatus parsedStatus = TaskStatus.valueOf(status.toUpperCase());
			TaskStatus parsedStatus =  validateStatus(status);
			
			System.out.println("\ntaskName : "+ taskName + "\nTaskDesc : "+description + "\nTask Date: "+ parsedDate +"\nStatus : "+ parsedStatus);
			
			
			
			return new TaskManager(taskName, description, parsedDate, parsedStatus);
			
		}	
		
		public static TaskStatus validateStatus(String status) throws MyTaskException
		{
				try {
					status.toUpperCase();
					return TaskStatus.valueOf(status);
					
				}catch(Exception e)
				{
					throw new  MyTaskException("[MyTaskException ] : Please enter valid status ..."+status+" <- This is  ");
				}
			
		}
		
		public static LocalDate validateDate(String taskDate) throws MyTaskException
		{
			try {
				taskDate = taskDate.trim();
				return LocalDate.parse(taskDate);
			}catch(Exception e)
			{
				throw new MyTaskException("[MyTaskException ] : Please enter valid Date ..." + taskDate);
			}
		}
}
