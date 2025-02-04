/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.compromisso.dao;

// Importações necessárias
import br.com.ifba.compromisso.entity.Compromisso;
import java.util.List;

/**
 *
 * @author hiane
 */

/**
 * Interface responsável pelo contrato de operações CRUD para compromissos.
 */
public interface CompromissoDAO {

    void criar(Compromisso compromisso);
    Compromisso buscarPorId(int id);
    List<Compromisso> listarTodos();
    void atualizar(Compromisso compromisso);
    void deletar(int id);
}