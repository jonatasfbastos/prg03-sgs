/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.requisicoes.controller;

import br.com.ifba.requisicoes.entity.Requisicoes;
import br.com.ifba.requisicoes.service.RequisicoesIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author aurian
 */
public class RequisicoesController implements RequisicoesIController{
    @Autowired
    private RequisicoesIService requisicoesIService;
    
    @Override
    public List<Requisicoes> findAll() throws RuntimeException {
        return requisicoesIService.findAll();
    }

    @Override
    public Requisicoes save(Requisicoes requisicoes) throws RuntimeException {
        Requisicoes atendimento = null;
        return requisicoesIService.save(atendimento);
    }

    @Override
    public Requisicoes update(Requisicoes requisicoes) throws RuntimeException {
        throw new RuntimeException ("O Objeto não pode ser editado.");
    }

    @Override
    public void delete(Requisicoes requisicoes) throws RuntimeException {
        throw new RuntimeException ("O Objeto não pode ser deletado.");
    }

    @Override
    public Requisicoes findById(Long id)  {
        return requisicoesIService.findById(id);
    }

}
