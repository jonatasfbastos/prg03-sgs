/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prontuario.controller;



import br.com.ifba.prontuario.entity.Prontuario;
import java.util.List;

/**
 *
 * @author Glauber
 */
public interface ProntuarioIController {
    public abstract List<Prontuario> findAll();
    public abstract void save(Prontuario prontuario);
    public abstract void update (Prontuario prontuario);
}
