/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.campanhavacina.controller;

import br.com.ifba.campanhavacina.entity.CampanhaVacinaEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.ifba.campanhavacina.service.CampanhaVacinaIService;

/**
 *
 * @author a1591
 * 
 * Camada Controller respnsavel por passar as informaçoes padronizadas para o Service
 */
@Controller
public class CampanhaVacinaController implements CampanhaVacinaIController{
    
    @Autowired
    private CampanhaVacinaIService campanhaVacinaIService;

    @Override
    public List <CampanhaVacinaEntity> findAll() throws RuntimeException{
        return campanhaVacinaIService.findAll();
    }
    
    @Override
    public CampanhaVacinaEntity save (CampanhaVacinaEntity campanhaEntity) throws RuntimeException{
        return campanhaVacinaIService.save(campanhaEntity);
    }
    
    @Override
    public CampanhaVacinaEntity update (CampanhaVacinaEntity campanhaEntity) throws RuntimeException{
        return campanhaVacinaIService.update(campanhaEntity);
    }
    
    @Override
    public void delete (CampanhaVacinaEntity campanhaEntity) throws RuntimeException{
        campanhaVacinaIService.delete(campanhaEntity);
    }
    
    @Override
    public CampanhaVacinaEntity findById (Long id) throws RuntimeException{
        return campanhaVacinaIService.findById(id);
    }
    
    @Override
    public List <CampanhaVacinaEntity> findByNome (String nome) throws RuntimeException{
        return campanhaVacinaIService.findByNome(nome);
    }
    
}
