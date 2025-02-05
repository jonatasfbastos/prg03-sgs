/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.agentevisita.repository;


import br.com.ifba.agentevisita.entity.AgenteVisita;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunhe
 */
/*
Interface do repositorio da Entidade Agente Visita para a fucionalidade
Gestão de Visitas Domiciliares e territoriais.
*/


@Repository
public interface AgenteVisitaRepository extends JpaRepository<AgenteVisita, Long>{
    
    public abstract List <AgenteVisita> findByNome(String nome);
    
}
