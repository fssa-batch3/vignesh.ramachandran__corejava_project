package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
	public int hashCode() {
		return Objects.hash(name, deadline);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(name, other.name) && Objects.equals(deadline, other.deadline);
	}

}

public class TaskList {
	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();

		taskList.add(new Task(1, "Task1", LocalDate.of(2023, 7, 19)));
		taskList.add(new Task(2, "Task2", LocalDate.of(2023, 7, 20)));
		taskList.add(new Task(3, "Task1", LocalDate.of(2023, 7, 19))); // Duplicate Task
		taskList.add(new Task(4, "Task1", LocalDate.of(2023, 8, 29))); // Duplicate Task

		Set<Task> uniqueTasks = new HashSet<>(taskList);

		for (Task task : uniqueTasks) {
			System.out.println("Task ID: " + task.getId());
			System.out.println("Task Name: " + task.getName());
			System.out.println("Task Deadline: " + task.getDeadline());
			System.out.println();
		}
	}
}
