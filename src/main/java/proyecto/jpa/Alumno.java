package proyecto.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 

@Entity
public class Alumno implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue
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
	/**
	 * One-many con Expediente
	 */
	public Alumno() {
		super();
	}

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

}
