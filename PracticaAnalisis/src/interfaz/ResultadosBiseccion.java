/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author carlosruiz
 */
public class ResultadosBiseccion extends javax.swing.JFrame {

    /**
     * Creates new form ResultadosBiseccion
     */
    public ResultadosBiseccion() {
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

        valorInicialIntervaloABiseccion = new javax.swing.JTextField();
        valorInicialIntervaloBBiseccion = new javax.swing.JTextField();
        iteracionesBiseccion = new javax.swing.JTextField();
        toleranciaBiseccion = new javax.swing.JTextField();
        botonRegresarResultadosBiseccion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        valorInicialIntervaloABiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(valorInicialIntervaloABiseccion);
        valorInicialIntervaloABiseccion.setBounds(230, 80, 240, 50);

        valorInicialIntervaloBBiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(valorInicialIntervaloBBiseccion);
        valorInicialIntervaloBBiseccion.setBounds(230, 130, 240, 50);

        iteracionesBiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(iteracionesBiseccion);
        iteracionesBiseccion.setBounds(680, 80, 240, 50);

        toleranciaBiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        toleranciaBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranciaBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(toleranciaBiseccion);
        toleranciaBiseccion.setBounds(680, 130, 240, 50);

        botonRegresarResultadosBiseccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarResultadosBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarResultadosBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarResultadosBiseccion);
        botonRegresarResultadosBiseccion.setBounds(40, 50, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Resultado Biseccion.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toleranciaBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranciaBiseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toleranciaBiseccionActionPerformed

    private void botonRegresarResultadosBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarResultadosBiseccionActionPerformed
        // TODO add your handling code here:
        Biseccion biseccion = new Biseccion();
        biseccion.setVisible(true);
        biseccion.setSize(1024,768);
        biseccion.setResizable(false);
        biseccion.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarResultadosBiseccionActionPerformed

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
            java.util.logging.Logger.getLogger(ResultadosBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadosBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadosBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadosBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadosBiseccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresarResultadosBiseccion;
    private javax.swing.JTextField iteracionesBiseccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField toleranciaBiseccion;
    private javax.swing.JTextField valorInicialIntervaloABiseccion;
    private javax.swing.JTextField valorInicialIntervaloBBiseccion;
    // End of variables declaration//GEN-END:variables
}
