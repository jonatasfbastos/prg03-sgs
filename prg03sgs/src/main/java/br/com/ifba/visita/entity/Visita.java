/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.visita.entity;

import br.com.ifba.agentevisita.entity.AgenteVisita;
import br.com.ifba.fichavisita.entity.FichaVisita;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sunhe
 */

/*
Classe Principal de Visita Domiciliar da funcionalidade Gestão de Visitas Domiciliares.

*/

@Entity
@NoArgsConstructor
@Table(name = "visitas")//Tabela para guardar o histórico de visitas.
public class Visita extends PersistenceEntity implements Serializable{
    
    //Atributos da classe Visita com métodos getters e setters e suas respectivas colunas na tabela do BD.
    @Column(name = "id_visita", nullable = false, unique = true)
    @Getter @Setter private int idVisita;
    
    @Column(name = "motivo_visita", nullable = false)
    @Getter @Setter private String motivoVisita;
    
    @Column(name = "data_visita", nullable = false)
    @Getter @Setter private Date dataVisita;
    
    @Column(name = "descricao", nullable = false)
    @Getter @Setter private String descricaoMotivo;//Atributo p/ guardar a descrição do motivo da visita.
    
    @Column(name = "responsavel_registro", nullable = false)
    @Getter @Setter private String responsavelVisita;//Atributo p/ guardar o nome da pessoa que fez a visita.
    
    @Column(name = "responsaveis_conferir", nullable = false)
    @Getter @Setter private String conferidoPor;
    
    @Column(name = "responsaveis_digitacao", nullable = false)
    @Getter @Setter private String digitadoPor;
    
    @Column(name = "numero_ficha", nullable = false, unique = true)
    @Getter @Setter private int numeroFicha;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Relação de Visita com uma (1:1) ficha de visita (FichaVisita).
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fichas_visita_id", referencedColumnName = "id")
    @Getter @Setter private FichaVisita fichaVisita;
  
    //Relação de Visita a um (1:1) agente de visita (AgenteVisita).
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "agentes_de_visita_id", referencedColumnName = "id")
    @Getter @Setter private AgenteVisita agenteVisita;
    
}
