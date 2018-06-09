/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import practicaanalisis.Metodos2;

/**
 *
 * @author carlosruiz
 */
public class MiMatriz extends javax.swing.JFrame {

    /**
     * Creates new form MiMatriz
     */
    public MiMatriz() {
        initComponents();
        jTextField1.setText(String.valueOf(Metodos2.tam));
        if(Metodos2.tam != 0){
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                Metodos2.a,
                new String [Metodos2.tam]
            ));
            Double[][] matrizB = new Double[Metodos2.tam][1];
            for(int i=0; i<matrizB.length; i++){
                matrizB[i][0] = Metodos2.b[i];
            }
            jTable2.setModel(new javax.swing.table.DefaultTableModel(
                matrizB,
                new String [1]
            ));
        }else{
            jTable1.setVisible(false);
            jTable2.setVisible(false);   
        }
        //System.out.println("A:" + Arrays.toString(Metodos2.a));
        //System.out.println("B:" + Arrays.toString(Metodos2.b));
        //System.out.println("n:" + Metodos2.tam);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresarMiMatriz = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        actualizarN = new javax.swing.JButton();
        guardarMatriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        regresarMiMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        regresarMiMatriz.setToolTipText("");
        regresarMiMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMiMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(regresarMiMatriz);
        regresarMiMatriz.setBounds(60, 40, 80, 80);

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(360, 135, 320, 50);

        actualizarN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonActualizarN.png"))); // NOI18N
        actualizarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarNActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarN);
        actualizarN.setBounds(700, 140, 140, 40);

        guardarMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonGuardarPequeno.png"))); // NOI18N
        guardarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(guardarMatriz);
        guardarMatriz.setBounds(700, 660, 300, 90);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
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
        jTable1.setTableHeader(null);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 800, 410);

        jTable2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setRowHeight(30);
        jTable2.setTableHeader(null);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(850, 240, 140, 410);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MiMatriz.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMiMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMiMatrizActionPerformed
        // TODO add your handling code here:
        MetodosDirectos metodosDirectos = new MetodosDirectos();
        metodosDirectos.setVisible(true);
        metodosDirectos.setSize(1024,768);
        metodosDirectos.setResizable(false);
        metodosDirectos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_regresarMiMatrizActionPerformed

    private void guardarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarMatrizActionPerformed
        // TODO add your handling code here:
        //EJEMPLO JAVA
        /*
        Metodos2.tam = 4;
        //Metodos2.a = {};
        Metodos2.b = new Double[4];
        Double[] tb = {150.0,230.0,325.0,450.0};
        Metodos2.b = tb;
        //Double[][] ta = {{7.0,2.0,-3.0,4.0},{5.0,-1.0,14.0,-1.0},{1.0,9.0,-7.0,13.0},{-12.0,13.0,-8.0,-4.0}};
        //Double[][] ta = {{-7.0,0.0,-3.0,4.0},{5.0,0.0,14.0,-1.0},{1.0,0.0,-7.0,13.0},{-12.0,0.0,-8.0,-4.0}};
        Double[][] ta = {{25.0, -2.0, -7.0, -2.0},{-2.0,36.0,-3.0,-5.0},{-7.0,-3.0,54.0,-5.0},{-2.0,-5.0,-5.0,75.0}};
        Metodos2.a = ta;
        */
        
        Metodos2.tam = Integer.parseInt(jTextField1.getText());
        Metodos2.a = getTableData(jTable1);
        if(Metodos2.a[0][0] == 0.0){
            JOptionPane.showMessageDialog(rootPane, "La matriz no puede tener un 0 en la primera posicion de la fila 1");
            
            Double[] matrizX = new Double[Metodos2.tam];
            for(int i=0; i < matrizX.length; i++){
                matrizX[i] = 0.0;
            }
            Metodos2.x = matrizX;
            Metodos2.b = matrizX;
            Double[][] ma = new Double[Metodos2.tam][Metodos2.tam];
            for(int i = 0; i< Metodos2.tam; i++){
                ma[i] = matrizX;
            }
            Metodos2.a = ma;
        }else{
            //System.out.println(Arrays.toString(Metodos2.b));

            //System.out.println("A:" + Arrays.toString(Metodos2.a));
            //System.out.println("B:" + Arrays.toString(Metodos2.b));
            //System.out.println("n:" + Metodos2.tam);
            Double[][] arregloB = getTableData(jTable2);
            Double[] matrizB = new Double[arregloB.length];
            for(int i=0; i < matrizB.length; i++){
                matrizB[i] = arregloB[i][0];
            }
            Metodos2.b = matrizB;

            Double[] matrizX = new Double[Metodos2.tam];
            for(int i=0; i < matrizX.length; i++){
                matrizX[i] = 0.0;
            }
            Metodos2.x = matrizX;
            JOptionPane.showMessageDialog(rootPane, "Matriz guardada exitosamente");
        }
    }//GEN-LAST:event_guardarMatrizActionPerformed

    
    
    private void actualizarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarNActionPerformed
        // TODO add your handling code here      
        int n = Integer.parseInt(jTextField1.getText());
        //Metodos2.tam = n;
        if(n > 0){
        Double[][] matrizA = new Double[n][n];
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[i].length; j++){
                matrizA[i][j] = null;
            }
        }
        
        jTable1.setVisible(true);
        jTable2.setVisible(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matrizA,
            new String [n]
        ));
        
        Double[][] matrizB = new Double[n][1];
        for(int i=0; i<matrizB.length; i++){
            matrizB[i][0] = null;
        }
        //System.out.println(Arrays.toString(matrizB));
        //System.out.println(Arrays.toString(matrizB[0]));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            matrizB,
            new String [1]
        ));
        
        //System.out.println("A:" + Arrays.toString(Metodos2.a));
        //System.out.println("B:" + Arrays.toString(Metodos2.b));
        //System.out.println("n:" + Metodos2.tam);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Recuerde que el valor de N debe ser mayor a cero");
        }
    }//GEN-LAST:event_actualizarNActionPerformed


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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarN;
    private javax.swing.JButton guardarMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton regresarMiMatriz;
    // End of variables declaration//GEN-END:variables
}
