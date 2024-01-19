package auxiliarClasses;

import java.util.regex.Pattern;

public class TextValidator {
	private final static String PROGRAM_CODE_REGEX = "^[a-zA-Z]{3}$";
	private final static String COURSE_CODE_REGEX = "^[a-zA-Z]{3}$";

	public static boolean isValidName(String name) {
		return name != null && name.matches("^[a-zA-Z'\\s]+$");
	}
	
	public static boolean isValidEmail(String name) {
		return false;
	}
	
	public static boolean isValidID(String name) {
		return false;
	}

	public static boolean isValidProgramCode(String programCode) {
		return programCode != null && programCode.matches(PROGRAM_CODE_REGEX);
	}

	public static boolean validCourseCode(String courseCode) {
		return courseCode != null && courseCode.matches(COURSE_CODE_REGEX);
	}
}
