/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.controller;

import br.com.ifba.fornecedor.entity.Fornecedor;
import br.com.ifba.fornecedor.service.FornecedorIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Controlador responsável pelo gerenciamento de fornecedores.
 *
 * Esta classe oferece os métodos necessários para realizar operações de CRUD 
 * (criação, leitura, atualização e exclusão) sobre a entidade {@link Fornecedor}.
 * 
 * @author rober
 */
@Controller
@RequiredArgsConstructor
public class FornecedorController implements FornecedorIController{

    private final FornecedorIService fornecedorIService;
    
    @Override
    public List<Fornecedor> findAll() {
        return fornecedorIService.findAll();
    }

    @Override
    public void save(Fornecedor fornecedor) {
        fornecedorIService.save(fornecedor);
    }

    @Override
    public void update(Fornecedor fornecedor) {
        fornecedorIService.update(fornecedor);
    }

    @Override
    public void delete(Fornecedor fornecedor) {
        fornecedorIService.delete(fornecedor);
    }

    @Override
    public List<Fornecedor> findByCnpjLikeIgnoreCase(String cnpj) {
        return fornecedorIService.findByCnpjLikeIgnoreCase(cnpj);
    }

    @Override
    public List<Fornecedor> findByRazaoSocialContainingIgnoreCase(String nome) {
        return fornecedorIService.findByRazaoSocialContainingIgnoreCase(nome);
    }

    @Override
    public Fornecedor findById(Long id) {
        return fornecedorIService.findById(id);
    }

    @Override
    public Fornecedor findByCnpj(String cnpj) {
        return fornecedorIService.findByCnpj(cnpj);
    }
}