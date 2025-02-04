package br.com.ifba.usuario.service;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.repository.UsuarioRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioIService{
    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) throws RuntimeException {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) throws RuntimeException {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Usuario usuario) throws RuntimeException {
        usuarioRepository.delete(usuario);
    }

    @Override
    public List<Usuario> findAll() throws RuntimeException {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) throws RuntimeException {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> findByNome(String nome) throws RuntimeException {
        return usuarioRepository.findByNome(nome);
    }

    @Override
    public List<Usuario> findByEmail(String email) throws RuntimeException {
        return usuarioRepository.findByEmail(email);
    }
}
