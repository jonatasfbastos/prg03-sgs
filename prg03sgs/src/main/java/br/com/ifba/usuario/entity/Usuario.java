package br.com.ifba.usuario.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
//import br.com.ifba.nivelacesso.entity.NivelAcesso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
public class Usuario extends PersistenceEntity{
    //O nome não pode ser nulo.
    @Column(name = "nome", nullable = false)
    @Getter
    @Setter
    private String nome;
    //O email deve ser único e não pode ser nulo.
    @Column(name = "email", nullable = false, unique = true)
    @Getter
    @Setter
    private String email;
    //A senha não pode ser nula.
    @Column(name = "senha", nullable = false)
    @Getter
    @Setter
    private String senha;
    //O nível de acesso não pode ser nulo.
    /*@Column(name = "nivel_acesso", nullable = false)
    @Getter
    @Setter
    private NivelAcesso nivelAcesso;*/
}
