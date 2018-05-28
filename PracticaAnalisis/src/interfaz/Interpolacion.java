/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicaanalisis.Metodos2;

/**
 *
 * @author Daniel Rendon M
 */
public class Interpolacion extends javax.swing.JFrame {

    /**
     * Creates new form Interpolacion
     */
    //int n = 0;
    public static String tabla;
    public static String resultado;
    public static String polinomio;
    public static String tablaIni;
    public static String tablaFin;
    
    public Interpolacion() {
        initComponents();
        jTextField1.setText(String.valueOf(Metodos2.nPuntos));
        jTextField2.setText(String.valueOf(Metodos2.valorX));
        if(Metodos2.nPuntos != 0){
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                Metodos2.puntos,
                new String [Metodos2.nPuntos]
            ));
            
        }else{
            jTable1.setVisible(false); 
        }
        
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
        botonRegresar = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        ayudaNewtonInterpolacion = new javax.swing.JButton();
        ayudaLagrange = new javax.swing.JButton();
        ayudaSplineLineal = new javax.swing.JButton();
        ayudaSplineCuadratico = new javax.swing.JButton();
        ayudaSplineCubico = new javax.swing.JButton();
        newtonInterpolacion = new javax.swing.JRadioButton();
        lagrange = new javax.swing.JRadioButton();
        splineLineal = new javax.swing.JRadioButton();
        splineCuadratico = new javax.swing.JRadioButton();
        splineCubico = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        actualizarN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        ayudaNeville = new javax.swing.JButton();
        neville = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(140, 70, 80, 80);

        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalcularBoton.png"))); // NOI18N
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular);
        calcular.setBounds(310, 640, 370, 100);

        ayudaNewtonInterpolacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaNewtonInterpolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaNewtonInterpolacionActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaNewtonInterpolacion);
        ayudaNewtonInterpolacion.setBounds(110, 455, 50, 50);

        ayudaLagrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaLagrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaLagrangeActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaLagrange);
        ayudaLagrange.setBounds(355, 455, 50, 50);

        ayudaSplineLineal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaSplineLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaSplineLinealActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaSplineLineal);
        ayudaSplineLineal.setBounds(110, 550, 50, 50);

        ayudaSplineCuadratico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaSplineCuadratico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaSplineCuadraticoActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaSplineCuadratico);
        ayudaSplineCuadratico.setBounds(354, 550, 50, 50);

        ayudaSplineCubico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        ayudaSplineCubico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaSplineCubicoActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaSplineCubico);
        ayudaSplineCubico.setBounds(670, 550, 50, 50);

        buttonGroup1.add(newtonInterpolacion);
        getContentPane().add(newtonInterpolacion);
        newtonInterpolacion.setBounds(255, 470, 30, 23);

        buttonGroup1.add(lagrange);
        lagrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagrangeActionPerformed(evt);
            }
        });
        getContentPane().add(lagrange);
        lagrange.setBounds(530, 470, 30, 23);

        buttonGroup1.add(splineLineal);
        getContentPane().add(splineLineal);
        splineLineal.setBounds(320, 565, 28, 23);

        buttonGroup1.add(splineCuadratico);
        getContentPane().add(splineCuadratico);
        splineCuadratico.setBounds(620, 565, 28, 23);

        buttonGroup1.add(splineCubico);
        splineCubico.setToolTipText("");
        getContentPane().add(splineCubico);
        splineCubico.setBounds(890, 565, 28, 23);

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 175, 280, 40);

        actualizarN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonActualizarN.png"))); // NOI18N
        actualizarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarNActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarN);
        actualizarN.setBounds(700, 173, 150, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 950, 190);

        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 215, 370, 40);

        ayudaNeville.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAyudaPequeno.png"))); // NOI18N
        getContentPane().add(ayudaNeville);
        ayudaNeville.setBounds(670, 455, 50, 50);

        buttonGroup1.add(neville);
        neville.setToolTipText("");
        getContentPane().add(neville);
        neville.setBounds(810, 470, 28, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Interpolacion.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        Temas temas = new Temas();
        temas.setVisible(true);
        temas.setSize(1024,768);
        temas.setResizable(false);
        temas.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void lagrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagrangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lagrangeActionPerformed

    public static Double[][] getTableData (JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Double[][] tableData = new Double[nRow][nCol];
        for (int i = 0 ; i < nRow ; i++){
            for (int j = 0 ; j < nCol ; j++){
                System.out.println(dtm.getValueAt(i,j));
                if (dtm.getValueAt(i,j) == null || dtm.getValueAt(i,j).toString().replaceAll("\\s","").equals("")){
                    tableData[i][j] = 0.0;
                }else{
                    tableData[i][j] = Double.parseDouble(dtm.getValueAt(i,j).toString());
                }
                //tableData[i][j] = Double.parseDouble(dtm.getValueAt(i,j).toString());
            }
        }
        return tableData;
    }
    
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:        
        Metodos2.nPuntos = Integer.parseInt(jTextField1.getText());
        Metodos2.puntos = getTableData(jTable1);
        Metodos2.valorX = Double.parseDouble(jTextField2.getText());
        boolean isNewton = false;
        
        Double[] x = Metodos2.puntos[0];
        Double[] y = Metodos2.puntos[1];
        
        newtonInterpolacion.setActionCommand("0");
        lagrange.setActionCommand("1");
        splineLineal.setActionCommand("2");
        splineCuadratico.setActionCommand("3");
        splineCubico.setActionCommand("4");  
        neville.setActionCommand("5");
        int metodo;
        boolean metodoCorrecto = false;
        String tipoMetodo = null;
        try{
            metodo = Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        }catch(Exception e){
            metodo = -1;
        }
        
        if(Metodos2.nPuntos >= 2){
            switch(metodo){
                case 0:
                    //Newton
                    isNewton = true;
                    tipoMetodo = "newton";
                    Metodos2.newtonDifDiv(Metodos2.nPuntos, Metodos2.valorX, x, y);
                    try {
                        String s = null;

                        boolean error=false;
                        while ((s = Metodos2.stdError.readLine()) != null) {
                            JOptionPane.showMessageDialog(this,s,"Error",JOptionPane.ERROR_MESSAGE);
                            error=true;
                        } 
                        if(!error){
                            //Interpretar para obtener 3 cosas: matrizFinal(Pasar a Double[][]), Resultados de X(String) y etapas(String)
                            String output = "";
                            while ((s = Metodos2.stdOutput.readLine()) != null) {
                                System.out.println(s);
                                output = output + (s + "\n");
                            }

                            String[] arrOutput = output.split("!");
                            tabla = arrOutput[0];
                            resultado = arrOutput[1];
                            polinomio = arrOutput[2];
                            //System.out.println("SALIDA JAVA");
                            //System.out.println(etapas);
                            //System.out.println("--");
                            //System.out.println(matrizFinal);
                            //System.out.println("---");
                            //System.out.println(resultado);
                            //System.out.println("FIN SALIDA JAVA");


                        }
                    } catch (IOException ex) {
                        Logger.getLogger(MetodosDirectos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    metodoCorrecto = true;
                    break;
                case 1:
                    // Lagrange
                    tipoMetodo= "lagrange";
                    isNewton = false;
                    Metodos2.lagrange(Metodos2.nPuntos, Metodos2.valorX, x, y);
                    try {
                        String s = null;

                        boolean error=false;
                        while ((s = Metodos2.stdError.readLine()) != null) {
                            JOptionPane.showMessageDialog(this,s,"Error",JOptionPane.ERROR_MESSAGE);
                            error=true;
                        } 
                        if(!error){
                            //Interpretar para obtener 3 cosas: matrizFinal(Pasar a Double[][]), Resultados de X(String) y etapas(String)
                            String output = "";
                            while ((s = Metodos2.stdOutput.readLine()) != null) {
                                System.out.println(s);
                                output = output + (s + "\n");
                            }

                            String[] arrOutput = output.split("!");
                            tabla = arrOutput[0];
                            resultado = arrOutput[1];
                            polinomio = arrOutput[2];
                            //System.out.println("SALIDA JAVA");
                            //System.out.println(etapas);
                            //System.out.println("--");
                            //System.out.println(matrizFinal);
                            //System.out.println("---");
                            //System.out.println(resultado);
                            //System.out.println("FIN SALIDA JAVA");


                        }
                    } catch (IOException ex) {
                        Logger.getLogger(MetodosDirectos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    metodoCorrecto = true;
                    break;
                    
                case 2:
                    //Spline Lineal
                    metodoCorrecto = true;
                    break;
                case 3:
                    //Spline Cuadrático
                    isNewton = false;
                    
                    metodoCorrecto = true;
                    break;
                case 4:
                    //Spline Cúbico
                    tipoMetodo = "spline";
                    Metodos2.splineCubico(Metodos2.nPuntos, Metodos2.valorX, x, y);
                    try {
                        String s = null;

                        boolean error=false;
                        while ((s = Metodos2.stdError.readLine()) != null) {
                            JOptionPane.showMessageDialog(this,s,"Error",JOptionPane.ERROR_MESSAGE);
                            error=true;
                        } 
                        if(!error){
                            //Interpretar para obtener 3 cosas: matrizFinal(Pasar a Double[][]), Resultados de X(String) y etapas(String)
                            String output = "";
                            while ((s = Metodos2.stdOutput.readLine()) != null) {
                                System.out.println(s);
                                output = output + (s + "\n");
                            }

                            String[] arrOutput = output.split("!");
                            tabla = arrOutput[0];
                            resultado = "";
                            polinomio = "";
                            
                            //System.out.println("SALIDA JAVA");
                            //System.out.println(etapas);
                            //System.out.println("--");
                            //System.out.println(matrizFinal);
                            //System.out.println("---");
                            //System.out.println(resultado);
                            //System.out.println("FIN SALIDA JAVA");


                        }
                    } catch (IOException ex) {
                        Logger.getLogger(MetodosDirectos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    metodoCorrecto = true;
                    break;
                case 5:
                    //Neville
                    metodoCorrecto = true;
                    isNewton = false;
                    tipoMetodo = "neville";
                    Metodos2.neville(Metodos2.nPuntos, Metodos2.valorX, x, y);
                    try {
                        String s = null;

                        boolean error=false;
                        while ((s = Metodos2.stdError.readLine()) != null) {
                            JOptionPane.showMessageDialog(this,s,"Error",JOptionPane.ERROR_MESSAGE);
                            error=true;
                        } 
                        if(!error){
                            //Interpretar para obtener 3 cosas: matrizFinal(Pasar a Double[][]), Resultados de X(String) y etapas(String)
                            String output = "";
                            while ((s = Metodos2.stdOutput.readLine()) != null) {
                                System.out.println(s);
                                output = output + (s + "\n");
                            }

                            String[] arrOutput = output.split("!");
                            tabla = arrOutput[0];
                            resultado = "";
                            polinomio = "";
                            //System.out.println("SALIDA JAVA");
                            //System.out.println(etapas);
                            //System.out.println("--");
                            //System.out.println(matrizFinal);
                            //System.out.println("---");
                            //System.out.println(resultado);
                            //System.out.println("FIN SALIDA JAVA");


                        }
                    } catch (IOException ex) {
                        Logger.getLogger(MetodosDirectos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;                    
                default:
                    metodoCorrecto = false;
                    JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un método");
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor asigne valores a sus puntos y a X");
        }
        
        if(metodoCorrecto){
            if("neville".equals(tipoMetodo) || "spline".equals(tipoMetodo)){
                TablaInterpolacion tablaIn = new TablaInterpolacion(tabla, resultado, polinomio,isNewton, true);
                tablaIn.setVisible(true);
                tablaIn.setSize(1024,768);
                tablaIn.setResizable(false);
                tablaIn.setLocationRelativeTo(null);
                dispose();
            }else if ("spline".equals(tipoMetodo)){
                
            }else{

                ResultadoInterpolacion resultadoInterpolacion = new ResultadoInterpolacion(tabla, resultado, polinomio, isNewton);
                resultadoInterpolacion.setVisible(true);
                resultadoInterpolacion.setSize(1024,768);
                resultadoInterpolacion.setResizable(false);
                resultadoInterpolacion.setLocationRelativeTo(null);        
                dispose();
            }
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void actualizarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarNActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(jTextField1.getText());
        if(n > 0){
            Double[][] matrizA = new Double[2][n];
            for(int i=0; i<matrizA.length; i++){
                for(int j=0; j<matrizA[i].length; j++){
                    matrizA[i][j] = null;
                }
            }
            jTable1.setVisible(true);
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matrizA,
            new String [n]
        ));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Recuerde que el valor de N debe ser mayor a cero");
        }
    }//GEN-LAST:event_actualizarNActionPerformed

    private void ayudaNewtonInterpolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaNewtonInterpolacionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Newton", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaNewtonInterpolacion.png")));
    }//GEN-LAST:event_ayudaNewtonInterpolacionActionPerformed

    private void ayudaLagrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaLagrangeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Lagrange", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaLagrange.png")));
    }//GEN-LAST:event_ayudaLagrangeActionPerformed

    private void ayudaSplineLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaSplineLinealActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Spline Lineal", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaSplineLineal.png")));
    }//GEN-LAST:event_ayudaSplineLinealActionPerformed

    private void ayudaSplineCuadraticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaSplineCuadraticoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Spline Cuadrático", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaSplineCuadratico.png")));
    }//GEN-LAST:event_ayudaSplineCuadraticoActionPerformed

    private void ayudaSplineCubicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaSplineCubicoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, null, "AYUDA - Spline Cúbico", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/AyudaSplineCubico.png")));
    }//GEN-LAST:event_ayudaSplineCubicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarN;
    private javax.swing.JButton ayudaLagrange;
    private javax.swing.JButton ayudaNeville;
    private javax.swing.JButton ayudaNewtonInterpolacion;
    private javax.swing.JButton ayudaSplineCuadratico;
    private javax.swing.JButton ayudaSplineCubico;
    private javax.swing.JButton ayudaSplineLineal;
    private javax.swing.JButton botonRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton lagrange;
    private javax.swing.JRadioButton neville;
    private javax.swing.JRadioButton newtonInterpolacion;
    private javax.swing.JRadioButton splineCuadratico;
    private javax.swing.JRadioButton splineCubico;
    private javax.swing.JRadioButton splineLineal;
    // End of variables declaration//GEN-END:variables
}
