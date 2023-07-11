package day02.practice;

public class User {
	
	@Override
	public String toString() {
		return "User Details : Id = " + getId() + ", Name = " + getName() + ", Password = " + getPassword()
				+ ", Email Id = " + getEmailId();
	}

	private int id;
	private String name;
	private String password;
	private String emailId;

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmailId() {
		return emailId;
	}

}
