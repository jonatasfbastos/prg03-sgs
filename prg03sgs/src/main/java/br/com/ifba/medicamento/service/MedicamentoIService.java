/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.medicamento.service;

import br.com.ifba.medicamento.entity.Medicamento;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Interface de serviço para operações relacionadas à entidade Medicamento.
 *
 * Esta interface define os métodos para manipulação e consulta. 
 * incluindo operações de criação, atualização, exclusão e busca.
 * Implementações dessa interface devem lidar com as regras de negócio e 
 * validações relacionadas à entidade Medicamento, garantindo a integridade dos dados.
 *
 * @author rober
 */
public interface MedicamentoIService{
    /**
     * Recupera todos os medicamentos disponíveis no sistema.
     * 
     * @return uma lista contendo todos os medicamentos.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract List<Medicamento> findAll() throws RuntimeException;
    
    /**
     * Salva um novo medicamento no sistema.
     * 
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     * @throws IllegalArgumentException se campos essenciais estiverem vazios
     */
    public abstract void save(Medicamento medicamento) throws RuntimeException, IllegalArgumentException;
    
    /**
     * Atualiza as informações de um medicamento no sistema.
     * @throws IllegalArgumentException se campos essenciais estiverem vazios
     * @throws EntityNotFoundException entidade nao encontrada no banco de dados. 
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract void update (Medicamento medicamento) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;
    
    /**
     * Remove um medicamento no sistema.
     * 
     * @throws EntityNotFoundException entidade nao encontrada no banco de dados. 
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract void delete (Medicamento medicamento) throws RuntimeException, EntityNotFoundException;
    
    /**
     * Busca medicamentos com base no nome fornecido e ignora o case
     * 
     * @param nome o nome do medicamento a ser buscado.
     * @return uma lista de medicamentos correspondentes ao nome fornecido.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract List<Medicamento> findByNomeLikeIgnoreCase(String nome) throws RuntimeException;
    
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
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract Medicamento findById(Long id) throws RuntimeException;
}