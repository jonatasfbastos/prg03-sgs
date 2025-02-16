/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fichavisita.service;

import br.com.ifba.fichavisita.entity.FichaVisita;
import br.com.ifba.fichavisita.repository.FichaVisitaRepository;
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
public class FichaVisitaService implements FichaVisitaIService{

    private final FichaVisitaRepository fichaRepository;
    
    @Override
    public void save(FichaVisita ficha) throws RuntimeException, IllegalArgumentException {
        if(ficha == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }if(StringUtil.isNullOrEmpty(ficha.getNome()) || 
            StringUtil.isNullOrEmpty(ficha.getDesfecho())){
            throw new IllegalArgumentException("Campos obrigatórios não podem ficar nulos!");
        }
        
        fichaRepository.save(ficha);
    }

    @Override
    public void update(FichaVisita ficha) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        if(ficha == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }
        if(ficha.getId() == null){
            throw new IllegalArgumentException("O ID do objeto está vazio!");
        }
        if(StringUtil.isNullOrEmpty(ficha.getNome()) || 
            StringUtil.isNullOrEmpty(ficha.getDesfecho())){
            throw new IllegalArgumentException("Campos obrigatórios não podem ficar nulos!");
        }
        if(findById(ficha.getId()) == null){
            throw new EntityNotFoundException("Objeto Agente não foi encontrado!");
        }
        
        fichaRepository.save(ficha);
    }

    @Override
    public void delete(FichaVisita ficha) throws RuntimeException, IllegalArgumentException {
        if(ficha == null){
            throw new RuntimeException ("Os dados não foram preenchidos!");
        }
        if(findById(ficha.getId()) == null){
            throw new EntityNotFoundException("Objeto Agente não foi encontrado!");
        }
        
        fichaRepository.delete(ficha);
    }

    @Override
    public FichaVisita findById(Long id) throws RuntimeException {
        if(id == null){
            throw new RuntimeException ("O objeto não foi encontrado!");
        }
        return fichaRepository.findById(id).orElse(null);
    }

    @Override
    public List<FichaVisita> findAll() throws RuntimeException {
        return fichaRepository.findAll();
    }
    
}
