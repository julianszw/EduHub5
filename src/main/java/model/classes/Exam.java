package model.classes;

import enums.ExamType;
import enums.TestType;

public class Exam {
	private ExamType examType;
	private TestType testType;
	private String title;
	private String virtualExam; //setter

	//Lo ideal sería que, al crear una interfaz, pueda ir eligiendo el tip ode examen y eso

	public Exam(ExamType type, String title) {
		setType(type);
		setTitle(title);
	}

	public ExamType getType() {
		return examType;
	}

	public void setType(ExamType type) {
		this.examType = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
