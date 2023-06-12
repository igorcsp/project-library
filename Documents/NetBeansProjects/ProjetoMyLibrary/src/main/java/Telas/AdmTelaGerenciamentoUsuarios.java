/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Cadastrar;
import Classes.GerenciamentoUsuarios;

/**
 *
 * @author Igor
 */
public class AdmTelaGerenciamentoUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciamentoUsuarios
     */
    public AdmTelaGerenciamentoUsuarios() {
        super("Gerenciamento de Usuários");
        initComponents();
        this.setLocationRelativeTo(null);
        GerenciamentoUsuarios gu = new GerenciamentoUsuarios();
        gu.mostrarUsuarios(tableUsuarios);
        
        txtIdGerenc.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCpfGerenc = new javax.swing.JTextField();
        txtNomeGerenc = new javax.swing.JTextField();
        txtTelefoneGerenc = new javax.swing.JTextField();
        txtEmailGerenc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEnderecoGerenc = new javax.swing.JTextField();
        txtComplementoGerenc = new javax.swing.JTextField();
        txtSenhaGerenc = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnIncluirGerenc = new javax.swing.JButton();
        btnModificarGerenc = new javax.swing.JButton();
        btnExcluirGerenc = new javax.swing.JButton();
        btnVoltarGerenc = new javax.swing.JButton();
        txtIdGerenc = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Usuários"));

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Senha:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("E-mail:");

        jLabel6.setText("Endereço:");

        jLabel7.setText("Comp:");

        btnIncluirGerenc.setText("Incluir");
        btnIncluirGerenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirGerencActionPerformed(evt);
            }
        });

        btnModificarGerenc.setText("Modificar");
        btnModificarGerenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGerencActionPerformed(evt);
            }
        });

        btnExcluirGerenc.setText("Excluir");
        btnExcluirGerenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirGerencActionPerformed(evt);
            }
        });

        btnVoltarGerenc.setText("Voltar");
        btnVoltarGerenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarGerencActionPerformed(evt);
            }
        });

        txtIdGerenc.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        btnLimpar.setText("Limpar campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIncluirGerenc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltarGerenc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificarGerenc, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeGerenc)
                                    .addComponent(txtCpfGerenc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtComplementoGerenc)
                                    .addComponent(txtEnderecoGerenc)
                                    .addComponent(txtEmailGerenc)
                                    .addComponent(txtTelefoneGerenc)
                                    .addComponent(txtSenhaGerenc, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(9, 9, 9))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenhaGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplementoGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(btnIncluirGerenc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarGerenc)
                    .addComponent(btnExcluirGerenc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltarGerenc)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirGerencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirGerencActionPerformed
        GerenciamentoUsuarios gu = new GerenciamentoUsuarios();
        Cadastrar cadastrar = new Cadastrar();
        cadastrar.inserirCadastro(txtCpfGerenc, txtNomeGerenc, txtSenhaGerenc, txtTelefoneGerenc, txtEmailGerenc, txtEnderecoGerenc, txtComplementoGerenc);
        gu.mostrarUsuarios(tableUsuarios);
        
        txtIdGerenc.setText("");
        txtCpfGerenc.setText("");
        txtNomeGerenc.setText("");
        txtSenhaGerenc.setText("");
        txtTelefoneGerenc.setText("");
        txtEmailGerenc.setText("");
        txtEnderecoGerenc.setText("");
        txtComplementoGerenc.setText("");
    }//GEN-LAST:event_btnIncluirGerencActionPerformed

    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuariosMouseClicked
        GerenciamentoUsuarios gu = new GerenciamentoUsuarios();
        gu.selecionarUsuarios(tableUsuarios, txtIdGerenc, txtCpfGerenc, txtNomeGerenc, txtSenhaGerenc, txtTelefoneGerenc, txtEmailGerenc, txtEnderecoGerenc, txtComplementoGerenc);
    }//GEN-LAST:event_tableUsuariosMouseClicked

    private void btnModificarGerencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGerencActionPerformed
        GerenciamentoUsuarios gu = new GerenciamentoUsuarios();
        gu.modificarUsuarios(txtCpfGerenc, txtNomeGerenc, txtSenhaGerenc, txtTelefoneGerenc, txtEmailGerenc, txtEnderecoGerenc, txtComplementoGerenc, txtIdGerenc);
        gu.mostrarUsuarios(tableUsuarios);
        
        txtIdGerenc.setText("");
        txtCpfGerenc.setText("");
        txtNomeGerenc.setText("");
        txtSenhaGerenc.setText("");
        txtTelefoneGerenc.setText("");
        txtEmailGerenc.setText("");
        txtEnderecoGerenc.setText("");
        txtComplementoGerenc.setText("");
    }//GEN-LAST:event_btnModificarGerencActionPerformed

    private void btnExcluirGerencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirGerencActionPerformed
        GerenciamentoUsuarios gu = new GerenciamentoUsuarios();
        gu.excluirUsuarios(txtIdGerenc, txtCpfGerenc);
        gu.mostrarUsuarios(tableUsuarios);
        
        txtIdGerenc.setText("");
        txtCpfGerenc.setText("");
        txtNomeGerenc.setText("");
        txtSenhaGerenc.setText("");
        txtTelefoneGerenc.setText("");
        txtEmailGerenc.setText("");
        txtEnderecoGerenc.setText("");
        txtComplementoGerenc.setText("");
    }//GEN-LAST:event_btnExcluirGerencActionPerformed

    private void btnVoltarGerencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarGerencActionPerformed
        this.dispose();
        AdmTelaMenuAdministrador tma = new AdmTelaMenuAdministrador();
        tma.setVisible(true);
    }//GEN-LAST:event_btnVoltarGerencActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtIdGerenc.setText("");
        txtCpfGerenc.setText("");
        txtNomeGerenc.setText("");
        txtSenhaGerenc.setText("");
        txtTelefoneGerenc.setText("");
        txtEmailGerenc.setText("");
        txtEnderecoGerenc.setText("");
        txtComplementoGerenc.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(AdmTelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmTelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmTelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmTelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmTelaGerenciamentoUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirGerenc;
    private javax.swing.JButton btnIncluirGerenc;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnModificarGerenc;
    private javax.swing.JButton btnVoltarGerenc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTextField txtComplementoGerenc;
    private javax.swing.JTextField txtCpfGerenc;
    private javax.swing.JTextField txtEmailGerenc;
    private javax.swing.JTextField txtEnderecoGerenc;
    private javax.swing.JTextField txtIdGerenc;
    private javax.swing.JTextField txtNomeGerenc;
    private javax.swing.JPasswordField txtSenhaGerenc;
    private javax.swing.JTextField txtTelefoneGerenc;
    // End of variables declaration//GEN-END:variables
}
