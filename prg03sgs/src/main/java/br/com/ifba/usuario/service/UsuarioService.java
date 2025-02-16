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
        if (usuario.getId() != null) {
            throw new RuntimeException("Este usuário já existe");
        } else {
            return usuarioRepository.save(usuario);
        }
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
    public List<Usuario> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String nome, String email, String senha, String nivelAcesso) throws RuntimeException {
        return usuarioRepository.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(nome, email, senha, nivelAcesso);
    }

    @Override
    public List<Usuario> findByNome(String nome) throws RuntimeException {
        return usuarioRepository.findByNome(nome);
    }

    @Override
    public List<Usuario> findByEmail(String email) throws RuntimeException {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public List<Usuario> findBySenha(String senha) throws RuntimeException {
        return usuarioRepository.findBySenha(senha);
    }

    @Override
    public List<Usuario> findByNivelAcesso(String nivelAcesso) throws RuntimeException {
        return usuarioRepository.findByNivelAcesso(nivelAcesso);
    }

    /*@Override
    public List<Usuario> findByIdContainingOrNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(String id, String nome, String email, String senha, String nivelAcesso) throws RuntimeException {
        return usuarioRepository.findByIdContainingOrNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseOrSenhaContainingIgnoreCaseOrNivelAcessoContainingIgnoreCase(id, nome, email, senha, nivelAcesso);
    }*/
}
