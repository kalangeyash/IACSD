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

	@Override
	public String deleteTask(int taskId) throws MyTaskException{
		// TODO Auto-generated method stub
		
		TaskManager t = map.get(taskId);
		if(t == null)
		{
			throw new MyTaskException("Task with given Id does not exist ...");
		}
		t.setActive(false);
		return "Task "+ taskId + " has been deleted";

	}

	@Override
	public String updateTask(int taskId)throws MyTaskException {
		// TODO Auto-generated method stub
		
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
		
	}

	@Override
	public void sortTaskByDate() {
		// TODO Auto-generated method stub
		
	}

}
