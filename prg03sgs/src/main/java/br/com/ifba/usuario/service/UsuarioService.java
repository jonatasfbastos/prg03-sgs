package br.com.ifba.usuario.service;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.repository.UsuarioRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioIService {

    //Injeção de dependência no Repository.
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
    public List<Usuario> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(String nome, String email) throws RuntimeException {
        return usuarioRepository.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(nome, email);
    }

}
