/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.campanhavacina.view;

import br.com.ifba.campanhavacina.entity.CampanhaVacinaEntity;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.ifba.campanhavacina.controller.CampanhaVacinaIController;

/**
 *
 * @author a1591
 * 
 * View responsavel por excluir um item especifico atraves do id
 */
@Component
public class CampanhaVacinaExcluir extends javax.swing.JFrame {

    @Autowired
    private CampanhaVacinaIController campanhaVacinaController;
    
    /**
     * Creates new form CursoExcluir
     */
    public CampanhaVacinaExcluir() {
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza a janela
    }
    
    @Autowired
    private GestaoCampanhaVacina listarFrame; // Referência para o frame de listagem
    
    public CampanhaVacinaExcluir(GestaoCampanhaVacina listarFrame) {
        initComponents(); // Inicializa os componentes da interface gráfica
        this.setLocationRelativeTo(null); // Centraliza a janela
        
        this.listarFrame = listarFrame; // Recebe o frame responsável pela listagem
        
        // Adiciona um listener para detectar o fechamento da janela
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                if (listarFrame != null) {
                    listarFrame.readJTable(); // Atualiza a tabela no frame de listagem
                }
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha esta janela sem encerrar o programa
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iDCampanhaExcluir = new javax.swing.JLabel();
        textFildFindIDExcluir = new javax.swing.JTextField();
        buttonExcluirCampanha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iDCampanhaExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iDCampanhaExcluir.setText("Digite o ID :");

        textFildFindIDExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonExcluirCampanha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonExcluirCampanha.setText("Excluir");
        buttonExcluirCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirCampanhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iDCampanhaExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFildFindIDExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(buttonExcluirCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iDCampanhaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFildFindIDExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonExcluirCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirCampanhaActionPerformed
        // TODO add your handling code here:
        
        if(textFildFindIDExcluir.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    null, 
                    "PREENCHA TODOS OS CAMPOS\n", 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
        // Procura o curso pelo ID
        CampanhaVacinaEntity CampanhaExcluir = campanhaVacinaController.findById(Long.valueOf(textFildFindIDExcluir.getText()));

        // Remove o curso
        campanhaVacinaController.delete(CampanhaExcluir); 
        
        // Atualiza a tabela
        listarFrame.readJTable();
        
        JOptionPane.showMessageDialog(
                    this, 
                    "Deletado com Sucesso !\n", 
                    "Sucesso", 
                    JOptionPane.INFORMATION_MESSAGE
        );
        
    }//GEN-LAST:event_buttonExcluirCampanhaActionPerformed

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
            java.util.logging.Logger.getLogger(CampanhaVacinaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CampanhaVacinaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CampanhaVacinaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CampanhaVacinaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GestaoCampanhaVacina listarFrame = new GestaoCampanhaVacina();
                new CampanhaVacinaExcluir(listarFrame).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExcluirCampanha;
    private javax.swing.JLabel iDCampanhaExcluir;
    private javax.swing.JTextField textFildFindIDExcluir;
    // End of variables declaration//GEN-END:variables
}
