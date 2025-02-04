/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcionarios.controller;

import br.com.ifba.funcionarios.entity.Funcionarios;
import java.util.List;

/**
 * Interface que define os métodos para o controlador de funcionários.
 *
 * Esta interface declara as operações básicas de CRUD e métodos de busca 
 * para a entidade Funcionarios.
 *
 * Autor: Rafael
 */
public interface FuncionariosIController {
    
    /**
     * Retorna uma lista contendo todos os funcionários cadastrados.
     * @return Lista de Funcionarios.
     */
    public abstract List<Funcionarios> findAll();
    
    /**
     * Salva um novo funcionário no banco de dados.
     * @param funcionarios Objeto do funcionário a ser salvo.
     */
    public abstract void save(Funcionarios funcionarios);
    
    /**
     * Atualiza as informações de um funcionário existente.
     * @param funcionarios Objeto do funcionário com os dados atualizados.
     */
    public abstract void update(Funcionarios funcionarios);
    
    /**
     * Exclui um funcionário do banco de dados.
     * @param funcionarios Objeto do funcionário a ser excluído.
     */
    public abstract void delete(Funcionarios funcionarios);
    
    /**
     * Busca funcionários cujo nome contenha um determinado valor, ignorando maiúsculas e minúsculas.
     * @param nome Parte do nome do funcionário a ser pesquisado.
     * @return Lista de funcionários que correspondem ao critério.
     */
    public abstract List<Funcionarios> findByNomeLikeIgnoreCase(String nome);
    
    /**
     * Busca funcionários cujo nome contenha um determinado valor.
     * @param nome Parte do nome do funcionário a ser pesquisado.
     * @return Lista de funcionários que correspondem ao critério.
     */
    public abstract List<Funcionarios> findByNomeContaining(String nome);
    
    /**
     * Busca um funcionário pelo seu identificador único (ID).
     * @param id Identificador único do funcionário.
     * @return Objeto do funcionário correspondente ao ID informado.
     * @throws RuntimeException Caso o funcionário não seja encontrado.
     */
    public abstract Funcionarios findById(Long id) throws RuntimeException;
}
