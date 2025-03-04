/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.service;

import br.com.ifba.paciente.entity.Paciente;
import br.com.ifba.paciente.repository.PacienteRepository;
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
public class PacienteService implements PacienteIService{
    
    private final PacienteRepository pacienteRepository;
    
    @Override
    public List<Paciente> findAll() throws RuntimeException {
        try {
            return pacienteRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar prontuários: " + e.getMessage());
        }
    }

    @Override
    public void save(Paciente paciente) throws RuntimeException, IllegalArgumentException {
        if (paciente == null) {
            throw new IllegalArgumentException("Paciente não pode ser nulo.");
        }
        try {
            pacienteRepository.save(paciente);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar paciente: " + e.getMessage());
        }
    }

    @Override
    public void update(Paciente paciente) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        if (paciente == null || paciente.getId() == null) {
            throw new IllegalArgumentException("Paciente inválido ou sem ID.");
        }
        if (!pacienteRepository.existsById(paciente.getId())) {
            throw new EntityNotFoundException("Paciente com ID " + paciente.getId() + " não encontrado.");
        }
        try {
            pacienteRepository.save(paciente);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar paciente: " + e.getMessage());
        }
    }
    
    @Override
    public Paciente findById(Long id) throws EntityNotFoundException {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        return paciente.orElseThrow(() -> new EntityNotFoundException("Paciente com ID " + id + " não encontrado."));
    }

    @Override
    public Paciente findByCpf(String cpf) throws EntityNotFoundException {
        Optional<Paciente> paciente = pacienteRepository.findByCpf(cpf);
        return paciente.orElseThrow(() -> new EntityNotFoundException("Paciente com CPF " + cpf + " não encontrado."));
    }
    
}
