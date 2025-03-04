package br.com.ifba.usuario.entity;

import br.com.ifba.compromisso.entity.Compromisso;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.perfilusuario.entity.PerfilUsuario;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    //O perfil de usuário não pode ser nulo.
    @Column(name = "perfil_usuario", nullable = false)
    private PerfilUsuario perfilUsuario;
    //Relação com a classe Compromisso (Um usuário pode ter vários compromissos).
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Compromisso> compromissos = new ArrayList<>();
    //Relação com a classe PerfilUsuario (Um usuário pode ter vários perfis).
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PerfilUsuario> perfisUsuario = new ArrayList<>();
}
