package py.com.isproject.rodate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Vehiculo {

	@Id
	@SequenceGenerator(name = "vehiculo_seq_generator", sequenceName = "seq_vehiculo", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehiculo_seq_generator")
	@Column(name = "usuario_id")
	private Integer id;

	private String marca;

	private String modelo;

	private String descripcion;

	private String situacion;

}
