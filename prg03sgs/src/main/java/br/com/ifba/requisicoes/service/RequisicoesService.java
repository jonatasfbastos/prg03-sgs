/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.requisicoes.service;

import br.com.ifba.requisicoes.entity.Requisicoes;
import br.com.ifba.requisicoes.repository.RequisicoesRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aurian
 */

@Service
public class RequisicoesService implements RequisicoesIService{
     
    @Autowired
    private RequisicoesRepository requisicoesRepository;
    
    private static final Logger log = (Logger) LoggerFactory.getLogger(RequisicoesService.class);
    
    @Override
    public List<Requisicoes> findAll() {
        //Retorna todos as requisicoes encontrados no banco de dados
        return requisicoesRepository.findAll();
    }
    
    @Override
    public Requisicoes save(Requisicoes requisicoes) throws RuntimeException{
        //Verifica se o objeto atendimento é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(requisicoes == null){
            throw new RuntimeException ("Dados da requisição nao preenchidos");
            
        //Se a requisição não for nulo, então ele é inserido no banco de dados
        } else {
            log.info("Salvando o Objeto Requisição!");
            return requisicoesRepository.save(requisicoes);
        }
    }
    
    @Override
    public Requisicoes update(Requisicoes requisicoes) {
       throw new RuntimeException ("O Objeto não pode ser editado.");
    }
    
    @Override
    public void delete(Requisicoes requisicoes) {
        throw new RuntimeException ("O Objeto não pode ser deletado.");
    }
    
    @Override
    public Requisicoes findById(Long id) {
        // Verifica se o ID fornecido é nulo, caso seja, lança uma exceção informando que o ID não foi preenchido
        if(id == null){
            throw new RuntimeException ("ID nao preenchido.");
            
        //Retorna o atendimento encontrado pelo ID utilizando o requisicoesRepository ou uma exceção caso o requisição não seja encontrado
        } else {
            return requisicoesRepository.findById(id).orElseThrow(() -> new RuntimeException("Requisição nao encontrado."));
        }
    }
    
    @Override
    public List<Requisicoes> findByNomePaciente(String nomePaciente) {
        //Verifica se o nome fornecido é nulo, caso seja, lança uma exceção informando que o nome não foi preenchido
        if(nomePaciente == null || nomePaciente.trim().isEmpty()){
            throw new RuntimeException ("Nome não preenchido");
        } else {
            //Retorna uma lista de atendimentos encontrados pelo nome utilizando o atendimentoRepository
            return requisicoesRepository.findByNomePaciente(nomePaciente);
        }
    }
}
