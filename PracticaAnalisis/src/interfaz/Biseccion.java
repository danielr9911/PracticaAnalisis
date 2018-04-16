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
public class Biseccion extends javax.swing.JFrame {

    /**
     * Creates new form Biseccion
     */
    public Biseccion() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        xSuperiorBiseccion = new javax.swing.JTextField();
        xInferiorBiseccion = new javax.swing.JTextField();
        iteracionesBiseccion = new javax.swing.JTextField();
        toleranciaBiseccion = new javax.swing.JTextField();
        botonRegresar = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        botonCalcularBiseccion = new javax.swing.JButton();
        errorRelBiseccion = new javax.swing.JRadioButton();
        errorABSBiseccion = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        xSuperiorBiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        xSuperiorBiseccion.setSize(new java.awt.Dimension(290, 50));
        xSuperiorBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xSuperiorBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(xSuperiorBiseccion);
        xSuperiorBiseccion.setBounds(480, 300, 260, 50);

        xInferiorBiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        xInferiorBiseccion.setSize(new java.awt.Dimension(290, 50));
        xInferiorBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xInferiorBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(xInferiorBiseccion);
        xInferiorBiseccion.setBounds(480, 230, 260, 50);

        iteracionesBiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        iteracionesBiseccion.setSize(new java.awt.Dimension(290, 50));
        getContentPane().add(iteracionesBiseccion);
        iteracionesBiseccion.setBounds(480, 380, 290, 50);

        toleranciaBiseccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        toleranciaBiseccion.setSize(new java.awt.Dimension(290, 50));
        getContentPane().add(toleranciaBiseccion);
        toleranciaBiseccion.setBounds(480, 450, 260, 50);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(130, 80, 80, 80);

        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ayuda.png"))); // NOI18N
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(botonAyuda);
        botonAyuda.setBounds(840, 60, 110, 110);

        botonCalcularBiseccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalcularBoton.png"))); // NOI18N
        botonCalcularBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(botonCalcularBiseccion);
        botonCalcularBiseccion.setBounds(340, 650, 370, 100);

        buttonGroup1.add(errorRelBiseccion);
        errorRelBiseccion.setToolTipText("");
        errorRelBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorRelBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(errorRelBiseccion);
        errorRelBiseccion.setBounds(890, 590, 30, 30);

        buttonGroup1.add(errorABSBiseccion);
        errorABSBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorABSBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(errorABSBiseccion);
        errorABSBiseccion.setBounds(430, 590, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Biseccion Pagina Principal.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xSuperiorBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xSuperiorBiseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xSuperiorBiseccionActionPerformed

    private void xInferiorBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xInferiorBiseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xInferiorBiseccionActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        Intervalo inter = new Intervalo();
        inter.setVisible(true);
        inter.setSize(1024,768);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Biseccion", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/Biseccion Ayuda.png")));
    }//GEN-LAST:event_botonAyudaActionPerformed

    private void botonCalcularBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularBiseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCalcularBiseccionActionPerformed

    private void errorRelBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorRelBiseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorRelBiseccionActionPerformed

    private void errorABSBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorABSBiseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorABSBiseccionActionPerformed
    
    private void groupButton(){
        ButtonGroup bgroup = new ButtonGroup();
        
        bgroup.add(errorABSBiseccion);
        bgroup.add(errorRelBiseccion);
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
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biseccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonCalcularBiseccion;
    private javax.swing.JButton botonRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton errorABSBiseccion;
    private javax.swing.JRadioButton errorRelBiseccion;
    private javax.swing.JTextField iteracionesBiseccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField toleranciaBiseccion;
    private javax.swing.JTextField xInferiorBiseccion;
    private javax.swing.JTextField xSuperiorBiseccion;
    // End of variables declaration//GEN-END:variables
}
