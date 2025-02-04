/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atendimento.controller;

import br.com.ifba.atendimento.entity.Atendimento;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author larissa
 */
public interface AtendimentoIController {
    public abstract List <Atendimento> findAll();
    public abstract Atendimento save(Atendimento atendimento);
    public abstract Atendimento update(Atendimento atendimento);
    public abstract void delete(Atendimento atendimento);
    public abstract Atendimento findById(Long id);
    public abstract List<Atendimento> findByNomeFuncionario(String nomeFuncionario);
    public abstract List<Atendimento> findByNomeFuncionarioAndDataHoraInicioBetween(
        String nomeFuncionario, 
        LocalDateTime dataHoraInicio, 
        LocalDateTime dataHoraFim
    );
}
