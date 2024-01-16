import modelClasses.Campus;
import modelClasses.DegreeProgram;
import modelClasses.Gender;
import modelClasses.Professor;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CampusTest {
    Campus campus = new Campus();

    @Test
    public void testAddDegreeProgram() {
        campus.addDegreeProgram(new DegreeProgram("Análisis de Sistemas", "ASI"));
        assertTrue(campus.searchDegreeProgram("ASI") != null);
    }

    @Test
    public void testAddProfessor() {
        campus.addProfessor(new Professor("Juan", "Pérez", Gender.MALE, "12345678", "juan@perez.com", LocalDate.of(1990, 10, 15)));
        assertTrue(campus.searchProfessor("12345678") != null);

    }
}
