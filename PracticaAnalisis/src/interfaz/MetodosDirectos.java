/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import practicaanalisis.Metodos2;

/**
 *
 * @author carlosruiz
 */
public class MetodosDirectos extends javax.swing.JFrame {

    /**
     * Creates new form MetodosDirectos
     */
    public MetodosDirectos() {
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
        regresarMetodosDirectos = new javax.swing.JButton();
        miMatriz = new javax.swing.JButton();
        calcularMetodosDirectos = new javax.swing.JButton();
        simple = new javax.swing.JRadioButton();
        pivoteoParcial = new javax.swing.JRadioButton();
        pivoteoTotal = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        ayudaSimple = new javax.swing.JButton();
        ayudaPivoteoParcial = new javax.swing.JButton();
        ayudaPivoteoTotal = new javax.swing.JButton();
        ayudaCrout = new javax.swing.JButton();
        ayudaDoolittle = new javax.swing.JButton();
        ayudaCholesky = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        regresarMetodosDirectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        regresarMetodosDirectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMetodosDirectosActionPerformed(evt);
            }
        });
        getContentPane().add(regresarMetodosDirectos);
        regresarMetodosDirectos.setBounds(50, 60, 80, 80);

        miMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonMiMatriz.png"))); // NOI18N
        miMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(miMatriz);
        miMatriz.setBounds(200, 640, 300, 90);

        calcularMetodosDirectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonCalcularPequeno.png"))); // NOI18N
        calcularMetodosDirectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularMetodosDirectosActionPerformed(evt);
            }
        });
        getContentPane().add(calcularMetodosDirectos);
        calcularMetodosDirectos.setBounds(510, 640, 300, 90);

        buttonGroup1.add(simple);
        simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleActionPerformed(evt);
            }
        });
        getContentPane().add(simple);
        simple.setBounds(280, 285, 30, 23);

        buttonGroup1.add(pivoteoParcial);
        getContentPane().add(pivoteoParcial);
        pivoteoParcial.setBounds(620, 285, 28, 23);

        buttonGroup1.add(pivoteoTotal);
        getContentPane().add(pivoteoTotal);
        pivoteoTotal.setBounds(910, 285, 28, 23);

        buttonGroup1.add(jRadioButton1);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(270, 525, 28, 23);

        buttonGroup1.add(jRadioButton4);
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(560, 525, 28, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setToolTipText("");
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(860, 525, 28, 23);

        ayudaSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaSimpleActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaSimple);
        ayudaSimple.setBounds(130, 270, 50, 50);

        ayudaPivoteoParcial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaPivoteoParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaPivoteoParcialActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaPivoteoParcial);
        ayudaPivoteoParcial.setBounds(375, 270, 50, 50);

        ayudaPivoteoTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaPivoteoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaPivoteoTotalActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaPivoteoTotal);
        ayudaPivoteoTotal.setBounds(685, 270, 50, 50);

        ayudaCrout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaCrout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaCroutActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaCrout);
        ayudaCrout.setBounds(135, 505, 50, 50);

        ayudaDoolittle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaDoolittle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaDoolittleActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaDoolittle);
        ayudaDoolittle.setBounds(385, 505, 50, 50);

        ayudaCholesky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaCholesky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaCholeskyActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaCholesky);
        ayudaCholesky.setBounds(690, 505, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MetodosDirectos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMetodosDirectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMetodosDirectosActionPerformed
        // TODO add your handling code here:
        SistemasEcuaciones se = new SistemasEcuaciones();
        se.setVisible(true);
        se.setSize(1024,768);
        se.setResizable(false);
        se.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_regresarMetodosDirectosActionPerformed

    private void calcularMetodosDirectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularMetodosDirectosActionPerformed
        // TODO add your handling code here:
        simple.setActionCommand("0");
        pivoteoParcial.setActionCommand("1");
        pivoteoTotal.setActionCommand("2");
        jRadioButton1.setActionCommand("3");
        jRadioButton4.setActionCommand("4");
        jRadioButton5.setActionCommand("5");
        int metodo = Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        
        switch(metodo){
            case 0:
                //Simple
                
                break;
            case 1:
                //Parcial
                Metodos2.pivoteoParcial(Metodos2.a, Metodos2.b, Metodos2.tam);
                break;
            case 2:
                //Total
                break;
            case 3:
                //Crout
                break;
            case 4:
                //Doolittle
                break;
            case 5:
                //Cholesky
                break;
            default:
                break;
                
                
        }
        
        ResultadosMetodosDirectos resultadosMetodosDirectos = new ResultadosMetodosDirectos();
        resultadosMetodosDirectos.setVisible(true);
        resultadosMetodosDirectos.setSize(1024,768);
        resultadosMetodosDirectos.setResizable(false);
        resultadosMetodosDirectos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_calcularMetodosDirectosActionPerformed

    private void simpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpleActionPerformed

    private void miMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMatrizActionPerformed
        // TODO add your handling code here:
        MiMatriz miMatriz = new MiMatriz();
        miMatriz.setVisible(true);
        miMatriz.setSize(1024,768);
        miMatriz.setResizable(false);
        miMatriz.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_miMatrizActionPerformed

    private void ayudaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaSimpleActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Simple", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaSimple.png")));
    }//GEN-LAST:event_ayudaSimpleActionPerformed

    private void ayudaPivoteoParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaPivoteoParcialActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Pivoteo Parcial", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaPivoteoParcial.png")));
    }//GEN-LAST:event_ayudaPivoteoParcialActionPerformed

    private void ayudaPivoteoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaPivoteoTotalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Pivoteo Total", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaPivoteoTotal.png")));
    }//GEN-LAST:event_ayudaPivoteoTotalActionPerformed

    private void ayudaCroutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaCroutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Crout", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaCrout.png")));
    }//GEN-LAST:event_ayudaCroutActionPerformed

    private void ayudaDoolittleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaDoolittleActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Doolittle", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaDoolittle.png")));
    }//GEN-LAST:event_ayudaDoolittleActionPerformed

    private void ayudaCholeskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaCholeskyActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Cholesky", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaCholesky.png")));
    }//GEN-LAST:event_ayudaCholeskyActionPerformed

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
            java.util.logging.Logger.getLogger(MetodosDirectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodosDirectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodosDirectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodosDirectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodosDirectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayudaCholesky;
    private javax.swing.JButton ayudaCrout;
    private javax.swing.JButton ayudaDoolittle;
    private javax.swing.JButton ayudaPivoteoParcial;
    private javax.swing.JButton ayudaPivoteoTotal;
    private javax.swing.JButton ayudaSimple;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcularMetodosDirectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JButton miMatriz;
    private javax.swing.JRadioButton pivoteoParcial;
    private javax.swing.JRadioButton pivoteoTotal;
    private javax.swing.JButton regresarMetodosDirectos;
    private javax.swing.JRadioButton simple;
    // End of variables declaration//GEN-END:variables
}
