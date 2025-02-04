package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;

public interface UsuarioIController {
    public abstract Usuario save(Usuario usuario);

    public abstract Usuario update(Usuario usuario);

    public abstract void delete(Usuario usuario);

    public abstract List<Usuario> findAll();

    public abstract Usuario findById(Long id);
    
    public abstract List<Usuario> findByNome(String nome);
    
    public abstract List<Usuario> findByEmail(String email);
}
