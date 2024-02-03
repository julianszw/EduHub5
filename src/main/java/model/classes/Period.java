package model.classes;

import java.time.Year;

public class Period {
    private int semester;
    private Year year;

    public Period(int semester, Year year) {
        this.semester = semester;
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
