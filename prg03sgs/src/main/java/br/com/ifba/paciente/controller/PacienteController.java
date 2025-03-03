/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.controller;

import br.com.ifba.paciente.entity.Paciente;
import br.com.ifba.paciente.service.PacienteIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Glauber
 */
@Controller
@RequiredArgsConstructor
public class PacienteController implements PacienteIController{

    private final PacienteIService pacienteService;
    
    @Override
    public List<Paciente> findAll() {
        return pacienteService.findAll();
    }

    @Override
    public void save(Paciente paciente) {
        pacienteService.save(paciente);
    }

    @Override
    public void update(Paciente paciente) {
        pacienteService.update(paciente);
    }
    
     public Paciente findById(Long id) {
        return pacienteService.findById(id);
     }
    
}
