package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class Task {
	
	public String taskName;
    public int priority;
    
    public Task(String name, int priority) {
    	this.taskName = name;
    	this.priority = priority;
    }
    
    public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
    	for (Task task : tasks) {
            if (task.taskName.equals(name)) {
                return true;  // Found a task with the given name
            }
        }

        return false;
    }
	
    public static void main(String[] args) {
    	ArrayList<Task> tasks = new ArrayList<>();
    	tasks.add(new Task("Task 1", 1));
    	tasks.add(new Task("Task 2", 2));
    	tasks.add(new Task("Task 3", 3));
    	
    	boolean foundOk = findTaskByName("Task 2", tasks);
    	System.out.println(foundOk);
	}
    
    
	
	


}
