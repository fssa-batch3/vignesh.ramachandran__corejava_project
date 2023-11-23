package userObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//import io.github.cdimascio.dotenv.Dotenv;

public class Update {

	public static void update(User user) {
		
		
		// if already exists

		if (user == null) {
			throw new RuntimeException("User cannot be null");
		}

		String email = user.getEmail();
		String password = user.getPassword();

		if (email == null || "".equals(email.trim())) {
			throw new RuntimeException("Email cannot be null or empty");
		}

		if (password == null || "".equals(password.trim())) {
			throw new RuntimeException("Password cannot be null or empty");
		}

		if (password.length() > 8 && password.length() < 8) {
			throw new RuntimeException("Password should be in 8 characters");
		}

		// pattern
		String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern ptn = Pattern.compile(emailPattern);
		Matcher matcher = ptn.matcher(email);

		if (!matcher.matches()) {
			throw new RuntimeException("Email doesn't in required pattern");
		}

		String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8}$";
		Pattern ptn2 = Pattern.compile(passwordPattern);
		Matcher matcher2 = ptn2.matcher(password);

		if (!matcher2.matches()) {
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
			String query = "SELECT * FROM users WHERE is_active = 1 AND email = ?";

			ps = con.prepareStatement(query);
			ps.setString(1, email);// don't start with zero, 1 represent the 1st question mark
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new RuntimeException("User not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
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
		
		
		
		// update user
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

//			con = DriverManager.getConnection(url, username, passwordDB);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		try {
			String query = "UPDATE users SET password=? WHERE email =?";
			
			ps = con.prepareStatement(query);
			
			ps.setString(1, password);
			ps.setString(2, email);
			
			
			int rowUpdated = ps.executeUpdate();
			
			if (rowUpdated > 0) {
	            System.out.println("User with ID " + email + " updated successfully.");
	        } else {
	            System.out.println("No user found with ID " + email+ ". Nothing updated.");
	        }
			
			
		} catch (SQLException e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		     throw new RuntimeException("Error updating user: " + e.getMessage());
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

		update(user);

	}

}
