/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.agentevisita.service;

import br.com.ifba.agentevisita.entity.AgenteVisita;
import br.com.ifba.agentevisita.repository.AgenteVisitaRepository;
import br.com.ifba.infrastructure.util.StringUtil;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author sunhe
 */

@Service
@RequiredArgsConstructor
public class AgenteVisitaService implements AgenteVisitaIService{

    private final AgenteVisitaRepository agenteVRepository;
    
    @Override
    public void save(AgenteVisita agenteVisita) throws RuntimeException, IllegalArgumentException{
        if(agenteVisita == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }if(StringUtil.isNullOrEmpty(agenteVisita.getNome()) || 
            StringUtil.isNullOrEmpty(agenteVisita.getCbo()) || 
            StringUtil.isNullOrEmpty(agenteVisita.getCpfProfissional())){
            throw new IllegalArgumentException("Campos obrigatórios não podem ficar nulos!");
        }
        
        agenteVRepository.save(agenteVisita);
        
    }

    @Override
    public void update(AgenteVisita agenteVisita) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        if(agenteVisita == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }
        if(agenteVisita.getId() == null){
            throw new IllegalArgumentException("O ID do objeto está vazio!");
        }
        if(StringUtil.isNullOrEmpty(agenteVisita.getNome()) || 
            StringUtil.isNullOrEmpty(agenteVisita.getCbo()) || 
            StringUtil.isNullOrEmpty(agenteVisita.getCpfProfissional())){
            throw new IllegalArgumentException("Campos obrigatórios não podem ficar nulos!");
        }
        if(findById(agenteVisita.getId()) == null){
            throw new EntityNotFoundException("Objeto Agente não foi encontrado!");
        }
        
        agenteVRepository.save(agenteVisita);
        
    }

    @Override
    public void delete(AgenteVisita agenteVisita) throws RuntimeException, IllegalArgumentException{
        if(agenteVisita == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }
        if(findById(agenteVisita.getId()) == null){
            throw new EntityNotFoundException("Objeto Agente não foi encontrado!");
        }
        
        agenteVRepository.delete(agenteVisita);
    
    }

    @Override
    public AgenteVisita findById(Long id) throws RuntimeException {
        if(id == null){
            throw new RuntimeException ("O objeto não foi encontrado!");
        }
        return agenteVRepository.findById(id).orElse(null);
    }

    @Override
    public List<AgenteVisita> findByNome(String nome){
       return agenteVRepository.findByNome(nome);
    }

    @Override
    public List<AgenteVisita> findAll() throws RuntimeException {
        return agenteVRepository.findAll();
    }
    
}
