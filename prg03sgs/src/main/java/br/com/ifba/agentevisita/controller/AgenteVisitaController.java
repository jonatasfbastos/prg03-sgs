/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.agentevisita.controller;

import br.com.ifba.agentevisita.entity.AgenteVisita;
import br.com.ifba.agentevisita.service.AgenteVisitaIService;
import jakarta.persistence.Id;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sunhe
 */

/*
Controller para da entidade AgenteVisita relecionada à Gestão de Visita Domiciliar e Territorial.
Contem os metodos das operções do CRUD.
*/

@Controller
@RequiredArgsConstructor
public class AgenteVisitaController implements AgenteVisitaIController{
    
    private final AgenteVisitaIService agenteIService;

    //Método para salvar o objeto Agente no sistema.
    @Override
    public void save(AgenteVisita agente) {
        agenteIService.save(agente);
    }

    //Método para atualizar o objeto Agente no sistema.
    @Override
    public void update(AgenteVisita agente) {
        agenteIService.update(agente);
    }

    //Método para deletar o objeto Agente no sistema.
    @Override
    public void delete(AgenteVisita agente) {
        agenteIService.delete(agente);
    }

    //Método para achare o agente por ID.
    @Override
    public AgenteVisita findById(Long id) {
        return agenteIService.findById(id);
    }

    //Método para encontra o agente pelo nome.
    @Override
    public List<AgenteVisita> findByNome(String nome) {
        return agenteIService.findByNome(nome);
    }

    //Método para encontrar todos os agentes.S
    @Override
    public List<AgenteVisita> findAll() {
        return agenteIService.findAll();
    }
    
}
