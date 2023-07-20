package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Task implements Comparable<Task> {
	private int id;
	private String name;
	private LocalDate deadline;
	
	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public int compareTo(Task otherTask) {
		return this.getDeadline().compareTo(otherTask.getDeadline());
	}
	
}

public class TaskList {

	public static void main(String[] args) {
		
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(3,"Coding",LocalDate.of(2022, 10, 22)));
		tasks.add(new Task(5,"Product Design",LocalDate.of(2022, 10, 01)));
		tasks.add(new Task(1,"Software Design",LocalDate.of(2022, 10, 07)));
		tasks.add(new Task(3,"Coding",LocalDate.of(2022, 10, 22)));
		
		
		Collections.sort(tasks);
		
		for (Task task : tasks) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
        }
		
		

	}

}
