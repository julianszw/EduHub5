package model.classes;

import enums.Country;
import enums.Gender;
import enums.StudentStatus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {
	private static int enrollmentNumber;
	private int enrollmentCode;
	private StudentStatus status;
	private ArrayList courses;
	private ArrayList califications;
	private ArrayList degreePrograms;

	public Student(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
		super(firstName, lastName, nationality, ID, gender, email, birthDate);
		courses = new ArrayList();
		califications = new ArrayList();
		degreePrograms = new ArrayList();
	}

	private void generateEnrollmentCode() {
		this.enrollmentCode = enrollmentNumber++;
		//TODO pasarlo a String. Usar el TextValidator para generar un formato pasándole  el enrollmentNumber
	}

	//TODO considerar clase Enrollment
	public void enrollInDegreeProgram(DegreeProgram degreeProgram) {
		this.degreePrograms.add(degreeProgram);
	}


}
