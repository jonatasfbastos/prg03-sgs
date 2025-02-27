/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.medicamento.entity;

import br.com.ifba.fornecedor.entity.Fornecedor;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represente a entidade "Medicamento" mapeada para a tabela "medicamentos" no banco de dados
 * Utiliza as anotações da JPA para facilitar o mapeamento objeto-relacional
 * 
 * @author rober
 */
@Entity
@Table (name = "medicamentos")
@NoArgsConstructor
public class Medicamento extends PersistenceEntity implements Serializable{
    
    @Column (name = "nome", nullable = false)
    @Getter @Setter private String nome;
    
    @Column (name = "categoria", nullable = false)
    @Getter @Setter private String categoria;
    
    @Column (name = "quantidade")
    @Getter @Setter private long quantidade;
    
    @Column (name = "data_fabricacao", nullable = false)
    @Getter @Setter private LocalDate dataFabricacao;
    
    @Column (name = "data_validade", nullable = false)
    @Getter @Setter private LocalDate dataValidade;
    
    @Column (name = "lote")
    @Getter @Setter private String lote;
    
    @Column (name = "instrucao_armazenamento")
    @Getter @Setter private String instrucaoArmazenamento;
    
    @Column (name = "registro_anvisa", nullable = false, unique = true)
    @Getter @Setter private String registroAnvisa;
    
    @Column (name = "tipo_receita")
    @Getter @Setter private String tipoReceita;
    
    @Column (name = "descricao")
    @Getter @Setter private String descricao;
    
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable(
        name = "medicamento_fornecedor",
        joinColumns = @JoinColumn(name = "medicamento_id"),
        inverseJoinColumns = @JoinColumn(name = "fornecedor_id"))
    @Getter @Setter private List<Fornecedor> fornecedores = new ArrayList<>();
}