package br.com.ifba.perfilusuario.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.usuario.entity.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "perfis_usuario")
@Getter
@Setter
public class PerfilUsuario extends PersistenceEntity implements Serializable {
    //O nome não pode ser nulo.
    @Column(name = "nome", nullable = false)
    private String nome;
    //A descrição não pode ser nula.
    @Column(name = "descricao", nullable = false)
    private String descricao;
    //Relação com a classe Usuário (Cada perfil pertence a um único usuário).
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)//Chave estrangeira (Foreign Key) que liga as tabelas "usuarios" e "perfis_usuario" (O campo "usuario_id" ficará na tabela "perfis_usuario").
    private Usuario usuario;
    //Método ToString para exibir o nome do perfil de usuário no cbxUserProfile.
    @Override
    public String toString(){
        return nome;
    }
}
