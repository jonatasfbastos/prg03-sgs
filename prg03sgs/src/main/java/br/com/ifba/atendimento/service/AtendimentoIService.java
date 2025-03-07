/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atendimento.service;

import br.com.ifba.atendimento.entity.Atendimento;
import java.util.List;

/**
 * Interface do Service da entidade Atendimento
 * @author larissa
 */
public interface AtendimentoIService {
    public abstract List <Atendimento> findAll();
    public abstract Atendimento save(Atendimento atendimento);
    public abstract Atendimento update(Atendimento atendimento);
    public abstract void delete(Atendimento atendimento);
    public abstract Atendimento findById(Long id);
}
