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
    public List<Usuario> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String nome, String email, String senha, String nivelAcesso) throws RuntimeException {
        return usuarioIService.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(nome, email, senha, nivelAcesso);
    }

    @Override
    public List<Usuario> findByNome(String nome) throws RuntimeException {
        return usuarioIService.findByNome(nome);
    }

    @Override
    public List<Usuario> findByEmail(String email) throws RuntimeException {
        return usuarioIService.findByEmail(email);
    }

    @Override
    public List<Usuario> findBySenha(String senha) throws RuntimeException {
        return usuarioIService.findBySenha(senha);
    }

    @Override
    public List<Usuario> findByNivelAcesso(String nivelAcesso) throws RuntimeException {
        return usuarioIService.findByNivelAcesso(nivelAcesso);
    }

    /*@Override
    public List<Usuario> findByIdContainingOrNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String id, String nome, String email, String senha, String nivelAcesso) throws RuntimeException {
        return usuarioIService.findByIdContainingOrNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(id, nome, email, senha, nivelAcesso);
    }*/
}
