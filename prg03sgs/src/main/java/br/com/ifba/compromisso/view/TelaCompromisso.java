/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.compromisso.view;

// Importações necessárias
import javax.swing.*;
import br.com.ifba.compromisso.service.CompromissoService;
import br.com.ifba.compromisso.entity.Compromisso;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.HeadlessException;
/**
 *
 * @author hiane
 */

/**
 * Tela grafica para gerenciamento de
compromissos
 */
public class TelaCompromisso extends javax.swing.JFrame {

    // Serviço para gerenciar os compromissos
    private final CompromissoService compromissoService = new CompromissoService();

    // Componentes da tela
    private JTextField txtTitulo;
    private JTextField txtDescricao;
    private JTextField txtDataHora;
    private JTextField txtLocal;
    private JButton btnSalvar;
    private JButton btnListar;
    private JTextArea txtAreaCompromissos;
    
    /**
     * Construtor da tela
     */
    public TelaCompromisso() {
        initComponents();

}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   /** public void initComponents() {
        setTitle("Gestão de Compromissos");
        setSize(400, 400);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Layout manual

        // Criando e posicionando componentes
        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(20, 20, 80, 25);
        add(lblTitulo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(100, 20, 200, 25);
        add(txtTitulo);

        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(20, 60, 80, 25);
        add(lblDescricao);

        txtDescricao = new JTextField();
        txtDescricao.setBounds(100, 60, 200, 25);
        add(txtDescricao);

        JLabel lblDataHora = new JLabel("Data e Hora:");
        lblDataHora.setBounds(20, 100, 80, 25);
        add(lblDataHora);

        txtDataHora = new JTextField();
        txtDataHora.setBounds(100, 100, 200, 25);
        add(txtDataHora);

        JLabel lblLocal = new JLabel("Local:");
        lblLocal.setBounds(20, 140, 80, 25);
        add(lblLocal);

        txtLocal = new JTextField();
        txtLocal.setBounds(100, 140, 200, 25);
        add(txtLocal);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(100, 180, 100, 30);
        add(btnSalvar);

        btnListar = new JButton("Listar");
        btnListar.setBounds(210, 180, 100, 30);
        add(btnListar);

        txtAreaCompromissos = new JTextArea();
        txtAreaCompromissos.setBounds(20, 220, 350, 120);
        add(txtAreaCompromissos);

        // Adicionando ações aos botões
        btnSalvar.addActionListener(evt -> salvarCompromisso());
        
        btnListar.addActionListener(evt -> listarCompromissos());
    }
**/
    // Método para salvar um compromisso
    private void salvarCompromisso() {
        try {
            String titulo = txtTitulo.getText();
            String descricao = txtDescricao.getText();
            String dataHoraStr = txtDataHora.getText();
            String local = txtLocal.getText();

            // Formata a data e hora
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dataHora = LocalDateTime.parse(dataHoraStr, formatter);

            // Cria o compromisso e salva
            Compromisso compromisso = new Compromisso(0, titulo, descricao, dataHora, local);
            compromissoService.adicionarCompromisso(compromisso);

            JOptionPane.showMessageDialog(this, "Compromisso salvo com sucesso!");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar compromisso. Verifique o formato da data e hora (yyyy-MM-dd HH:mm).");
        }
    }

    // Método para listar compromissos na tela
    private void listarCompromissos() {
        txtAreaCompromissos.setText("");
        for (Compromisso c : compromissoService.listarCompromissos()) {
            txtAreaCompromissos.append(c.getTitulo() + " - " + c.getDataHora().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + "\n");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaCompromisso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
