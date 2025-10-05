package com.task.tester;


import com.task.service.TaskServiceImplementation;
import com.task.exception.MyTaskException;

public class TestTask {

    public static void main(String[] args) {

        try {
            TaskServiceImplementation service = new TaskServiceImplementation();

            // ✅ Add few tasks
            System.out.println(service.addNewTask(
                "Project Module 1",
                "Complete backend for project",
                "2025-10-06",
                "PENDING"
            ));

            System.out.println(service.addNewTask(
                "Prepare Presentation",
                "Make slides for client meeting",
                "2025-10-05",
                "INPROGRESS"
            ));

            System.out.println(service.addNewTask(
                "Team Meeting",
                "Discuss progress and blockers",
                "2025-10-07",
                "PENDING"
            ));

            System.out.println(service.addNewTask(
                "Code Review",
                "Review pull requests",
                "2025-10-04",
                "COMPLETED"
            ));

            System.out.println("\n=== All Tasks ===");
            service.displayAllTask();

            // ✅ Display only pending tasks
            System.out.println("\n=== Pending Tasks ===");
            service.displayPendingTask();

            // ✅ Update task status (mark taskId 1001 as COMPLETED)
            System.out.println("\n=== Update Task Status ===");
            System.out.println(service.updateTaskStatus(1001));

            // ✅ Sort and display tasks by date
            System.out.println("\n=== Tasks Sorted by Date ===");
            service.sortTaskByDate();

            // ✅ Delete a task
            System.out.println("\n=== Delete Task ===");
            System.out.println(service.deleteTask(1002));

            // ✅ Display all tasks after deletion
            System.out.println("\n=== Tasks After Deletion ===");
            service.displayAllTask();

        } catch (MyTaskException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}