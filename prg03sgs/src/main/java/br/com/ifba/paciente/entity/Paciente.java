/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
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
@Table (name = "pacientes")
@NoArgsConstructor
public class Paciente extends PersistenceEntity implements Serializable {
    @Column (name = "nome", nullable = false)
    @Getter @Setter private String nome;
    
    @Column (name = "cpf", nullable = false)
    @Getter @Setter private String cpf;
    
    @Column (name = "data_nascimento", nullable = false)
    @Getter @Setter private LocalDate dataNascimento;
    
    @Column (name = "sexo", nullable = false)
    @Getter @Setter private String sexo;
    
    @Column (name = "estado_civil")
    @Getter @Setter private String estadoCivil;
    
    @Column (name = "endereço")
    @Getter @Setter private String endereço;
    
    @Column (name = "contato")
    @Getter @Setter private String contato;
    
    @Column (name = "nome_Responsavel")
    @Getter @Setter private String nomeResponsavel;
    
    @Column (name = "contatoResponsavel")
    @Getter @Setter private String contatoResponsavel;
    
    
}
