package py.com.isproject.rodate.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import py.com.isproject.rodate.model.Usuario;
import py.com.isproject.rodate.repository.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioListMB {

	@Autowired
	private UsuarioRepository usuarioRepository;

	private List<Usuario> usuarios;

	@PostConstruct
	public void init() {
		fetchUsuarios();
	}

	private void fetchUsuarios() {
		setUsuarios(usuarioRepository.findAll());
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
