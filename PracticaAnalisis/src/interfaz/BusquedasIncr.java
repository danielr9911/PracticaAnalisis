/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import practicaanalisis.Funcion;
import static practicaanalisis.Funcion.callFunction;
import practicaanalisis.Metodos;

/**
 *
 * @author Daniel Rendon M
 */
public class BusquedasIncr extends javax.swing.JFrame {
    private static java.text.DecimalFormat sf = new java.text.DecimalFormat("0.#E0");

    /**
     * Creates new form BusquedasIncr
     */
    public BusquedasIncr() {
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

        textXo = new javax.swing.JTextField();
        textDelta = new javax.swing.JTextField();
        textIter = new javax.swing.JTextField();
        botonRegresar = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        botonCalcularBusquedas = new javax.swing.JButton();
        funcionesBusquedasIncrementales = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textXo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textXo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textXoActionPerformed(evt);
            }
        });
        getContentPane().add(textXo);
        textXo.setBounds(240, 300, 590, 50);

        textDelta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(textDelta);
        textDelta.setBounds(270, 390, 560, 50);

        textIter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(textIter);
        textIter.setBounds(370, 490, 460, 50);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(40, 40, 80, 80);

        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ayuda.png"))); // NOI18N
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(botonAyuda);
        botonAyuda.setBounds(860, 100, 110, 110);

        botonCalcularBusquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalcularBoton.png"))); // NOI18N
        botonCalcularBusquedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularBusquedasActionPerformed(evt);
            }
        });
        getContentPane().add(botonCalcularBusquedas);
        botonCalcularBusquedas.setBounds(500, 620, 370, 100);

        funcionesBusquedasIncrementales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonMisFunciones.png"))); // NOI18N
        funcionesBusquedasIncrementales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionesBusquedasIncrementalesActionPerformed(evt);
            }
        });
        getContentPane().add(funcionesBusquedasIncrementales);
        funcionesBusquedasIncrementales.setBounds(165, 625, 300, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BusquedasIncrementales.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textXoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textXoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textXoActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        Ecuaciones1Var ec = new Ecuaciones1Var();
        ec.setVisible(true);
        ec.setSize(1024,768);
        ec.setResizable(false);
        ec.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Busquedas incrementales", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/Busquedas Incrementales Ayuda.png")));
    }//GEN-LAST:event_botonAyudaActionPerformed

    private void botonCalcularBusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularBusquedasActionPerformed
        // TODO add your handling code here:
        double x0 = 0;
        double delta = 0;
        int iter = 0;
        boolean camposCorrectos = true;
        
        try{
            x0 = Double.parseDouble(textXo.getText());
            delta = Double.parseDouble(textDelta.getText());       
            iter = Integer.parseInt(textIter.getText());
        }catch(Exception e){
            camposCorrectos = false;
        }
        
        if(iter <= 0 && delta == 0){
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese información correcta a los campos, como un número mayor que cero para iteraciones y número diferente de cero para el delta");
            camposCorrectos = false;
        }else if(iter <= 0){    
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un número mayor que cero para iteraciones");
            camposCorrectos = false;
        } else if(delta == 0){
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un número diferente de cero para el delta");
            camposCorrectos = false;
        } else{
            camposCorrectos = true;
        }
        
        if (camposCorrectos){
            if(Funcion.f != ""){
                String mensaje = "";
                boolean correct = false;
                Double[][] data = null;
                double fxi = callFunction("f", x0);       
                if (fxi == 0){
                    mensaje = x0 + " es una raiz";               
                }else {
                    Metodos.busquedas_incrementales(x0, delta, iter);
                    //Resultados
                    data = Metodos.data;
                    Object[][] newData = formatearData(data);
                    mensaje = Metodos.mens;

                    ResultadosBusquedas resultadosBusquedas = new ResultadosBusquedas(x0, delta, iter, newData, mensaje);
                    resultadosBusquedas.setVisible(true);
                    resultadosBusquedas.setSize(1024,768);
                    resultadosBusquedas.setResizable(false);
                    resultadosBusquedas.setLocationRelativeTo(null);
                    dispose();
                    correct = true;
                }
                if (!correct){
                    JOptionPane.showMessageDialog(rootPane, mensaje);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Por favor ingresar una función F(x) válida para ejecutar el método");
            }
        }
    }//GEN-LAST:event_botonCalcularBusquedasActionPerformed

    private void funcionesBusquedasIncrementalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionesBusquedasIncrementalesActionPerformed
        // TODO add your handling code here:
        Funciones func = new Funciones("busquedasincrementales");
        func.setVisible(true);
        func.setSize(1024,768);
        func.setResizable(false);
        func.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_funcionesBusquedasIncrementalesActionPerformed

    private Object[][] formatearData(Double[][] data) {
        Object[][] newData = new Object[data.length][];
        for(int i = 0; i < data.length; i++){
            newData[i] = new Object[3];
            newData[i][0] = data[i][0].intValue();
            newData[i][1] = data[i][1];
            newData[i][2] = sf.format(data[i][2]);
        }
        return newData;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonCalcularBusquedas;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton funcionesBusquedasIncrementales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textDelta;
    private javax.swing.JTextField textIter;
    private javax.swing.JTextField textXo;
    // End of variables declaration//GEN-END:variables
}
