/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atendimento.entity;

import br.com.ifba.anamnese.entity.Anamnese;
import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.paciente.entity.Paciente;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

    @Column(name = "data_hora_inicio")
    private LocalDateTime dataHoraInicio;
    
    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;
    
    @Column(name = "tipo_atendimento")
    private String tipoAtendimento;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_funcionario")
    private Funcionarios funcionario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_anamnese")
    private Anamnese anamnese;
    
}
