/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atendimento.service;

import br.com.ifba.atendimento.entity.Atendimento;
import br.com.ifba.atendimento.repository.AtendimentoRepository;
import ch.qos.logback.classic.Logger;
import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author larissa
 */

@Service
public class AtendimentoService implements AtendimentoIService{
    
    @Autowired
    private AtendimentoRepository atendimentoRepository;
    
    private static final Logger log = (Logger) LoggerFactory.getLogger(AtendimentoService.class);

    @Override
    public List<Atendimento> findAll() {
        //Retorna todos os atendimentos encontrados no banco de dados
        return atendimentoRepository.findAll();
    }

    @Override
    public Atendimento save(Atendimento atendimento) throws RuntimeException{
        //Verifica se o objeto atendimento é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(atendimento == null){
            throw new RuntimeException ("Dados do atendimento nao preenchidos");
            
        //Se o atendimento não for nulo, então ele é inserido no banco de dados
        } else {
            log.info("Salvando o Objeto Atendimento!");
            return atendimentoRepository.save(atendimento);
        }
    }

    @Override
    public Atendimento update(Atendimento atendimento) {
       throw new RuntimeException ("O Objeto não pode ser editado.");
    }

    @Override
    public void delete(Atendimento atendimento) {
        throw new RuntimeException ("O Objeto não pode ser deletado.");
    }

    @Override
    public Atendimento findById(Long id) {
        // Verifica se o ID fornecido é nulo, caso seja, lança uma exceção informando que o ID não foi preenchido
        if(id == null){
            throw new RuntimeException ("ID nao preenchido.");
            
        //Retorna o atendimento encontrado pelo ID utilizando o atendimentoRepository ou uma exceção caso o atendimento não seja encontrado
        } else {
            return atendimentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Atendimento nao encontrado."));
        }
    }

    @Override
    public List<Atendimento> findByNomeFuncionario(String nomeFuncionario) {
        //Verifica se o nome fornecido é nulo, caso seja, lança uma exceção informando que o nome não foi preenchido
        if(nomeFuncionario == null || nomeFuncionario.trim().isEmpty()){
            throw new RuntimeException ("Nome não preenchido");
        } else {
            //Retorna uma lista de atendimentos encontrados pelo nome utilizando o atendimentoRepository
            return atendimentoRepository.findByNomeFuncionario(nomeFuncionario);
        }
    }

    @Override
    public List<Atendimento> findByNomeFuncionarioAndDataHoraInicioBetween(
            String nomeFuncionario, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {
        
        //Verifica se o nome fornecido é nulo, caso seja, lança uma exceção informando que o nome não foi preenchido
        if(nomeFuncionario == null || nomeFuncionario.trim().isEmpty()){
            throw new RuntimeException ("Nome não preenchido");
        //Verifica se a data de inicio fornecida é nula, caso seja, lança uma exceção informando que a data não foi preenchida
        } else if(dataHoraInicio == null) {
            throw new RuntimeException ("Data de início não preenchido");
        //Verifica se a data final fornecida é nula, caso seja, lança uma exceção informando que a data não foi preenchida
        } else if(dataHoraInicio == null) {
            throw new RuntimeException ("Data de fim não preenchido");
        //Verifica se a data inicial está após a data final. Caso esteja, lança uma exceção
        } else if(dataHoraInicio.isAfter(dataHoraFim)) {
            throw new RuntimeException ("Data de inicio é após a data de fim");
        } else {
            //Retorna a lista de atendimentos encontrados
            return atendimentoRepository.findByNomeFuncionarioAndDataHoraInicioBetween(
                nomeFuncionario, 
                dataHoraInicio, 
                dataHoraFim);
        }   
    }
    
}
