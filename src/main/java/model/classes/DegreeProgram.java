package model.classes;

import validators.TextValidator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DegreeProgram {
	private String name;
	private String programCode;
	private Professor programDirector;
	private ArrayList<Course> courses; //curriculum

	public DegreeProgram(String name, String programCode) {
		this.initializeLists();
		setName(name);
		setProgramCode(programCode);
	}

	private void initializeLists() {
		this.courses = new ArrayList<>();
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

	public void setProgramDirector(Professor programDirector) {
		this.programDirector = programDirector;
	}

	public String getName() {
		return name;
	}

	public String getProgramCode() {
		return programCode;
	}

	public Professor getProgramDirector() {
		return programDirector;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public ArrayList<Course> getCurriculum() {
		return this.courses;
	}

	public Course searchCourse(String courseCode) {
		return courses.stream()
				.filter(course -> course.getCode().equals(courseCode))
				.findFirst()
				.orElse(null); // Devuelve el curso si se encuentra, de lo contrario devuelve null
	}

}
