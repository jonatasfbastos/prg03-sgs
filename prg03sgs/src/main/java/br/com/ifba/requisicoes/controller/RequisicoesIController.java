/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.requisicoes.controller;

import br.com.ifba.requisicoes.entity.Requisicoes;
import java.util.List;

/**
 *
 * @author aurian
 */
public interface RequisicoesIController {
    public abstract List <Requisicoes> findAll();
    public abstract Requisicoes save(Requisicoes requisicoes);
    public abstract Requisicoes update(Requisicoes requisicoes);
    public abstract void delete(Requisicoes requisicoes);
    public abstract Requisicoes findById(Long id);

}
