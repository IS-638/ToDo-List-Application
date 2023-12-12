/*
Isaac Do
CS2336.001
 */

import java.util.*;

/**
 * This `Task` class represents a task with a description, due date, 
 * and completion status. 
 * Please implement the provided methods and add appropriate comments for each method.
 */

class Task implements Comparable<Task>
{
	private String description;
	private String dueDate;
	private boolean completed;

	/* default constructor */
    public Task()
	{
		this.description = "";
		this.dueDate = "";
		this.completed = false;
	}

	/* 
	 * Write appropriate comment:
	 *
	 * parameterized constructor
	 */
	public Task(String description, String dueDate)
	{
		this.description = description;
		this.dueDate = dueDate;
	}

	/* 
	 * Write appropriate comment:
	 *
	 * returns the description
	 */	
    public String getDescription()
	{
        return this.description;
	}
	
	/* 
	 * Write appropriate comment:
	 *
	 * returns the due date
	 */
    public String getDueDate()
	{
        return this.dueDate;
	}

	/*
	 * Write appropriate comment:
	 *
	 * returns if task is completed or not
	 */
	public boolean isCompleted()
	{
        return this.completed;
	}

	/* 
	 * Write appropriate comment:
	 */
	public void markCompleted()
	{
		this.completed = true;
    }

	/*
	 * This method overrides the `equals` method from the `Object` class. 
	 * It checks if two tasks are equal by comparing their description, due date, and completion status.
	 */
	@Override
	public boolean equals(Object obj)
	{
        Task task = (Task)obj;

		return completed == task.completed &&
				description.equals(task.description) &&
				dueDate.equals(task.dueDate);
	}

	/*
	 * This method overrides the `toString` method from the `Object` class. 
	 * It returns a string representation of the task, including its description, due date, and completion status.
     * 
	 */
	@Override
	public String toString() {
		return "Description: " + getDescription() + "\n" +
				"Due Date: " + getDueDate() + "\n" +
				"Status: " + (isCompleted() ? "Completed" : "Pending") + 
				"\n";
	}

	/* compares two tasks and their due dates */
	@Override
	public int compareTo(Task otherTask)
	{
		return this.dueDate.compareTo(otherTask.dueDate);
	}
}
class PersonalTask extends Task
{
	private String reminderDate;

	PersonalTask(String description, String dueDate, String reminderDate)
	{
		super(description, dueDate);
		this.reminderDate = reminderDate;
	}

	/* override toString method */
	public String toString()
	{
		return super.toString() + "Reminder Date: " + this.reminderDate + "\n";
	}
}
class WorkTask extends Task
{
	private int priorityLevel;

    WorkTask(String description, String dueDate, int priorityLevel)
	{
		super(description, dueDate);
		this.priorityLevel = priorityLevel;
	}

	public String toString()
	{
		return super.toString() + "Priority Level: " + this.priorityLevel + "\n";
	}
}
class ShoppingTask extends Task
{
	private String shoppingList;

    ShoppingTask(String description, String dueDate, String shoppingList)
	{
		super(description, dueDate);
		this.shoppingList = shoppingList;
	}

	public String toString()
	{
		return super.toString() + "Shopping List: " + this.shoppingList + "\n";
	}
}

