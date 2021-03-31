package proyecto.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Encuesta implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ENVIO")
	private Date fechaEnvio;
	/**
	 * Many-one weak con Expediente
	 * Many-many Grupo_Asignatura
	 */
	
	public Encuesta() {
		super();
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

}
