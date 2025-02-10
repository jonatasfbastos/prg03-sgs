/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compromisso.service;

// Importações necessárias
import br.com.ifba.compromisso.entity.Compromisso;
import br.com.ifba.compromisso.repository.CompromissoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author hiane
 */

/**
 * Serviço responsável por gerenciar operações relacionadas a compromissos.
 */
@Service
public class CompromissoService {

    @Autowired
    private CompromissoRepository compromissoRepository;

    /**
     * Salva um novo compromisso no banco de dados.
     * @param compromisso
     */
    public void criar(Compromisso compromisso) {
        compromissoRepository.save(compromisso);
        System.out.println("Compromisso criado: " + compromisso.getTitulo());
    }

    /**
     * Busca um compromisso pelo ID.
     * @param id
     * @return 
     */
    public Compromisso buscarPorId(Long id) {
        Optional<Compromisso> compromisso = compromissoRepository.findById(id);
        return compromisso.orElse(null);
    }

    /**
     * Lista todos os compromissos armazenados.
     * @return 
     */
    public List<Compromisso> listarTodos() {
        return compromissoRepository.findAll();
    }

    /**
     * Atualiza um compromisso existente.
     * @param compromisso
     */
    public void atualizar(Compromisso compromisso) {
        if (compromissoRepository.existsById(compromisso.getId())) {
            compromissoRepository.save(compromisso);
            System.out.println("Compromisso atualizado: " + compromisso.getTitulo());
        }
    }

    /**
     * Deleta um compromisso pelo ID.
     * @param id
     */
    public void deletar(Long id) {
        if (compromissoRepository.existsById(id)) {
            compromissoRepository.deleteById(id);
            System.out.println("Compromisso deletado com ID: " + id);
        }
    }
}