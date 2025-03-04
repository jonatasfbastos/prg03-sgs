/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.anamnese.service;

import br.com.ifba.anamnese.entity.Anamnese;
import java.util.List;

/**
 * Interface do Service da entidade Anamnese
 * @author larissa
 */
public interface AnamneseIService {
    public abstract List <Anamnese> findAll();
    public abstract Anamnese save(Anamnese anamnese);
    public abstract Anamnese findById(Long id);
}
