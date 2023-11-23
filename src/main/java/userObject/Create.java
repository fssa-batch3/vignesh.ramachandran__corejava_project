package userObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Create {

	public static void create(User user) throws RuntimeException {
		
		

		if (user == null) {
			throw new RuntimeException("User cannot be null");
		}

		String email = user.getEmail();
		String password = user.getPassword();
		
		if(email == null || "".equals(email.trim())) {
			throw new RuntimeException("Email cannot be null or empty");
		}
		
		if(password == null || "".equals(password.trim())) {
			throw new RuntimeException("Password cannot be null or empty");
		}
		
		if(password.length() > 8 && password.length() < 8) {
			throw new RuntimeException("Password should be in 8 characters");
		}
		
		// pattern
		String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern ptn = Pattern.compile(emailPattern);
		Matcher matcher = ptn.matcher(email);
		
		if(!matcher.matches()) {
			throw new RuntimeException("Email doesn't in required pattern");
		}
		
		String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8}$";
		Pattern ptn2 = Pattern.compile(passwordPattern);
		Matcher matcher2 = ptn2.matcher(password);
		
		if(!matcher2.matches()) {
			throw new RuntimeException("Password doesn't in required pattern");
		}
		
		
//		Dotenv env = Dotenv.load();
//		String url  = env.get("DATABASE_HOST");
//		String username = env.get("DATABASE_USERNAME");
//		String passwordDB = env.get("DATABASE_PASSWORD");
		
		Connection con = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			con = DriverManager.getConnection(url, username, passwordDB);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String query = "INSERT INTO users(email, password ) VALUES (? ,?)";
			
			ps = con.prepareStatement(query);
			
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ps.executeUpdate();
			
			System.out.println("User has been created sucessfully");
			
		}catch(SQLException e) {
//			e.printStackTrace();
			if(e.getMessage().contains("Duplicate entry")) {
				throw new RuntimeException("Duplicate constraint");
			} else {
				System.out.println(e.getMessage());
				throw new RuntimeException(e);
			}
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (ps != null) {
					ps.close();
				}

				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

	public static void main(String[] args) {

		User user = new User("vignesh@gmail.com", "asd123");

		create(user);

	}

}
