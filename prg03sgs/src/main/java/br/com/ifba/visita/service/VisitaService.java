/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.visita.service;

import br.com.ifba.infrastructure.util.StringUtil;
import br.com.ifba.visita.entity.Visita;
import br.com.ifba.visita.repository.VisitaRepository;
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
public class VisitaService implements VisitaIService{

    private final VisitaRepository visitaRepository;
    
    @Override
    public void save(Visita visita) throws RuntimeException, IllegalArgumentException {
       if(visita == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }if(StringUtil.isNullOrEmpty(visita.getDescricaoMotivo()) || 
            StringUtil.isNullOrEmpty(visita.getResponsavelVisita())){
            throw new IllegalArgumentException("Campos obrigatórios não podem ficar nulos!");
        }
        
        visitaRepository.save(visita);
    }

    @Override
    public void update(Visita visita) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
       if(visita == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }
        if(visita.getId() == null){
            throw new IllegalArgumentException("O ID do objeto está vazio!");
        }
        if(StringUtil.isNullOrEmpty(visita.getDescricaoMotivo()) || 
            StringUtil.isNullOrEmpty(visita.getResponsavelVisita())){
            throw new IllegalArgumentException("Campos obrigatórios não podem ficar nulos!");
        }
        if(findById(visita.getId()) == null){
            throw new EntityNotFoundException("Objeto Agente não foi encontrado!");
        }
        
        visitaRepository.save(visita);
    }

    @Override
    public void delete(Visita visita) throws RuntimeException, IllegalArgumentException {
    if(visita == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }
        if(findById(visita.getId()) == null){
            throw new EntityNotFoundException("Objeto Agente não foi encontrado!");
        }
        
        visitaRepository.delete(visita);
    }

    @Override
    public Visita findById(Long id) throws RuntimeException {
    if(id == null){
            throw new RuntimeException ("O objeto não foi encontrado!");
        }
        return visitaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Visita> findAll() throws RuntimeException {
        return visitaRepository.findAll();
    }
    
}
