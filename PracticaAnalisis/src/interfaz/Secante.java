/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static practicaanalisis.Funcion.callFunction;
import practicaanalisis.Metodos;
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
        ayudaSecante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        x0Secante.setSize(new java.awt.Dimension(610, 45));
        getContentPane().add(x0Secante);
        x0Secante.setBounds(240, 210, 610, 45);

        x1Secante.setSize(new java.awt.Dimension(610, 45));
        getContentPane().add(x1Secante);
        x1Secante.setBounds(240, 270, 610, 45);

        iteracionesSecante.setSize(new java.awt.Dimension(480, 45));
        getContentPane().add(iteracionesSecante);
        iteracionesSecante.setBounds(370, 340, 480, 45);

        toleranciaSecante.setSize(new java.awt.Dimension(480, 45));
        getContentPane().add(toleranciaSecante);
        toleranciaSecante.setBounds(370, 410, 480, 45);

        botonRegresarSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarSecante);
        botonRegresarSecante.setBounds(160, 70, 80, 80);

        buttonGroup1.add(errorAbsSecante);
        errorAbsSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorAbsSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(errorAbsSecante);
        errorAbsSecante.setBounds(420, 520, 30, 23);

        buttonGroup1.add(errorRelSecante);
        getContentPane().add(errorRelSecante);
        errorRelSecante.setBounds(800, 520, 30, 23);

        calcularSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalcularBoton.png"))); // NOI18N
        calcularSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(calcularSecante);
        calcularSecante.setBounds(330, 600, 380, 100);

        ayudaSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ayuda.png"))); // NOI18N
        ayudaSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaSecante);
        ayudaSecante.setBounds(850, 60, 110, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Secante.png"))); // NOI18N
        getContentPane().add(jLabel1);
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
        double x0 = Double.parseDouble(x0Secante.getText());
        double x1 = Double.parseDouble(x1Secante.getText());
        double tol = Double.parseDouble(toleranciaSecante.getText());
        int iter = Integer.parseInt(iteracionesSecante.getText());
        errorAbsSecante.setActionCommand("0");
        errorRelSecante.setActionCommand("1");
        int err = Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        
        String mensaje ="";
        boolean correct = false;
        Double[][] data = null;
        
        double fx0 = callFunction("f", x0);
        double fx1 = callFunction("f", x1);
        
        if(fx0 == 0){
            mensaje = x0 + "es una raiz";
        }else if(fx1 == 0){
            mensaje = x1 + "es una raiz";
        }else if(iter <= 0){
            mensaje = "El numero de iteraciones debe ser mayor a cero";
        }else if(tol <=0){
            mensaje = "La tolerancia debe ser mayor a cero";
        }else{
            Metodos.secante(x0,x1,tol,iter,err);
            data = Metodos.data;
            mensaje = Metodos.mens;
            
            ResultadosSecante resultadosSecante = new ResultadosSecante(x0,x1,tol,iter,data,mensaje);
            resultadosSecante.setVisible(true);
            resultadosSecante.setSize(1024,768);
            resultadosSecante.setResizable(false);
            resultadosSecante.setLocationRelativeTo(null);
            dispose();
            correct = true;
        }
        if (!correct){
            JOptionPane.showMessageDialog(rootPane, mensaje);
        }
    }//GEN-LAST:event_calcularSecanteActionPerformed

    private void errorAbsSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorAbsSecanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorAbsSecanteActionPerformed

    private void ayudaSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaSecanteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Secante", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/SecanteAyuda.png")));
    }//GEN-LAST:event_ayudaSecanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayudaSecante;
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
