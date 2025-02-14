/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.requisicoes.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    @Column(name = "nome_paciente", nullable = false)
    @Getter @Setter private String nomePaciente;

    @Column(name = "id_paciente", nullable = false)
    @Getter @Setter private Long idPaciente;
    
    @Column(name = "nome_funcionario", nullable = false)
    @Getter @Setter private String nomeFuncionario;
    
    @Column(name = "id_funcionario", nullable = false)
    @Getter @Setter private Long idFuncionario;
    
    @Column(name = "data_hora")
    @Getter private LocalDateTime dataHora;

    @Column(name = "tipo_exame")
    @Getter @Setter private String tipoExame;
    
    @Column(name = "observações")
    @Getter @Setter private String observacoes;
}
