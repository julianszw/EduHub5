package model.classes;

import validators.TextValidator;

import java.util.ArrayList;
import java.util.Optional;

public class DegreeProgram {
	private String name;
	private String programCode;
	private Professor programDirector;
	private ArrayList<Course> courses; //curriculum
	private ArrayList<Student> enrolledStudents;


	public DegreeProgram(String name, String programCode) {
		this.courses = new ArrayList<>();
		this.enrolledStudents = new ArrayList<>();
		setName(name);
		setProgramCode(programCode);
		//método que reciba la lista de docuentes del campus y ofrezca seleccionar un programDirector
	}


	private void setName(String name) {
		if (TextValidator.isValidName(name)){
			this.name = name;
		} else {
			throw new IllegalArgumentException(name + " no es un nombre válido para la carrera");
		}
	}


	private void setProgramCode(String programCode) {
		if (TextValidator.isValidDegreeProgramCode(programCode)){
			this.programCode = programCode;
		} else {
			throw new IllegalArgumentException(programCode + " no es un código válido para la carrera");
		}

	}


	public void setProgramDirector(Professor programDirector) { //select
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

	//Mmmm
	public ArrayList<Course> getCurriculum() {
		return this.courses;
	}


	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public boolean enrollStudent(Student student) {
		if (findEnrolledStudent(student).isPresent()) {
			throw new IllegalArgumentException("El estudiante ya está inscrito en este programa");
		}
		return enrolledStudents.add(student);
	}

	public boolean unrollStudent(Student student) {
		if (findEnrolledStudent(student).isEmpty()) {
			throw new IllegalArgumentException("El estudiante no existe");
		}
		return enrolledStudents.remove(student);
	}


	public Optional<Course> findCourseByCode(String courseCode) {
		return courses.stream()
				.filter(course -> course.getCode().equals(courseCode))
				.findFirst();
	}

	private Optional<Student> findEnrolledStudent(Student student) {
		return enrolledStudents.stream()
				.filter(enrolledStudent -> enrolledStudent.equals(student))
				.findFirst();
	}








}
