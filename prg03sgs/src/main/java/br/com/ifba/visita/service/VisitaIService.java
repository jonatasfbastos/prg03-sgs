/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.visita.service;

import br.com.ifba.visita.entity.Visita;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 *
 * @author sunhe
 */
public interface VisitaIService {
    
    public abstract void save(Visita visita) throws RuntimeException, IllegalArgumentException;;
    public abstract void update(Visita visita) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;;
    public abstract void delete(Visita visita) throws RuntimeException, IllegalArgumentException;;
    public abstract Visita findById(Long id) throws RuntimeException;;
    public abstract List <Visita> findAll() throws RuntimeException;
    
}
