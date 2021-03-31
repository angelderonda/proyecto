package proyecto.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Clase {
	@EmbeddedId
	@Column(name = "ID")
	private ClaseId id;
	@Column(name = "HORA_FIN")
	@Temporal(TemporalType.TIME)
	private Date horaFin; 
	
	
	//Relacion muchos a uno con Asignatura
	@ManyToOne(optional = false)
	private Asignatura asignaturaClase;
	
	//Relacion muchos a uno con Grupo
	@ManyToOne(optional = false)
	private Grupo grupoClase;
	
	

	//Getters and Setters
	
	
	//toString
	

	//HashCode and Equals
	
	
	
}
