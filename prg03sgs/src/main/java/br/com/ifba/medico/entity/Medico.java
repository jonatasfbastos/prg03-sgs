/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.medico.entity;

import br.com.ifba.funcionarios.entity.Funcionarios;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medicos")
@NoArgsConstructor
public class Medico {
    
    @Column(name = "coren", nullable = false)
    @Getter @Setter private String coren;
    
    @Column(name = "especialidade", nullable = false)
    @Getter @Setter private String especialidade;
    
    @OneToOne
    @JoinColumn(name = "fucnionario_id", nullable = false)
    
    private Funcionarios funcionarios;
}
