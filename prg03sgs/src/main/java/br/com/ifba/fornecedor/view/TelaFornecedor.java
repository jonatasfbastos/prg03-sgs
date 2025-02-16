/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.fornecedor.view;

import br.com.ifba.fornecedor.controller.FornecedorIController;
import br.com.ifba.fornecedor.entity.Fornecedor;
import jakarta.annotation.PostConstruct;
import java.awt.GraphicsEnvironment;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author rober
 */
@Component
@Lazy
@RequiredArgsConstructor
public class TelaFornecedor extends javax.swing.JFrame {

    private final DefaultTableModel tabela = new DefaultTableModel(new Object[]{"ID", "CNPJ", "Razao Social", "Email", "Telefone"}, 0);
    
    private final FornecedorIController fornecedorController;
    
    private int linhaSelecionada = 0;
    /**
     * Creates new form TelaFornecedor
     */
    {
        initComponents();
    }
    
    @PostConstruct
    public void init () {
        if (!GraphicsEnvironment.isHeadless()) {
            initTable();
        }
    }
    
    private void initTable () {
        List<Fornecedor> fornecedores = fornecedorController.findAll();
        for (Fornecedor fornecedor : fornecedores) {
            tabela.addRow(new Object[]{fornecedor.getId(), fornecedor.getCnpj(), 
                fornecedor.getRazaoSocial(), fornecedor.getEmail(), fornecedor.getTelefone()});
        }
        tableFornecedor.setModel(tabela);
    }
    
    public void updateTable() {
        tabela.setRowCount(0);
        List<Fornecedor> fornecedores = fornecedorController.findAll();
        for (Fornecedor fornecedor : fornecedores) {
            tabela.addRow(new Object[]{fornecedor.getId(), fornecedor.getCnpj(), 
                fornecedor.getRazaoSocial(), fornecedor.getEmail(), fornecedor.getTelefone()});
        }
        tableFornecedor.setModel(tabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaCadastroFornecedor = new javax.swing.JFrame();
        lblCnpjCadastro = new javax.swing.JLabel();
        lblTituloCadastroForncedor1 = new javax.swing.JLabel();
        lblRazaoSocialCadastro = new javax.swing.JLabel();
        lblEmailCadastro = new javax.swing.JLabel();
        lblTelefoneCadastro = new javax.swing.JLabel();
        txtCnpjCadastro = new javax.swing.JTextField();
        txtRazaoSocialCadastro = new javax.swing.JTextField();
        txtTelefoneCadastro = new javax.swing.JTextField();
        txtEmailCadastro = new javax.swing.JTextField();
        btnFornecedorLimparCadastro = new javax.swing.JButton();
        btnFornecedorCadastro1 = new javax.swing.JButton();
        lblLinhaSelecionada = new javax.swing.JLabel();
        txtBuscarFornecedor = new javax.swing.JTextField();
        lblTextoNomeFornecedor = new javax.swing.JLabel();
        lblTextoLinhaSelecionada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFornecedor = new javax.swing.JTable();
        lblTituloFornecedor = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();

        TelaCadastroFornecedor.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        TelaCadastroFornecedor.setMinimumSize(new java.awt.Dimension(400, 294));
        TelaCadastroFornecedor.setResizable(false);
        TelaCadastroFornecedor.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                TelaCadastroFornecedorWindowClosed(evt);
            }
        });

        lblCnpjCadastro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCnpjCadastro.setText("CNPJ");

        lblTituloCadastroForncedor1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTituloCadastroForncedor1.setText("Cadastrar Fornecedor");

        lblRazaoSocialCadastro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblRazaoSocialCadastro.setText("Razão Social");

        lblEmailCadastro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblEmailCadastro.setText("Email");

        lblTelefoneCadastro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTelefoneCadastro.setText("Telefone");

        btnFornecedorLimparCadastro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnFornecedorLimparCadastro.setText("Limpar");
        btnFornecedorLimparCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorLimparCadastroActionPerformed(evt);
            }
        });

        btnFornecedorCadastro1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnFornecedorCadastro1.setText("Adicionar");
        btnFornecedorCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorCadastro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaCadastroFornecedorLayout = new javax.swing.GroupLayout(TelaCadastroFornecedor.getContentPane());
        TelaCadastroFornecedor.getContentPane().setLayout(TelaCadastroFornecedorLayout);
        TelaCadastroFornecedorLayout.setHorizontalGroup(
            TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroFornecedorLayout.createSequentialGroup()
                .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(TelaCadastroFornecedorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFornecedorLimparCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnFornecedorCadastro1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaCadastroFornecedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRazaoSocialCadastro)
                            .addComponent(lblCnpjCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmailCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelefoneCadastro, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCnpjCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRazaoSocialCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroFornecedorLayout.createSequentialGroup()
                    .addContainerGap(102, Short.MAX_VALUE)
                    .addComponent(lblTituloCadastroForncedor1)
                    .addGap(92, 92, 92)))
        );
        TelaCadastroFornecedorLayout.setVerticalGroup(
            TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroFornecedorLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCnpjCadastro)
                    .addComponent(txtCnpjCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazaoSocialCadastro)
                    .addComponent(txtRazaoSocialCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailCadastro)
                    .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneCadastro)
                    .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFornecedorLimparCadastro)
                    .addComponent(btnFornecedorCadastro1))
                .addGap(14, 14, 14))
            .addGroup(TelaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TelaCadastroFornecedorLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblTituloCadastroForncedor1)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblLinhaSelecionada.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLinhaSelecionada.setText("0");

        txtBuscarFornecedor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscarFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarFornecedorKeyPressed(evt);
            }
        });

        lblTextoNomeFornecedor.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTextoNomeFornecedor.setText("Informe o nome do Medicamento");

        lblTextoLinhaSelecionada.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTextoLinhaSelecionada.setText("Linha Selecionada");

        tableFornecedor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableFornecedor.setModel(tabela);
        tableFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableFornecedor);

        lblTituloFornecedor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTituloFornecedor.setText("FORNECEDORES");

        btnAdicionar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoNomeFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTextoLinhaSelecionada)
                        .addGap(18, 18, 18)
                        .addComponent(lblLinhaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)
                        .addGap(27, 27, 27))))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(lblTituloFornecedor)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTituloFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoNomeFornecedor)
                    .addComponent(txtBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoLinhaSelecionada)
                    .addComponent(lblLinhaSelecionada))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnAdicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarFornecedorKeyPressed

    }//GEN-LAST:event_txtBuscarFornecedorKeyPressed

    private void tableFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFornecedorMouseClicked
        linhaSelecionada = tableFornecedor.getSelectedRow();
        lblLinhaSelecionada.setText(Integer.toString(linhaSelecionada + 1));
    }//GEN-LAST:event_tableFornecedorMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        TelaCadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnFornecedorLimparCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorLimparCadastroActionPerformed
        txtCnpjCadastro.setText("");
        txtRazaoSocialCadastro.setText("");
        txtEmailCadastro.setText("");
        txtTelefoneCadastro.setText("");
    }//GEN-LAST:event_btnFornecedorLimparCadastroActionPerformed

    private void btnFornecedorCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorCadastro1ActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCnpj(txtCnpjCadastro.getText());
        fornecedor.setRazaoSocial(txtRazaoSocialCadastro.getText());
        fornecedor.setEmail(txtEmailCadastro.getText());
        fornecedor.setTelefone(txtTelefoneCadastro.getText());
        
        fornecedorController.save(fornecedor);
    }//GEN-LAST:event_btnFornecedorCadastro1ActionPerformed

    private void TelaCadastroFornecedorWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_TelaCadastroFornecedorWindowClosed
        updateTable();
    }//GEN-LAST:event_TelaCadastroFornecedorWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FornecedorIController fornecedorController = null;
                TelaFornecedor telaFornecedor = new TelaFornecedor(fornecedorController);
                telaFornecedor.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame TelaCadastroFornecedor;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnFornecedorCadastro1;
    private javax.swing.JButton btnFornecedorLimparCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCnpjCadastro;
    private javax.swing.JLabel lblEmailCadastro;
    private javax.swing.JLabel lblLinhaSelecionada;
    private javax.swing.JLabel lblRazaoSocialCadastro;
    private javax.swing.JLabel lblTelefoneCadastro;
    private javax.swing.JLabel lblTextoLinhaSelecionada;
    private javax.swing.JLabel lblTextoNomeFornecedor;
    private javax.swing.JLabel lblTituloCadastroForncedor1;
    private javax.swing.JLabel lblTituloFornecedor;
    private javax.swing.JTable tableFornecedor;
    private javax.swing.JTextField txtBuscarFornecedor;
    private javax.swing.JTextField txtCnpjCadastro;
    private javax.swing.JTextField txtEmailCadastro;
    private javax.swing.JTextField txtRazaoSocialCadastro;
    private javax.swing.JTextField txtTelefoneCadastro;
    // End of variables declaration//GEN-END:variables
}
