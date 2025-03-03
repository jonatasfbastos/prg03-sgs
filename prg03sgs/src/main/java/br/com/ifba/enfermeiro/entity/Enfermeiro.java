/*
 * Classe que representa a entidade Enfermeiro no sistema.
 * Esta classe é uma entidade JPA (Java Persistence API) mapeada para a tabela "enfermeiros" no banco de dados.
 * Ela estende PersistenceEntity, herdando propriedades comuns como ID.
 */

package br.com.ifba.enfermeiro.entity;

import br.com.ifba.funcionarios.entity.Funcionarios; // Importação da entidade Funcionários
import br.com.ifba.infrastructure.entity.PersistenceEntity; // Importação da superclasse de persistência
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable; // Interface que permite que objetos dessa classe sejam serializados
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Classe que representa a entidade Enfermeiro.
 * Armazena informações específicas de um enfermeiro, como seu número de COREN.
 */
@Entity // Indica que esta classe é uma entidade JPA gerenciada pelo Hibernate
@Table(name = "enfermeiros") // Define o nome da tabela correspondente no banco de dados
@NoArgsConstructor // Lombok: gera um construtor sem argumentos automaticamente
public class Enfermeiro extends PersistenceEntity implements Serializable {

    /**
     * Número do COREN (Conselho Regional de Enfermagem) do enfermeiro.
     * Campo obrigatório no banco de dados.
     */
    @Column(name = "coren", nullable = false)
    @Getter @Setter private String coren;

    /**
     * Relacionamento de um-para-um com a entidade Funcionários.
     * Um enfermeiro está associado a um funcionário no sistema.
     */
    @OneToOne // Define um relacionamento 1:1 entre Enfermeiro e Funcionário
    @JoinColumn(name = "fucnionario_id", nullable = false) // Define a chave estrangeira na tabela de enfermeiros
    private Funcionarios funcionarios;
}
