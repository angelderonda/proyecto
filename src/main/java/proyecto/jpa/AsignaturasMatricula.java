package proyecto.jpa;

import javax.persistence.*;

public class AsignaturasMatricula {
	
	//Relacion muchos a uno con asignatura
	@ManyToOne(optional = false)
	private Asignatura asignaturaAsignaturasMatricula;
	
	//Relacion muchos a uno con matricula
	@ManyToOne(optional = false)
	private Asignatura matriculaAsignaturasMatricula;
	
	//Relacion muchos a uno con grupo
	@ManyToOne(optional = false)
	private Asignatura grupoAsignaturasMatricula;
	
}
