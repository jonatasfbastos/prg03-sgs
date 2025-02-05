/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fichavisita.controller;

import br.com.ifba.fichavisita.entity.FichaVisita;
import java.util.List;

/**
 *
 * @author sunhe
 */

/*
Interface do Controller da entidade FichaVisita relecionada à Gestão de Visita Domiciliar e Territorial.
*/

public interface FichaVisitaIController {
    
    public abstract void save(FichaVisita ficha);
    public abstract void update(FichaVisita ficha);
    public abstract void delete(FichaVisita ficha);
    public abstract FichaVisita findById(Long id);
    public abstract List <FichaVisita> findAll();
    
}
