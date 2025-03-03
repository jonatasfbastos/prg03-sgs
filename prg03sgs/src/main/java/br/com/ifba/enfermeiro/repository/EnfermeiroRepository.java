/*
 * Interface que representa o repositório da entidade Enfermeiro.
 * Estende JpaRepository, fornecendo métodos prontos para operações de banco de dados.
 */

package br.com.ifba.enfermeiro.repository;

import br.com.ifba.enfermeiro.entity.Enfermeiro; // Importação da entidade Enfermeiro
import org.springframework.data.jpa.repository.JpaRepository; // Importação do JpaRepository para acesso aos dados
import org.springframework.stereotype.Repository; // Importação da anotação Repository

/**
 * Repositório responsável por gerenciar operações de persistência para a entidade Enfermeiro.
 * Permite a realização de operações como salvar, excluir, atualizar e buscar dados no banco.
 */
@Repository // Anotação que marca esta interface como um repositório gerenciado pelo Spring
public interface EnfermeiroRepository extends JpaRepository<Enfermeiro, Long> {
    // JpaRepository já fornece os métodos padrão para operações CRUD, então nenhuma implementação adicional é necessária.
}
