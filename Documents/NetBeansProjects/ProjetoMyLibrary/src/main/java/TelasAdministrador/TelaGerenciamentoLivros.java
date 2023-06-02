/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelasAdministrador;

import Classes.GerenciamentoLivros;


/**
 *
 * @author Igor
 */
public class TelaGerenciamentoLivros extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciamentoUsuarios
     */
    public TelaGerenciamentoLivros() {
        super("Gerenciamento de Livros");
        initComponents();
        this.setLocationRelativeTo(null);
        GerenciamentoLivros gl = new GerenciamentoLivros();
        gl.mostrarLivros(tableLivros);
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
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIncluirLivros = new javax.swing.JButton();
        btnModificarLivros = new javax.swing.JButton();
        btnExcluirLivros = new javax.swing.JButton();
        btnVoltarLivros = new javax.swing.JButton();
        txtIdLivro = new javax.swing.JTextField();
        txtDisponivel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtReservado = new javax.swing.JTextField();
        txtEmprestadoPara = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Livros"));

        jLabel1.setText("Título:");

        jLabel2.setText("Autor:");

        jLabel3.setText("Disponível:");

        btnIncluirLivros.setText("Incluir");
        btnIncluirLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirLivrosActionPerformed(evt);
            }
        });

        btnModificarLivros.setText("Modificar");
        btnModificarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLivrosActionPerformed(evt);
            }
        });

        btnExcluirLivros.setText("Excluir");
        btnExcluirLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivrosActionPerformed(evt);
            }
        });

        btnVoltarLivros.setText("Voltar");
        btnVoltarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLivrosActionPerformed(evt);
            }
        });

        txtIdLivro.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        jLabel4.setText("Reservado:");

        txtEmprestadoPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmprestadoParaActionPerformed(evt);
            }
        });

        jLabel5.setText("Emprestado para:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVoltarLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificarLivros, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAutor)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDisponivel)
                                    .addComponent(txtReservado)
                                    .addComponent(txtEmprestadoPara))))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIncluirLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReservado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmprestadoPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txtIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIncluirLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarLivros)
                    .addComponent(btnExcluirLivros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltarLivros)
                .addGap(16, 16, 16))
        );

        tableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLivros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirLivrosActionPerformed
        GerenciamentoLivros gu = new GerenciamentoLivros();
        gu.inserirLivros(txtTitulo, txtAutor);
        gu.mostrarLivros(tableLivros);
    }//GEN-LAST:event_btnIncluirLivrosActionPerformed

    private void tableLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLivrosMouseClicked
        GerenciamentoLivros gu = new GerenciamentoLivros();
        gu.selecionarLivros(tableLivros, txtIdLivro, txtTitulo, txtAutor, txtDisponivel, txtReservado, txtEmprestadoPara);
    }//GEN-LAST:event_tableLivrosMouseClicked

    private void btnModificarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLivrosActionPerformed
        GerenciamentoLivros gu = new GerenciamentoLivros();
        gu.modificarLivros(txtTitulo, txtAutor, txtDisponivel, txtReservado, txtEmprestadoPara, txtIdLivro);
        gu.mostrarLivros(tableLivros);
    }//GEN-LAST:event_btnModificarLivrosActionPerformed

    private void btnExcluirLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivrosActionPerformed
        GerenciamentoLivros gu = new GerenciamentoLivros();
        gu.excluirLivros(txtIdLivro);
        gu.mostrarLivros(tableLivros);
    }//GEN-LAST:event_btnExcluirLivrosActionPerformed

    private void btnVoltarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLivrosActionPerformed
        this.dispose();
        TelaMenuAdministrador tma = new TelaMenuAdministrador();
        tma.setVisible(true);
    }//GEN-LAST:event_btnVoltarLivrosActionPerformed

    private void txtEmprestadoParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmprestadoParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmprestadoParaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciamentoLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirLivros;
    private javax.swing.JButton btnIncluirLivros;
    private javax.swing.JButton btnModificarLivros;
    private javax.swing.JButton btnVoltarLivros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLivros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDisponivel;
    private javax.swing.JTextField txtEmprestadoPara;
    private javax.swing.JTextField txtIdLivro;
    private javax.swing.JTextField txtReservado;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
