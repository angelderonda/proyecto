package proyecto.jpa;

import javax.persistence.*;

/**
* @author Los Datografos 
* Clase: AsignaturasMatricula
* Esta clase se utiliza para relacionar las asignaturas elegidas en una matrícula y con el/los grupo/s en el/los que se van a impartir las mismas.
*/

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
