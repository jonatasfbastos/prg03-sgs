package br.com.ifba.perfilusuario.service;

import br.com.ifba.perfilusuario.entity.PerfilUsuario;
import br.com.ifba.perfilusuario.repository.PerfilUsuarioRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PerfilUsuarioService implements PerfilUsuarioIService{
    //Injeção de dependência no Repository.
    private final PerfilUsuarioRepository perfilUsuarioRepository;
    
    @Override
    public PerfilUsuario save(PerfilUsuario perfilUsuario) {
        return perfilUsuarioRepository.save(perfilUsuario);
    }

    @Override
    public PerfilUsuario update(PerfilUsuario perfilUsuario) {
        return perfilUsuarioRepository.save(perfilUsuario);
    }

    @Override
    public void delete(PerfilUsuario perfilUsuario) {
        perfilUsuarioRepository.delete(perfilUsuario);
    }

    @Override
    public List<PerfilUsuario> findAll() {
        return perfilUsuarioRepository.findAll();
    }
    
    @Override
    public PerfilUsuario findById(Long id) throws RuntimeException {
        return perfilUsuarioRepository.findById(id).orElse(null);
    } 
}
