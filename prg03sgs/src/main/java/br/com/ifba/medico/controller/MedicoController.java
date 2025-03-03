/*
 * Classe responsável por expor as operações relacionadas aos médicos através de uma interface HTTP.
 * Ela delega as ações para o serviço correspondente (MedicoIService), facilitando a comunicação entre o cliente (usuário) e a lógica de negócios.
 */

package br.com.ifba.medico.controller;

import br.com.ifba.medico.entity.Medico; // Importação da entidade Medico
import br.com.ifba.medico.service.MedicoIService; // Importação do serviço MedicoIService
import java.util.List; // Importação da classe List para manipulação de coleções
import lombok.RequiredArgsConstructor; // Lombok para injeção de dependência automática via construtor
import org.springframework.stereotype.Controller; // Anotação que marca essa classe como um controlador Spring

/**
 * Controlador responsável por gerenciar as requisições relacionadas a médicos.
 * Implementa a interface MedicoIController, garantindo a implementação dos métodos definidos.
 */
@Controller // Marca essa classe como um controlador Spring, indicando que lida com requisições HTTP
@RequiredArgsConstructor // Lombok: Gera o construtor necessário para injeção do serviço MedicoIService
public class MedicoController implements MedicoIController {
    
    private final MedicoIService medicoIService; // Injeção do serviço responsável pela lógica de negócios dos médicos
    
    /**
     * Retorna uma lista de todos os médicos cadastrados.
     * Delegação da tarefa para o serviço correspondente.
     * @return Lista de médicos
     */
    @Override
    public List<Medico> findAll() {
        return medicoIService.findAll(); // Chama o método no serviço para buscar todos os médicos
    }
    
    /**
     * Salva um novo médico no sistema.
     * Delegação da tarefa para o serviço correspondente.
     * @param medico Objeto do tipo Medico a ser salvo
     */
    @Override
    public void save(Medico medico) {
        medicoIService.save(medico); // Chama o método no serviço para salvar o médico
    }
    
    /**
     * Atualiza os dados de um médico existente no sistema.
     * Delegação da tarefa para o serviço correspondente.
     * @param medico Objeto do tipo Medico a ser atualizado
     */
    @Override
    public void update(Medico medico) {
        medicoIService.update(medico); // Chama o método no serviço para atualizar o médico
    }
    
    /**
     * Exclui um médico do sistema.
     * Delegação da tarefa para o serviço correspondente.
     * @param medico Objeto do tipo Medico a ser excluído
     */
    @Override
    public void delete(Medico medico) {
        medicoIService.delete(medico); // Chama o método no serviço para excluir o médico
    }
    
    /**
     * Busca um médico pelo seu ID.
     * Delegação da tarefa para o serviço correspondente.
     * @param id Identificador do médico
     * @return O médico encontrado ou lança uma exceção em caso de erro
     * @throws RuntimeException Caso o médico não seja encontrado
     */
    @Override
    public Medico findById(Long id) throws RuntimeException {
        return medicoIService.findById(id); // Chama o método no serviço para buscar o médico pelo ID
    }
}
