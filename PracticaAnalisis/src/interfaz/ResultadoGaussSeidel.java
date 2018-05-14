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
public class ResultadoGaussSeidel extends javax.swing.JFrame {

    /**
     * Creates new form ResultadoGaussSeidel
     */
    public ResultadoGaussSeidel() {
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

        botonRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGaussSeidel = new javax.swing.JTable();
        iteracionesGaussSeidel = new javax.swing.JTextField();
        toleranciaGaussSeidel = new javax.swing.JTextField();
        normaGaussSeidel = new javax.swing.JTextField();
        lambdaGaussSeidel = new javax.swing.JTextField();
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
        botonRegresar.setBounds(90, 20, 80, 80);

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 610, 910, 140);

        tablaGaussSeidel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaGaussSeidel);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 270, 910, 290);

        iteracionesGaussSeidel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        iteracionesGaussSeidel.setSize(new java.awt.Dimension(200, 40));
        getContentPane().add(iteracionesGaussSeidel);
        iteracionesGaussSeidel.setBounds(325, 110, 200, 40);

        toleranciaGaussSeidel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        toleranciaGaussSeidel.setSize(new java.awt.Dimension(200, 40));
        getContentPane().add(toleranciaGaussSeidel);
        toleranciaGaussSeidel.setBounds(325, 160, 200, 40);

        normaGaussSeidel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(normaGaussSeidel);
        normaGaussSeidel.setBounds(660, 110, 200, 40);

        lambdaGaussSeidel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(lambdaGaussSeidel);
        lambdaGaussSeidel.setBounds(570, 160, 290, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Resultado Gauss Seidel.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        GaussSeidel gaussSeidel = new GaussSeidel();
        gaussSeidel.setVisible(true);
        gaussSeidel.setSize(1024,768);
        gaussSeidel.setResizable(false);
        gaussSeidel.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ResultadoGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadoGaussSeidel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField iteracionesGaussSeidel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lambdaGaussSeidel;
    private javax.swing.JTextField normaGaussSeidel;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTable tablaGaussSeidel;
    private javax.swing.JTextField toleranciaGaussSeidel;
    // End of variables declaration//GEN-END:variables
}
