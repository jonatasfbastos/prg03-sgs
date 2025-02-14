/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.campanhavacina.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author a1591
 */

@Entity
@Table(name = "campanha_vacina")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CampanhaVacinaEntity extends PersistenceEntity implements Serializable{
    
    @Column(name = "nome_campanha", nullable = false)
    @Getter @Setter private String nome;
    
    @Column(name = "local_vacina", nullable = false, unique = true)
    @Getter @Setter private String localVacina;
    
    @Column(name = "data_campaha_inicio")
    @Getter @Setter private LocalDateTime inicioCampanha;
    
    @Column(name = "data_campaha_final")
    @Getter @Setter private LocalDateTime finalCampanha;
    
    @Column(name = "disponibilidade")
    @Getter @Setter private boolean disponibilidade;
    
    @Column(name = "publico_alvo", nullable = false)
    @Getter @Setter private String publicoAlvo;
    
    
}
