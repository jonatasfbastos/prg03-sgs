/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fornecedor.service;

import br.com.ifba.fornecedor.entity.Fornecedor;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Interface de controle para operações relacionadas à entidade Fornecedor. 
 * 
 * Esta interface define os métodos para manipulação e consulta de fornecedores, 
 * incluindo operações de criação, atualização, exclusão e busca por critérios 
 * específicos. 
 * 
 * @author rober
 */
public interface FornecedorIService {
     /**
     * Recupera todos os fornecedores disponíveis no sistema.
     *
     * @return uma lista contendo todos os fornecedores.
     */
    public abstract List<Fornecedor> findAll();
    
     /**
     * Salva um novo fornecedor no sistema.
     *
     * @param fornecedor o medicamento a ser salvo.
     */
    public abstract void save(Fornecedor fornecedor) throws RuntimeException, IllegalArgumentException;
    
    /**
     * Atualiza as informações de um fornecedor existente.
     *
     * @param fornecedor o fornecedor com as informações atualizadas.
     */
    public abstract void update (Fornecedor fornecedor) throws RuntimeException, IllegalArgumentException;
    
    /**
     * Remove um fornecedor do sistema.
     *
     * @param fornecedor o fornecedor a ser removido.
     */
    public abstract void delete (Fornecedor fornecedor) throws RuntimeException, EntityNotFoundException;
    
    /**
     * Recupera todos os fornecedores disponíveis no sistema com o cnpj igual ao informado
     *
     * @return uma lista contendo os fornecedores.
     */
    public abstract List<Fornecedor> findByCnpjLikeIgnoreCase(String cnpj);
    
    /**
     * Recupera todos os fornecedores disponíveis no sistema que possuam
     * como parte da razaoSocial o @param nome.
     *
     * @return uma lista contendo os fornecedores.
     */
    public abstract List<Fornecedor> findByRazaoSocialContainingIgnoreCase(String nome);

    /**
     * Busca um fornecedor pelo seu identificador único.
     * 
     * @param id o identificador único do fornecedor.
     * @return o fornecedor correspondente ao ID fornecido, ou {@code null} se não encontrado.
     */
    public abstract Fornecedor findById (Long id) throws RuntimeException;
    
    /**
     * Busca um fornecedor pelo seu cnpj que é unico.
     * 
     * @param cnpj o cnpj do fornecedor.
     * @return o fornecedor correspondente ao CNPJ fornecido, ou {@code null} se não encontrado.
     */
    public Fornecedor findByCnpj(String cnpj);
}
