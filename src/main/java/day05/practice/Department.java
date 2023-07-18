package day05.practice;

public class Department {
	
	String deptName;
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}
	
	public void printDepartDetails() {
		System.out.println("Department: " + deptName);
	}


}
