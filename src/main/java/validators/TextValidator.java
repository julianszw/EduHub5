package validators;

import enums.Country;

import java.util.regex.Pattern;

public class TextValidator {
	private final static Pattern NAME_REGEX = Pattern.compile("^[a-zA-Z'\\- ]+$");
	private final static Pattern PROGRAM_CODE_REGEX = Pattern.compile("^[a-zA-Z]{3}$");
	private final static Pattern COURSE_CODE_REGEX = Pattern.compile("^[a-zA-Z]{3}$");
	private final static Pattern BRANCH_CODE_REGEX = Pattern.compile("^[a-zA-Z]{3}$");
	private final static Pattern EMAIL_REGEX = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
	private final static Pattern EMAIL_USER_REGEX = Pattern.compile("^[a-zA-Z0-9._%+-]+$");
	private final static Pattern EMAIL_DOMAIN_REGEX = Pattern.compile("^[a-zA-Z0-9.-]+$");
	private final static Pattern DEGREE_PROGRAM_NAME_REGEX = Pattern.compile("^[A-Za-z\\s]{1,45}$");
	private final static Pattern COURSE_NAME_REGEX = Pattern.compile("^[A-Za-z\\s]{1,45}$");

	public static boolean isValidName(String name) {
		return name != null && NAME_REGEX.matcher(name).matches();
	}

	public static boolean isValidEmail(String email) {
		return email != null && EMAIL_REGEX.matcher(email).matches();
	}

	public static boolean isValidDegreeProgramCode(String programCode) {
		return programCode != null && PROGRAM_CODE_REGEX.matcher(programCode).matches();
	}

	public static boolean isValidCourseCode(String courseCode) {
		return courseCode != null && COURSE_CODE_REGEX.matcher(courseCode).matches();
	}

	public static boolean isValidBranchCode(String branchCode) {
		return branchCode != null && BRANCH_CODE_REGEX.matcher(branchCode).matches();
	}

	public static boolean isValidID(String ID, Country country) {
		return ID != null && ID.matches(country.getIDPattern());
	}

	public static boolean isValidUserEmail(String emailUser) {
		return emailUser != null && EMAIL_USER_REGEX.matcher(emailUser).matches();
	}

	public static boolean isValidDomainEmail(String emailDomain) {
		return emailDomain != null && EMAIL_DOMAIN_REGEX.matcher(emailDomain).matches();
	}

	public static boolean isValidDegreeProgramName(String programName) {
		return programName != null && DEGREE_PROGRAM_NAME_REGEX.matcher(programName).matches();
	}

	public static boolean isValidCourseName(String courseName) {
		return courseName != null && COURSE_NAME_REGEX.matcher(courseName).matches();
	}

}
