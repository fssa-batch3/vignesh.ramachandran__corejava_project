package day10.practice;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		//Question 1
		System.out.println("Question 1");
		String email1 = "vignesh@gmail.com";
		String email2 = "vigneshgmail.com";
		
		
			try {
				if(EmailValidator.isValidEmail(email1)) {
					System.out.println("Valid email :" + email1);
				}
			
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
			
			
			System.out.println();
			System.out.println();
			System.out.println();
		
		
		//Question 2
			System.out.println("Question 2");
			UserRegister userRegister = new UserRegister();
			User user1 = new User(1, "Vignesh", "vignesh@gmail.com");
			User user2 = new User(2, "Vignesh Ramachandran", "vignesh.ramachandran@email.com");
			User user3 = new User(3, "Ramachandran", "vigneshramachandran@gmail.com");
			try {
				userRegister.register(user1);
				userRegister.register(user2);
				userRegister.register(user3);
			} catch (Exception e) {
				//System.out.println("UserAlreadyExistsException = " + e.getMessage());
				e.printStackTrace();
			}
			ArrayList<User> userList = userRegister.getUserList();
			for (User user : userList) {
				System.out.println("User ID: " + user.id + ", Name: " + user.name + ", Email: " + user.email);
			}
		

	}

}
