package proyecto.jpa;

import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="disc", discriminatorType = DiscriminatorType.CHAR )
@DiscriminatorValue("A")
public class Asignatura {
	@Id
	private Long referencia;
	private Integer codigo;
	private Integer creditos;
	private Boolean ofertada;
	private String nombre;
	private Integer curso;
	private String tipo; //Mat basica, optativa,tfg...
	private String duracion;
	
	//Relacion muchos a uno con titulacion
	@ManyToOne(optional = false)
	private Titulacion titulacionAsig;
	
	//Relacion uno a muchos con clase
	@OneToMany(mappedBy="asignaturaClase")
	private List<Clase> clasesAsig;

	//Relacion uno a muchos con grupoAsignatura
	@OneToMany(mappedBy="asignaturaGrupo")
	private List<GruposAsignatura> gruposAsignaturaAsig;
		
	//Relacion uno a muchos con matricula
	@OneToMany(mappedBy="asignaturaMatricula")
	private List<AsignaturasMatricula> asignaturasMatriculas;

	//Getters and Setters
	
	public Long getReferencia() {
		return referencia;
	}

	public void setReferencia(Long referencia) {
		this.referencia = referencia;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Boolean getOfertada() {
		return ofertada;
	}

	public void setOfertada(Boolean ofertada) {
		this.ofertada = ofertada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Titulacion getTitulacionAsig() {
		return titulacionAsig;
	}

	public void setTitulacionAsig(Titulacion titulacionAsig) {
		this.titulacionAsig = titulacionAsig;
	}

	public List<Clase> getClasesAsig() {
		return clasesAsig;
	}

	public void setClasesAsig(List<Clase> clasesAsig) {
		this.clasesAsig = clasesAsig;
	}

	public List<GruposAsignatura> getGruposAsignaturaAsig() {
		return gruposAsignaturaAsig;
	}

	public void setGruposAsignaturaAsig(List<GruposAsignatura> gruposAsignaturaAsig) {
		this.gruposAsignaturaAsig = gruposAsignaturaAsig;
	}

	public List<AsignaturasMatricula> getAsignaturasMatriculas() {
		return asignaturasMatriculas;
	}

	public void setAsignaturasMatriculas(List<AsignaturasMatricula> asignaturasMatriculas) {
		this.asignaturasMatriculas = asignaturasMatriculas;
	}
	
	//toString
	@Override
	public String toString() {
		return "Asignatura [referencia=" + referencia + ", codigo=" + codigo + ", creditos=" + creditos + ", ofertada="
				+ ofertada + ", nombre=" + nombre + ", curso=" + curso + ", tipo=" + tipo + ", duracion=" + duracion
				+ ", titulacionAsig=" + titulacionAsig + "]";
	}

	

	//HashCode and Equals
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
		Asignatura other = (Asignatura) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}
