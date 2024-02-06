package model.classes;

import enums.Country;
import enums.Gender;
import validators.ObjectValidator;

import java.time.LocalDate;

public class Employee extends Person{
	private Role role;

	public Employee(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate, Role role) {
		super(firstName, lastName, nationality, ID, gender, email, birthDate);
		this.role = role;

	}

	public Employee(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
		this(firstName, lastName, nationality, ID, gender, email, birthDate, null);
	}

	public Role getRole() {
		return role;
	}
}



