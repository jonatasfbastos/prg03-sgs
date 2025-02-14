/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.campanhavacina.service;

import br.com.ifba.campanhavacina.entity.CampanhaVacinaEntity;
import br.com.ifba.campanhavacina.repository.CursoRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author a1591
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class CampanhaVacinaService implements CampanhaVacinaIService{

    private final CursoRepository cursoRepository;

    @Override
    public CampanhaVacinaEntity save(CampanhaVacinaEntity campanhaEntity) throws RuntimeException {
        // Verifica se o objeto campanha é nulo; se for, lança uma exceção informando que os dados não foram preenchidos
        if (campanhaEntity == null) {
            throw new RuntimeException("Dados da campanha não preenchidos");

        // Verifica se a campanha já possui um ID (caso tenha, significa que a campanha já existe na base de dados)
        } else if (campanhaEntity.getId() != null) {
            throw new RuntimeException("Campanha já existente no banco de dados");

        // Se a campanha não for nula e não tiver ID, então ela é inserida no banco de dados
        } else {
            log.info("Salvando Objeto Campanha no Banco!");
            return cursoRepository.save(campanhaEntity);
        }
    }

    @Override
    public List<CampanhaVacinaEntity> findAll() throws RuntimeException {
        // Retorna todas as campanhas encontradas no banco de dados
        log.info("Procurando Todas as Campanhas no Banco!");
        return cursoRepository.findAll();
    }

    @Override
    public CampanhaVacinaEntity update(CampanhaVacinaEntity campanhaEntity) throws RuntimeException {
        if (campanhaEntity == null) {
            throw new RuntimeException("Dados da campanha não preenchidos");
        }
        if (campanhaEntity.getId() == null) {
            throw new RuntimeException("ID da campanha não fornecido");
        }

        // Verifica se a campanha existe no banco de dados
        Optional<CampanhaVacinaEntity> campanhaExistente = cursoRepository.findById(campanhaEntity.getId());
        if (!campanhaExistente.isPresent()) {
            throw new RuntimeException("Campanha não encontrada");
        }

        // Atualiza a campanha no banco de dados
        log.info("Atualizando Objeto Campanha no Banco!");
        return cursoRepository.save(campanhaEntity);
    }

    @Override
    public void delete(CampanhaVacinaEntity campanhaEntity) throws RuntimeException {
        // Verifica se o objeto campanha é nulo; se for, lança uma exceção informando que os dados não foram preenchidos
        if (campanhaEntity == null) {
            throw new RuntimeException("Dados da campanha não preenchidos");
        // Exclui a campanha do banco de dados utilizando o cursoDao
        } else {
            log.info("Excluindo Objeto Campanha no Banco!");
            cursoRepository.delete(campanhaEntity);
        }
    }

    @Override
    public CampanhaVacinaEntity findById(Long id) throws RuntimeException {
        // Verifica se o ID fornecido é nulo; caso seja, lança uma exceção informando que o ID não foi preenchido
        if (id == null) {
            throw new RuntimeException("ID não preenchido");

        // Retorna a campanha encontrada pelo ID utilizando o cursoRepository ou uma exceção caso a campanha não seja encontrada
        } else {
            log.info("Procurando Objeto Campanha no Banco Pelo ID!");
            return cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Campanha não encontrada."));
        }
    }

    @Override
    public List<CampanhaVacinaEntity> findByNome(String nome) throws RuntimeException {
        // Verifica se o nome fornecido é nulo; caso seja, lança uma exceção informando que o nome não foi preenchido
        if (nome == null || nome.trim().isEmpty()) {
            throw new RuntimeException("Nome não preenchido");
        } else {
            // Retorna uma lista de campanhas encontradas pelo nome utilizando o cursoRepository
            log.info("Procurando Objeto Campanha no Banco Pelo Nome!");
            return cursoRepository.findByNome(nome);
        }
    }
    
}
