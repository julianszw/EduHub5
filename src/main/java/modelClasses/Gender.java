package modelClasses;

public enum Gender {
	FEMALE("Female", "F"),
	MALE("Male", "M"),
	NON_BINARY("Non Binary", "N"),
	OTHER("Other", "O");

	private final String description;
	private final String code;

	Gender(String description, String shortCode) {
		this.description = description;
		this.code = shortCode;
	}

	public String getDescription() {
		return description;
	}

	public String getShortCode() {
		return code;
	}
}

