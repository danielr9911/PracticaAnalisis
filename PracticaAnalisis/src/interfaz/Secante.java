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
public class Secante extends javax.swing.JFrame {

    /**
     * Creates new form ResultadosRaicesMultiples
     */
    public Secante() {
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
        x0Secante = new javax.swing.JTextField();
        x1Secante = new javax.swing.JTextField();
        iteracionesSecante = new javax.swing.JTextField();
        toleranciaSecante = new javax.swing.JTextField();
        botonRegresarSecante = new javax.swing.JButton();
        errorAbsSecante = new javax.swing.JRadioButton();
        errorRelSecante = new javax.swing.JRadioButton();
        calcularSecante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        x0Secante.setSize(new java.awt.Dimension(610, 45));
        add(x0Secante);
        x0Secante.setBounds(240, 210, 610, 45);

        x1Secante.setSize(new java.awt.Dimension(610, 45));
        add(x1Secante);
        x1Secante.setBounds(240, 270, 610, 45);

        iteracionesSecante.setSize(new java.awt.Dimension(480, 45));
        add(iteracionesSecante);
        iteracionesSecante.setBounds(370, 340, 480, 45);

        toleranciaSecante.setSize(new java.awt.Dimension(480, 45));
        add(toleranciaSecante);
        toleranciaSecante.setBounds(370, 410, 480, 45);

        botonRegresarSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarSecanteActionPerformed(evt);
            }
        });
        add(botonRegresarSecante);
        botonRegresarSecante.setBounds(160, 70, 80, 80);

        buttonGroup1.add(errorAbsSecante);
        add(errorAbsSecante);
        errorAbsSecante.setBounds(420, 520, 30, 23);

        buttonGroup1.add(errorRelSecante);
        add(errorRelSecante);
        errorRelSecante.setBounds(800, 520, 30, 23);

        calcularSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalcularBoton.png"))); // NOI18N
        calcularSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularSecanteActionPerformed(evt);
            }
        });
        add(calcularSecante);
        calcularSecante.setBounds(330, 600, 380, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Secante.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarSecanteActionPerformed
        // TODO add your handling code here:
        Abierto abiertos = new Abierto();
        abiertos.setVisible(true);
        abiertos.setSize(1024,768);
        abiertos.setResizable(false);
        abiertos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarSecanteActionPerformed

    private void calcularSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularSecanteActionPerformed
        // TODO add your handling code here:
        ResultadosSecante resultadosSecante = new ResultadosSecante();
        resultadosSecante.setVisible(true);
        resultadosSecante.setSize(1024,768);
        resultadosSecante.setResizable(false);
        resultadosSecante.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_calcularSecanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresarSecante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcularSecante;
    private javax.swing.JRadioButton errorAbsSecante;
    private javax.swing.JRadioButton errorRelSecante;
    private javax.swing.JTextField iteracionesSecante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField toleranciaSecante;
    private javax.swing.JTextField x0Secante;
    private javax.swing.JTextField x1Secante;
    // End of variables declaration//GEN-END:variables

}