/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.paciente.controller;

import br.com.ifba.paciente.entity.Paciente;
import java.util.List;

/**
 *
 * @author Glauber
 */
public interface PacienteIController {
    public abstract List<Paciente> findAll();
    public abstract void save(Paciente paciente);
    public abstract void update (Paciente paciente);
    public Paciente findById(Long id);
}
