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
public class Usuario {

	@Id
	@SequenceGenerator(name = "usuario_seq_generator", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq_generator")
	@Column(name = "usuario_id")
	private Integer id;

	@Column(nullable = false, length = 50)
	private String nombre;

	@Column(nullable = false, length = 50)
	private String apellido;

	@Column(nullable = false, length = 20)
	private String login;

	@Column(nullable = false, length = 50)
	private String email;

	@Column(nullable = false, length = 50)
	private String password;

	@Column(nullable = false, length = 1)
	private String situacion;

}
