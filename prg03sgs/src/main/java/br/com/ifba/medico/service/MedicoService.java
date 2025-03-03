/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.medico.service;

import br.com.ifba.infrastructure.util.StringUtil;
import br.com.ifba.medico.entity.Medico;
import br.com.ifba.medico.repository.MedicoRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rafael
 */

@Service
@RequiredArgsConstructor
public class MedicoService implements MedicoIService {
    
    private final MedicoRepository medicoRepository;
    
    @Override
    public List <Medico> findAll() throws RuntimeException {
        return medicoRepository.findAll();
    }
    
    @Override
    public void save(Medico medico) throws RuntimeException, IllegalArgumentException {
        if (medico == null) {
            throw new RuntimeException("Não está preenchido");
        }
        
        if (StringUtil.isNullOrEmpty(medico.getEspecialidade()) ||
            StringUtil.isNullOrEmpty(medico.getCoren()))
        {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");
        }

        // Remove espaços extras dos campos Especialidade e Coren
        medico.setEspecialidade(StringUtil.trimExtraSpaces(medico.getEspecialidade()));
        medico.setCoren(StringUtil.trimExtraSpaces(medico.getCoren()));

        medicoRepository.save(medico);
    }
    
    @Override
    public void update(Medico medico) throws RuntimeException, IllegalArgumentException, EntityNotFoundException {
        if (medico == null) {
            throw new RuntimeException("Não está preenchido");
        }

        // Validação de campos obrigatórios
        if (StringUtil.isNullOrEmpty(medico.getEspecialidade()) ||
            StringUtil.isNullOrEmpty(medico.getCoren()))
        {
            throw new IllegalArgumentException("Preencha os campos obrigatórios");
        }

        // Verifica se os medicos existe no banco
        if (findById(medico.getId()) == null) {
            throw new EntityNotFoundException("O Medico com o ID: " + medico.getId() + " não pode ser encontrado");
        }

        // Remove espaços extras dos campos
        medico.setEspecialidade(StringUtil.trimExtraSpaces(medico.getEspecialidade()));
        medico.setCoren(StringUtil.trimExtraSpaces(medico.getCoren()));

        medicoRepository.save(medico);
    }
    
    public void delete(Medico medico) throws RuntimeException, EntityNotFoundException {
        if (medico == null) {
            throw new RuntimeException("Preencha os dados");
        }

        // Verifica se o funcionário existe antes de excluir
        if (findById(medico.getId()) == null) {
            throw new EntityNotFoundException("Medico com o ID: " + medico.getId() + " não pode ser encontrado");
        }

        medicoRepository.delete(medico);
    }

    @Override
    public Medico findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("Medico não encontrado");
        }
        return medicoRepository.findById(id).orElse(null);
    }
}
