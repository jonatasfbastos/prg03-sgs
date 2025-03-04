package br.com.ifba.perfilusuario.service;

import br.com.ifba.perfilusuario.entity.PerfilUsuario;
import java.util.List;

public interface PerfilUsuarioIService {
    public abstract PerfilUsuario save(PerfilUsuario perfilUsuario);

    public abstract PerfilUsuario update(PerfilUsuario perfilUsuario);

    public abstract void delete(PerfilUsuario perfilUsuario);

    public abstract List<PerfilUsuario> findAll();
    
    public abstract PerfilUsuario findById(Long id);
}
