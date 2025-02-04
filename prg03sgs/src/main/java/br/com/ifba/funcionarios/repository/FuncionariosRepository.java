/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcionarios.repository;

import br.com.ifba.funcionarios.entity.Funcionarios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para a entidade Funcionarios.
 * 
 * Esta interface permite a realização de operações de persistência para a
 * entidade Funcionarios, incluindo buscas personalizadas.
 *
 * Autor: Rafael
 */
@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long> {
    
    /**
     * Busca funcionários cujo nome contenha um determinado valor, ignorando maiúsculas e minúsculas.
     * @param nome Parte do nome do funcionário a ser pesquisado.
     * @return Lista de funcionários que correspondem ao critério de busca.
     */
    List<Funcionarios> findByNomeLikeIgnoreCase(String nome);
    
    /**
     * Busca funcionários cujo nome contenha um determinado valor.
     * @param nome Parte do nome do funcionário a ser pesquisado.
     * @return Lista de funcionários que correspondem ao critério de busca.
     */
    List<Funcionarios> findByNomeContaining(String nome);
}
