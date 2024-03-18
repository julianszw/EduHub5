package model.classes;

import enums.Country;
import enums.Gender;
import enums.Role;

import java.time.LocalDate;

public class Employee extends User {
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



