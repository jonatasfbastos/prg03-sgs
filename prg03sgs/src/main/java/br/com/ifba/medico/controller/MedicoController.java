/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.medico.controller;

import br.com.ifba.medico.entity.Medico;
import br.com.ifba.medico.service.MedicoIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Rafael
 */
@Controller
@RequiredArgsConstructor
public class MedicoController implements MedicoIController {
    
    private final MedicoIService medicoIService;
    
    @Override
    public List <Medico> findAll() {
        return medicoIService.findAll();
    }
    
    @Override
    public void save(Medico medico) {
        medicoIService.save(medico);
    }
    
    @Override
    public void update(Medico medico) {
        medicoIService.update(medico);
    }
    
    @Override
    public void delete(Medico medico) {
        medicoIService.delete(medico);
    }
    
    @Override
    public Medico findById(Long id) throws RuntimeException {
        return medicoIService.findById(id);
    }
}
