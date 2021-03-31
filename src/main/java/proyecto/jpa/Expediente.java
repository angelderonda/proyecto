package proyecto.jpa;

import java.util.List;

import javax.persistence.*;

@Entity
public class Expediente {
	@Id
	@Column(name = "NUMERO_EXPEDIENTE")
	private Long numeroExpediente;
	private Boolean activo;
	@Column(name = "NOTA_MEDIA_PROVISIONAL")
	private Long notaMediaProvisional;
	@Column(name = "CREDITOS_SUPERADOS")
	private Integer creditosSuperados;
	@Column(name = "CREDITOS_SUPERADOS")
	private Integer creditosFB;
	@Column(name = "CREDITOS_MO")
	private Integer creditosMO;
	@Column(name = "CREDITOS_OP")
	private Integer creditosOP;
	@Column(name = "CREDITOS_CF")
	private Integer creditosCF;
	@Column(name = "CREDITOS_PE")
	private Integer creditosPE;
	@Column(name = "CREDITOS_TF")
	private Integer creditosTF;

	// Relacion muchos a uno con titulacion
	@ManyToOne(optional = false)
	private Titulacion titulacionExp;

	// Relacion muchos a uno con Alumnos
	@ManyToOne(optional = false)
	private Alumno alumnoExp;

	//Relacion uno a muchos con Encuesta
	@OneToMany(mappedBy = "expedienteEncuesta")
	private List<Encuesta> encuestas;
	
	// Relacion uno a muchos con Matricula
	@OneToMany(mappedBy = "expedienteMatricula")
	private List<Matricula> matriculas;

	//Getters y Setters
	public Long getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(Long numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Long getNotaMediaProvisional() {
		return notaMediaProvisional;
	}

	public void setNotaMediaProvisional(Long notaMediaProvisional) {
		this.notaMediaProvisional = notaMediaProvisional;
	}

	public Integer getCreditosSuperados() {
		return creditosSuperados;
	}

	public void setCreditosSuperados(Integer creditosSuperados) {
		this.creditosSuperados = creditosSuperados;
	}

	public Integer getCreditosFB() {
		return creditosFB;
	}

	public void setCreditosFB(Integer creditosFB) {
		this.creditosFB = creditosFB;
	}

	public Integer getCreditosMO() {
		return creditosMO;
	}

	public void setCreditosMO(Integer creditosMO) {
		this.creditosMO = creditosMO;
	}

	public Integer getCreditosOP() {
		return creditosOP;
	}

	public void setCreditosOP(Integer creditosOP) {
		this.creditosOP = creditosOP;
	}

	public Integer getCreditosCF() {
		return creditosCF;
	}

	public void setCreditosCF(Integer creditosCF) {
		this.creditosCF = creditosCF;
	}

	public Integer getCreditosPE() {
		return creditosPE;
	}

	public void setCreditosPE(Integer creditosPE) {
		this.creditosPE = creditosPE;
	}

	public Integer getCreditosTF() {
		return creditosTF;
	}

	public void setCreditosTF(Integer creditosTF) {
		this.creditosTF = creditosTF;
	}

	public Titulacion getTitulacionExp() {
		return titulacionExp;
	}

	public void setTitulacionExp(Titulacion titulacionExp) {
		this.titulacionExp = titulacionExp;
	}

	public Alumno getAlumnoExp() {
		return alumnoExp;
	}

	public void setAlumnoExp(Alumno alumnoExp) {
		this.alumnoExp = alumnoExp;
	}

	public List<Encuesta> getEncuestas() {
		return encuestas;
	}

	public void setEncuestas(List<Encuesta> encuestas) {
		this.encuestas = encuestas;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	//ToString
	@Override
	public String toString() {
		return "Expediente [numeroExpediente=" + numeroExpediente + ", activo=" + activo + ", notaMediaProvisional="
				+ notaMediaProvisional + ", creditosSuperados=" + creditosSuperados + ", creditosFB=" + creditosFB
				+ ", creditosMO=" + creditosMO + ", creditosOP=" + creditosOP + ", creditosCF=" + creditosCF
				+ ", creditosPE=" + creditosPE + ", creditosTF=" + creditosTF + ", titulacionExp=" + titulacionExp
				+ "]";
	}
	
	//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroExpediente == null) ? 0 : numeroExpediente.hashCode());
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
		Expediente other = (Expediente) obj;
		if (numeroExpediente == null) {
			if (other.numeroExpediente != null)
				return false;
		} else if (!numeroExpediente.equals(other.numeroExpediente))
			return false;
		return true;
	}
	
	

}

