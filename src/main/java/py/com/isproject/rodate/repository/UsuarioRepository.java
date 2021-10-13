package py.com.isproject.rodate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.com.isproject.rodate.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
