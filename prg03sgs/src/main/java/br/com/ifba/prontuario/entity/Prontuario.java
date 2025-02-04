/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.entity;

import br.com.ifba.anamnese.entity.Anamnese;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.paciente.entity.Paciente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Glauber
 */

@Entity
@Table (name = "prontuario")
@NoArgsConstructor
public class Prontuario extends PersistenceEntity implements Serializable{
    @Column (name = "data_criacao")
    @Getter private LocalDate dataCriacao = LocalDate.now();
    
    @Getter @Setter private Paciente paciente;
    
    @Getter @Setter private Anamnese anamneses; 
}
