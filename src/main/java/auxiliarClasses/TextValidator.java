package auxiliarClasses;

import java.util.regex.Pattern;

public class TextValidator {
	
	public static boolean validateName(String name) {
		return false;
	}
	
	public static boolean validateEmail(String name) {
		return false;
	}
	
	public static boolean validateID(String name) {
		return false;
	}

	public static boolean validateProgramCode(String programCode) {
		String pattern = "^[a-zA-Z]{3}$";
		Pattern regex = Pattern.compile(pattern);
		return regex.matcher(programCode).matches();
	}
}
