/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.compromisso.repository;

import br.com.ifba.compromisso.entity.Compromisso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hiane
 */

/**
 * Interface Repository para a entidade Compromisso.
 * Utiliza Spring Data JPA para facilitar operações no banco de dados.
 */
@Repository
public interface CompromissoRepository extends JpaRepository<Compromisso, Long> {
    // JpaRepository já fornece os métodos CRUD, então não precisamos implementá-los manualmente.
}