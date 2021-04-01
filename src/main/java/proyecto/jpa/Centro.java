package proyecto.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Centro {

	
	@Id
	@Column(name="ID")
	private Integer id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="DIRECCION")
	private String direccion;
	@Column(name="TELEFONO_CONSERJERIA")
	private Long telefonoConserjeria;
	
	
	@ManyToMany
	private List<Titulacion> centroTitulacion;	
	
	//Getters and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getTelefonoConserjeria() {
		return telefonoConserjeria;
	}

	public void setTelefono_conserjeria(Long telefonoConserjeria) {
		this.telefonoConserjeria = telefonoConserjeria;
	}

}
