package day02.misc;

public class Student {
	
	String name;
	int id;
	String email;
	public static String academy;
	static int count;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	// static initialization block
	static {
		Academy academy1 = new Academy();
		academy = academy1.getCode();
	}
	
	// constructor
	public Student() {
		Student.count = count + 1;
	}



}
