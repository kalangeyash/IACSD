package com.task.service;

import java.time.LocalDate;

import com.task.core.TaskStatus;
import com.task.exception.MyTaskException;

/*Following functionalities are expected -

a. Add New Task                       
b. Delete a task                         
c. Update task status               
d. Display all pending tasks     
e. Display all pending tasks for today           
f.  Display all tasks sorted by taskDate            
*/
public interface TaskService {
		String addNewTask(String taskName, String description, String taskDate, String status) throws MyTaskException;
		
		String deleteTask(int taskId)throws MyTaskException;
		
		String updateTaskStatus(int taskId)throws MyTaskException;
		
		void displayAllTask();
		
		void displayPendingTask();
		
		void sortTaskByDate();
		
}
