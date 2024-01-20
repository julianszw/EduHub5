package auxiliarClasses;

import java.util.regex.Pattern;

public class TextValidator {
	private final static String NAME_REGEX = "^[a-zA-Z'\\s]+$"; //TODO ¿Mismo Regex que para lastName?
	private final static String LAST_NAME_REGEX = "^[a-zA-Z'\\-]+$"; //Se agregan apóstrofes y guiones //TODO Agregaría especios
	private final static String PROGRAM_CODE_REGEX = "^[a-zA-Z]{3}$"; //TODO ¿hacer un GENERIC_CODE_REGEX?
	private final static String COURSE_CODE_REGEX = "^[a-zA-Z]{3}$";
	private final static String BRANCH_CODE_REGEX = "^[a-zA-Z]{3}$";
	private final static String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	private final static String EMAIL_USER_REGEX = "^[a-zA-Z0-9._%+-]+$";
	private final static String EMAIL_DOMAIN_REGEX = "^[a-zA-Z0-9.-]+$";


	public static boolean isValidName(String name) {
		return name != null && name.matches(NAME_REGEX);
	}

	public static boolean isValidLastName(String lastName) {
		return lastName != null && lastName.matches(LAST_NAME_REGEX);
	}

	public static boolean isValidEmail(String email) {
		return email != null && email.matches(EMAIL_REGEX);
	}

	public static boolean isValidProgramCode(String programCode) {
		return programCode != null && programCode.matches(PROGRAM_CODE_REGEX);
	}

	public static boolean isValidCourseCode(String courseCode) {
		return courseCode != null && courseCode.matches(COURSE_CODE_REGEX);
	}

	public static boolean isValidBrancheCode(String branchChde) {
		return branchChde != null && branchChde.matches(BRANCH_CODE_REGEX);
	}

	public static boolean isValidID(String ID, Country country) {
		return ID.matches(country.getIDPattern());
	}

	public static boolean isValidUserEmail(String emailUser) {
		return emailUser.matches(EMAIL_USER_REGEX);
	}

	public static boolean isValidDomainEmail(String emailDomain) {
		return emailDomain.matches(EMAIL_DOMAIN_REGEX);
	}

}
