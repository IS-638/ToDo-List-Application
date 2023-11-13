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
	 */	
	public void addTask(Task task)
	{
        //TODO;Write your code here

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
        //TODO;Write your code here

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
     *
	 */
	public Integer getTasksCount()
	{
        //TODO;Write your code here
        return 0;
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

