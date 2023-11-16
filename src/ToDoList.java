import java.util.*;

/**
 * @author mehra
 * This class represents a ToDoList and provides methods to perform 
 * various operations on the list. 
 * Please implement the provided methods and add appropriate comments for each method.
 *
 */
class ToDoList
{
	// entry to linked list
	private Node head;
	private int taskCount;

	/* 
     * @author mehra
     * The class has a private inner class named Node, which represents 
	 * a node in the linked list. 
	 * Each node contains a Task object and a reference to the next 
	 * node in the list.
	 */
	private class Node
	{
		private Task task;
		private Node next;

		public Node(Task task)
		{
			this.task = task;
			this.next = null;
		}		
	}

	/* 
	 * Write appropriate comment:
	 *
	 * This method traverses through the to-do list to find the last task and
	 * add the new task at the end of the list.
	 * If the list is empty (head points to null) then assign the new task as
	 * the first task.
	 */	
	public void addTask(Task task)
	{
		// assign the passed task as an argument to a new node
		Node newTaskNode = new Node(task);

		// check that there is a task in the list
		if (head != null)
		{
			// temporary store the first node
			Node currentTaskNode = head;

			/* keep traversing through the list as long as the next node
			* is not empty/null */
			while (currentTaskNode.next != null)
				/* update the current task to point to the next task in the list */
				currentTaskNode = currentTaskNode.next;

			/* insert the new task at the end of the list when the loop finds the
			* last node in the list */
			currentTaskNode.next = newTaskNode;
		}
		else
			/* if the list is empty then assign the new task to the head
			* of the list so that the head points to the first node in the list */
			head = newTaskNode;
		// keep count of tasks
		taskCount++;
	}

	/*
     * This method is responsible for displaying all tasks within the list. 
     * If the list is empty, it will print "No tasks found".
	 * Note: You must use the provided toString() method of the Task class to format the task details correctly.
     * 
     * Write appropriate comment:
     *
     * This method will traverse through the to-do list by looking at the current
     * node and checking if it is empty or not. If the current node is empty then no
     * task should be displayed otherwise display the current task and update the current
     * task to point to the next task.
	 */
	public void showAllTasks()
	{
		// ensure the list isn't empty
		if (head != null)
		{
			Node currentTaskNode = head;

			/* traverse through the list as long as the current node
			* isn't the last node */
			while (currentTaskNode != null)
			{
				// print each task
				System.out.println(currentTaskNode.task.toString());
				// update the current node to point to the next node
				currentTaskNode = currentTaskNode.next;
			}
		}
		else
			System.out.println("No tasks found");
	}

	/*
	 * This method marks a task as completed based on its description. 
     * If a match is not found it will print "Task not found", otherwise "Task marked as completed"
	 * Note: You must use the overriden equals() method of the Task class to search the task, to get the full credit.
     * 
     * Write appropriate comment:
     *
     * This method will traverse through the list like usual, but we will compare the current
     * task description with a given description for a match. If the description match then print
     * "Task marked as completed" and mark the task completed then exit the loop. If there is no match,
     * keep updating the current node and continue traversing through the list until a match or the loop
     * reaches the end of the list.
     *
	 */
	public void markTaskAsCompleted(String description)
	{
		Node currentTaskNode = head;

		while (currentTaskNode != null)
		{
			/* check for a match in the description */
			if (currentTaskNode.task.getDescription().equals(description))
			{
				System.out.println("Task marked as completed");

				/* mark the task completed */
				currentTaskNode.task.markCompleted();
				return;
			}
			/* point to the next node if description does not match */
			currentTaskNode = currentTaskNode.next;
		}
		System.out.println("Task not found");
	}

	/*
	 * This method filters the tasks based on their completion status. 
     * If a match is not found it will print "No tasks found". 
	 * Note: You must use the provided toString() method of the Task class to format the task details correctly.
     * 
     * Write appropriate comment:
     *
     * Traverse through the list and check each node based on given filter. If we are filtering for completed
     * tasks, ensure that the current task is marked completed then print.
     *
     */
	public void filterTasksByStatus(boolean completed)
	{
		Node currentTaskNode = head;

		while (currentTaskNode != null)
		{
			/* our filter is for completed task, and we must ensure the task is completed */
			if (completed && currentTaskNode.task.isCompleted())
				System.out.println(currentTaskNode.task.toString());
			/* we are filtering anything not completed */
			else if (!completed)
				System.out.println(currentTaskNode.task.toString());
			else
			{
				System.out.println("No tasks found");

				/* exit the loop if none found */
				return;
			}

			/* update the current node */
			currentTaskNode = currentTaskNode.next;
		}
	}

	/*
	 * This method checks if a given task is present in the list. 
	 * Note: You must use the overriden equals() method of the Task class to search the task, to get the full credit.
     * 
     * Write appropriate comment:
     *
	 */
	public Boolean containsTask(Task task1)
	{
        //TODO;Write your code here
        return false;
	}
    
	/*
     * Write appropriate comment:
     * returns the total task count
	 */
	public Integer getTasksCount()
	{
        //TODO;Write your code here
        return this.taskCount;
    }
    
    /*
     * Write appropriate comment:
     *
	 */
	public void sortTasks(String sortBy)
	{
        //TODO;Write your code here
    }
}

