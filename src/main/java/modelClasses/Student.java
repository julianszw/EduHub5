package modelClasses;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {
	private ArrayList courses;
	private ArrayList califications;
	private StudentStatus status;

	public Student(String firstName, String lastName, Gender gender, String ID, String email, LocalDate dateOfBirth, String username, String password) {
		super(firstName, lastName, gender, ID, email, dateOfBirth);
	}

//	public Student(String firstName, String lastName, Gender gender, String ID, EMail email, LocalDate dateOfBirth,
//			String username, String password, StudentStatus status) {
//		super(firstName, lastName, gender, ID, email, dateOfBirth, username, password, status);
//		// TODO Auto-generated constructor stub
//	}

}
