/*
 * Interface que define os serviços para a entidade Enfermeiro.
 * Essa interface estabelece um contrato para operações relacionadas a enfermeiros,
 * que serão implementadas por uma classe de serviço concreta.
 */

package br.com.ifba.enfermeiro.service;

import br.com.ifba.enfermeiro.entity.Enfermeiro; // Importação da entidade Enfermeiro
import java.util.List; // Importação da classe List para manipulação de coleções

/**
 * Interface de serviço para a entidade Enfermeiro.
 * Define os métodos que devem ser implementados para manipulação dos dados de enfermeiros.
 */
public interface EnfermeiroIService {

    /**
     * Retorna uma lista contendo todos os enfermeiros cadastrados.
     * @return Lista de objetos do tipo Enfermeiro.
     */
    public abstract List<Enfermeiro> findAll();

    /**
     * Salva um novo enfermeiro no sistema.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser salvo.
     */
    public abstract void save(Enfermeiro enfermeiro);

    /**
     * Atualiza as informações de um enfermeiro existente.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser atualizado.
     */
    public abstract void update(Enfermeiro enfermeiro);

    /**
     * Remove um enfermeiro do sistema.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser removido.
     */
    public abstract void delete(Enfermeiro enfermeiro);

    /**
     * Busca um enfermeiro pelo seu ID.
     * @param id Identificador único do enfermeiro.
     * @return Objeto do tipo Enfermeiro encontrado pelo ID.
     * @throws RuntimeException Caso o enfermeiro não seja encontrado.
     */
    public abstract Enfermeiro findById(Long id) throws RuntimeException;
}
