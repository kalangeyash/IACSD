package com.task.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.task.core.TaskManager;
import com.task.core.TaskStatus;
import com.task.exception.MyTaskException;
import com.task.validations.TaskValidations;

public class TaskServiceImplementation implements TaskService {
	
	Map<Integer,TaskManager> map;
	
	public TaskServiceImplementation() {
		// TODO Auto-generated constructor stub
		map= new HashMap<>();
	}
	

	@Override
	public String addNewTask(String taskName, String description, String taskDate, String status)  throws MyTaskException{
		// TODO Auto-generated method stub
		TaskManager m = TaskValidations.validateInput(taskName, description, taskDate, status);
		map.put(m.getTaskId(), m);
		return  "Task Added successfully";
	}

//	@Override
//	public String deleteTask(int taskId) throws MyTaskException{
//		// TODO Auto-generated method stub
//		
//		TaskManager t = map.get(taskId);
//		if(t == null)
//		{
//			throw new MyTaskException("Task with given Id does not exist ...");
//		}
//		
//		t.setActive(false);
//		map.remove(taskId);
//		return "Task "+ taskId + " has been deleted";
//
//	}
	public String deleteTask(int taskId) throws MyTaskException {
	    TaskManager t = map.get(taskId);  // first check if task exists

	    if (t == null) {
	        throw new MyTaskException("Task with given Id does not exist ...");
	    }

	    // mark as inactive before deleting (optional: depends on your design)
	    t.setActive(false);

	    // remove from map
	    map.remove(taskId);

	    return "Task " + taskId + " has been deleted";
	}

	@Override
	public String updateTask(int taskId)
//			throws MyTaskException 
	{
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void displayAllTask() {
		// TODO Auto-generated method stub
		for(TaskManager x : map.values())
			{
				System.out.println(x);
			}
	}

	@Override
	public void displayPendingTask() {
		// TODO Auto-generated method stub
		
		for(TaskManager x : map.values())
		{
//			if(x.getStatus().equals("PENDING"))   // works only if getStatus() returns String .....but here it return TaskStatus (Enum)
				// x.getStatus() == "PENDING"        // wrong: `==` compares references, not values
			if(x.getStatus() == TaskStatus.PENDING)
			{
				System.out.println(x);
			}
		}
		
	}

	@Override
	public void sortTaskByDate() {
		// TODO Auto-generated method stub
		map.values()
		.stream()
		.sorted((x1,x2) -> x1.getTaskDate().compareTo(x2.getTaskDate()))
		.forEach(x-> System.out.println(x));
	}

}
