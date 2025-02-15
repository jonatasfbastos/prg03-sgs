/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fornecedor.repository;

import br.com.ifba.fornecedor.entity.Fornecedor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface do repositório para a entidade Fornecedor.
 * 
 * @author rober
 */
@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
    // Utiliza o operador "LIKE" para busca com padrão e ignora o tipo de case
    List<Fornecedor> findByCnpjLikeIgnoreCase(String cnpj);
    
    // Busca por parte do nome, ignorando o case
    List<Fornecedor> findByRazaoSocialContainingIgnoreCase(String nome);
    
    //Busca pelo CNPJ
    public Fornecedor findByCnpj(String cnpj);
}