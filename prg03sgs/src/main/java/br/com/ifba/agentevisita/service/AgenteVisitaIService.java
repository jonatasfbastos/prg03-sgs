/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.agentevisita.service;

import br.com.ifba.agentevisita.entity.AgenteVisita;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 *
 * @author sunhe
 */
public interface AgenteVisitaIService {
    
    public abstract void save (AgenteVisita agenteVisita) throws RuntimeException, IllegalArgumentException;
    public abstract void update (AgenteVisita agenteVisita) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;
    public abstract void delete (AgenteVisita agenteVisita) throws RuntimeException, IllegalArgumentException;
    public abstract AgenteVisita findById (Long id) throws RuntimeException;
    public abstract List <AgenteVisita> findByNome(String nome);
    public abstract List <AgenteVisita> findAll() throws RuntimeException;
}
