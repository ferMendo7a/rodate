package py.com.isproject.rodate.bean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import py.com.isproject.rodate.model.Usuario;
import py.com.isproject.rodate.repository.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioFormMB {

	@Autowired
	private UsuarioRepository usuarioRepository;

	private Usuario usuario;

	@PostConstruct
	public void init() {
		usuario = new Usuario();
	}

	public void save() {
		try {
			usuario.setPassword("123");
			usuario.setSituacion("A");
			usuarioRepository.save(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
