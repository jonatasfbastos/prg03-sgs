/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba;

import br.com.ifba.atendimento.view.TelaAtendimento;
import br.com.ifba.medicamento.controller.MedicamentoIController;
import br.com.ifba.medicamento.view.TelaMedicamento;
import br.com.ifba.prontuario.view.TelaProntuario;
import br.com.ifba.usuario.controller.UsuarioIController;
import br.com.ifba.usuario.view.TelaUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Glauber
 */
@Component
@RequiredArgsConstructor
public class TelaInicial extends javax.swing.JFrame {

    private final MedicamentoIController medicamentoController;
    private final UsuarioIController usuarioController;
    
    @Autowired
    private ApplicationContext context;
    
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMedicamentos = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
<<<<<<< HEAD
        btnVisitas = new javax.swing.JButton();
=======
        btnAtendimentos = new javax.swing.JButton();
>>>>>>> b5d6d240b246d2a375c758846f2c66ab948707b4

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMedicamentos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });

        btnProntuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnProntuario.setText("Prontuario");
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnUsuarios.setText("Usuários");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnVisitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVisitas.setText("Visitas");
        btnVisitas.setActionCommand("Visitas");
        btnVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitasActionPerformed(evt);
=======
        btnAtendimentos.setText("Atendimentos");
        btnAtendimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtendimentosActionPerformed(evt);
>>>>>>> b5d6d240b246d2a375c758846f2c66ab948707b4
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(btnAtendimentos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedicamentos)
                    .addComponent(btnAtendimentos))
                .addGap(18, 18, 18)
                .addComponent(btnProntuario)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnVisitas)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*
    *  Chama a tela de medicamentos
    */
    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        // TODO add your handling code here:
        TelaMedicamento telaMedicamento = new TelaMedicamento(medicamentoController);
        telaMedicamento.setVisible(true);
        telaMedicamento.init();
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        // TODO add your handling code here:
        TelaProntuario telaProntuario = new TelaProntuario();
        telaProntuario.setDefaultCloseOperation(TelaInicial.DISPOSE_ON_CLOSE);
        telaProntuario.setVisible(true);
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        TelaUsuario telaUsuario = new TelaUsuario(usuarioController);
        telaUsuario.setVisible(true);
        telaUsuario.carregarTela();
    }//GEN-LAST:event_btnUsuariosActionPerformed

<<<<<<< HEAD
    private void btnVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisitasActionPerformed
=======
    private void btnAtendimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtendimentosActionPerformed
        //Abre a janela de cadastro do curso ao clicar no botão btnCadastrarCurso
        TelaAtendimento telaAtendimento = context.getBean(TelaAtendimento.class);
        telaAtendimento.setDefaultCloseOperation(TelaAtendimento.DISPOSE_ON_CLOSE);
        telaAtendimento.setVisible(true);
    }//GEN-LAST:event_btnAtendimentosActionPerformed
>>>>>>> b5d6d240b246d2a375c758846f2c66ab948707b4

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
                 TelaInicial telaInicial = new TelaInicial(medicamentoController, usuarioController);
                 telaInicial.setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtendimentos;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVisitas;
    // End of variables declaration//GEN-END:variables
}
