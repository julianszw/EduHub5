package auxiliar.classes;

import model.classes.SchoolPeriod;

import java.time.LocalDate;
import java.time.Year;

public class SchoolPeriodGenerator {
    private static int year = LocalDate.now().getYear();
    private static final int inscriptionLimitMonth = 7;
    private static final int inscriptionLimitDay = 1;

    public static SchoolPeriod generateSchoolPeriod() {
        Year thisYear = Year.of(LocalDate.now().getYear());
        int semester = calculateSemester(thisYear);
        return new SchoolPeriod(semester, thisYear);
    }

    /**
     * Evalúa si la fecha de hoy es anterior o no a la fecha
     * @return Devuelve el número de semestre. Por ahora puede ser 1 o 2
     * Se asume que el sistema divide el año en dos períodos (cuatrimestres)
     */
    private static int calculateSemester(Year year) {
        return LocalDate.now().isBefore(year.atMonth(inscriptionLimitMonth).atDay(inscriptionLimitDay)) ? 1 : 2;
    }


}
