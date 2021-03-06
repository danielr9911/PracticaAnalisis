/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Font;
import practicaanalisis.Metodos2;

/**
 *
 * @author carlosruiz
 */
public class ResultadoNeville extends javax.swing.JFrame {

    /**
     * Creates new form ResultadoNeville
     */
    public ResultadoNeville(String tabla, String resultado) {
        initComponents();
        System.out.println("Resultados de Java");
        System.out.println(Metodos2.nPuntos);
        Double[][] neville = new Double[Metodos2.nPuntos][Metodos2.nPuntos + 2];
        String[] arr = tabla.split(":");
        for (int i = 0; i < arr.length; i++){
            String[] fila = arr[i].split(";");
            for(int j = 0; j < fila.length; j++){
                neville[i][j] = Double.parseDouble(fila[j]);
            }
        }
        String[] titulos = titulos(Metodos2.nPuntos + 2);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                neville,
                titulos
            ));
        jTextArea1.setText(resultado);
    }
    
    private String[] titulos(int n){
        String[] titulos = new String[n];
        titulos[0] = "n";
        titulos[1] = "Xi";
        titulos[2] = "f(Xi)";
        for (int i = 3; i < n; i++){
            titulos[i] = "Grado "+ (i - 2);
        }return titulos;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        botonRegresar.setBounds(180, 25, 80, 80);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 620, 910, 130);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTable1.getTableHeader().setFont(new Font("Lucida Grande", Font.ITALIC, 24));
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
        jTable1.setRowHeight(30);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 170, 910, 400);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ResultadoNeville.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        Interpolacion interpolacion = new Interpolacion();
        interpolacion.setVisible(true);
        interpolacion.setSize(1024,768);
        interpolacion.setResizable(false);
        interpolacion.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
