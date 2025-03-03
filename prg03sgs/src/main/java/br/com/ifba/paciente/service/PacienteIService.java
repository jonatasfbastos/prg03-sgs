/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.paciente.service;

import br.com.ifba.paciente.entity.Paciente;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 *
 * @author Glauber
 */
public interface PacienteIService {
    public abstract List<Paciente> findAll() throws RuntimeException;
    public abstract void save(Paciente paciente) throws RuntimeException, IllegalArgumentException;
    public abstract void update (Paciente paciente) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;
    public Paciente findById(Long id) throws EntityNotFoundException;
}
