package day05.practice;

public class Student {

	String name;
	int id;
	Department department;
	
	public Student() {
		
	}
	
	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	public void printStudentDetails() {
		System.out.println("Student Details: "+ "\n" +
			"Name: "+ this.name + "\n" +
			"Id: " + this.id);
		
		this.department.printDepartDetails();
	}
}
