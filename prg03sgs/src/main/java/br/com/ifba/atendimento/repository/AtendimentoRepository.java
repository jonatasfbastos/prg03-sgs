/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atendimento.repository;

import br.com.ifba.atendimento.entity.Atendimento;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author larissa
 */

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long>{

    // Buscar atendimentos pelo nome do funcionário
    List<Atendimento> findByNomeFuncionario(String nomeFuncionario);
    
    // Método para buscar atendimentos entre dataHoraInicio e dataHoraFim para um funcionário específico
    List<Atendimento> findByNomeFuncionarioAndDataHoraInicioBetween(
        String nomeFuncionario, 
        LocalDateTime dataHoraInicio, 
        LocalDateTime dataHoraFim
    );

}
