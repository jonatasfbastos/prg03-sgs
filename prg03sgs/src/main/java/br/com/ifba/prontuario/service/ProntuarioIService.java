/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prontuario.service;


import br.com.ifba.prontuario.entity.Prontuario;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Glauber
 */
public interface ProntuarioIService {
    public abstract List<Prontuario> findAll() throws RuntimeException;
    public Optional<Prontuario> findById(Long id);
    public abstract void save(Prontuario prontuario) throws RuntimeException, IllegalArgumentException;
    public abstract void update (Prontuario prontuario) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;
    
}
