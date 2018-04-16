/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author pedrosalzedo
 */
public class PuntoFijo extends javax.swing.JFrame {

    /**
     * Creates new form PuntoFijo
     */
    public PuntoFijo() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        xInicialPuntoFijo = new javax.swing.JTextField();
        iteracionesPuntoFijo = new javax.swing.JTextField();
        toleranciaPuntoFijo = new javax.swing.JTextField();
        errorABSPuntoFijo = new javax.swing.JRadioButton();
        errorRelPuntoFijo = new javax.swing.JRadioButton();
        botonRegresarPuntoFijo = new javax.swing.JButton();
        ayudaPuntoFijo = new javax.swing.JButton();
        calcularPuntoFijo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        xInicialPuntoFijo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(xInicialPuntoFijo);
        xInicialPuntoFijo.setBounds(410, 230, 300, 50);

        iteracionesPuntoFijo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        iteracionesPuntoFijo.setSize(new java.awt.Dimension(300, 50));
        getContentPane().add(iteracionesPuntoFijo);
        iteracionesPuntoFijo.setBounds(410, 310, 300, 50);

        toleranciaPuntoFijo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        toleranciaPuntoFijo.setSize(new java.awt.Dimension(300, 50));
        getContentPane().add(toleranciaPuntoFijo);
        toleranciaPuntoFijo.setBounds(410, 400, 300, 50);

        buttonGroup1.add(errorABSPuntoFijo);
        errorABSPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorABSPuntoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(errorABSPuntoFijo);
        errorABSPuntoFijo.setBounds(430, 520, 28, 23);

        buttonGroup1.add(errorRelPuntoFijo);
        errorRelPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorRelPuntoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(errorRelPuntoFijo);
        errorRelPuntoFijo.setBounds(840, 520, 28, 23);

        botonRegresarPuntoFijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarPuntoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarPuntoFijo);
        botonRegresarPuntoFijo.setBounds(70, 70, 80, 80);

        ayudaPuntoFijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ayuda.png"))); // NOI18N
        ayudaPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaPuntoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaPuntoFijo);
        ayudaPuntoFijo.setBounds(880, 50, 110, 110);

        calcularPuntoFijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalcularBoton.png"))); // NOI18N
        calcularPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPuntoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(calcularPuntoFijo);
        calcularPuntoFijo.setBounds(320, 640, 380, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoFijo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void errorABSPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorABSPuntoFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorABSPuntoFijoActionPerformed

    private void errorRelPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorRelPuntoFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorRelPuntoFijoActionPerformed

    private void calcularPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPuntoFijoActionPerformed
        // TODO add your handling code here:
        ResultadosPuntoFijo RpuntoFijo = new ResultadosPuntoFijo();
        RpuntoFijo.setVisible(true);
        RpuntoFijo.setSize(1024,768);
        RpuntoFijo.setResizable(false);
        RpuntoFijo.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_calcularPuntoFijoActionPerformed

    private void botonRegresarPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarPuntoFijoActionPerformed
        // TODO add your handling code here:
        Abierto abiertos = new Abierto();
        abiertos.setVisible(true);
        abiertos.setSize(1024,768);
        abiertos.setResizable(false);
        abiertos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarPuntoFijoActionPerformed

    private void ayudaPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaPuntoFijoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Punto Fijo", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/Punto Fijo Ayuda.png")));
    }//GEN-LAST:event_ayudaPuntoFijoActionPerformed

    private void groupButton(){
        ButtonGroup bgroup = new ButtonGroup();
        
        bgroup.add(errorABSPuntoFijo);
        bgroup.add(errorRelPuntoFijo);
    }
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
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntoFijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayudaPuntoFijo;
    private javax.swing.JButton botonRegresarPuntoFijo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcularPuntoFijo;
    private javax.swing.JRadioButton errorABSPuntoFijo;
    private javax.swing.JRadioButton errorRelPuntoFijo;
    private javax.swing.JTextField iteracionesPuntoFijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField toleranciaPuntoFijo;
    private javax.swing.JTextField xInicialPuntoFijo;
    // End of variables declaration//GEN-END:variables
}