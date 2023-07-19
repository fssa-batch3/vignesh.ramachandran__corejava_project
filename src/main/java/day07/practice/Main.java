package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Task {
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

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (id != other.id)
			return false;
		if (deadline == null) {
			if (other.deadline != null)
				return false;
		} else if (!deadline.equals(other.deadline))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class Main {

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();

		// Add tasks to the list
		taskList.add(new Task(1, "Task1", LocalDate.parse("2023-07-20")));
		taskList.add(new Task(2, "Task2", LocalDate.parse("2023-07-21")));
		taskList.add(new Task(3, "Task1", LocalDate.parse("2023-07-20"))); // Duplicate task
		taskList.add(new Task(4, "Task2", LocalDate.parse("2023-07-21"))); // Duplicate task

		System.out.println("Original task list:");
		for (Task task : taskList) {
			System.out.println(
					"Task ID: " + task.getId() + ", Name: " + task.getName() + ", Deadline: " + task.getDeadline());
		}

		HashSet<Task> uniqueTasks = new HashSet<>(taskList);

		System.out.println("\nUnique task list:");
		for (Task task : uniqueTasks) {
			System.out.println(
					"Task ID: " + task.getId() + ", Name: " + task.getName() + ", Deadline: " + task.getDeadline());
		}
	}
}
