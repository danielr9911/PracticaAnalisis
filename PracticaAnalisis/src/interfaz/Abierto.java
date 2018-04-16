/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Daniel Rendon M
 */
public class Abierto extends javax.swing.JFrame {

    /**
     * Creates new form Abierto
     */
    public Abierto() {
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

        botonPuntoFijo = new javax.swing.JButton();
        botonNewton = new javax.swing.JButton();
        botonSecante = new javax.swing.JButton();
        botonRaicesMultiples = new javax.swing.JButton();
        botonRegresarMetodosAbiertos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonPuntoFijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonPuntoFijo.png"))); // NOI18N
        botonPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(botonPuntoFijo);
        botonPuntoFijo.setBounds(180, 300, 630, 100);

        botonNewton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonNewton.png"))); // NOI18N
        botonNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNewtonActionPerformed(evt);
            }
        });
        getContentPane().add(botonNewton);
        botonNewton.setBounds(180, 410, 630, 110);

        botonSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonSecante.png"))); // NOI18N
        botonSecante.setToolTipText("");
        getContentPane().add(botonSecante);
        botonSecante.setBounds(180, 530, 630, 110);

        botonRaicesMultiples.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonRaicesMultiples.png"))); // NOI18N
        botonRaicesMultiples.setToolTipText("");
        getContentPane().add(botonRaicesMultiples);
        botonRaicesMultiples.setBounds(177, 639, 630, 110);

        botonRegresarMetodosAbiertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarMetodosAbiertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarMetodosAbiertosActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarMetodosAbiertos);
        botonRegresarMetodosAbiertos.setBounds(90, 110, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MetodosAbiertos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 1140, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNewtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonNewtonActionPerformed

    private void botonRegresarMetodosAbiertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarMetodosAbiertosActionPerformed
        // TODO add your handling code here:
        Ecuaciones1Var ec = new Ecuaciones1Var();
        ec.setVisible(true);
        ec.setSize(1024,768);
        ec.setResizable(false);
        ec.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarMetodosAbiertosActionPerformed

    private void botonPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoFijoActionPerformed
        // TODO add your handling code here:
        PuntoFijo pf = new PuntoFijo();
        pf.setVisible(true);
        pf.setSize(1024,768);
        pf.setResizable(false);
        pf.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonPuntoFijoActionPerformed

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
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Abierto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNewton;
    private javax.swing.JButton botonPuntoFijo;
    private javax.swing.JButton botonRaicesMultiples;
    private javax.swing.JButton botonRegresarMetodosAbiertos;
    private javax.swing.JButton botonSecante;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
