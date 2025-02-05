/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fichavisita.controller;

import br.com.ifba.fichavisita.entity.FichaVisita;
import br.com.ifba.fichavisita.service.FichaVisitaIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sunhe
 */

@Controller
@RequiredArgsConstructor
public class FichaVisitaController implements FichaVisitaIController{

    private final FichaVisitaIService fichaIService;
    
    @Override
    public void save(FichaVisita ficha) {
       fichaIService.save(ficha);
    }

    @Override
    public void update(FichaVisita ficha) {
        fichaIService.update(ficha);
    }

    @Override
    public void delete(FichaVisita ficha) {
        fichaIService.delete(ficha);
    }

    @Override
    public FichaVisita findById(Long id) {
        return fichaIService.findById(id);
    }

    @Override
    public List<FichaVisita> findAll() {
        return fichaIService.findAll();
    }
    
}
