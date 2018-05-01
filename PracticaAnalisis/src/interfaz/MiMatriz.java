/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Arrays;
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
        System.out.println("A:" + Arrays.toString(Metodos2.a));
        System.out.println("B:" + Arrays.toString(Metodos2.b));
        System.out.println("n:" + Metodos2.tam);
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
        jTable1.setTableHeader(null);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 800, 380);

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
        jTable2.setTableHeader(null);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(900, 270, 90, 380);

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
        Metodos2.tam = Integer.parseInt(jTextField1.getText());
        Metodos2.a = getTableData(jTable1);
        Double[][] arregloB = getTableData(jTable2);
        Double[] matrizB = new Double[arregloB.length];
        for(int i=0; i < matrizB.length; i++){
            matrizB[i] = arregloB[i][0];
        }
        Metodos2.b = matrizB;
        System.out.println(Arrays.toString(Metodos2.b));
        
        System.out.println("A:" + Arrays.toString(Metodos2.a));
        System.out.println("B:" + Arrays.toString(Metodos2.b));
        System.out.println("n:" + Metodos2.tam);
        JOptionPane.showMessageDialog(rootPane, "Matriz guardada exitosamente");
    }//GEN-LAST:event_guardarMatrizActionPerformed

    
    
    private void actualizarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarNActionPerformed
        // TODO add your handling code here
        int n = Integer.parseInt(jTextField1.getText());
        //Metodos2.tam = n;
        
        Double[][] matrizA = new Double[n][n];
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[i].length; j++){
                matrizA[i][j] = 0.0;
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
            matrizB[i][0] = 0.0;
        }
        System.out.println(Arrays.toString(matrizB));
        System.out.println(Arrays.toString(matrizB[0]));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            matrizB,
            new String [1]
        ));
        
        System.out.println("A:" + Arrays.toString(Metodos2.a));
        System.out.println("B:" + Arrays.toString(Metodos2.b));
        System.out.println("n:" + Metodos2.tam);
    }//GEN-LAST:event_actualizarNActionPerformed

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
            java.util.logging.Logger.getLogger(MiMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiMatriz().setVisible(true);
            }
        });
    }

    public static Double[][] getTableData (JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Double[][] tableData = new Double[nRow][nCol];
        for (int i = 0 ; i < nRow ; i++)
            for (int j = 0 ; j < nCol ; j++)
                tableData[i][j] = Double.parseDouble(dtm.getValueAt(i,j).toString());                
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
