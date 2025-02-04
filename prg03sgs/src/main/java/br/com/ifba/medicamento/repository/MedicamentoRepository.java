/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.medicamento.repository;

import br.com.ifba.medicamento.entity.Medicamento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface do repositório para a entidade Medicamento.
 *
 * @author rober
 */
@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>{
    // Utiliza o operador "LIKE" para busca com padrão e ignora o tipo de case
    List<Medicamento> findByNomeLikeIgnoreCase(String nome);
    
    // Busca por parte do nome, ignorando o case
    List<Medicamento> findByNomeContainingIgnoreCase(String nome);
}