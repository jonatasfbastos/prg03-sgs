/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.prontuario.entity.Prontuario;
import br.com.ifba.requisicoes.entity.Requisicoes;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
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
    
    @Column (name = "cpf", nullable = false, unique = true, length = 11)
    @Getter @Setter private String cpf;
    
    @Column (name = "data_nascimento", nullable = false)
    @Getter @Setter private LocalDate dataNascimento;
    
    @Column (name = "sexo", nullable = false)
    @Getter @Setter private String sexo;
    
    @Column (name = "estado_civil")
    @Getter @Setter private String estadoCivil;
    
    @Column (name = "endereco")
    @Getter @Setter private String endereco;
    
    @Column (name = "contato")
    @Getter @Setter private String contato;
    
    @Column (name = "nome_responsavel")
    @Getter @Setter private String nomeResponsavel;
    
    @Column (name = "contato_responsavel")
    @Getter @Setter private String contatoResponsavel;
    
    @OneToOne(mappedBy = "paciente")
    @Getter @Setter private Prontuario prontuario;
    
    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Getter @Setter private Requisicoes requisicoes;
    
}
