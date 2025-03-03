/*
 * Interface que define os contratos dos métodos que o controlador de médicos deve implementar.
 * Este controlador irá expor as operações CRUD (Criar, Ler, Atualizar, Excluir) para os médicos.
 * A interface é uma forma de garantir que a classe implementadora tenha esses métodos, facilitando a manutenção e testabilidade.
 */

package br.com.ifba.medico.controller;

import br.com.ifba.medico.entity.Medico; // Importação da entidade Medico
import java.util.List; // Importação da classe List para manipulação de coleções

/**
 * Interface que define os métodos que um controlador de médicos deve implementar.
 * Esses métodos são usados para manipulação de dados de médicos, como buscar, salvar, atualizar e excluir.
 */
public interface MedicoIController {
    
    /**
     * Método para buscar todos os médicos cadastrados no sistema.
     * @return Lista de médicos
     */
    public abstract List<Medico> findAll();

    /**
     * Método para salvar um novo médico no sistema.
     * @param medico Objeto do tipo Medico que será salvo
     */
    public abstract void save(Medico medico);

    /**
     * Método para atualizar as informações de um médico existente no sistema.
     * @param medico Objeto do tipo Medico com os dados a serem atualizados
     */
    public abstract void update(Medico medico);

    /**
     * Método para excluir um médico do sistema.
     * @param medico Objeto do tipo Medico que será excluído
     */
    public abstract void delete(Medico medico);

    /**
     * Método para buscar um médico específico pelo seu ID.
     * @param id Identificador único do médico
     * @return O médico encontrado ou null caso não encontre
     * @throws RuntimeException Caso o médico não seja encontrado
     */
    public abstract Medico findById(Long id) throws RuntimeException;
}
