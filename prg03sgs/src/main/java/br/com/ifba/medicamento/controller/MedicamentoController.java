/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.medicamento.controller;

import br.com.ifba.medicamento.entity.Medicamento;
import br.com.ifba.medicamento.service.MedicamentoIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Controlador responsável pelo gerenciamento de medicamentos.
 *
 * Esta classe oferece os métodos necessários para realizar operações de CRUD 
 * (criação, leitura, atualização e exclusão) sobre a entidade {@link Medicamento}.
 */
@Controller
@RequiredArgsConstructor
public class MedicamentoController implements MedicamentoIController{

    private final MedicamentoIService medicamentoIService;
    
    @Override
    public List<Medicamento> findAll() {
        return medicamentoIService.findAll();
    }

    @Override
    public void save(Medicamento medicamento) {
        medicamentoIService.save(medicamento);
    }

    @Override
    public void update(Medicamento medicamento) {
        medicamentoIService.update(medicamento);
    }

    @Override
    public void delete(Medicamento medicamento) {
        medicamentoIService.delete(medicamento);
    }

    @Override
    public List<Medicamento> findByNomeLikeIgnoreCase(String nome) {
        return medicamentoIService.findByNomeLikeIgnoreCase(nome);
    }
    
    @Override
    public List<Medicamento> findByNomeContainingIgnoreCase(String nome) {
        return medicamentoIService.findByNomeContainingIgnoreCase(nome);
    }

    @Override
    public Medicamento findById(Long id) throws RuntimeException {
        return medicamentoIService.findById(id);
    }
}