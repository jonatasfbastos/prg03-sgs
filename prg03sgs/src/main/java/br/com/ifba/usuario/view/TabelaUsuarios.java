package br.com.ifba.usuario.view;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;
//Modelo abstrato de tabela (Vinculado a JFrame).

public class TabelaUsuarios extends AbstractTableModel {

    private List<Usuario> listaUsuarios;

    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_EMAIL = 2;
    private final int COL_SENHA = 3;
    private final int COL_NIVELACESSO = 4;

    //Armazena todos os cursos cadastrados em uma lista, que funcionará como as linhas da JTable.
    public TabelaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //Obtém a quantidade de linhas na JTable.
    @Override
    public int getRowCount() {
        return this.listaUsuarios.size();
    }

    //Obtém a quantidade de colunas na JTable.
    @Override
    public int getColumnCount() {
        return 5;
    }

    //Cria as colunas da JTable.
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case COL_ID:
                return "ID";
            case COL_NOME:
                return "Nome";
            case COL_EMAIL:
                return "Email";
            case COL_SENHA:
                return "Senha";
            case COL_NIVELACESSO:
                return "Nível de Acesso";
            default:
                break;
        }

        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = this.listaUsuarios.get(rowIndex);

        if (columnIndex == COL_ID) {
            return usuario.getId();
        } else if (columnIndex == COL_NOME) {
            return usuario.getNome();
        } else if (columnIndex == COL_EMAIL) {
            return usuario.getEmail();
        } else if (columnIndex == COL_SENHA) {
            return usuario.getSenha();
        } else if (columnIndex == COL_NIVELACESSO) {
            return usuario.getNivelAcesso();
        }

        return "-";
    }

    //Pega as informações de um curso cadastrado em determinada linha da JTable.
    public Usuario getObjetoUsuario(int row) {
        return this.listaUsuarios.get(row);
    }
}
