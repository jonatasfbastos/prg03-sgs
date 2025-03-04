package br.com.ifba.perfilusuario.repository;

import br.com.ifba.perfilusuario.entity.PerfilUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuario, Long> {
    
}
