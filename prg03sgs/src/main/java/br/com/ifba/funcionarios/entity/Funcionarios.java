/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.funcionarios.entity;

import br.com.ifba.campanhavacina.entity.CampanhaVacinaEntity;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Classe que representa a entidade Funcionários.
 *
 * Esta classe mapeia a tabela "Funcionarios" no banco de dados e contém
 * atributos essenciais para armazenar informações sobre os funcionários.
 *
 * Autor: Rafael
 */
@Entity
@Table(name = "Funcionarios")
@NoArgsConstructor
public class Funcionarios extends PersistenceEntity implements Serializable {
    
    /** Nome do funcionário. Campo obrigatório. */
    @Column(name = "nome", nullable = false)
    @Getter @Setter private String nome;
    
    /** CPF do funcionário. Campo obrigatório. */
    @Column(name = "cpf", nullable = false)
    @Getter @Setter private String cpf;
    
    /** Data de nascimento do funcionário. Campo obrigatório. */
    @Column(name = "data_nascimento")
    @Getter @Setter private String dataNascimento;
    
    /** Endereço do funcionário. Campo obrigatório. */
    @Column(name = "endereço")
    @Getter @Setter private String endereco;
    
    /** Telefone do funcionário. Campo opcional. */
    @Column(name = "telefone")
    @Getter @Setter private String telefone;
    
    /** E-mail do funcionário. Campo opcional. */
    @Column(name = "email")
    @Getter @Setter private String email;
    
    /** Cargo ocupado pelo funcionário. Campo opcional. */
    @Column(name = "cargo")
    @Getter @Setter private String cargo;
    
    /** Salário do funcionário. Campo opcional. */
    @Column(name = "salario")
    @Getter @Setter private String salario;
    
    // "Funcionarios" == "Profissional da Saúde"
    // Muitos 'Funcionarios' para uma 'Campanha De Vacinação'
    @ManyToOne
    @Getter @Setter private CampanhaVacinaEntity campanhaDeVacina;
    
}
