package model.classes;

public class ContentUnit {
	private String title;
	private int unitNumber;
	
	public ContentUnit(String title, int unitNumber) {
		setTitle(title);
		setUnitNumber(unitNumber);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}
	
	
}
