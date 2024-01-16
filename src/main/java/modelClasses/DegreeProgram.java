package modelClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DegreeProgram {
	private String name;
	private String programCode;
	private Employee programDirector;
	private ArrayList<Course> courses;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getProgramDirector() {
		return programDirector;
	}

	public void setProgramDirector(Employee programDirector) {
		this.programDirector = programDirector;
	}

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}
	
	

}
