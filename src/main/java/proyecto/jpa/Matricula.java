package proyecto.jpa;

import java.util.List;

import javax.persistence.*;

/**
* @author Los Datografos 
* Clase: Matricula
* Indica la elección del alumnado para turnos y asignaturas.
*/

@Entity
public class Matricula {
	@Id
	@Column(name = "CURSO_ACADEMICO", nullable = false)
	private Integer cursoAcademico;
	@Column(name = "ESTADO", nullable = false)
	private String estado;
	@Column(name = "FECHA_MATRICULA", nullable = false)
	private String fechaMatricula;
	@Column(name = "NUMERO_ARCHIVO")
	private Integer numeroArchivo;
	@Column(name = "TURNO_PREFERENTE")
	private String turnoPreferente;
	@Column(name = "NUEVO_INGRESO")
	private Boolean nuevoIngreso;
	
	
	
	
	//Relacion muchos a uno con expediente
	@ManyToOne(optional = false)
	private Expediente expedienteMatricula;
	
	//Relacion uno a muchos con asignaturaMatricula
	@OneToMany(mappedBy="matriculaAsignaturasMatricula")
	private List<AsignaturasMatricula> asignaturasMatriculaMatricula;
	
	//Getters y Setters

	public Integer getCursoAcademico() {
		return cursoAcademico;
	}

	public void setCursoAcademico(Integer cursoAcademico) {
		this.cursoAcademico = cursoAcademico;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Integer getNumeroArchivo() {
		return numeroArchivo;
	}

	public void setNumeroArchivo(Integer numeroArchivo) {
		this.numeroArchivo = numeroArchivo;
	}

	public String getTurnoPreferente() {
		return turnoPreferente;
	}

	public void setTurnoPreferente(String turnoPreferente) {
		this.turnoPreferente = turnoPreferente;
	}

	public Boolean getNuevoIngreso() {
		return nuevoIngreso;
	}

	public void setNuevoIngreso(Boolean nuevoIngreso) {
		this.nuevoIngreso = nuevoIngreso;
	}

	public Expediente getExpedienteMatricula() {
		return expedienteMatricula;
	}

	public void setExpedienteMatricula(Expediente expedienteMatricula) {
		this.expedienteMatricula = expedienteMatricula;
	}

	public List<AsignaturasMatricula> getAsignaturasMatriculaMatricula() {
		return asignaturasMatriculaMatricula;
	}

	public void setAsignaturasMatriculaMatricula(List<AsignaturasMatricula> asignaturasMatriculaMatricula) {
		this.asignaturasMatriculaMatricula = asignaturasMatriculaMatricula;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Matricula [cursoAcademico=" + cursoAcademico + ", estado=" + estado + ", fechaMatricula="
				+ fechaMatricula + ", numeroArchivo=" + numeroArchivo + ", turnoPreferente=" + turnoPreferente
				+ ", nuevoIngreso=" + nuevoIngreso + "]";
	}
	
	//HashCode & Equals
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cursoAcademico == null) ? 0 : cursoAcademico.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		if (cursoAcademico == null) {
			if (other.cursoAcademico != null)
				return false;
		} else if (!cursoAcademico.equals(other.cursoAcademico))
			return false;
		return true;
	}
	
}
