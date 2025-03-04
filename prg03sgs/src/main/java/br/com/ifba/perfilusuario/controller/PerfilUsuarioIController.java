package br.com.ifba.perfilusuario.controller;

import br.com.ifba.perfilusuario.entity.PerfilUsuario;
import java.util.List;

public interface PerfilUsuarioIController {

    public abstract PerfilUsuario save(PerfilUsuario perfilUsuario);

    public abstract PerfilUsuario update(PerfilUsuario perfilUsuario);

    public abstract void delete(PerfilUsuario perfilUsuario);

    public abstract List<PerfilUsuario> findAll();
    
    public abstract PerfilUsuario findById(Long id);
}
