/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.campanhavacina.service;

import br.com.ifba.campanhavacina.entity.CampanhaVacinaEntity;
import java.util.List;

/**
 *
 * @author a1591
 */
public interface CampanhaVacinaIService {

    public abstract List <CampanhaVacinaEntity> findAll() throws RuntimeException;
    public abstract CampanhaVacinaEntity save(CampanhaVacinaEntity campanhaEntity) throws RuntimeException;
    public abstract CampanhaVacinaEntity update(CampanhaVacinaEntity campanhaEntity) throws RuntimeException;
    public abstract void delete(CampanhaVacinaEntity campanhaEntity) throws RuntimeException;
    public abstract CampanhaVacinaEntity findById(Long id) throws RuntimeException;
    public abstract List <CampanhaVacinaEntity> findByNome(String nome) throws RuntimeException;
    
}
