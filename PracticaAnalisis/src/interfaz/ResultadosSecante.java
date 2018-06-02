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
public class ResultadosSecante extends javax.swing.JFrame  {
    private static java.text.DecimalFormat sf = new java.text.DecimalFormat("0.#E0");

    /**
     * Creates new form ResultadosSecante
     */
    public ResultadosSecante(double x0, double x1, double tol, int iter, Object[][] dat, String res) {
        initComponents();
        tableSecante.setModel(new javax.swing.table.DefaultTableModel(
            dat,
            new String []{
                "n", "Xn", "f(Xm)", "Error"
            }
        ));
       
        textResult.setText(res);
        x0Secante.setText(String.valueOf(x0));
        x1Secante.setText(String.valueOf(x1));
        iteracionesSecante.setText(String.valueOf(iter));
        toleranciaSecante.setText(String.valueOf(tol));
        textResult.setEditable(false);
        x0Secante.setEditable(false);
        x1Secante.setEditable(false);
        iteracionesSecante.setEditable(false);
        toleranciaSecante.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        x0Secante = new javax.swing.JTextField();
        iteracionesSecante = new javax.swing.JTextField();
        toleranciaSecante = new javax.swing.JTextField();
        botonRegresarResultadoSecante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textResult = new javax.swing.JTextArea();
        x1Secante = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSecante = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        x0Secante.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(x0Secante);
        x0Secante.setBounds(240, 110, 260, 40);

        iteracionesSecante.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        iteracionesSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteracionesSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(iteracionesSecante);
        iteracionesSecante.setBounds(700, 110, 260, 40);

        toleranciaSecante.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        toleranciaSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranciaSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(toleranciaSecante);
        toleranciaSecante.setBounds(700, 160, 260, 40);

        botonRegresarResultadoSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarResultadoSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarResultadoSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarResultadoSecante);
        botonRegresarResultadoSecante.setBounds(80, 50, 80, 80);

        textResult.setColumns(20);
        textResult.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        textResult.setRows(5);
        jScrollPane1.setViewportView(textResult);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 610, 910, 130);

        x1Secante.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(x1Secante);
        x1Secante.setBounds(240, 160, 260, 40);

        tableSecante.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        tableSecante.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSecante.setRowHeight(30);
        jScrollPane2.setViewportView(tableSecante);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 270, 910, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ResultadoSecante.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarResultadoSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarResultadoSecanteActionPerformed
        // TODO add your handling code here:
        Secante secante = new Secante();
        secante.setVisible(true);
        secante.setSize(1024,768);
        secante.setResizable(false);
        secante.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarResultadoSecanteActionPerformed

    private void toleranciaSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranciaSecanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toleranciaSecanteActionPerformed

    private void iteracionesSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteracionesSecanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iteracionesSecanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresarResultadoSecante;
    private javax.swing.JTextField iteracionesSecante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableSecante;
    private javax.swing.JTextArea textResult;
    private javax.swing.JTextField toleranciaSecante;
    private javax.swing.JTextField x0Secante;
    private javax.swing.JTextField x1Secante;
    // End of variables declaration//GEN-END:variables
}
