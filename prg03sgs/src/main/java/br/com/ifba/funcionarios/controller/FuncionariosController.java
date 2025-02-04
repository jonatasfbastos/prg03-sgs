/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Controlador responsável pela gestão de funcionários.
 */
package br.com.ifba.funcionarios.controller;

import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.funcionarios.service.FuncionariosIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Classe que implementa o controlador de funcionários.
 * Utiliza o padrão de injeção de dependência para acessar os serviços relacionados.
 *
 * Anotação @Controller indica que esta classe é um componente Spring do tipo Controller.
 * Anotação @RequiredArgsConstructor gera automaticamente um construtor para os atributos finais (final).
 *
 * Autor: Rafael
 */
@Controller
@RequiredArgsConstructor
public class FuncionariosController implements FuncionariosIController {
    
    // Injeção de dependência do serviço de funcionários
    private final FuncionariosIService funcionariosIService;
    
    /**
     * Método para buscar todos os funcionários.
     * @return Lista de todos os funcionários cadastrados.
     */
    @Override
    public List<Funcionarios> findAll() {
        return funcionariosIService.findAll();
    }

    /**
     * Método para salvar um novo funcionário no banco de dados.
     * @param funcionarios Objeto do funcionário a ser salvo.
     */
    @Override
    public void save(Funcionarios funcionarios) {
        funcionariosIService.save(funcionarios);
    }

    /**
     * Método para atualizar os dados de um funcionário existente.
     * @param funcionarios Objeto do funcionário com os dados atualizados.
     */
    @Override
    public void update(Funcionarios funcionarios) {
        funcionariosIService.update(funcionarios);
    }

    /**
     * Método para excluir um funcionário do banco de dados.
     * @param funcionarios Objeto do funcionário a ser excluído.
     */
    @Override
    public void delete(Funcionarios funcionarios) {
        funcionariosIService.delete(funcionarios);
    }

    /**
     * Método para buscar funcionários cujo nome contenha um determinado valor, ignorando maiúsculas e minúsculas.
     * @param nome Parte do nome do funcionário a ser pesquisado.
     * @return Lista de funcionários que atendem ao critério de pesquisa.
     */
    @Override
    public List<Funcionarios> findByNomeLikeIgnoreCase(String nome) {
        return funcionariosIService.findByNomeLikeIgnoreCase(nome);
    }
    
    /**
     * Método para buscar funcionários cujo nome contenha um determinado valor.
     * @param nome Parte do nome do funcionário a ser pesquisado.
     * @return Lista de funcionários que atendem ao critério de pesquisa.
     */
    @Override
    public List<Funcionarios> findByNomeContaining(String nome) {
        return funcionariosIService.findByNomeContaining(nome);
    }
    
    /**
     * Método para buscar um funcionário pelo seu ID.
     * @param id Identificador único do funcionário.
     * @return Objeto do funcionário correspondente ao ID fornecido.
     * @throws RuntimeException Caso o funcionário não seja encontrado.
     */
    @Override
    public Funcionarios findById(Long id) throws RuntimeException {
        return funcionariosIService.findById(id);
    }
}
