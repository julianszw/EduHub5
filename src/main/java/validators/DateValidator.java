package validators;

import java.time.LocalDate;

public class DateValidator {
    public static final LocalDate MIN_BIRTH_DATE = LocalDate.of(1910, 01, 01);
    public static final LocalDate MIN_INSCRIPTION_DATE = LocalDate.of(1950, 01, 01);

    public static boolean isValidBirthDate(LocalDate aDate) {
        return aDate != null && aDate.isAfter(MIN_BIRTH_DATE);
    }

    public static boolean isValidInscriptionDate(LocalDate aDate) {
        return aDate != null && aDate.isAfter(MIN_INSCRIPTION_DATE);
    }
}
