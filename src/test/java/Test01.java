import modelClasses.Campus;
import modelClasses.DegreeProgram;

public class Test01 {
    public static void main(String[] args) {
    Campus campus01 = new Campus();
    campus01.addDegreeProgram(new DegreeProgram("Análisis de Sistemas", "ASI"));
    System.out.println(campus01.searchDegreeProgram("ASI"));
    }

}
