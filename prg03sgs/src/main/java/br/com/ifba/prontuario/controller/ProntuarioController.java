/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.controller;

import br.com.ifba.prontuario.entity.Prontuario;
import br.com.ifba.prontuario.service.ProntuarioIService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Glauber
 */
@Controller
@RequiredArgsConstructor
public class ProntuarioController implements ProntuarioIController{
    
    @Autowired
    private final ProntuarioIService prontuarioService;
    
    @Override
    public List<Prontuario> findAll() {
        return prontuarioService.findAll();
    }
    
    @Override
    public Optional<Prontuario> findById(Long id){
        return prontuarioService.findById(id);
    }

    @Override
    public void save(Prontuario prontuario) {
        prontuarioService.save(prontuario);
    }

    @Override
    public void update(Prontuario prontuario) {
        prontuarioService.update(prontuario);
    }
    
}
