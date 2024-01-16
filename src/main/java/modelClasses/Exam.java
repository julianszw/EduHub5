package modelClasses;

public class Exam {
	private ExamType type;
	private String title;

	public Exam(ExamType type, String title) {
		setType(type);
		setTitle(title);
	}

	public ExamType getType() {
		return type;
	}

	public void setType(ExamType type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
