package modelClasses;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Person{
	private LocalDate hireDate;
	private ArrayList<Course> coursesCanTeach;

	public Professor(String firstName, String lastName, Gender gender, String ID, String email, LocalDate dateOfBirth) {
		super(firstName, lastName, gender, ID, email, dateOfBirth);
		this.coursesCanTeach = new ArrayList<>();
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

}
