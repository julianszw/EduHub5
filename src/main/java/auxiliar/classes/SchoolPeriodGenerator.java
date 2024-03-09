package auxiliar.classes;

import model.classes.SchoolPeriod;

import java.time.LocalDate;
import java.time.Year;

public class SchoolPeriodGenerator {
    private static int year = LocalDate.now().getYear();
    private static final int INSCRIPTION_LIMIT_MONTH = 7;
    private static final int INSCRIPTION_LIMIT_DAY = 1;

    public static SchoolPeriod generateSchoolPeriod() {
        Year thisYear = Year.of(LocalDate.now().getYear());
        int semester = calculateSemester(thisYear);
        return new SchoolPeriod(semester, thisYear);
    }




    private static int calculateSemester(Year year) {
        /*Evalúa si la fecha de hoy es anterior o no a la fecha
    Devuelve el número de semestre. Por ahora puede ser 1 o 2
    Se asume que el sistema divide el año en dos períodos (cuatrimestres)*/
        return LocalDate.now().isBefore(year.atMonth(INSCRIPTION_LIMIT_MONTH).atDay(INSCRIPTION_LIMIT_DAY)) ? 1 : 2;
    }


}
