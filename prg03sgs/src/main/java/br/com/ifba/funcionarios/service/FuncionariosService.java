/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.funcionarios.service;

import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.funcionarios.repository.FuncionariosRepository;
import br.com.ifba.infrastructure.util.StringUtil;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Serviço para gerenciamento de funcionários.
 * Implementa a interface FuncionariosIService e fornece operações CRUD.
 * 
 * @author Rafael
 */
@Service
@RequiredArgsConstructor // Injeta automaticamente o repositório via construtor
public class FuncionariosService implements FuncionariosIService {

    // Repositório responsável por acessar os dados dos funcionários
    private final FuncionariosRepository funcionariosRepository;

    /**
     * Retorna a lista de todos os funcionários cadastrados.
     * 
     * @return Lista de funcionários.
     * @throws RuntimeException Se ocorrer um erro ao buscar os funcionários.
     */
    @Override
    public List<Funcionarios> findAll() throws RuntimeException {
        return funcionariosRepository.findAll();
    }

    /**
     * Salva um novo funcionário no banco de dados após validar os campos obrigatórios.
     * 
     * @param funcionarios Objeto do funcionário a ser salvo.
     * @throws RuntimeException Se o objeto funcionário for nulo.
     * @throws IllegalArgumentException Se algum campo obrigatório estiver vazio.
     */
    @Override
    public void save(Funcionarios funcionarios) throws RuntimeException, IllegalArgumentException {
        if (funcionarios == null) {
            throw new RuntimeException("Não está preenchido");
        }

        // Validação de campos obrigatórios
        if (StringUtil.isNullOrEmpty(funcionarios.getNome()) ||
            StringUtil.isNullOrEmpty(funcionarios.getCpf()))
        {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");
        }

        // Remove espaços extras dos campos nome e CPF
        funcionarios.setNome(StringUtil.trimExtraSpaces(funcionarios.getNome()));
        funcionarios.setCpf(StringUtil.trimExtraSpaces(funcionarios.getCpf()));

        funcionariosRepository.save(funcionarios);
    }

    /**
     * Atualiza um funcionário existente após verificar a existência do mesmo.
     * 
     * @param funcionarios Objeto do funcionário a ser atualizado.
     * @throws RuntimeException Se o objeto funcionário for nulo.
     * @throws IllegalArgumentException Se o ID não for informado ou algum campo obrigatório estiver vazio.
     * @throws EntityNotFoundException Se o funcionário não for encontrado no banco de dados.
     */
    @Override
    public void update(Funcionarios funcionarios) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        if (funcionarios == null) {
            throw new RuntimeException("Não está preenchido");
        }

        if (funcionarios.getId() == null) {
            throw new IllegalArgumentException("Preencha o ID");
        }

        // Validação de campos obrigatórios
        if (StringUtil.isNullOrEmpty(funcionarios.getNome()) ||
            StringUtil.isNullOrEmpty(funcionarios.getTelefone()) ||
            StringUtil.isNullOrEmpty(funcionarios.getCpf())) 
        {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");
        }

        // Verifica se o funcionário existe no banco
        if (findById(funcionarios.getId()) == null) {
            throw new EntityNotFoundException("O Funcionário com o ID: " + funcionarios.getId() + " não pode ser encontrado");
        }

        // Remove espaços extras dos campos
        funcionarios.setNome(StringUtil.trimExtraSpaces(funcionarios.getNome()));
        funcionarios.setCpf(StringUtil.trimExtraSpaces(funcionarios.getCpf()));
        funcionarios.setTelefone(StringUtil.trimExtraSpaces(funcionarios.getTelefone()));

        funcionariosRepository.save(funcionarios);
    }

    /**
     * Exclui um funcionário do banco de dados.
     * 
     * @param funcionarios Objeto do funcionário a ser excluído.
     * @throws RuntimeException Se o objeto funcionário for nulo.
     * @throws EntityNotFoundException Se o funcionário não for encontrado no banco de dados.
     */
    @Override
    public void delete(Funcionarios funcionarios) throws RuntimeException, EntityNotFoundException {
        if (funcionarios == null) {
            throw new RuntimeException("Preencha os dados");
        }

        // Verifica se o funcionário existe antes de excluir
        if (findById(funcionarios.getId()) == null) {
            throw new EntityNotFoundException("Funcionário com o ID: " + funcionarios.getId() + " não pode ser encontrado");
        }

        funcionariosRepository.delete(funcionarios);
    }

    /**
     * Busca funcionários cujo nome corresponde parcialmente ao valor informado, ignorando diferenças entre maiúsculas e minúsculas.
     * 
     * @param nome Nome ou parte do nome a ser pesquisado.
     * @return Lista de funcionários que correspondem ao critério de pesquisa.
     * @throws RuntimeException Se ocorrer um erro na busca.
     */
    @Override
    public List<Funcionarios> findByNomeLikeIgnoreCase(String nome) throws RuntimeException {
        return funcionariosRepository.findByNomeLikeIgnoreCase(nome);
    }

    /**
     * Busca funcionários cujo nome contém o valor informado.
     * 
     * @param nome Nome ou parte do nome a ser pesquisado.
     * @return Lista de funcionários que contêm o valor informado no nome.
     * @throws RuntimeException Se ocorrer um erro na busca.
     */
    @Override
    public List<Funcionarios> findByNomeContaining(String nome) throws RuntimeException {
        return funcionariosRepository.findByNomeContaining(nome);
    }

    /**
     * Busca um funcionário pelo seu ID.
     * 
     * @param id Identificador único do funcionário.
     * @return Funcionário correspondente ao ID informado ou null se não for encontrado.
     * @throws RuntimeException Se o ID for nulo.
     */
    @Override
    public Funcionarios findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("Funcionário não encontrado");
        }
        return funcionariosRepository.findById(id).orElse(null);
    }

    /**
     * Busca um funcionário pelo seu ID.
     * 
     * @param cpf Cpf do funcionário.
     * @return Funcionário correspondente ao Cpf informado ou exceção se não for encontrado.
     * @throws RuntimeException Se o Cpf for nulo.
     */
    @Override
    public Funcionarios findByCpf(String cpf) throws RuntimeException {
        if (cpf == null) {
            throw new RuntimeException("Funcionário não encontrado");
        } else {
            return funcionariosRepository.findByCpf(cpf);
        }
    }
}

