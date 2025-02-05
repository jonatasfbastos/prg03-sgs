/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fichavisita.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sunhe
 */

/*
Classe da entidade Ficha Visita para Gestão de Visitas Domiciliares, a qual guarda infomrações
para uma ficha de visita utilizada por agentes comunitários (e que pode ser utilizada por outros tipos de
profissional da saude, se for necessario).
*/

@Entity
@NoArgsConstructor
@Table(name = "fichas_visita")//Nome da tabela que guarda fichas de visita.
public class FichaVisita extends PersistenceEntity implements Serializable{
    
    //Atributos da classe FichaVisita com métodos getters e setters e suas respectivas colunas na tabela do BD.
    @Column(name = "cabecalho_ficha", nullable = false)
    @Getter @Setter private String cabecalho;
    
    @Column(name = "motivo_visita", nullable = false)
    @Getter @Setter private String motivoVisita;
    
    @Column(name = "busca_ativa", nullable = false)
    @Getter @Setter private boolean buscaAtiva;
    
    @Column(name = "acompanhamentos", nullable = false)
    @Getter @Setter private String acompanhamento;
    
    @Column(name = "controle_ambiental", nullable = false)
    @Getter @Setter private String controleAmbiental;
    
    @Column(name = "antropometria", nullable = false)
    @Getter @Setter private String antropometria;
    
    @Column(name = "sinais_vitais", nullable = false)
    @Getter @Setter private String sinaisVitais;
    
    @Column(name = "glicemia", nullable = false)
    @Getter @Setter private String glicemia;
    
    @Column(name = "desfecho", nullable = false)
    @Getter @Setter private String desfecho;
    
    @Column(name = "numero_ficha", nullable = false, unique = true)
    @Getter @Setter private int numeroFicha;
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //Métodos da classe Visita.
    public void registrarVisita(){
        
    }
    
    public void atualizarVisita(){
        
    }
    
    public void constultarVisitas(){
        
    }
    
}
