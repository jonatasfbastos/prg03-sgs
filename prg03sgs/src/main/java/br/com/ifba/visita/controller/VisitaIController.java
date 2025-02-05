/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.visita.controller;

import br.com.ifba.visita.entity.Visita;
import java.util.List;

/**
 *
 * @author sunhe
 */
public interface VisitaIController {
    
    public abstract void save(Visita visita);
    public abstract void update(Visita visita);
    public abstract void delete(Visita visita);
    public abstract Visita findById(Long id);
    public abstract List <Visita> findAll();
    
}
