/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author pedrosalzedo
 */
public class ResultadosPuntoFijo extends javax.swing.JFrame {

    /**
     * Creates new form ResultadosPuntoFijo
     */
    public ResultadosPuntoFijo() {
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

        xInicialPuntoFijo = new javax.swing.JTextField();
        iteracionesPuntoFijo = new javax.swing.JTextField();
        toleranciaPuntoFijo = new javax.swing.JTextField();
        botonRegresarResultadosPuntoFijo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        xInicialPuntoFijo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        xInicialPuntoFijo.setSize(new java.awt.Dimension(240, 50));
        getContentPane().add(xInicialPuntoFijo);
        xInicialPuntoFijo.setBounds(240, 100, 240, 50);

        iteracionesPuntoFijo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        iteracionesPuntoFijo.setSize(new java.awt.Dimension(240, 50));
        getContentPane().add(iteracionesPuntoFijo);
        iteracionesPuntoFijo.setBounds(380, 160, 240, 50);

        toleranciaPuntoFijo.setSize(new java.awt.Dimension(240, 50));
        getContentPane().add(toleranciaPuntoFijo);
        toleranciaPuntoFijo.setBounds(680, 100, 240, 50);

        botonRegresarResultadosPuntoFijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarResultadosPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarResultadosPuntoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarResultadosPuntoFijo);
        botonRegresarResultadosPuntoFijo.setBounds(40, 30, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ResultadoPuntoFijo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarResultadosPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarResultadosPuntoFijoActionPerformed
        // TODO add your handling code here:
        PuntoFijo pf = new PuntoFijo();
        pf.setVisible(true);
        pf.setSize(1024,768);
        pf.setResizable(false);
        pf.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarResultadosPuntoFijoActionPerformed

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
            java.util.logging.Logger.getLogger(ResultadosPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadosPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadosPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadosPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadosPuntoFijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresarResultadosPuntoFijo;
    private javax.swing.JTextField iteracionesPuntoFijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField toleranciaPuntoFijo;
    private javax.swing.JTextField xInicialPuntoFijo;
    // End of variables declaration//GEN-END:variables
}
