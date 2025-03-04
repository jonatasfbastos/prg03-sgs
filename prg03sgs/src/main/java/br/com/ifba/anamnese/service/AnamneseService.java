/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.anamnese.service;

import br.com.ifba.anamnese.entity.Anamnese;
import br.com.ifba.anamnese.repository.AnamneseRepository;
import java.util.List;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author larissa
 */

@Service
public class AnamneseService implements AnamneseIService {
    
    @Autowired
    private AnamneseRepository anamneseRepository;
    
    private static final Logger log = (Logger) LoggerFactory.getLogger(AnamneseService.class);

    @Override
    public List<Anamnese> findAll() {
        //Retorna todos os atendimentos encontrados no banco de dados
        return anamneseRepository.findAll();
    }

    @Override
    public Anamnese save(Anamnese anamnese) throws RuntimeException {
        //Verifica se o objeto anamnese é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(anamnese == null){
            throw new RuntimeException ("Dados da anamnese nao preenchidos");
            
        //Se a anamnese não for nula, então ela é inserido no banco de dados
        } else {
            log.info("Salvando o Objeto Anamnese!");
            return anamneseRepository.save(anamnese);
        }
    }

    @Override
    public Anamnese findById(Long id) {
        // Verifica se o ID fornecido é nulo, caso seja, lança uma exceção informando que o ID não foi preenchido
        if(id == null){
            throw new RuntimeException ("ID nao preenchido.");
            
        //Retorna a anamnese encontrado pelo ID utilizando o anamneseRepository ou uma exceção caso a anamnese não seja encontrada
        } else {
            return anamneseRepository.findById(id).orElseThrow(() -> new RuntimeException("Anamnese nao encontrada."));
        }
    }
    
}
