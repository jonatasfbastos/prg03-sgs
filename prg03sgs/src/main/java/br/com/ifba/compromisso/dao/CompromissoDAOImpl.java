/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compromisso.dao;

// Importações necessárias
import br.com.ifba.compromisso.entity.Compromisso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hiane
 */

/**
 * Implementação do DAO utilizando uma lista em memória.
 */
public class CompromissoDAOImpl implements CompromissoDAO {

    private List<Compromisso> compromissos = new ArrayList<>();

    @Override
    public void criar(Compromisso compromisso) {
        compromissos.add(compromisso);
        System.out.println("Compromisso criado: " + compromisso.getTitulo());
    }

    @Override
    public Compromisso buscarPorId(int id) {
        return compromissos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Compromisso> listarTodos() {
        return compromissos;
    }

    @Override
    public void atualizar(Compromisso compromisso) {
        Compromisso existente = buscarPorId(compromisso.getId());
        if (existente != null) {
            existente.setTitulo(compromisso.getTitulo());
            existente.setDescricao(compromisso.getDescricao());
            existente.setDataHora(compromisso.getDataHora());
            existente.setLocal(compromisso.getLocal());
            System.out.println("Compromisso atualizado: " + compromisso.getTitulo());
        }
    }

    @Override
    public void deletar(int id) {
        compromissos.removeIf(c -> c.getId() == id);
        System.out.println("Compromisso deletado com ID: " + id);
    }
}