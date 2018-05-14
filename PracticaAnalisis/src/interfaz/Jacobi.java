/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practicaanalisis.Funcion;
import practicaanalisis.Metodos;
import practicaanalisis.Metodos2;

/**
 *
 * @author carlosruiz
 */
public class Jacobi extends javax.swing.JFrame {

    private static java.text.DecimalFormat sf = new java.text.DecimalFormat("0.#E0"); 
    /**
     * Creates new form Jacobi
     */
    public Jacobi() {
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
        iteracionesJacobi = new javax.swing.JTextField();
        toleranciaJacobi = new javax.swing.JTextField();
        regresarJacobi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lamdaJacobi = new javax.swing.JTextField();
        normaInfinito = new javax.swing.JRadioButton();
        normaEuclidiana = new javax.swing.JRadioButton();
        botonCalcular = new javax.swing.JButton();
        ayudaLamba = new javax.swing.JButton();
        ayudaJacobi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        iteracionesJacobi.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(iteracionesJacobi);
        iteracionesJacobi.setBounds(360, 210, 510, 40);

        toleranciaJacobi.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(toleranciaJacobi);
        toleranciaJacobi.setBounds(360, 290, 510, 40);

        regresarJacobi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        regresarJacobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarJacobiActionPerformed(evt);
            }
        });
        getContentPane().add(regresarJacobi);
        regresarJacobi.setBounds(140, 70, 80, 80);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(174, 10, 5));
        jLabel2.setText("λ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 350, 40, 40);

        lamdaJacobi.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(lamdaJacobi);
        lamdaJacobi.setBounds(280, 355, 590, 40);

        buttonGroup1.add(normaInfinito);
        getContentPane().add(normaInfinito);
        normaInfinito.setBounds(405, 415, 30, 23);

        buttonGroup1.add(normaEuclidiana);
        getContentPane().add(normaEuclidiana);
        normaEuclidiana.setBounds(865, 415, 30, 23);

        botonCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalcularBoton.png"))); // NOI18N
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(botonCalcular);
        botonCalcular.setBounds(540, 520, 370, 100);

        ayudaLamba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaLamba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaLambaActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaLamba);
        ayudaLamba.setBounds(205, 345, 50, 50);

        ayudaJacobi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ayuda.png"))); // NOI18N
        ayudaJacobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaJacobiActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaJacobi);
        ayudaJacobi.setBounds(730, 50, 110, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jacobi.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ayudaJacobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaJacobiActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Jacobi", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaJacobi.png")));
    }//GEN-LAST:event_ayudaJacobiActionPerformed

    private void regresarJacobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarJacobiActionPerformed
        // TODO add your handling code here:
        MetodosIterativos metodosIterativos = new MetodosIterativos();
        metodosIterativos.setVisible(true);
        metodosIterativos.setSize(1024,768);
        metodosIterativos.setResizable(false);
        metodosIterativos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_regresarJacobiActionPerformed

    private void ayudaLambaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaLambaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - λ", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaLambda.png")));
    }//GEN-LAST:event_ayudaLambaActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        // TODO add your handling code here:
        double lambda = 0;
        double tol = 0;
        int iter = 0;
        boolean camposCorrectos = true;
        
        try{
            lambda = Double.parseDouble(lamdaJacobi.getText());
            tol = Double.parseDouble(toleranciaJacobi.getText());
            iter = Integer.parseInt(iteracionesJacobi.getText());
        }catch(Exception e){
            camposCorrectos = false;
        }
        
        if(iter <= 0 && tol <= 0 && (lambda < 0 || lambda > 2)){
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese información correcta a los campos, como un número mayor que cero para iteraciones y número mayor de cero para la tolerancia");
            camposCorrectos = false;
        }else if(iter <= 0){    
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un número mayor que cero para iteraciones");
            camposCorrectos = false;
        } else if(tol <= 0){
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un número mayor de cero para la tolerancia");
            camposCorrectos = false;
        }else if(lambda < 0 || lambda > 2){
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese un número mayor a 0 y menor a 2 para el valor de lambda");
            camposCorrectos = false; 
        }else{
            camposCorrectos = true;
        }
        
        normaInfinito.setActionCommand("0");
        normaEuclidiana.setActionCommand("1");
        int err = 0;
        try{
            err = Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccionar el tipo de norma para trabajar");
            camposCorrectos = false;
        }
        
        if (camposCorrectos){
            if(Metodos2.tam != 0){
                Metodos2.jacobiRelajado(Metodos2.a, Metodos2.b, Metodos2.tam, tol, iter, lambda, Metodos2.x);
                try {
                    String s = null;
                    
                    boolean error=false;
                    while ((s = Metodos2.stdError.readLine()) != null) {
                        JOptionPane.showMessageDialog(this,s,"Error",JOptionPane.ERROR_MESSAGE);
                        error=true;
                    } 
                    if(!error){
                        String output = "";
                        while ((s = Metodos2.stdOutput.readLine()) != null) {
                            System.out.println(s);
                            output = output + (s + "\n");
                        }
                        //INTERPRETAR S
                        String[] arrOutput = output.split("!");
                        
                        System.out.println(Arrays.toString(arrOutput));
                        String resultadoX = arrOutput[arrOutput.length-1];
                        Double[][] tabla = new Double[arrOutput.length][Metodos2.tam+2];
                        for (int i = 0; i < arrOutput.length-1; i++) {
                            String temp = arrOutput[i];
                            System.out.println(temp);
                            temp = temp.replaceAll("\n", " ");
                            System.out.println(temp);
                            temp = temp.replace("[", "");
                            System.out.println(temp);
                            temp = temp.replace("]", "");
                            System.out.println(temp);
                            temp = temp.replace(",", "");
                            System.out.println(temp);
                            temp = temp.replaceAll("\\s+"," ");
                            System.out.println(temp);
                            
                            temp = temp.replace(" ", "!");
                            if(temp.charAt(0) == '!'){
                                temp = temp.substring(1,temp.length());
                            }
                            if(temp.charAt(temp.length()-1) == '!'){
                                temp = temp.substring(0,temp.length()-1);
                            }
                            //temp = temp.substring(1,temp.length()-1);
                            System.out.println(temp);
                            String[] arrTemp = temp.split("!");
                            
                            System.out.println(Arrays.toString(arrTemp));
                            
                            for (int j = 0; j < arrTemp.length; j++) {
                                
                                tabla[i][j] = Double.parseDouble(arrTemp[j]);
                            }
                            
                            
                            
                            
                            //String[] sFila = arrOutput[i].split("\n");
                            //Double[] fila = new Double[Metodos2.tam+2];
                            
                            //System.out.println(Arrays.toString(sFila));
                            
                        }
                    
                    }
                }catch (IOException ex) {
                    Logger.getLogger(Jacobi.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingresar una función F(x) y F'(x) válida para ejecutar el método");
            }
        }
    }//GEN-LAST:event_botonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jacobi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayudaJacobi;
    private javax.swing.JButton ayudaLamba;
    private javax.swing.JButton botonCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField iteracionesJacobi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lamdaJacobi;
    private javax.swing.JRadioButton normaEuclidiana;
    private javax.swing.JRadioButton normaInfinito;
    private javax.swing.JButton regresarJacobi;
    private javax.swing.JTextField toleranciaJacobi;
    // End of variables declaration//GEN-END:variables
}
