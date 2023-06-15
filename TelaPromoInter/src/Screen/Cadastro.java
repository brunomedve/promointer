/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screen;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
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

        txtNomeCompleto = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        checkMostarSenha = new javax.swing.JCheckBox();
        btnFacebook = new javax.swing.JButton();
        btnGoogle = new javax.swing.JButton();
        btnCriarConta = new javax.swing.JButton();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1445, 916));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomeCompleto.setBackground(new java.awt.Color(68, 68, 68));
        txtNomeCompleto.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        txtNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeCompleto.setBorder(null);
        txtNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 460, 40));

        txtEmail.setBackground(new java.awt.Color(68, 68, 68));
        txtEmail.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 460, 40));

        txtSenha.setBackground(new java.awt.Color(68, 68, 68));
        txtSenha.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(null);
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 460, 40));

        checkMostarSenha.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        checkMostarSenha.setForeground(new java.awt.Color(67, 221, 134));
        checkMostarSenha.setText("Mostrar Senha");
        checkMostarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkMostarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMostarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(checkMostarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        btnFacebook.setContentAreaFilled(false);
        btnFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 660, 70, 70));

        btnGoogle.setContentAreaFilled(false);
        btnGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoogleActionPerformed(evt);
            }
        });
        getContentPane().add(btnGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 660, 70, 70));

        btnCriarConta.setContentAreaFilled(false);
        btnCriarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 780, 180, 70));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PromoInter - Cadastro.png"))); // NOI18N
        lbBackground.setText("jLabel1");
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoogleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoogleActionPerformed

    private void checkMostarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMostarSenhaActionPerformed
        if (checkMostarSenha.isSelected()) {
            txtSenha.setEchoChar((char) 0);
        } else {
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_checkMostarSenhaActionPerformed

    private void txtNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCompletoActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        if (!txtNomeCompleto.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtSenha.getText().isEmpty()) {
            Login telaDeLogin = new Login();
            telaDeLogin.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Cadastro Incompleto");
        }


    }//GEN-LAST:event_btnCriarContaActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnGoogle;
    private javax.swing.JCheckBox checkMostarSenha;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
