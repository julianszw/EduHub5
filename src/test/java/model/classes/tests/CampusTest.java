package model.classes.tests;

import enums.Country;
import enums.Gender;
import model.classes.*;
import modelClasses.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CampusTest {
    Campus campus;
    DegreeProgram analisisDeSistemas, ingenieriaElectrica, psicologia, adminEmpresas, cienciasComputacion, biologiaMarina;
    Professor hanzoHattori, pedroAlmodovar, sofiaCoppola, gasparNoe, scarlettJohansson;
    Student lukeSkywalker;

    @Before
    public void setUpCampus() {
        campus = new Campus();
        lukeSkywalker = new Student("Luke", "Skywalker", Country.ALBANIA, "55555555", Gender.MALE, "luke@skywalker.com", LocalDate.of(1900, 12, 16));
    }

    @Before
    public void setUpDegreePrograms() {
        analisisDeSistemas = new DegreeProgram("Análisis de Sistemas", "ASI");
        ingenieriaElectrica = new DegreeProgram("Ingeniería Eléctrica", "IEE");
        psicologia = new DegreeProgram("Psicología", "PSI");
        adminEmpresas = new DegreeProgram("Administración de Empresas", "ADE");
        cienciasComputacion = new DegreeProgram("Ciencias de la Computación", "CC");
        biologiaMarina = new DegreeProgram("Biología Marina", "BIM");
    }

    @Before
    public void setUpProfessors() {
        hanzoHattori = new Professor("Hattori", "Hanzo", Country.JAPAN, "12345678", Gender.MALE, "hanzo@hattori.com", LocalDate.of(1950, 10, 15));
        pedroAlmodovar = new Professor("Pedro", "Almodóvar", Country.SPAIN, "23456789", Gender.MALE, "pedro@almodovar.com", LocalDate.of(1960, 5, 25));
        sofiaCoppola = new Professor("Sofía", "Coppola", Country.USA, "34567890", Gender.FEMALE, "sofia@coppola.com", LocalDate.of(1971, 5, 14));
        gasparNoe = new Professor("Gaspar", "Noé", Country.FRANCE, "45678901", Gender.MALE, "gaspar@noe.com", LocalDate.of(1963, 12, 27));
        scarlettJohansson = new Professor("Scarlett", "Johansson", Country.USA, "56789012", Gender.FEMALE, "scarlett@johansson.com", LocalDate.of(1984, 11, 22));

    }

    @Test
    public void testAddDegreeProgram() {
        campus.addDegreeProgram(analisisDeSistemas);
        assertNotNull(campus.searchDegreeProgram("ASI"));
    }

    @Test
    public void testAddSeveralDegreePrograms() {
        campus.addDegreeProgram(ingenieriaElectrica);
        campus.addDegreeProgram(psicologia);
        campus.addDegreeProgram(adminEmpresas);
        campus.addDegreeProgram(cienciasComputacion);
        assertEquals(4, campus.getDegreePrograms().size());
    }

    @Test
    public void testRemoveDegreeProgram() {
        campus.addDegreeProgram(biologiaMarina);
        assertNotNull(campus.searchDegreeProgram("BIM"));
        campus.removeDegreeProgram("BIM");
        assertNull(campus.searchDegreeProgram("BIM"));
    }

    @Test
    public void testShouldNotAddNullDegreeProgram() {
        DegreeProgram nullDegreeProgram = null;
        campus.addDegreeProgram(nullDegreeProgram); //TODO quizás es mejor null como parámetro
        assertTrue(!campus.getDegreePrograms().contains(nullDegreeProgram));
        assertEquals(0, campus.getDegreePrograms().size());
    }

    @Test
    public void testShouldNotAddAlreadyAddedDegreeProgram() {

    }

    @Test
    public void testAddProfessor() {
        campus.addProfessor(hanzoHattori);
        assertNotNull(campus.searchProfessor("12345678"));
    }

    @Test
    public void testAddSeveralProfessors() {
        campus.addProfessor(hanzoHattori);
        campus.addProfessor(pedroAlmodovar);
        campus.addProfessor(sofiaCoppola);
        campus.addProfessor(gasparNoe);
        campus.addProfessor(scarlettJohansson);
        assertNotNull(campus.searchProfessor("12345678"));
        assertNotNull(campus.searchProfessor("23456789"));
        assertNotNull(campus.searchProfessor("34567890"));
        assertNotNull(campus.searchProfessor("45678901"));
        assertNotNull(campus.searchProfessor("56789012"));
        assertEquals(5, campus.getProfessors().size());
    }

    @Test
    public void testShouldNotFindNotAddedProfessors() {
        assertNull(campus.searchProfessor("99999999"));
        assertNull(campus.searchProfessor("99999998"));
    }

    @Test
    public void testAddStudent() {
        campus.addStudent(lukeSkywalker);
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
    //TODO quizá conviene agregar y borrar
    public void testDeleteDegreeProgram() {
        campus.removeDegreeProgram("ASI");
        assertNull(campus.searchDegreeProgram("ASI"));
    }


}
