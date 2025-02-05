/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.visita.controller;

import br.com.ifba.visita.entity.Visita;
import br.com.ifba.visita.service.VisitaIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sunhe
 */

@Controller
@RequiredArgsConstructor
public class VisitaController implements VisitaIController{

    private final VisitaIService visitaIService;
    
    @Override
    public void save(Visita visita) {
        visitaIService.save(visita);
    }

    @Override
    public void update(Visita visita) {
        visitaIService.update(visita);
    }

    @Override
    public void delete(Visita visita) {
        visitaIService.delete(visita);
    }

    @Override
    public Visita findById(Long id) {
        return visitaIService.findById(id);
    }

    @Override
    public List<Visita> findAll() {
        return visitaIService.findAll();
    }
    
}
