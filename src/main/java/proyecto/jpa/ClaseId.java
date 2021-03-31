package proyecto.jpa;
import java.util.Date;

import javax.persistence.*;

/**
 * 
 * @author Los Datografos
 * Esta clase se usa para poder crear la clave primaria compuesta de Clase. 
 */

@Embeddable
public class ClaseId{
		@Column(name = "DIA")
		@Temporal(TemporalType.DATE)
		private Date dia;
		@Column(name = "HORA_INICIO")
		@Temporal(TemporalType.TIME)
		private Date horaInicio;
}

