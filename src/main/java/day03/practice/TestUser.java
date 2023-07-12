package day03.practice;

public class TestUser {

	public static void main(String[] args) {
		
		User user = new User();
		System.out.println("name=" + user.name + ", " + "email=" + user.email + ", " + "password=" + user.password);
		
		User user1 = new User("Vignesh", "vignesh@gmail.com", "123asd");
		System.out.println("name=" + user1.name + ", " + "email=" + user1.email + ", " + "password=" + user1.password);

	}

}
