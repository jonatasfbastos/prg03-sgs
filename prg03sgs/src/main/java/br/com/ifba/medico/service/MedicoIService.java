/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.medico.service;

import br.com.ifba.medico.entity.Medico;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 *
 * @author Rafael
 */
public interface MedicoIService {
    
    public abstract List <Medico> findAll() throws RuntimeException;

    public abstract void save(Medico medico) throws RuntimeException, IllegalArgumentException;

    public abstract void update(Medico medico) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;

    public abstract void delete(Medico medico) throws RuntimeException, EntityNotFoundException;

    public abstract Medico findById(Long id) throws RuntimeException;
    
}
