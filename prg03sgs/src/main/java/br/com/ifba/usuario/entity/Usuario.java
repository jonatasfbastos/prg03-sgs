package br.com.ifba.usuario.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario extends PersistenceEntity implements Serializable {

    //O nome não pode ser nulo.
    @Column(name = "nome", nullable = false)
    private String nome;
    //O email deve ser único e não pode ser nulo.
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    //A senha não pode ser nula.
    @Column(name = "senha", nullable = false)
    private String senha;
    //O nível de acesso não pode ser nulo.
    @Column(name = "nivel_acesso", nullable = false)
    private String nivelAcesso;
}
