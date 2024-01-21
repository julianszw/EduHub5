package modelClasses;

import validators.TextValidator;

import java.util.ArrayList;

public class DegreeProgram {
	private String name;
	private String programCode;
	private Employee programDirector;
	private ArrayList<Course> courses; //curriculum
	private ArrayList<Branch> availableBranches;

	public DegreeProgram(String name, String programCode) {
		this.initializeLists();
		setName(name);
		setProgramCode(programCode);
	}

	private void initializeLists() {
		this.courses = new ArrayList<>();
		this.availableBranches = new ArrayList<>();
	}

	public void setName(String name) {
		if (TextValidator.isValidName(name)){
			this.name = name;
		} else {
			throw new IllegalArgumentException(name + " no es un nombre válido para la carrera");
		}
	}

	public void setProgramCode(String programCode) {
		if (TextValidator.isValidDegreeProgramCode(programCode)){
			this.programCode = programCode;
		} else {
			throw new IllegalArgumentException(programCode + " no es un código válido para la carrera");
		}

	}

	public void setProgramDirector(Employee programDirector) {
		this.programDirector = programDirector;
	}

	public String getName() {
		return name;
	}

	public String getProgramCode() {
		return programCode;
	}

	public Employee getProgramDirector() {
		return programDirector;
	}

}
