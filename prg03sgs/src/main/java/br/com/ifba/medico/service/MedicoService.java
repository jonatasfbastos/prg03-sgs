/*
 * Classe de Serviço que implementa os métodos definidos pela interface MedicoIService.
 * A lógica de negócios relacionada à entidade Medico é implementada aqui.
 */

package br.com.ifba.medico.service;

import br.com.ifba.infrastructure.util.StringUtil;  // Utilitário para manipulação de strings, como remoção de espaços extras
import br.com.ifba.medico.entity.Medico;  // Entidade Medico que representa os médicos no banco de dados
import br.com.ifba.medico.repository.MedicoRepository;  // Repositório responsável pela comunicação com o banco de dados
import jakarta.persistence.EntityNotFoundException;  // Exceção lançada quando a entidade não é encontrada no banco de dados
import java.util.List;  // Lista para retornar múltiplos objetos
import lombok.RequiredArgsConstructor;  // Geração automática de construtores com todos os campos finais
import org.springframework.stereotype.Service;  // Anotação que indica que a classe é um componente de serviço do Spring

/**
 * Classe responsável pela implementação da lógica de negócios para a entidade Medico.
 * Esta classe implementa os métodos da interface MedicoIService.
 */
@Service  // Indica que a classe é um componente de serviço Spring
@RequiredArgsConstructor  // Gera automaticamente o construtor com os campos finais necessários
public class MedicoService implements MedicoIService {
    
    // Injeção do repositório MedicoRepository, que gerencia a persistência de objetos Medico
    private final MedicoRepository medicoRepository;
    
    /**
     * Método para obter todos os médicos do banco de dados.
     * @return uma lista de objetos Medico
     * @throws RuntimeException se ocorrer algum erro durante a execução
     */
    @Override
    public List <Medico> findAll() throws RuntimeException {
        return medicoRepository.findAll();  // Chama o método findAll do repositório para obter todos os médicos
    }
    
    /**
     * Método para salvar um novo médico no banco de dados.
     * Verifica se o médico e os campos obrigatórios estão preenchidos antes de salvar.
     * @param medico o objeto Medico a ser salvo
     * @throws RuntimeException se o objeto Medico for nulo
     * @throws IllegalArgumentException se campos obrigatórios não forem preenchidos
     */
    @Override
    public void save(Medico medico) throws RuntimeException, IllegalArgumentException {
        if (medico == null) {
            throw new RuntimeException("Não está preenchido");  // Verifica se o médico não é nulo
        }
        
        // Verifica se os campos obrigatórios (especialidade e coren) estão preenchidos
        if (StringUtil.isNullOrEmpty(medico.getEspecialidade()) ||
            StringUtil.isNullOrEmpty(medico.getCoren())) {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");  // Lança exceção se os campos estiverem vazios
        }

        // Remove espaços extras dos campos 'especialidade' e 'coren' usando o utilitário StringUtil
        medico.setEspecialidade(StringUtil.trimExtraSpaces(medico.getEspecialidade()));
        medico.setCoren(StringUtil.trimExtraSpaces(medico.getCoren()));

        medicoRepository.save(medico);  // Salva o médico no banco de dados
    }
    
    /**
     * Método para atualizar um médico existente no banco de dados.
     * Verifica se o médico existe e se os campos obrigatórios estão preenchidos antes de realizar a atualização.
     * @param medico o objeto Medico a ser atualizado
     * @throws RuntimeException se o objeto Medico for nulo
     * @throws IllegalArgumentException se campos obrigatórios não forem preenchidos
     * @throws EntityNotFoundException se o médico com o ID fornecido não for encontrado no banco de dados
     */
    @Override
    public void update(Medico medico) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        if (medico == null) {
            throw new RuntimeException("Não está preenchido");  // Verifica se o médico não é nulo
        }

        // Valida se os campos obrigatórios estão preenchidos
        if (StringUtil.isNullOrEmpty(medico.getEspecialidade()) ||
            StringUtil.isNullOrEmpty(medico.getCoren())) {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");  // Lança exceção se campos não estiverem preenchidos
        }

        // Verifica se o médico existe no banco antes de atualizar
        if (findById(medico.getId()) == null) {
            throw new EntityNotFoundException("O Medico com o ID: " + medico.getId() + " não pode ser encontrado");  // Lança exceção se médico não for encontrado
        }

        // Remove espaços extras dos campos 'especialidade' e 'coren' novamente antes de atualizar
        medico.setEspecialidade(StringUtil.trimExtraSpaces(medico.getEspecialidade()));
        medico.setCoren(StringUtil.trimExtraSpaces(medico.getCoren()));

        medicoRepository.save(medico);  // Salva as alterações do médico no banco de dados
    }
    
    /**
     * Método para excluir um médico do banco de dados.
     * Verifica se o médico existe antes de excluir.
     * @param medico o objeto Medico a ser excluído
     * @throws RuntimeException se o objeto Medico for nulo
     * @throws EntityNotFoundException se o médico não for encontrado no banco de dados
     */
    public void delete(Medico medico) throws RuntimeException, EntityNotFoundException {
        if (medico == null) {
            throw new RuntimeException("Preencha os dados");  // Verifica se o médico não é nulo
        }

        // Verifica se o médico existe no banco antes de tentar excluí-lo
        if (findById(medico.getId()) == null) {
            throw new EntityNotFoundException("Medico com o ID: " + medico.getId() + " não pode ser encontrado");  // Lança exceção se o médico não existir
        }

        medicoRepository.delete(medico);  // Exclui o médico do banco de dados
    }

    /**
     * Método para encontrar um médico pelo seu ID.
     * @param id o ID do médico
     * @return o médico encontrado, ou null se não for encontrado
     * @throws RuntimeException se o ID for nulo
     */
    @Override
    public Medico findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("Medico não encontrado");  // Verifica se o ID não é nulo
        }
        return medicoRepository.findById(id).orElse(null);  // Busca o médico no repositório. Retorna null se não encontrado
    }
}
