/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.service;

import br.com.ifba.fornecedor.entity.Fornecedor;
import br.com.ifba.fornecedor.repository.FornecedorRepository;
import br.com.ifba.infrastructure.util.StringUtil;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Implementação do serviço de gerenciamento de fornecedores.
 * 
 * Esta classe oferece os métodos necessários para realizar operações de CRUD (criação, leitura, atualização e exclusão).
 * As operações incluem a validação de campos essenciais antes de interagir com o banco de dados.
 *
 * @author rober
 */
@Service
@RequiredArgsConstructor
public class FornecedorService implements FornecedorIService{
    
    private final FornecedorRepository fornecedorRepository;
    
    @Override
    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    @Override
    public void save(Fornecedor fornecedor) throws RuntimeException, IllegalArgumentException {
        
        if (fornecedor == null) {
            throw new RuntimeException ("Dados nao preenchidos!");
        }
        
        if (StringUtil.isNullOrEmpty(fornecedor.getCnpj()) ||
            StringUtil.isNullOrEmpty(fornecedor.getRazaoSocial())) 
        {
            throw new IllegalArgumentException("Campos essenciais estao vazios");
        }
        
        fornecedor.setCnpj(StringUtil.trimExtraSpaces(fornecedor.getCnpj()));
        fornecedor.setRazaoSocial(StringUtil.trimExtraSpaces(fornecedor.getRazaoSocial()));
         
        fornecedorRepository.save(fornecedor);
    }

    @Override
    public void update(Fornecedor fornecedor) throws RuntimeException, IllegalArgumentException {
        if (fornecedor == null) {
            throw new RuntimeException ("Dados nao preenchidos!");
        }
        
        if (StringUtil.isNullOrEmpty(fornecedor.getCnpj()) ||
            StringUtil.isNullOrEmpty(fornecedor.getRazaoSocial())) 
        {
            throw new IllegalArgumentException("Campos essenciais estao vazios");
        }
        
        fornecedor.setCnpj(StringUtil.trimExtraSpaces(fornecedor.getCnpj()));
        fornecedor.setRazaoSocial(StringUtil.trimExtraSpaces(fornecedor.getRazaoSocial()));
        
        fornecedorRepository.save(fornecedor);
    }

    @Override
    public void delete(Fornecedor fornecedor) throws RuntimeException, EntityNotFoundException{
        
        if (fornecedor == null) {
            throw new RuntimeException ("Dados nao preenchidos!");
        }
        
        if (findById(fornecedor.getId()) == null) {
            throw new EntityNotFoundException("Fornecedor não encontrado com o ID: " + fornecedor.getId());            
        }
        
        fornecedorRepository.delete(fornecedor);
    }

    @Override
    public List<Fornecedor> findByCnpjLikeIgnoreCase(String cnpj) {
        return fornecedorRepository.findByCnpjLikeIgnoreCase(cnpj);
    }

    @Override
    public List<Fornecedor> findByRazaoSocialContainingIgnoreCase(String nome) {
        return fornecedorRepository.findByRazaoSocialContainingIgnoreCase(nome);
    }    

    @Override
    public Fornecedor findById(Long id) throws RuntimeException{
        if (id == null) {
            throw new RuntimeException ("Fornecedor nao encontrado no banco de dados!");
        }
        return fornecedorRepository.findById(id).orElse(null);
    }

    @Override
    public Fornecedor findByCnpj(String cnpj) {
        if (StringUtil.isNullOrEmpty(cnpj)) {
            throw new RuntimeException ("Fornecedor Invalido!");
        }
        try {
            return fornecedorRepository.findByCnpj(cnpj);
        } catch(Exception e) {
            throw new RuntimeException ("Fornecedor nãp encontrado!");
        } 
    }
}