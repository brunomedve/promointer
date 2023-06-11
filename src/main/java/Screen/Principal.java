/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screen;

import Aplication.ModeloTelaPrincipal;

/**
 *
 * @author bruno
 */
public class Principal extends javax.swing.JFrame {
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public void recebeTituloOferta(ModeloTelaPrincipal model) {

        lbbloco1.setText(model.getTituloOferta());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSugerirOferta = new javax.swing.JButton();
        lbbloco1 = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSugerirOferta.setContentAreaFilled(false);
        btnSugerirOferta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSugerirOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSugerirOfertaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSugerirOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 70, 190, 40));

        lbbloco1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbbloco1.setLabelFor(lbbloco1);
        lbbloco1.setText("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        lbbloco1.setToolTipText("");
        lbbloco1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbbloco1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbbloco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 140, 110));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PromoInter - Principal.png"))); // NOI18N
        lbBackground.setText("jLabel1");
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSugerirOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSugerirOfertaActionPerformed
        CadastroOferta telaCadastroOferta = new CadastroOferta();
        telaCadastroOferta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSugerirOfertaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSugerirOferta;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbbloco1;
    // End of variables declaration//GEN-END:variables
}