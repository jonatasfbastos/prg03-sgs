/*
 * Classe responsável pela implementação dos serviços de enfermeiros no sistema.
 * Ela realiza operações de persistência relacionadas a enfermeiros, como salvar, atualizar, excluir e buscar dados.
 * Utiliza a injeção de dependência para acessar o repositório e executar operações no banco de dados.
 */

package br.com.ifba.enfermeiro.service;

import br.com.ifba.enfermeiro.entity.Enfermeiro; // Importação da entidade Enfermeiro
import br.com.ifba.enfermeiro.repository.EnfermeiroRepository; // Importação do repositório de enfermeiros
import br.com.ifba.infrastructure.util.StringUtil; // Utilitário para manipulação de strings
import jakarta.persistence.EntityNotFoundException; // Exceção lançada quando a entidade não é encontrada
import java.util.List; // Importação da classe List para manipulação de coleções
import lombok.RequiredArgsConstructor; // Lombok para gerar o construtor com injeção de dependência
import org.springframework.stereotype.Service; // Anotação que indica que esta classe é um serviço

/**
 * Implementação do serviço relacionado aos enfermeiros.
 * Realiza operações como salvar, atualizar, excluir e buscar enfermeiros.
 */
@Service // Indica que essa classe é um serviço gerenciado pelo Spring
@RequiredArgsConstructor // Lombok: Gera um construtor com injeção de dependência para os campos finais
public class EnfermeiroService implements EnfermeiroIService {

    private final EnfermeiroRepository enfermeiroRepository; // Repositório de enfermeiros, injetado automaticamente pelo Spring

    /**
     * Retorna todos os enfermeiros cadastrados.
     * @return Lista de enfermeiros.
     */
    @Override
    public List<Enfermeiro> findAll() throws RuntimeException {
        return enfermeiroRepository.findAll(); // Chama o método do repositório para buscar todos os enfermeiros
    }

    /**
     * Salva um novo enfermeiro no sistema.
     * Realiza validações antes de persistir os dados no banco.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser salvo.
     */
    @Override
    public void save(Enfermeiro enfermeiro) throws RuntimeException, IllegalArgumentException {
        if (enfermeiro == null) {
            throw new RuntimeException("Não está preenchido"); // Lança exceção se o objeto enfermeiro for nulo
        }
        
        // Valida se o campo 'coren' está preenchido
        if (StringUtil.isNullOrEmpty(enfermeiro.getCoren())) {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");
        }

        // Remove espaços extras do campo 'coren' antes de salvar
        enfermeiro.setCoren(StringUtil.trimExtraSpaces(enfermeiro.getCoren()));

        enfermeiroRepository.save(enfermeiro); // Chama o repositório para salvar o enfermeiro
    }

    /**
     * Atualiza as informações de um enfermeiro existente.
     * Realiza validações e verifica se o enfermeiro existe no banco antes de realizar a atualização.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser atualizado.
     */
    @Override
    public void update(Enfermeiro enfermeiro) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        if (enfermeiro == null) {
            throw new RuntimeException("Não está preenchido"); // Lança exceção se o objeto enfermeiro for nulo
        }

        // Valida se o campo 'coren' está preenchido
        if (StringUtil.isNullOrEmpty(enfermeiro.getCoren())) {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");
        }

        // Verifica se o enfermeiro existe no banco antes de atualizar
        if (findById(enfermeiro.getId()) == null) {
            throw new EntityNotFoundException("O Enfermeiro com o ID: " + enfermeiro.getId() + " não pode ser encontrado");
        }

        // Remove espaços extras do campo 'coren' antes de salvar
        enfermeiro.setCoren(StringUtil.trimExtraSpaces(enfermeiro.getCoren()));

        enfermeiroRepository.save(enfermeiro); // Chama o repositório para atualizar o enfermeiro
    }

    /**
     * Exclui um enfermeiro do sistema.
     * Realiza validações e verifica se o enfermeiro existe no banco antes de realizar a exclusão.
     * @param enfermeiro Objeto do tipo Enfermeiro a ser removido.
     */
    public void delete(Enfermeiro enfermeiro) throws RuntimeException, EntityNotFoundException {
        if (enfermeiro == null) {
            throw new RuntimeException("Preencha os dados"); // Lança exceção se o objeto enfermeiro for nulo
        }

        // Verifica se o enfermeiro existe no banco antes de excluir
        if (findById(enfermeiro.getId()) == null) {
            throw new EntityNotFoundException("Enfermeiro com o ID: " + enfermeiro.getId() + " não pode ser encontrado");
        }

        enfermeiroRepository.delete(enfermeiro); // Chama o repositório para excluir o enfermeiro
    }

    /**
     * Busca um enfermeiro pelo seu ID.
     * @param id Identificador único do enfermeiro.
     * @return O enfermeiro encontrado ou nulo se não existir.
     */
    @Override
    public Enfermeiro findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("Enfermeiro não encontrado"); // Lança exceção se o ID for nulo
        }

        // Busca o enfermeiro pelo ID usando o repositório, retorna nulo se não encontrar
        return enfermeiroRepository.findById(id).orElse(null);
    }
}
