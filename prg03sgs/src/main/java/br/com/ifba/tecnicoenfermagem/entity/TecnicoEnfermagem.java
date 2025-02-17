/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tecnicoenfermagem.entity;

import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tecnico_enfermagem")
@NoArgsConstructor
public class TecnicoEnfermagem extends PersistenceEntity implements Serializable{
    
    @Column(name = "Registro", nullable = false)
    @Getter @Setter private String coren;
    
    @OneToOne
    @JoinColumn(name = "fucnionario_id", nullable = false)
    private Funcionarios funcionarios;
}
