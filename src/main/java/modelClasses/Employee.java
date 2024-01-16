package modelClasses;

import java.time.LocalDate;

public class Employee extends Person{
	public Employee(String firstName, String lastName, Gender gender, String ID, String email, LocalDate dateOfBirth, String username, String password) {
		super(firstName, lastName, gender, ID, email, dateOfBirth);
	}

//	public Employee(String firstName, String lastName, Gender gender, String ID, EMail email, LocalDate dateOfBirth,
//			String username, String password, StudentStatus status) {
//		super(firstName, lastName, gender, ID, email, dateOfBirth, username, password, status);
//		// TODO Auto-generated constructor stub
	}



