package br.com.ifba.usuario.service;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;

public interface UsuarioIService {

    public abstract Usuario save(Usuario usuario);

    public abstract Usuario update(Usuario usuario);

    public abstract void delete(Usuario usuario);

    public abstract List<Usuario> findAll();

    public abstract Usuario findById(Long id);

    //public abstract List<Usuario> findByIdContainingOrNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String id, String nome, String email, String senha, String nivelAcesso);
    
    public abstract List<Usuario> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String nome, String email, String senha, String nivelAcesso);

    public abstract List<Usuario> findByNome(String nome);

    public abstract List<Usuario> findByEmail(String email);

    public abstract List<Usuario> findBySenha(String senha);

    public abstract List<Usuario> findByNivelAcesso(String nivelAcesso);
}
