/*
 * Interface que define um repositório para a entidade Medico.
 * O Spring Data JPA fornece implementação automática dos métodos de persistência.
 */

package br.com.ifba.medico.repository;

import br.com.ifba.medico.entity.Medico; // Importação da classe Medico, que representa a entidade a ser persistida no banco de dados
import org.springframework.data.jpa.repository.JpaRepository; // Importação da interface JpaRepository, que fornece as operações básicas de CRUD
import org.springframework.stereotype.Repository; // Importação da anotação Repository para marcar a interface como um repositório Spring

/**
 * Interface do repositório para a entidade Medico.
 * A interface herda de JpaRepository, que oferece todos os métodos necessários para acessar a base de dados de forma simples e rápida.
 */
@Repository // Marca esta interface como um repositório Spring, que é um componente de acesso aos dados
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    // O JpaRepository fornece métodos como save(), findById(), findAll(), delete(), entre outros
    // O MedicoRepository não precisa implementar nenhum método, pois o JpaRepository já fornece uma implementação padrão
    // O tipo de entidade (Medico) e o tipo de seu identificador (Long) são passados como parâmetros genéricos para o JpaRepository
}
