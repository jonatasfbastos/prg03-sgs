package br.com.ifba.usuario.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
public class Usuario extends PersistenceEntity{
    @Column(name = "nome", nullable = false)
    @Getter
    @Setter
    private String nome;
    
    @Column(name = "email", nullable = false, unique = true)
    @Getter
    @Setter
    private String email;
    
    @Column(name = "senha", nullable = false)
    @Getter
    @Setter
    private String senha;
}
