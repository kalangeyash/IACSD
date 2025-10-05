package com.task.core;
/*
 . Lab exam difficulty level
Create a menu driven application "TaskManager" to manage your day-to-day tasks. 

You can create a class Task with fields like taskId, taskName, description, taskDate, status, active.  done
taskId should be unique and generated automatically. done
status should be either PENDING, IN PROGRESS or COMPLETED.
active should be either true or false. Deleted task will have active=false 
Newly added task should have default status as PENDING and active=true

You can use suitable data structure to store data in memory.

Following functionalities are expected -

a. Add New Task                       
b. Delete a task                         
c. Update task status               
d. Display all pending tasks     
e. Display all pending tasks for today           
f.  Display all tasks sorted by taskDate            

 **/

import java.time.LocalDate;

	public class TaskManager {
	
		private static int taskIdCounter;
		private int taskId;
		private String taskName;
		private  String description;
		private LocalDate  taskDate;
		private TaskStatus status;
		private boolean active;
		
		static
		{
			taskIdCounter = 1001;
		}
		
		public TaskManager(String taskName, String description, LocalDate taskDate, TaskStatus status) {
			this.taskId = taskIdCounter++;
			this.taskName = taskName;
			this.description = description;
			this.taskDate = taskDate;
			this.status = status;
			this.active = false;
		}
	@Override
	public String toString() {
		return "TaskManager [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description
				+ ", taskDate=" + taskDate + ", status=" + status + ", active=" + active + "]";
	}

	
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	


	
	
}
