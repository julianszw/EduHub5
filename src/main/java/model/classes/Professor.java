package model.classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Person{
	private LocalDate hireDate;
	private ArrayList<Course> enabledCourses; //TODO borrar

	public Professor(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
		super(firstName, lastName, nationality, ID, gender, email, birthDate);
		this.enabledCourses = new ArrayList<>();
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public ArrayList<Course> getEnabledCourses() {
		return this.enabledCourses;
	}

	public void enableForCourse(Course course) {
		if (course != null) {
			this.enabledCourses.add(course);
		}
	}

	public boolean disableForCourse(String courseCode) {
		return this.enabledCourses.remove(this.searchCourse(courseCode));
	}

	private Course searchCourse(String courseCode) {
		return enabledCourses.stream()
				.filter(course -> course.getCode().equals(courseCode))
				.findFirst()
				.orElse(null);
	}



}
