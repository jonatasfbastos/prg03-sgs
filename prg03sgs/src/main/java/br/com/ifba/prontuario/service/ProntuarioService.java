/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.service;


import br.com.ifba.prontuario.entity.Prontuario;
import br.com.ifba.prontuario.repository.ProntuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Glauber
 */

@Service
@RequiredArgsConstructor
public class ProntuarioService implements ProntuarioIService {
    
    private final ProntuarioRepository prontuarioRepository;
    
    
    // Lista todos os prontuários
    @Override
    public List<Prontuario> findAll() throws RuntimeException {
        try {
            return prontuarioRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar prontuários: " + e.getMessage());
        }
    }
    
    @Override
    public Optional<Prontuario> findById(Long id) {
        return prontuarioRepository.findById(id);
    }
    
    // Salva um novo prontuário
    @Override
    public void save(Prontuario prontuario) throws RuntimeException, IllegalArgumentException {
        // Verifica se o paciente está associado ao prontuário
        if (prontuario.getPaciente() == null || prontuario.getPaciente().getId() == null) {
            throw new IllegalArgumentException("Paciente é obrigatório para o prontuário.");
        }

        try {
            // Salva o prontuário no banco de dados
            prontuarioRepository.save(prontuario);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar prontuário: " + e.getMessage());
        }
    }
    
    // Atualiza um prontuário existente
    @Override
    public void update(Prontuario prontuario) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        // Verifica se o ID do prontuário foi informado
        if (prontuario.getId() == null) {
            throw new IllegalArgumentException("ID do prontuário é obrigatório para atualização.");
        }

        // Busca o prontuário existente pelo ID
        Prontuario existente = prontuarioRepository.findById(prontuario.getId())
                .orElseThrow(() -> new EntityNotFoundException("Prontuário com ID " + prontuario.getId() + " não encontrado."));

        try {
            // Atualiza as informações do prontuário
            existente.setAnamnese(prontuario.getAnamnese());
            existente.setPaciente(prontuario.getPaciente());

            // Salva as alterações no banco de dados
            prontuarioRepository.save(existente);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar prontuário: " + e.getMessage());
        }
    }
}

