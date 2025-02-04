package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.service.UsuarioIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UsuarioController implements UsuarioIController{
    private final UsuarioIService usuarioIService;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioIService.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioIService.update(usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        usuarioIService.delete(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioIService.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioIService.findById(id);
    }

    @Override
    public List<Usuario> findByNome(String nome) {
        return usuarioIService.findByNome(nome);
    }

    @Override
    public List<Usuario> findByEmail(String email) {
        return usuarioIService.findByEmail(email);
    }
}
