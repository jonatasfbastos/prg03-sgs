/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.visita.entity;

import br.com.ifba.fichavisita.entity.FichaVisita;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "visitas_feitas")//Tabela para guardar o histórico de visitas.
public class Visita extends PersistenceEntity implements Serializable{
    
    //Atributos da classe Visita com métodos getters e setters e suas respectivas colunas na tabela do BD.
    @Column(name = "id_visita", nullable = false, unique = true)
    @Getter @Setter private int idVisita;
    
    @Column(name = "data_visita", nullable = false)
    @Getter @Setter private Date dataVisita;
    
    @Column(name = "descricao", nullable = false)
    @Getter @Setter private String descricaoMotivo;//Atributo p/ guardar a descrição do motivo da visita.
    
    @Column(name = "responsavel_registro", nullable = false)
    @Getter @Setter private String responsavelVisita;//Atributo p/ guardar o nome da pessoa que fez a visita.
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private FichaVisita fichaDeVisita;//Objeto do tipo FichaVisita para obter dados da ficha do usuário visitado.
    
}
