package assertion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean checkValidEmail(String emailId) {

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (emailId == null || "".equals(emailId.trim()))
			return false;
		return pat.matcher(emailId).matches();
	}

	public boolean checkValidPassword(String password) {
		
		if(password == null || "".equals(password.trim())) {
			return false;
		}

		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{10,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}
