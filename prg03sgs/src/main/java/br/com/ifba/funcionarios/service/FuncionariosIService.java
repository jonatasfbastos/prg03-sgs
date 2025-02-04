/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcionarios.service;

import br.com.ifba.funcionarios.entity.Funcionarios;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Interface de serviço para gerenciamento de funcionários.
 * Define métodos para operações básicas de CRUD (Create, Read, Update, Delete).
 * 
 * @author Rafael
 */
public interface FuncionariosIService {

    /**
     * Retorna uma lista com todos os funcionários cadastrados.
     * 
     * @return Lista de funcionários.
     * @throws RuntimeException Se ocorrer um erro ao buscar os funcionários.
     */
    public abstract List<Funcionarios> findAll() throws RuntimeException;

    /**
     * Salva um novo funcionário no sistema.
     * 
     * @param funcionarios Objeto do funcionário a ser salvo.
     * @throws RuntimeException Se ocorrer um erro ao salvar.
     * @throws IllegalArgumentException Se os dados do funcionário forem inválidos.
     */
    public abstract void save(Funcionarios funcionarios) throws RuntimeException, IllegalArgumentException;

    /**
     * Atualiza os dados de um funcionário existente.
     * 
     * @param funcionarios Objeto do funcionário com as informações atualizadas.
     * @throws RuntimeException Se ocorrer um erro na atualização.
     * @throws IllegalArgumentException Se os dados fornecidos forem inválidos.
     * @throws EntityNotFoundException Se o funcionário não for encontrado.
     */
    public abstract void update(Funcionarios funcionarios) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;

    /**
     * Exclui um funcionário do sistema.
     * 
     * @param funcionarios Objeto do funcionário a ser excluído.
     * @throws RuntimeException Se ocorrer um erro na exclusão.
     * @throws EntityNotFoundException Se o funcionário não for encontrado.
     */
    public abstract void delete(Funcionarios funcionarios) throws RuntimeException, EntityNotFoundException;

    /**
     * Busca funcionários cujo nome corresponde parcialmente ao valor informado, 
     * ignorando diferenças entre maiúsculas e minúsculas.
     * 
     * @param nome Nome ou parte do nome a ser pesquisado.
     * @return Lista de funcionários que correspondem ao critério de pesquisa.
     * @throws RuntimeException Se ocorrer um erro na busca.
     */
    public abstract List<Funcionarios> findByNomeLikeIgnoreCase(String nome) throws RuntimeException;

    /**
     * Busca funcionários cujo nome contém o valor informado.
     * 
     * @param nome Nome ou parte do nome a ser pesquisado.
     * @return Lista de funcionários que contêm o valor informado no nome.
     * @throws RuntimeException Se ocorrer um erro na busca.
     */
    public abstract List<Funcionarios> findByNomeContaining(String nome) throws RuntimeException;

    /**
     * Busca um funcionário pelo seu ID.
     * 
     * @param id Identificador único do funcionário.
     * @return Funcionário correspondente ao ID informado.
     * @throws RuntimeException Se ocorrer um erro na busca.
     */
    public abstract Funcionarios findById(Long id) throws RuntimeException;
}
