/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.medico.controller;

import br.com.ifba.medico.entity.Medico;
import java.util.List;

/**
 *
 * @author Rafael
 */

public interface MedicoIController {
    
    public abstract List <Medico> findAll();
    
    
    public abstract void save(Medico medico);
    
    
    public abstract void update(Medico medico);
    
    
    public abstract void delete(Medico medico);
    
    public abstract Medico findById(Long id) throws RuntimeException;
    
}
