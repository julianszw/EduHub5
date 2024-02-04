package model.classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;

public class Employee extends Person{
	//TODO
	// 	Role role

	public Employee(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
		super(firstName, lastName, nationality, ID, gender, email, birthDate);
	}

}



