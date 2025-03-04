/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.entity;

import br.com.ifba.anamnese.entity.Anamnese;
import br.com.ifba.atendimento.entity.Atendimento;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.paciente.entity.Paciente;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
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
    @Getter private final LocalDateTime dataCriacao = LocalDateTime.now();
    
    @OneToOne
    @JoinColumn(name = "paciente_id", nullable = false, unique = true)
    @Getter @Setter private Paciente paciente;
    
    @OneToMany(mappedBy = "prontuario", cascade = CascadeType.ALL)
    @Getter @Setter private List<Atendimento> atendimento;
    
   
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_anamnese")
    @Getter @Setter private Anamnese anamnese;
    
}
