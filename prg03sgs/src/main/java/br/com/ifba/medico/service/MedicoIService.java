/*
 * Interface que define os contratos dos serviços relacionados à entidade Medico.
 * Esta interface é implementada por uma classe de serviço que vai realizar a lógica de negócios.
 */

package br.com.ifba.medico.service;

import br.com.ifba.medico.entity.Medico; // Importação da entidade Medico
import jakarta.persistence.EntityNotFoundException; // Exceção lançada quando a entidade não é encontrada
import java.util.List; // Importação da lista que será usada para retornar múltiplos objetos Medico

/**
 * Interface que define os métodos de serviço para a entidade Medico.
 * Aqui são definidos os métodos que precisam ser implementados para realizar as operações de CRUD (Create, Read, Update, Delete).
 */
public interface MedicoIService {
    
    /**
     * Método para obter todos os médicos.
     * @return uma lista de todos os médicos cadastrados.
     * @throws RuntimeException se ocorrer algum erro durante a execução
     */
    public abstract List<Medico> findAll() throws RuntimeException;

    /**
     * Método para salvar um médico no banco de dados.
     * @param medico o médico a ser salvo
     * @throws RuntimeException se ocorrer algum erro durante a execução
     * @throws IllegalArgumentException se o médico fornecido for inválido (ex: dados obrigatórios não preenchidos)
     */
    public abstract void save(Medico medico) throws RuntimeException, IllegalArgumentException;

    /**
     * Método para atualizar os dados de um médico existente.
     * @param medico o médico com os dados atualizados
     * @throws RuntimeException se ocorrer algum erro durante a execução
     * @throws IllegalArgumentException se o médico fornecido for inválido (ex: dados obrigatórios não preenchidos)
     * @throws EntityNotFoundException se o médico com o ID fornecido não for encontrado no banco de dados
     */
    public abstract void update(Medico medico) throws RuntimeException, IllegalArgumentException, EntityNotFoundException;

    /**
     * Método para excluir um médico do banco de dados.
     * @param medico o médico a ser excluído
     * @throws RuntimeException se ocorrer algum erro durante a execução
     * @throws EntityNotFoundException se o médico com o ID fornecido não for encontrado no banco de dados
     */
    public abstract void delete(Medico medico) throws RuntimeException, EntityNotFoundException;

    /**
     * Método para encontrar um médico pelo seu ID.
     * @param id o identificador único do médico
     * @return o médico encontrado ou null caso não exista
     * @throws RuntimeException se ocorrer algum erro durante a execução
     */
    public abstract Medico findById(Long id) throws RuntimeException;
}
