package modelClasses;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {
	private ArrayList courses;
	private ArrayList califications;
	private StudentStatus status;

	public Student(String firstName, String lastName, Gender gender, String ID, String email, LocalDate dateOfBirth) {
		super(firstName, lastName, gender, ID, email, dateOfBirth);
		this.courses = new ArrayList();
		this.califications = new ArrayList();
	}


}
