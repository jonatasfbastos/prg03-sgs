/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.anamnese.controller;

import br.com.ifba.anamnese.entity.Anamnese;
import java.util.List;

/**
 *
 * @author larissa
 */
public interface AnamneseIController {
    public abstract List <Anamnese> findAll();
    public abstract Anamnese save(Anamnese anamnese);
    public abstract Anamnese findById(Long id);
}
