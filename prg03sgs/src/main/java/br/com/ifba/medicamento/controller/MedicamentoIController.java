/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.medicamento.controller;

import br.com.ifba.medicamento.entity.Medicamento;
import java.util.List;

/** 
 * Interface de controle para operações relacionadas à entidade Medicamento. 
 * 
 * Esta interface define os métodos para manipulação e consulta de medicamentos, 
 * incluindo operações de criação, atualização, exclusão e busca por critérios 
 * específicos. 
 */
public interface MedicamentoIController {
    /**
     * Recupera todos os medicamentos disponíveis no sistema.
     *
     * @return uma lista contendo todos os medicamentos.
     */
    public abstract List<Medicamento> findAll();
    
     /**
     * Salva um novo medicamento no sistema.
     *
     * @param medicamento o medicamento a ser salvo.
     */
    public abstract void save(Medicamento medicamento);
    
    /**
     * Atualiza as informações de um medicamento existente.
     *
     * @param medicamento o medicamento com as informações atualizadas.
     */
    public abstract void update (Medicamento medicamento);
    
    /**
     * Remove um medicamento do sistema.
     *
     * @param medicamento o medicamento a ser removido.
     */
    public abstract void delete (Medicamento medicamento);
    
    /**
     * Busca medicamentos com base no nome fornecido.
     *
     * @param nome o nome (ou parte do nome) dos medicamentos a serem buscados.
     * @return uma lista de medicamentos correspondentes ao nome fornecido.
     */
    public abstract List<Medicamento> findByNomeLikeIgnoreCase(String nome);
    
    /**
     * Busca medicamentos com base no nome fornecido e ignora o case
     * 
     * @param nome o nome (ou parte do nome) dos medicamentos a serem buscados.
     * @return uma lista de medicamentos correspondentes ao nome fornecido.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
     public abstract List<Medicamento> findByNomeContainingIgnoreCase(String nome) throws RuntimeException;
    
    /**
     * Busca um medicamento pelo seu identificador único.
     * 
     * @param id o identificador único do medicamento.
     * @return o medicamento correspondente ao ID fornecido, ou {@code null} se não encontrado.
     */
    public abstract Medicamento findById(Long id) throws RuntimeException;
}
