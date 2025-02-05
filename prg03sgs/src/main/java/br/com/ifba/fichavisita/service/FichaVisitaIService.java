/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fichavisita.service;

import br.com.ifba.fichavisita.entity.FichaVisita;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 *
 * @author sunhe
 */
public interface FichaVisitaIService {
    
    public abstract void save(FichaVisita ficha) throws RuntimeException, IllegalArgumentException;;
    public abstract void update(FichaVisita ficha) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;;
    public abstract void delete(FichaVisita ficha) throws RuntimeException, IllegalArgumentException;;
    public abstract FichaVisita findById(Long id) throws RuntimeException;;
    public abstract List <FichaVisita> findAll() throws RuntimeException;
    
}
