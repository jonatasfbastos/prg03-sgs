package br.com.ifba.perfilusuario.controller;

import br.com.ifba.perfilusuario.entity.PerfilUsuario;
import br.com.ifba.perfilusuario.service.PerfilUsuarioIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PerfilUsuarioController implements PerfilUsuarioIController{
    //Injeção de dependência no Service.
    private final PerfilUsuarioIService perfilUsuarioIService;

    @Override
    public PerfilUsuario save(PerfilUsuario perfilUsuario) throws RuntimeException {
        return perfilUsuarioIService.save(perfilUsuario);
    }

    @Override
    public PerfilUsuario update(PerfilUsuario perfilUsuario) throws RuntimeException {
        return perfilUsuarioIService.update(perfilUsuario);
    }

    @Override
    public void delete(PerfilUsuario perfilUsuario) throws RuntimeException {
        perfilUsuarioIService.delete(perfilUsuario);
    }
    
    @Override
    public List<PerfilUsuario> findAll() throws RuntimeException {
        return perfilUsuarioIService.findAll();
    }
    
    @Override
    public PerfilUsuario findById(Long id) throws RuntimeException {
        return perfilUsuarioIService.findById(id);
    }
}
