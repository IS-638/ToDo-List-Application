import java.util.*;
/**
 * This `Task` class represents a task with a description, due date, 
 * and completion status. 
 * Please implement the provided methods and add appropriate comments for each method.
 */

class Task {
	private String description;
	private String dueDate;
	private boolean completed;

    public Task() {
        //Write your code here
	}
	/* 
	 * Write appropriate comment:
	 */
	public Task(String description, String dueDate) {
        //Write your code here
	}

	/* 
	 * Write appropriate comment:
	 */	
    public String getDescription() {
        //Write your code here
        return null;
	}
	
	/* 
	 * Write appropriate comment:
	 */
    public String getDueDate() {
        //Write your code here
        return null;
	}

	/* 
	 * Write appropriate comment:
	 */
	public boolean isCompleted() {
        //Write your code here
        return false;
	}

	/* 
	 * Write appropriate comment:
	 */
	public void markCompleted() {
                //Write your code here
    }

	/*
	 * This method overrides the `equals` method from the `Object` class. 
	 * It checks if two tasks are equal by comparing their description, due date, and completion status.
	 */
	@Override
	public boolean equals(Object obj) {
        //Write your code here
        return false;
	}
    
    
//********************************************************* DO NOT CHANGE ***************************************************//
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

}
class PersonalTask extends Task{
	PersonalTask(String description, String dueDate, String reminderDate){}
}
class WorkTask extends Task{
    WorkTask(String description, String dueDate, int priorityLevel){}
}
class ShoppingTask extends Task{
    ShoppingTask(String description, String dueDate, String shoppingList){}
}

