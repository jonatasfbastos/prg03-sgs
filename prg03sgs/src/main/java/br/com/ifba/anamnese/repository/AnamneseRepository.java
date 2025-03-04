/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.anamnese.repository;

import br.com.ifba.anamnese.entity.Anamnese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author larissa
 */

@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese, Long>{
    
}
