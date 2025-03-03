/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.medico.entity;

import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.requisicoes.entity.Requisicoes;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medicos")
@NoArgsConstructor
public class Medico extends PersistenceEntity implements Serializable{
    
    @Column(name = "coren", nullable = false)
    @Getter @Setter private String coren;
    
    @Column(name = "especialidade", nullable = false)
    @Getter @Setter private String especialidade;
    
    @OneToOne
    @JoinColumn(name = "medico_id", nullable = false)    
    private Funcionarios funcionario;
    
    @OneToOne(mappedBy = "medico", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Getter @Setter private Requisicoes requisicoes;
}
