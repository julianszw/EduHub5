package validators;

import enums.Country;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class DateValidator {
    public static final LocalDate MIN_BIRTH_DATE = LocalDate.of(1910, 01, 01);
    public static final LocalDate MIN_INSCRIPTION_DATE = LocalDate.of(1950, 01, 01);
    public static final int LEGAL_AGE = 18;

    public static boolean isValidBirthDate(LocalDate aDate) {
        return aDate != null && aDate.isAfter(MIN_BIRTH_DATE);
    }

    public static boolean isValidInscriptionDate(LocalDate aDate) {
        return aDate != null && aDate.isAfter(MIN_INSCRIPTION_DATE);
    }

    public static boolean isLegalAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears() >=  LEGAL_AGE;
    }

    public static boolean isLegalAge(LocalDate birthDate, Country aCountry) {
        return Period.between(birthDate, LocalDate.now()).getYears() >= 18;
        //TODO comparar con mayoría de edad en ese país
    }

    public static boolean isValidPeriodYear(Year year) {
        return year.isAfter(Year.of(1950));
    }
}
