package enums;

public enum StudentStatus {
	ENROLLED, 			//Cursando
	GRADUATED,			//Graduado, ya terminó
	TRANSFERRED, 		//Se pasó a otra institución
	PENDING_GRADUATION, //Completó sus cursadas pero tiene exámenes finales pendientes
	SUSPENDED,			//El alumno fue suspendido en la institución
	ON_LEAVE,			//El alumno suspendió temporalmente sus estudios
	UNROLLED;			//Distinto de Suspended?
}
