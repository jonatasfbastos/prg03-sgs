/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.endereco.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represente a entidade "Endereco" mapeada para a tabela "enderecos" no banco de dados
 * Utiliza as anotações da JPA para facilitar o mapeamento objeto-relacional
 * @author rober
 */

@Entity
@Table (name = "enderecos")
@NoArgsConstructor
public class Endereco extends PersistenceEntity implements Serializable{
    @Column (name = "cep")
    @Getter @Setter private String cep;
    
    @Column (name = "estado")
    @Getter @Setter private String estado;
    
    @Column (name = "cidade")
    @Getter @Setter private String cidade;
    
    @Column (name = "bairro")
    @Getter @Setter private String bairro;
    
    @Column (name = "logradouro")
    @Getter @Setter private String logradouro;
    
    @Column (name = "numero")
    @Getter @Setter private int numero;
}