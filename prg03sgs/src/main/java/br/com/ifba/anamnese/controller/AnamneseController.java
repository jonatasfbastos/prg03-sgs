/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.anamnese.controller;

import br.com.ifba.anamnese.entity.Anamnese;
import br.com.ifba.anamnese.service.AnamneseIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller da entidade Anamnese
 * @author larissa
 */

@Controller
public class AnamneseController implements AnamneseIController {
    
    @Autowired
    private AnamneseIService anamneseService;

    @Override
    public List<Anamnese> findAll() throws RuntimeException {
        return anamneseService.findAll();
    }

    @Override
    public Anamnese save(Anamnese anamnese) throws RuntimeException {
        return anamneseService.save(anamnese);
    }

    @Override
    public Anamnese findById(Long id) throws RuntimeException {
        return anamneseService.findById(id);
    }
    
}
