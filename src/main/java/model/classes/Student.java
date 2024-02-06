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
//	private ArrayList califications;

	public Student(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
		super(firstName, lastName, nationality, ID, gender, email, birthDate);
	}

	private void generateEnrollmentCode() {
		this.enrollmentCode = enrollmentNumber++;
		//TODO pasarlo a String. Usar el TextValidator para generar un formato pasándole  el enrollmentNumber
	}



}
