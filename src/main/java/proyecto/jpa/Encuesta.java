package proyecto.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Encuesta {
	@Id
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ENVIO")
	private Date fechaEnvio;
		
	@ManyToMany
	private List<GruposAsignatura> grupoAsignaturaEncuesta;
	
	@ManyToOne(optional = false)
	private Expediente expedienteEncuesta;
	
	//Getters and Setters
	
	
	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Encuesta [fechaEnvio=" + fechaEnvio + ", grupoAsignaturaEncuesta=" + grupoAsignaturaEncuesta
				+ ", expedienteEncuesta=" + expedienteEncuesta + "]";
	}

	
	
	//HashCode and Equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expedienteEncuesta == null) ? 0 : expedienteEncuesta.hashCode());
		result = prime * result + ((fechaEnvio == null) ? 0 : fechaEnvio.hashCode());
		result = prime * result + ((grupoAsignaturaEncuesta == null) ? 0 : grupoAsignaturaEncuesta.hashCode());
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
		Encuesta other = (Encuesta) obj;
		if (expedienteEncuesta == null) {
			if (other.expedienteEncuesta != null)
				return false;
		} else if (!expedienteEncuesta.equals(other.expedienteEncuesta))
			return false;
		if (fechaEnvio == null) {
			if (other.fechaEnvio != null)
				return false;
		} else if (!fechaEnvio.equals(other.fechaEnvio))
			return false;
		if (grupoAsignaturaEncuesta == null) {
			if (other.grupoAsignaturaEncuesta != null)
				return false;
		} else if (!grupoAsignaturaEncuesta.equals(other.grupoAsignaturaEncuesta))
			return false;
		return true;
	}
	
	

}
