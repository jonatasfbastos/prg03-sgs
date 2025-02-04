/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atendimento.controller;

import br.com.ifba.atendimento.entity.Atendimento;
import br.com.ifba.atendimento.service.AtendimentoIService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller da entidade Atendimento
 * @author larissa
 */

@Controller
public class AtendimentoController implements AtendimentoIController{

    @Autowired
    private AtendimentoIService atendimentoIService;
    
    @Override
    public List<Atendimento> findAll() throws RuntimeException {
        return atendimentoIService.findAll();
    }

    @Override
    public Atendimento save(Atendimento atendimento) throws RuntimeException {
        return atendimentoIService.save(atendimento);
    }

    @Override
    public Atendimento update(Atendimento atendimento) throws RuntimeException {
        throw new RuntimeException ("O Objeto não pode ser editado.");
    }

    @Override
    public void delete(Atendimento atendimento) throws RuntimeException {
        throw new RuntimeException ("O Objeto não pode ser deletado.");
    }

    @Override
    public Atendimento findById(Long id) throws RuntimeException {
        return atendimentoIService.findById(id);
    }

    @Override
    public List<Atendimento> findByNomeFuncionario(String nomeFuncionario) throws RuntimeException {
        return atendimentoIService.findByNomeFuncionario(nomeFuncionario);
    }

    @Override
    public List<Atendimento> findByNomeFuncionarioAndDataHoraInicioBetween(
            String nomeFuncionario, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) 
            throws RuntimeException {
        return atendimentoIService.findByNomeFuncionarioAndDataHoraInicioBetween(
                nomeFuncionario, dataHoraInicio, dataHoraFim);
    }
    
}
