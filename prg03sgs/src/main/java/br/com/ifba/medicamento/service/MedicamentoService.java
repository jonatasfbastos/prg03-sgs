/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.medicamento.service;

import br.com.ifba.infrastructure.util.StringUtil;
import br.com.ifba.medicamento.entity.Medicamento;
import br.com.ifba.medicamento.repository.MedicamentoRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Implementação do serviço de gerenciamento de medicamentos.
 * 
 * Esta classe oferece os métodos necessários para realizar operações de CRUD (criação, leitura, atualização e exclusão).
 * As operações incluem a validação de campos essenciais antes de interagir com o banco de dados.
 *
 * @author rober
 */
@Service
@RequiredArgsConstructor
public class MedicamentoService implements MedicamentoIService{

    private final MedicamentoRepository medicamentoRepository;
    
    @Override
    public List<Medicamento> findAll() throws RuntimeException {
        return medicamentoRepository.findAll();
    }

    @Override
    public void save(Medicamento medicamento) throws RuntimeException, IllegalArgumentException{
        if (medicamento == null) {
            throw new RuntimeException ("Dados nao preenchidos!");
        }
        
        if (StringUtil.isNullOrEmpty(medicamento.getNome()) || 
            StringUtil.isNullOrEmpty(medicamento.getCategoria()) || 
            StringUtil.isNullOrEmpty(medicamento.getRegistroAnvisa())) 
        {
            throw new IllegalArgumentException("Campos essenciais estao vazios");
        }
        
        medicamento.setNome(StringUtil.trimExtraSpaces(medicamento.getNome()));
        medicamento.setRegistroAnvisa(StringUtil.trimExtraSpaces(medicamento.getRegistroAnvisa()));
        
        medicamentoRepository.save(medicamento);
    }

    @Override
    public void update(Medicamento medicamento) throws RuntimeException, IllegalArgumentException, EntityNotFoundException{
        
        if (medicamento == null) {
            throw new RuntimeException ("Dados nao preenchidos!");
        }
        
        if (medicamento.getId() == null) {
            throw new IllegalArgumentException("O ID está vazio");
        }
        
        if (StringUtil.isNullOrEmpty(medicamento.getNome()) || 
            StringUtil.isNullOrEmpty(medicamento.getCategoria()) || 
            StringUtil.isNullOrEmpty(medicamento.getRegistroAnvisa())) 
        {
            throw new IllegalArgumentException("Campos essenciais estão vazios");
        }
        
        if (findById(medicamento.getId()) == null) {
            throw new EntityNotFoundException("Medicamento não encontrado com o ID: " + medicamento.getId());
        }
        
        medicamento.setNome(StringUtil.trimExtraSpaces(medicamento.getNome()));
        medicamento.setRegistroAnvisa(StringUtil.trimExtraSpaces(medicamento.getRegistroAnvisa()));
        
        medicamentoRepository.save(medicamento);
    }

    @Override
    public void delete(Medicamento medicamento) throws RuntimeException, EntityNotFoundException{
        if (medicamento == null) {
           throw new RuntimeException ("Dados nao preenchidos!");
        }
        
        if (findById(medicamento.getId()) == null) {
            throw new EntityNotFoundException("Medicamento não encontrado com o ID: " + medicamento.getId());
        }
        
        medicamentoRepository.delete(medicamento);
    }

    @Override
    public List<Medicamento> findByNomeLikeIgnoreCase(String nome) throws RuntimeException{
       return medicamentoRepository.findByNomeLikeIgnoreCase(nome);
    }

    @Override
    public Medicamento findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException ("Medicamento nao encontrado no banco de dados!");
        }
        return medicamentoRepository.findById(id).orElse(null);
    }
}