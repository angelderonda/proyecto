package proyecto.jpa;
import javax.persistence.*;



/*
 * ManytoMany con Encuesta
 * ManytoOne con 
 * ManytoOne con 
 * 
 */

@Entity
public class GruposAsignatura {
	
	@Id
	@Column(name = "CURSO_ACADEMICO")
	private Integer curso_academico;
	@Column(name = "OFERTA")	
	private char oferta;
	
	//Relacion muchos a muchos con encuesta REVISAR!!!
	@ManyToMany
	private Encuesta encuestaGruposAsignatura;
	
	
	//Relacion muchos a uno con grupo
	@ManyToOne(optional = false)
	private Grupo grupoGruposAsignatura;
	
	//Relacion muchos a uno con asignatura
	@ManyToOne(optional = false)
	private Asignatura asignaturaGruposAsignatura;
	
	//Getters and Setters
	
	public Integer getCurso_academico() {
		return curso_academico;
	}
	public void setCurso_academico(Integer curso_academico) {
		this.curso_academico = curso_academico;
	}
	public char getOferta() {
		return oferta;
	}
	public void setOferta(char oferta) {
		this.oferta = oferta;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "GruposAsignatura [curso_academico=" + curso_academico + ", oferta=" + oferta + "]";
	}
	
	//HashCode and Equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso_academico == null) ? 0 : curso_academico.hashCode());
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
		GruposAsignatura other = (GruposAsignatura) obj;
		if (curso_academico == null) {
			if (other.curso_academico != null)
				return false;
		} else if (!curso_academico.equals(other.curso_academico))
			return false;
		return true;
	}

	

	
	
}
