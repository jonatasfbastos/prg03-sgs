/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.agentevisita.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.visita.entity.Visita;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sunhe
 */

/*
Classe que possui atributos e métodos para guardar e obter
informações sobre os profissionais que realizam as visitas. Possui uma subclasse para pegar
informações do posto de saúde no qual ele atua.
*/

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "agentes_de_visita")//Tabela para guardar os profissionais.
public class AgenteVisita  extends PersistenceEntity  implements Serializable {
    
    //Atributos de AgenteVisita, incluindo atributos para identificação do posto em que atua.
    @Column (name = "cpf_agente", nullable = false, unique = true)
    @Getter @Setter private String cpfProfissional;
    
    @Column (name = "nome_agente", nullable = false)
    @Getter @Setter private String nome;

    @Column(name = "cns", nullable = false)
    //É o número único de identificação de cada usuário ou profissional no Sistema Único de Saúde (SUS).
    @Getter @Setter private String cns;
    
    @Column (name = "cbo_agente", nullable = false)
    //Código que identifica a ocupação ou função do profissional de saúde.
    @Getter @Setter private String cbo;
    
    @Column (name = "cnes_posto", nullable = false)
    //Identifica o estabelecimento de saúde ao qual o profissional está vinculado.
    @Getter @Setter private String cnes;
    
    @Column (name = "ine", nullable = false)
    //Código que identifica as equipes de saúde que atuam em determinado estabelecimento.
    @Getter @Setter private String ine;

    @Column(name = "id_unidade_saude", nullable = false, unique = true)
    @Getter @Setter private int idUnidadeOrigem;
    
    @Column(name = "nome_unidade_saude", nullable = false)
    @Getter @Setter private String nomeUnidadeOrigem;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //Relação de AgenteVisita com uma ou várias (1:N) visitas (Visita).
    @OneToMany(mappedBy = "agenteVisita", cascade = CascadeType.ALL)
    @Getter @Setter private List<Visita> visitas = new ArrayList<>();
    
    //Métodos da classe AgenteVisita.
    public void associarVisita(Visita visita){
        
    }
    
    public boolean validarInformacoesProfissional(){
        if(getCbo() == null || getNome() == null || getCns() == null || getCpfProfissional() == null){
            System.out.println("Informações do profissional estão incompletas.");
            return false;
        }else{
            return true;
        }
    }
    
}
