package proyecto.jpa;

import java.util.List;

import javax.persistence.*;
/**
 * 
 * @author Los Datografos
 * Esta clase representa a una de las 4 titulaciones que existen en el sistema, con la posibilidad de 
 * crear alguna mas. 
 */
@Entity
public class Titulacion {
	@Id
	@Column(name = "CÓDIGO")
	private Long codigo;
	private String nombre;
	@Column
	private Integer creditos;
	
	//Relacion uno a muchos con asignatura
	@OneToMany(mappedBy="titulacionAsig")
	private List<Asignatura> asignaturas;
	
	//Relacion uno a muchos con expediente
	@OneToMany(mappedBy="titulacionExp")
	private List<Expediente> expedientes;

	//Getters y Setters
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public List<Expediente> getExpedientes() {
		return expedientes;
	}

	public void setExpedientes(List<Expediente> expedientes) {
		this.expedientes = expedientes;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Titulacion [codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", asignaturas="
				+ asignaturas + ", expedientes=" + expedientes + "]";
	}
	
	//HashCode & Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Titulacion other = (Titulacion) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	
}