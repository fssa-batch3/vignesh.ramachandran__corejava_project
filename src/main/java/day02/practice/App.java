package day02.practice;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Logger");
		Logger.debug("This is a debug message.");
		Logger.info("This is an informational message.");
		Logger.error("This is an error message.");
		Logger.debug(42);
		Logger.error(404);
		Logger.info(12345);

		System.out.println("User");

		User user = new User();
		user.setName("Maruthan Alagar");
		user.setEmailId("maruthan@fssa.freshworks.com");
		user.setId(10096);
		user.setPassword("asdf@1234");

		System.out.println(user.toString());

	}

}
