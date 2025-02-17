/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.requisicoes.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.medico.entity.Medico;
import br.com.ifba.paciente.entity.Paciente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author aurian
 */

@Entity
@Table (name = "requisicoes")
@NoArgsConstructor


public class Requisicoes extends PersistenceEntity implements Serializable{
    @OneToOne
    @JoinColumn(name = "paciente_id", nullable = false, unique = true)
    @Getter @Setter private Paciente paciente;
    
    @OneToOne
    @JoinColumn(name = "medico_id", nullable = false, unique = true)
    @Getter @Setter private Medico medico;   
    
    @Column(name = "data_hora")
    @Getter private LocalDateTime dataHora;

    @Column(name = "tipo_exame")
    @Getter @Setter private String tipoExame;
    
    @Column(name = "observações")
    @Getter @Setter private String observacoes;
    
}
