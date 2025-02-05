/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fichavisita.repository;


import br.com.ifba.fichavisita.entity.FichaVisita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunhe
 */

@Repository
public interface FichaVisitaRepository extends JpaRepository<FichaVisita, Long>{
    
}
