/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.campanhavacina.repository;

import br.com.ifba.campanhavacina.entity.CampanhaVacinaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a1591
 * 
 * Camada de persistencia onde é definido algumas funcionalidades especificas
 */

@Repository
public interface CursoRepository extends JpaRepository<CampanhaVacinaEntity, Long> {

    public List<CampanhaVacinaEntity> findByNome(String nome);  
    
}
