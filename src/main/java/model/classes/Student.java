package model.classes;

import enums.Country;
import enums.Gender;
import enums.StudentStatus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {
	private ArrayList courses;
	private ArrayList califications;
	private StudentStatus status;

	public Student(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
		super(firstName, lastName, nationality, ID, gender, email, birthDate);
		this.courses = new ArrayList();
		this.califications = new ArrayList();
	}

}
