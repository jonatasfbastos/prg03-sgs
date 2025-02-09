/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author rober
 */
@Entity
@Table (name = "fornecedores")
@NoArgsConstructor
public class Fornecedor extends PersistenceEntity implements Serializable{
    @Column (name = "cnpj", nullable = false, unique = true)
    @Getter @Setter private String cnpj;
    
    @Column (name = "razaoSocial")
    @Getter @Setter private String razaoSocial;
    
    @Column (name = "telefone")
    @Getter @Setter private String telefone;
    
    @Column (name = "email")
    @Getter @Setter private String email;
    
    //Relacao com a entidade Endereco. 0..1 -> 1
    
    //Relacao com a entidade Medicamento 1..* -> 1 .. *
}