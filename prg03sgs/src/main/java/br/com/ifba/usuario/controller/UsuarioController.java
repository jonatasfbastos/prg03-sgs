package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.service.UsuarioIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UsuarioController implements UsuarioIController {

    //Injeção de dependência no Service.
    private final UsuarioIService usuarioIService;

    @Override
    public Usuario save(Usuario usuario) throws RuntimeException {
        return usuarioIService.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) throws RuntimeException {
        return usuarioIService.update(usuario);
    }

    @Override
    public void delete(Usuario usuario) throws RuntimeException {
        usuarioIService.delete(usuario);
    }

    @Override
    public List<Usuario> findAll() throws RuntimeException {
        return usuarioIService.findAll();
    }

    @Override
    public Usuario findById(Long id) throws RuntimeException {
        return usuarioIService.findById(id);
    }

    @Override
    public List<Usuario> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(String nome, String email) throws RuntimeException {
        return usuarioIService.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(nome, email);
    }

}
