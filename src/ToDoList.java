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
	 */
	public void showAllTasks()
	{
		if (head != null)
		{
			Node current = head;
			while (current != null)
			{
				System.out.println(current.task.toString());
				current = current.next;
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
	 */
	public void markTaskAsCompleted(String description)
	{
		//TODO;Write your code here

	}
	/*
	 * This method filters the tasks based on their completion status. 
     * If a match is not found it will print "No tasks found". 
	 * Note: You must use the provided toString() method of the Task class to format the task details correctly.
     * 
     * Write appropriate comment:
     */
	public void filterTasksByStatus(boolean completed)
	{
        //TODO;Write your code here

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

