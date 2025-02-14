/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.campanhavacina.controller;

import br.com.ifba.campanhavacina.entity.CampanhaVacinaEntity;

/**
 *
 * @author a1591
 * 
 * Interface de controle para operações relacionadas à entidade da campanha. 
 * 
 * Esta interface define os métodos para manipulação e consulta de Campanha 
 * 
 */
import java.util.List;

public interface CampanhaVacinaIController {
    
    /**
     * Recupera todas as Campanha disponíveis no sistema.
     *
     * @return uma lista contendo todos os cadastrados de Campanhas.
     */
    public abstract List<CampanhaVacinaEntity> findAll() throws RuntimeException;

    /**
     * Salva um novo curso no sistema.
     *
     * @param campanhaEntity O objeto CampanhaVacinaEntity a ser salvo.
     * @return Salva, incluindo qualquer modificação feita pelo sistema (como ID gerado).
     */
    public abstract CampanhaVacinaEntity save(CampanhaVacinaEntity campanhaEntity) throws RuntimeException;

    /**
     * Atualiza os dados existente.
     *
     * @param campanhaEntity O objeto CampanhaVacinaEntity com os dados atualizados.
     * @return Atualizado após a persistência no sistema.
     */
    public abstract CampanhaVacinaEntity update(CampanhaVacinaEntity campanhaEntity) throws RuntimeException;

    /**
     * Remove do sistema uma Campanha.
     *
     * @param campanhaEntity O objeto CampanhaVacinaEntity a ser removido.
     */
    public abstract void delete(CampanhaVacinaEntity campanhaEntity) throws RuntimeException;

    /**
     * Busca pelo seu identificador único (ID).
     *
     * @param id O identificador único da Campanha.
     * @return Correspondente ao ID informado, ou null caso não seja encontrado.
     */
    public abstract CampanhaVacinaEntity findById(Long id) throws RuntimeException;

    /**
     * Busca uma lista de Campanhas pelo nome.
     *
     * @param nome O nome (ou parte do nome) da Campanha a ser buscado.
     * @return Uma lista de Campanhas que correspondem ao nome informado.
     */
    public abstract List<CampanhaVacinaEntity> findByNome(String nome) throws RuntimeException;
}

