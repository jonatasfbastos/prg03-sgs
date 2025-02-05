/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atendimento.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author larissa
 */

@Entity
@Table(name = "atendimentos")
@Getter @Setter
public class Atendimento extends PersistenceEntity implements Serializable {
    
    @Column(name = "nome_paciente", nullable = false)
    private String nomePaciente;

    @Column(name = "id_paciente", nullable = false)
    private Long idPaciente;
    
    @Column(name = "nome_funcionario", nullable = false)
    private String nomeFuncionario;
    
    @Column(name = "id_funcionario", nullable = false)
    private Long idFuncionario;
    
    @Column(name = "data_hora_inicio")
    private LocalDateTime dataHoraInicio;
    
    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;
    
    @Column(name = "tipo_atendimento")
    private String tipoAtendimento;

}
