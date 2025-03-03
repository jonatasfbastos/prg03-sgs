/*
 * Classe que representa um médico no sistema.
 * Esta classe herda de PersistenceEntity, que provavelmente fornece funcionalidades comuns de persistência.
 * Ela é uma entidade JPA e mapeada para a tabela "medicos" no banco de dados.
 */

package br.com.ifba.medico.entity;

import br.com.ifba.funcionarios.entity.Funcionarios; // Importação da entidade Funcionarios, que representa os dados de um funcionário
import br.com.ifba.infrastructure.entity.PersistenceEntity; // Importação da classe PersistenceEntity, que pode fornecer funcionalidades comuns de persistência
import br.com.ifba.requisicoes.entity.Requisicoes; // Importação da entidade Requisicoes, que representa os dados das requisições feitas por médicos
import jakarta.persistence.CascadeType; // Importação para definir tipos de propagação de operações de persistência (como salvar/excluir)
import jakarta.persistence.Column; // Importação da anotação que define uma coluna no banco de dados
import jakarta.persistence.Entity; // Importação da anotação para marcar a classe como uma entidade JPA
import jakarta.persistence.FetchType; // Importação para especificar como os dados de uma associação serão carregados
import jakarta.persistence.JoinColumn; // Importação para definir a coluna de junção entre duas tabelas
import jakarta.persistence.OneToOne; // Importação para representar um relacionamento "um para um"
import jakarta.persistence.Table; // Importação para definir o nome da tabela no banco de dados
import java.io.Serializable; // Importação da interface Serializable para permitir que objetos sejam serializados
import lombok.Getter; // Lombok: Gera automaticamente os métodos getter para os campos
import lombok.NoArgsConstructor; // Lombok: Gera um construtor sem argumentos
import lombok.Setter; // Lombok: Gera automaticamente os métodos setter para os campos

/**
 * A classe Medico é uma entidade JPA que representa um médico no sistema.
 * Ela possui informações como o número do COREN (registro do profissional), especialidade,
 * além de um relacionamento com a entidade Funcionarios e a entidade Requisicoes.
 */
@Entity // Marca a classe como uma entidade JPA, que será mapeada para uma tabela no banco de dados
@Table(name = "medicos") // Define o nome da tabela associada a essa entidade no banco de dados
@NoArgsConstructor // Gera um construtor sem argumentos, necessário para o JPA
public class Medico extends PersistenceEntity implements Serializable {
    
    @Column(name = "coren", nullable = false) // Define a coluna 'coren' no banco de dados, que não pode ser nula
    @Getter @Setter private String coren; // Define a propriedade 'coren' (número de registro do médico) com seus respectivos getters e setters
    
    @Column(name = "especialidade", nullable = false) // Define a coluna 'especialidade' no banco de dados, que também não pode ser nula
    @Getter @Setter private String especialidade; // Define a propriedade 'especialidade' (especialidade do médico) com seus respectivos getters e setters
    
    @OneToOne // Define um relacionamento "um para um" entre Médico e Funcionário
    @JoinColumn(name = "medico_id", nullable = false) // Define a coluna de junção 'medico_id', que relaciona o médico com o funcionário correspondente
    private Funcionarios funcionario; // Relacionamento com a entidade Funcionarios, onde cada médico é um funcionário
    
    @OneToOne(mappedBy = "medico", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Define um relacionamento "um para um" com Requisicoes
    @Getter @Setter private Requisicoes requisicoes; // Relacionamento com a entidade Requisicoes, onde cada médico pode ter uma requisição associada

}
