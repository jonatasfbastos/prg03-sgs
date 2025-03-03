/*
 * Interface que define o contrato para operações relacionadas à entidade Enfermeiro.
 * Essa interface será implementada por classes que gerenciam a lógica do controlador de enfermeiros.
 */

package br.com.ifba.enfermeiro.controller;

import br.com.ifba.enfermeiro.entity.Enfermeiro; // Importação da entidade Enfermeiro
import java.util.List; // Importação da classe List para manipulação de coleções

/**
 * Interface responsável por definir os métodos que devem ser implementados
 * pelos controladores da entidade Enfermeiro.
 */
public interface EnfermeiroIController {

    /**
     * Método para obter uma lista de todos os enfermeiros cadastrados.
     * @return Lista contendo todos os objetos do tipo Enfermeiro.
     */
    public abstract List<Enfermeiro> findAll();

    /**
     * Método para salvar um novo enfermeiro no sistema.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser salvo.
     */
    public abstract void save(Enfermeiro enfermeiro);

    /**
     * Método para atualizar as informações de um enfermeiro existente.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser atualizado.
     */
    public abstract void update(Enfermeiro enfermeiro);

    /**
     * Método para excluir um enfermeiro do sistema.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser removido.
     */
    public abstract void delete(Enfermeiro enfermeiro);

    /**
     * Método para buscar um enfermeiro pelo seu ID.
     * @param id Identificador único do enfermeiro.
     * @return Objeto do tipo Enfermeiro encontrado pelo ID.
     * @throws RuntimeException Caso o enfermeiro não seja encontrado.
     */
    public abstract Enfermeiro findById(Long id) throws RuntimeException;
}
