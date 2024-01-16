import modelClasses.*;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CampusTest {
    Campus campus = new Campus();

    @Test
    public void testAddDegreeProgram() {
        campus.addDegreeProgram(new DegreeProgram("Análisis de Sistemas", "ASI"));
        assertNotNull(campus.searchDegreeProgram("ASI"));
    }

    @Test
    public void testAddProfessor() {
        campus.addProfessor(new Professor("Hattori", "Hanzo", Gender.MALE, "12345678", "juan@perez.com", LocalDate.of(1950, 10, 15)));
        assertNotNull(campus.searchProfessor("12345678"));
    }

    @Test
    public void testAddStudent() {
        campus.addStudent(new Student("Luke", "Skywalker", Gender.MALE, "55555555", "luke@skywalker.com", LocalDate.of(1900, 12, 16)));
        assertNotNull(campus.searchStudent("55555555"));
    }

    @Test
    public void testAddCourse() {
        campus.addCourse(new Course("Matemática", "MAT"));
        assertNotNull(campus.searchCourse("MAT"));
    }

    @Test
    public void testAddBranch() {
        campus.addBranch(new Branch("Buenos Aires", "BUE"));
        assertNotNull(campus.searchBranch("BUE"));
    }

    @Test
    public void testDeleteDegreeProgram() {
        campus.deleteDegreeProgram("ASI");
        assertNull(campus.searchDegreeProgram("ASI"));
    }
}
