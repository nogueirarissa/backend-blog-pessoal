package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	public List<Usuario> findByUsuario(String usuario);
}
