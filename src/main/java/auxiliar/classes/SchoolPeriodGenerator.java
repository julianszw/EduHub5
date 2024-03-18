package auxiliar.classes;

import model.classes.SchoolPeriod;

import java.time.LocalDate;
import java.time.Year;

public class SchoolPeriodGenerator {
    private static int year = LocalDate.now().getYear();
    private static final int INSCRIPTION_LIMIT_MONTH = 7;
    private static final int INSCRIPTION_LIMIT_DAY = 1;

    public static int getYear() {
        return year;
    }

    public static SchoolPeriod generateSchoolPeriod() {
        Year thisYear = Year.of(LocalDate.now().getYear());
        int semester = calculateSemester(thisYear);
        return new SchoolPeriod(semester, thisYear);
    }

    private static int calculateSemester(Year year) {
        return LocalDate.now().isBefore(year.atMonth(INSCRIPTION_LIMIT_MONTH).atDay(INSCRIPTION_LIMIT_DAY)) ? 1 : 2;
    }


}
