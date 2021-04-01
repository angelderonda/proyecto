package proyecto.jpa;

import java.util.List;

import javax.persistence.*;

@Entity
public class Alumno{

	
	@Id
	@Column(name="ID")
	private Integer id;
	@Column(name="DNI")
	private String dni;
	@Column(name="NOMBRE_COMPLETO")
	private String nombreCompleto;
	@Column(name="EMAIL_INSTITUCIONAL")
	private String emailInstitucional;
	@Column(name="EMAIL_PERSONAL")
	private String emailPersonal;
	@Column(name="NUMERO_TELEFONO")
	private Long numeroTelefono;
	@Column(name="NUMERO_MOVIL")
	private Long numeroMovil;
	
	
	@OneToMany(mappedBy = "alumnoExpediente")
	private List<Expediente> expedienteAlumno;
	
	//Getter y setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEmailInstitucional() {
		return emailInstitucional;
	}

	public void setEmailInstitucional(String emailInstitucional) {
		this.emailInstitucional = emailInstitucional;
	}

	public String getEmailPersonal() {
		return emailPersonal;
	}

	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}

	public Long getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(Long numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Long getNumeroMovil() {
		return numeroMovil;
	}

	public void setNumeroMovil(Long numeroMovil) {
		this.numeroMovil = numeroMovil;
	}
	
	//toString

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", emailInstitucional="
				+ emailInstitucional + ", emailPersonal=" + emailPersonal + ", numeroTelefono=" + numeroTelefono
				+ ", numeroMovil=" + numeroMovil + ", expedienteAlumno=" + expedienteAlumno + "]";
	}
	
	//HashCode and Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((emailInstitucional == null) ? 0 : emailInstitucional.hashCode());
		result = prime * result + ((emailPersonal == null) ? 0 : emailPersonal.hashCode());
		result = prime * result + ((expedienteAlumno == null) ? 0 : expedienteAlumno.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombreCompleto == null) ? 0 : nombreCompleto.hashCode());
		result = prime * result + ((numeroMovil == null) ? 0 : numeroMovil.hashCode());
		result = prime * result + ((numeroTelefono == null) ? 0 : numeroTelefono.hashCode());
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
		Alumno other = (Alumno) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (emailInstitucional == null) {
			if (other.emailInstitucional != null)
				return false;
		} else if (!emailInstitucional.equals(other.emailInstitucional))
			return false;
		if (emailPersonal == null) {
			if (other.emailPersonal != null)
				return false;
		} else if (!emailPersonal.equals(other.emailPersonal))
			return false;
		if (expedienteAlumno == null) {
			if (other.expedienteAlumno != null)
				return false;
		} else if (!expedienteAlumno.equals(other.expedienteAlumno))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombreCompleto == null) {
			if (other.nombreCompleto != null)
				return false;
		} else if (!nombreCompleto.equals(other.nombreCompleto))
			return false;
		if (numeroMovil == null) {
			if (other.numeroMovil != null)
				return false;
		} else if (!numeroMovil.equals(other.numeroMovil))
			return false;
		if (numeroTelefono == null) {
			if (other.numeroTelefono != null)
				return false;
		} else if (!numeroTelefono.equals(other.numeroTelefono))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

}
