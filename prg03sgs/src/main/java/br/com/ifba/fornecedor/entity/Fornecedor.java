/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.entity;

import br.com.ifba.endereco.entity.Endereco;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.medicamento.entity.Medicamento;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "endereco_id", referencedColumnName = "id")
    @Getter @Setter private Endereco endereco;
    
    //Relacao com a entidade Medicamento 1..* -> 1 .. *
    @ManyToMany (mappedBy = "fornecedores", fetch = FetchType.LAZY,
            cascade = CascadeType.MERGE)
    @Getter @Setter private List<Medicamento> medicamentos = new ArrayList<>();
}