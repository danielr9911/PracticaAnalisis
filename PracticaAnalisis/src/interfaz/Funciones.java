/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import practicaanalisis.Funcion;

/**
 *
 * @author Daniel Rendon M
 */
public class Funciones extends javax.swing.JFrame {
    static private String metodo = "";
    /**
     * Creates new form Funciones
     * @param met
     */
    public Funciones(String met) {
        initComponents();
        if (met == "nada"){
            regresarMetodo.setVisible(false);
        }else{
            metodo = met;
        }
        fx.setText(Funcion.f);
        fPrimaX.setText(Funcion.df);
        fDoblePrimaX.setText(Funcion.ddf);
        gx.setText(Funcion.g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fx = new javax.swing.JTextField();
        botonGuardarFunciones = new javax.swing.JButton();
        botonRegresarFunciones = new javax.swing.JButton();
        gx = new javax.swing.JTextField();
        fPrimaX = new javax.swing.JTextField();
        fDoblePrimaX = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        regresarMetodo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fx.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(fx);
        fx.setBounds(230, 290, 660, 50);

        botonGuardarFunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarBoton.png"))); // NOI18N
        botonGuardarFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarFuncionesActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardarFunciones);
        botonGuardarFunciones.setBounds(570, 620, 370, 100);

        botonRegresarFunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarFuncionesActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarFunciones);
        botonRegresarFunciones.setBounds(50, 100, 80, 80);

        gx.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(gx);
        gx.setBounds(230, 360, 660, 50);

        fPrimaX.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(fPrimaX);
        fPrimaX.setBounds(230, 430, 660, 50);

        fDoblePrimaX.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(fDoblePrimaX);
        fDoblePrimaX.setBounds(230, 510, 660, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ayuda.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(890, 20, 110, 110);

        regresarMetodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegresarMetodo.png"))); // NOI18N
        regresarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMetodoActionPerformed(evt);
            }
        });
        getContentPane().add(regresarMetodo);
        regresarMetodo.setBounds(120, 615, 430, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Funciones.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarFuncionesActionPerformed
        // TODO add your handling code here:
        Ecuaciones1Var ec = new Ecuaciones1Var();
        ec.setVisible(true);
        ec.setSize(1024,768);
        ec.setResizable(false);
        ec.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarFuncionesActionPerformed

    private void botonGuardarFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarFuncionesActionPerformed
        // TODO add your handling code here:
        String funF = fx.getText();
        String funDF = fPrimaX.getText();
        String funDDF = fDoblePrimaX.getText();
        String funG = gx.getText();
        
        Funcion.setF(funF);
        Funcion.setDF(funDF);
        Funcion.setDDF(funDDF);
        Funcion.setG(funG);
        
        JOptionPane.showMessageDialog(rootPane, "Funciones guardadas exitosamente");
    }//GEN-LAST:event_botonGuardarFuncionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Funciones", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/FuncionesAyuda.png")));
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regresarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMetodoActionPerformed
        // TODO add your handling code here:
        switch (metodo){
            case "busquedasincrementales":
                BusquedasIncr bi = new BusquedasIncr();
                bi.setVisible(true);
                bi.setSize(1024,768);
                bi.setResizable(false);
                bi.setLocationRelativeTo(null);
                dispose();
                break;
            case "biseccion":
                Biseccion biseccion = new Biseccion();
                biseccion.setVisible(true);
                biseccion.setSize(1024,768);
                biseccion.setResizable(false);
                biseccion.setLocationRelativeTo(null);
                dispose();
                break;
            case "reglafalsa":
                ReglaFalsa reglf = new ReglaFalsa();
                reglf.setVisible(true);
                reglf.setSize(1024,768);
                reglf.setResizable(false);
                reglf.setLocationRelativeTo(null);
                dispose();
                break;
            case "puntofijo":
                PuntoFijo pf = new PuntoFijo();
                pf.setVisible(true);
                pf.setSize(1024,768);
                pf.setResizable(false);
                pf.setLocationRelativeTo(null);
                dispose();
                break;
            case "newton":
                Newton newton = new Newton();
                newton.setVisible(true);
                newton.setSize(1024,768);
                newton.setResizable(false);
                newton.setLocationRelativeTo(null);
                dispose();
                break;
            case "secante":
                Secante secante = new Secante();
                secante.setVisible(true);
                secante.setSize(1024,768);
                secante.setResizable(false);
                secante.setLocationRelativeTo(null);
                dispose();
                break;
            case "raicesmultiples":
                RaicesMultiples raicesMultiples = new RaicesMultiples();
                raicesMultiples.setVisible(true);
                raicesMultiples.setSize(1024,768);
                raicesMultiples.setResizable(false);
                raicesMultiples.setLocationRelativeTo(null);
                dispose();
                break;
            case "graficador":
                Graficador gr = new Graficador();
                gr.setVisible(true);
                gr.setSize(1024,768);
                gr.setResizable(false);
                gr.setLocationRelativeTo(null);
                dispose();
                break;
            default:
                
                break;
            
        }
    }//GEN-LAST:event_regresarMetodoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarFunciones;
    private javax.swing.JButton botonRegresarFunciones;
    private javax.swing.JTextField fDoblePrimaX;
    private javax.swing.JTextField fPrimaX;
    private javax.swing.JTextField fx;
    private javax.swing.JTextField gx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton regresarMetodo;
    // End of variables declaration//GEN-END:variables
}
