/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.agentevisita.controller;

import br.com.ifba.agentevisita.entity.AgenteVisita;
import java.util.List;

/**
 *
 * @author sunhe
 */

/*
Interface do Controller da entidade AgenteVisita relecionada à Gestão de Visita Domiciliar e Territorial.
*/

public interface AgenteVisitaIController {
    
    public abstract void save(AgenteVisita agente);
    public abstract void update(AgenteVisita agente);
    public abstract void delete(AgenteVisita agente);
    public abstract AgenteVisita findById(Long id);
    public abstract List <AgenteVisita> findByNome(String nome);
    public abstract List <AgenteVisita> findAll();
    
}
