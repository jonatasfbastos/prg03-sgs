/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.requisicoes.repository;

import br.com.ifba.requisicoes.entity.Requisicoes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aurian
 */

@Repository
public interface RequisicoesRepository extends JpaRepository <Requisicoes, Long> {
    List<Requisicoes> findByNomePaciente(String nomePaciente);
}
