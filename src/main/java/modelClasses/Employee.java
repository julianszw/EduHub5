package modelClasses;

import enums.Country;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee extends Person{

	public Employee(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
		super(firstName, lastName, nationality, ID, gender, email, birthDate);
	}

}



