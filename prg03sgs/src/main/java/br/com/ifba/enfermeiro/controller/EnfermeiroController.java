/*
 * Controlador responsável por gerenciar as operações relacionadas a "Enfermeiro".
 * Utiliza a anotação @Controller do Spring para definir que esta classe é um controlador.
 * A anotação @RequiredArgsConstructor do Lombok gera um construtor com os atributos final automaticamente.
 */

package br.com.ifba.enfermeiro.controller;

import br.com.ifba.enfermeiro.entity.Enfermeiro; // Importação da entidade Enfermeiro
import br.com.ifba.enfermeiro.service.EnfermeiroIService; // Importação do serviço de enfermeiro
import java.util.List; // Importação da classe List para manipulação de coleções
import lombok.RequiredArgsConstructor; // Importação do Lombok para gerar um construtor automático
import org.springframework.stereotype.Controller; // Importação do Spring para marcar a classe como um controlador

/**
 * Controlador para a entidade Enfermeiro.
 * Responsável por intermediar as requisições da aplicação e o serviço correspondente.
 */
@Controller
@RequiredArgsConstructor
public class EnfermeiroController implements EnfermeiroIController {

    // Injeção de dependência do serviço de enfermeiros via construtor
    private final EnfermeiroIService enfermeiroIService;

    /**
     * Método para buscar todos os enfermeiros cadastrados.
     * @return Lista de objetos do tipo Enfermeiro.
     */
    @Override
    public List<Enfermeiro> findAll() {
        return enfermeiroIService.findAll();
    }

    /**
     * Método para salvar um novo enfermeiro no sistema.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser salvo.
     */
    @Override
    public void save(Enfermeiro enfermeiro) {
        enfermeiroIService.save(enfermeiro);
    }

    /**
     * Método para atualizar um enfermeiro existente.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser atualizado.
     */
    @Override
    public void update(Enfermeiro enfermeiro) {
        enfermeiroIService.update(enfermeiro);
    }

    /**
     * Método para excluir um enfermeiro do sistema.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser removido.
     */
    @Override
    public void delete(Enfermeiro enfermeiro) {
        enfermeiroIService.delete(enfermeiro);
    }

    /**
     * Método para buscar um enfermeiro pelo seu ID.
     * @param id Identificador único do enfermeiro.
     * @return Objeto do tipo Enfermeiro encontrado pelo ID.
     * @throws RuntimeException Caso o enfermeiro não seja encontrado.
     */
    @Override
    public Enfermeiro findById(Long id) throws RuntimeException {
        return enfermeiroIService.findById(id);
    }
}
