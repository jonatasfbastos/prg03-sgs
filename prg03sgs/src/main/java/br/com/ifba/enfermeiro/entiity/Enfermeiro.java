/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.enfermeiro.entiity;

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
@Table(name = "enfermeiros")
@NoArgsConstructor
public class Enfermeiro {
    
    @Column(name = "coren", nullable = false)
    @Getter @Setter private String coren;
    
    @OneToOne
    @JoinColumn(name = "fucnionario_id", nullable = false)
    
    private Funcionarios funcionarios;
}
