/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compromisso.service;

// Importações necessárias
import br.com.ifba.compromisso.dao.CompromissoDAO;
import br.com.ifba.compromisso.dao.CompromissoDAOImpl;
import br.com.ifba.compromisso.entity.Compromisso;
import java.util.List;

/**
 *
 * @author hiane
 */

/**
 * Camada de serviço responsável por regras de negócio dos compromissos.
 */
public class CompromissoService {

    private CompromissoDAO compromissoDAO = new CompromissoDAOImpl();

    public void adicionarCompromisso(Compromisso compromisso) {
        compromissoDAO.criar(compromisso);
    }

    public Compromisso obterCompromisso(int id) {
        return compromissoDAO.buscarPorId(id);
    }

    public List<Compromisso> listarCompromissos() {
        return compromissoDAO.listarTodos();
    }

    public void atualizarCompromisso(Compromisso compromisso) {
        compromissoDAO.atualizar(compromisso);
    }

    public void removerCompromisso(int id) {
        compromissoDAO.deletar(id);
    }
}