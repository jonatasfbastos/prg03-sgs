/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.funcionarios.view;

import br.com.ifba.Prg03sgsApplication;
import br.com.ifba.funcionarios.controller.FuncionariosIController;
import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.funcionarios.view.TelaAdicionarFuncionario;
import br.com.ifba.funcionarios.view.TelaEditarFuncionarios;
import jakarta.annotation.PostConstruct;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Rafael
 */
@Component
public class TelaFuncionarios extends javax.swing.JFrame {
    
    @Autowired
    private FuncionariosIController funcionariosController; 
    
    {
        initComponents();
    }
    
    @PostConstruct
    public void init() {
        mostrarTabela();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloFuncionarios = new javax.swing.JLabel();
        lblTextoNomeFuncionario = new javax.swing.JLabel();
        txtBuscarFuncionarios = new javax.swing.JTextField();
        lblLinhaSelect = new javax.swing.JLabel();
        lblLinhaSelecionada = new javax.swing.JLabel();
        btnAdicionarFuncionario = new javax.swing.JButton();
        btnEditarFuncionario = new javax.swing.JButton();
        btnAtualizarFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnRemoverFuncionario1 = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloFuncionarios.setBackground(new java.awt.Color(0, 0, 153));
        lblTituloFuncionarios.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTituloFuncionarios.setText("FUNCINÁRIOS");
        getContentPane().add(lblTituloFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, -1));

        lblTextoNomeFuncionario.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTextoNomeFuncionario.setText("Informe o nome do Funcionario:");
        getContentPane().add(lblTextoNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtBuscarFuncionarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscarFuncionarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarFuncionariosKeyPressed(evt);
            }
        });
        getContentPane().add(txtBuscarFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, -1));

        lblLinhaSelect.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLinhaSelect.setText("Linha Selecionada:");
        getContentPane().add(lblLinhaSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        lblLinhaSelecionada.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLinhaSelecionada.setText("0");
        getContentPane().add(lblLinhaSelecionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        btnAdicionarFuncionario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAdicionarFuncionario.setText("Adicionar");
        btnAdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        btnEditarFuncionario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEditarFuncionario.setText("Editar");
        btnEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        btnAtualizarFuncionario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtualizarFuncionario.setText("Atualizar");
        btnAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cpf", "Telefone", "Aniversario", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFuncionarios);
        if (tblFuncionarios.getColumnModel().getColumnCount() > 0) {
            tblFuncionarios.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnRemoverFuncionario1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRemoverFuncionario1.setText("Remover");
        btnRemoverFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFuncionario1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverFuncionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFuncionariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarFuncionariosKeyPressed
       
    }//GEN-LAST:event_txtBuscarFuncionariosKeyPressed

    private void btnAdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFuncionarioActionPerformed
        ConfigurableApplicationContext context = (ConfigurableApplicationContext) 
            SpringApplication.run(Prg03sgsApplication.class);
        
        TelaAdicionarFuncionario telaCriar = context.getBean(TelaAdicionarFuncionario.class);
        telaCriar.setDefaultCloseOperation(TelaFuncionarios.DISPOSE_ON_CLOSE);
        telaCriar.setVisible(true);
    }//GEN-LAST:event_btnAdicionarFuncionarioActionPerformed

    private void btnEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncionarioActionPerformed
        ConfigurableApplicationContext context = (ConfigurableApplicationContext) 
            SpringApplication.run(Prg03sgsApplication.class);
        
        TelaEditarFuncionarios telaEditar = context.getBean(TelaEditarFuncionarios.class);
        telaEditar.setDefaultCloseOperation(TelaFuncionarios.DISPOSE_ON_CLOSE);
        telaEditar.setVisible(true);
    }//GEN-LAST:event_btnEditarFuncionarioActionPerformed

    private void btnAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncionarioActionPerformed
        mostrarTabela();
    }//GEN-LAST:event_btnAtualizarFuncionarioActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnRemoverFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFuncionario1ActionPerformed
        
        int linhaSelecionada = tblFuncionarios.getSelectedRow();
    
        
        if (linhaSelecionada != -1) {
            
            long idFuncionarios = (long) tblFuncionarios.getValueAt(linhaSelecionada, 0);
            Funcionarios funcionarios = funcionariosController.findById(idFuncionarios);
            funcionariosController.delete(funcionarios);
            
            DefaultTableModel tableModel = (DefaultTableModel) tblFuncionarios.getModel();
            tableModel.removeRow(linhaSelecionada);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um curso para excluir.");
        }
    }//GEN-LAST:event_btnRemoverFuncionario1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void mostrarTabela () {
        
        List<Funcionarios> funcionarios = funcionariosController.findAll();
   
        DefaultTableModel tableModel = (DefaultTableModel) tblFuncionarios.getModel();
        tableModel.setRowCount(0);

        // Adiciona os funcionarios à tabela
        for (Funcionarios funcionario : funcionarios) {
            tableModel.addRow(new Object[]{
            funcionario.getNome(),
            funcionario.getCpf(),
            funcionario.getTelefone(),
            funcionario.getId(),
            });
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarFuncionario;
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JButton btnEditarFuncionario;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemoverFuncionario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLinhaSelecionada;
    private javax.swing.JLabel lblLinhaSelect;
    private javax.swing.JLabel lblTextoNomeFuncionario;
    private javax.swing.JLabel lblTituloFuncionarios;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtBuscarFuncionarios;
    // End of variables declaration//GEN-END:variables
}
