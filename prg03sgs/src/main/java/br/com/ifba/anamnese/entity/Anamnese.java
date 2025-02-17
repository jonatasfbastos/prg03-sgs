/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.anamnese.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.prontuario.entity.Prontuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * classe de anamnese que terá relação com prontuario
 * @author Glauber
 */

@Entity
@Table (name = "anamnese")
@NoArgsConstructor
public class Anamnese extends PersistenceEntity implements Serializable{
    @Column (name = "queixas")
    @Getter @Setter private String queixas;
    
    
    @Column (name = "condicoes")
    @Getter @Setter private String condicoes;
}
