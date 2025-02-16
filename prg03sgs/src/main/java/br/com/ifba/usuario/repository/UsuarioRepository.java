package br.com.ifba.usuario.repository;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //public abstract List<Usuario> findByIdContainingOrNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String id, String nome, String email, String senha, String nivelAcesso);
    
    public abstract List<Usuario> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String nome, String email, String senha, String nivelAcesso);

    public abstract List<Usuario> findByNome(String nome);

    public abstract List<Usuario> findByEmail(String email);

    public abstract List<Usuario> findBySenha(String senha);

    public abstract List<Usuario> findByNivelAcesso(String nivelAcesso);
}
