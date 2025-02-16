/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba;

import br.com.ifba.medicamento.controller.MedicamentoIController;
import br.com.ifba.usuario.controller.UsuarioIController;
import br.com.ifba.atendimento.view.TelaAtendimento;
import br.com.ifba.campanhavacina.view.GestaoCampanhaVacina;
import br.com.ifba.fornecedor.controller.FornecedorIController;
import br.com.ifba.fornecedor.view.TelaFornecedor;
import br.com.ifba.medicamento.controller.MedicamentoIController;
import br.com.ifba.medicamento.view.TelaMedicamento;
import br.com.ifba.prontuario.view.TelaProntuario;
import br.com.ifba.usuario.controller.UsuarioIController;
import br.com.ifba.usuario.view.TelaUsuario;
import br.com.ifba.visita.controller.VisitaIController;
import br.com.ifba.visita.view.TelaVisitas;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author sunhe
 */

@Component
@RequiredArgsConstructor
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
    private final MedicamentoIController medicamentoController;
    private final UsuarioIController usuarioController;
    //private final VisitaIController visitaController;
    private final FornecedorIController fornecedorController;
    
    @Autowired
    private ApplicationContext context;
    
    {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //public TelaInicial() {
        //initComponents();
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloSistema = new javax.swing.JLabel();
        btnAtendimentos = new javax.swing.JButton();
        btnMedicamentos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProntuarios = new javax.swing.JButton();
        btnVisitas = new javax.swing.JButton();
        btnCampanhaDeVacina = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloSistema.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTituloSistema.setText("SISTEMA DE GESTÃO DE SAÚDE");

        btnAtendimentos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtendimentos.setText("Atendimentos");
        btnAtendimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtendimentosActionPerformed(evt);
            }
        });

        btnMedicamentos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnUsuarios.setText("Usuários");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnProntuarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnProntuarios.setText("Prontuário");
        btnProntuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuariosActionPerformed(evt);
            }
        });

        btnVisitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVisitas.setText("Visitas");
        btnVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitasActionPerformed(evt);
            }
        });

        btnCampanhaDeVacina.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCampanhaDeVacina.setText("Campanha Vacina");
        btnCampanhaDeVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampanhaDeVacinaActionPerformed(evt);
            }
        });

        btnFornecedores.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnFornecedores.setText("Fornecedores");
        btnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCampanhaDeVacina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtendimentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMedicamentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFornecedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProntuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTituloSistema)
                        .addGap(205, 205, 205))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtendimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCampanhaDeVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProntuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    *  Chama a tela de medicamentos
    */
    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        // TODO add your handling code here:
        TelaMedicamento telaMedicamento = new TelaMedicamento(medicamentoController, fornecedorController);
        telaMedicamento.setVisible(true);
        telaMedicamento.init();
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnAtendimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtendimentosActionPerformed
        //Abre a janela de cadastro do curso ao clicar no botão btnCadastrarCurso
        TelaAtendimento telaAtendimento = context.getBean(TelaAtendimento.class);
        telaAtendimento.setDefaultCloseOperation(TelaAtendimento.DISPOSE_ON_CLOSE);
        telaAtendimento.setVisible(true);
    }//GEN-LAST:event_btnAtendimentosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        TelaUsuario telaUsuario = new TelaUsuario(usuarioController);
        telaUsuario.setVisible(true);
        telaUsuario.carregarTela();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnProntuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuariosActionPerformed
        // TODO add your handling code here:
        TelaProntuario telaProntuario = new TelaProntuario();
        telaProntuario.setDefaultCloseOperation(TelaInicial.DISPOSE_ON_CLOSE);
        telaProntuario.setVisible(true);
    }//GEN-LAST:event_btnProntuariosActionPerformed

    private void btnVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitasActionPerformed
        // TODO add your handling code here:
        TelaVisitas telaVisita = new TelaVisitas();
        telaVisita.setDefaultCloseOperation(TelaInicial.DISPOSE_ON_CLOSE);
        telaVisita.setVisible(true);
        
    }//GEN-LAST:event_btnVisitasActionPerformed

    private void btnCampanhaDeVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampanhaDeVacinaActionPerformed
        // TODO add your handling code here:
        GestaoCampanhaVacina telaGestaoCampanhaVacina = context.getBean(GestaoCampanhaVacina.class);
        
        telaGestaoCampanhaVacina.setDefaultCloseOperation(GestaoCampanhaVacina.DISPOSE_ON_CLOSE);
        telaGestaoCampanhaVacina.setVisible(true);
    }//GEN-LAST:event_btnCampanhaDeVacinaActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        TelaFornecedor telaFornecedor = new TelaFornecedor(fornecedorController);
        telaFornecedor.setVisible(true);
        telaFornecedor.init();
    }//GEN-LAST:event_btnFornecedoresActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 MedicamentoIController medicamentoController = null;
                 UsuarioIController usuarioController = null;
                 FornecedorIController fornecedorController = null;
                 TelaInicial telaInicial = new TelaInicial(medicamentoController, usuarioController, fornecedorController);
                 telaInicial.setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtendimentos;
    private javax.swing.JButton btnCampanhaDeVacina;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnProntuarios;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVisitas;
    private javax.swing.JLabel lblTituloSistema;
    // End of variables declaration//GEN-END:variables
}
