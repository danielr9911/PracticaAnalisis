/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author pedrosalzedo
 */
public class ResultadosReglaFalsa extends javax.swing.JFrame {

    /**
     * Creates new form ResultadosReglaFalsa
     */
    public ResultadosReglaFalsa(double xi, double xs, double tol, int iter, Double[][] dat, String res) {
        initComponents();
        tableReglaFalsa.setModel(new javax.swing.table.DefaultTableModel(
            dat,
            new String[]{
                "n", "Xi", "Xs", "Xm", "f(Xm)", "Error"
            }
        ));
        textResultado.setText(res);
        xInferiorResultadosReglaFalsa.setText(String.valueOf(xi));
        xSuperiorResultadosReglaFalsa.setText(String.valueOf(xs));
        iteracionesResultdosReglaFalsa.setText(String.valueOf(iter));
        toleranciaResultadosReglaFalsa.setText(String.valueOf(tol));
        xInferiorResultadosReglaFalsa.setEditable(false);
        xSuperiorResultadosReglaFalsa.setEditable(false);
        iteracionesResultdosReglaFalsa.setEditable(false);
        toleranciaResultadosReglaFalsa.setEditable(false);
        textResultado.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xInferiorResultadosReglaFalsa = new javax.swing.JTextField();
        xSuperiorResultadosReglaFalsa = new javax.swing.JTextField();
        iteracionesResultdosReglaFalsa = new javax.swing.JTextField();
        toleranciaResultadosReglaFalsa = new javax.swing.JTextField();
        botonRegresarResultadosReglaFalsa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableReglaFalsa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        xInferiorResultadosReglaFalsa.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        xInferiorResultadosReglaFalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xInferiorResultadosReglaFalsaActionPerformed(evt);
            }
        });
        getContentPane().add(xInferiorResultadosReglaFalsa);
        xInferiorResultadosReglaFalsa.setBounds(230, 100, 240, 50);

        xSuperiorResultadosReglaFalsa.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        xSuperiorResultadosReglaFalsa.setSize(new java.awt.Dimension(240, 50));
        getContentPane().add(xSuperiorResultadosReglaFalsa);
        xSuperiorResultadosReglaFalsa.setBounds(230, 160, 240, 50);

        iteracionesResultdosReglaFalsa.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        iteracionesResultdosReglaFalsa.setSize(new java.awt.Dimension(240, 50));
        getContentPane().add(iteracionesResultdosReglaFalsa);
        iteracionesResultdosReglaFalsa.setBounds(690, 100, 240, 50);

        toleranciaResultadosReglaFalsa.setSize(new java.awt.Dimension(240, 50));
        getContentPane().add(toleranciaResultadosReglaFalsa);
        toleranciaResultadosReglaFalsa.setBounds(690, 160, 240, 50);

        botonRegresarResultadosReglaFalsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarResultadosReglaFalsa.setToolTipText("");
        botonRegresarResultadosReglaFalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarResultadosReglaFalsaActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarResultadosReglaFalsa);
        botonRegresarResultadosReglaFalsa.setBounds(40, 30, 80, 80);

        textResultado.setColumns(20);
        textResultado.setRows(5);
        jScrollPane1.setViewportView(textResultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 610, 930, 150);

        tableReglaFalsa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableReglaFalsa);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 270, 930, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Resultado Regla Falsa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarResultadosReglaFalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarResultadosReglaFalsaActionPerformed
        // TODO add your handling code here:
        ReglaFalsa reglaFalsa = new ReglaFalsa();
        reglaFalsa.setVisible(true);
        reglaFalsa.setSize(1024,768);
        reglaFalsa.setResizable(false);
        reglaFalsa.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarResultadosReglaFalsaActionPerformed

    private void xInferiorResultadosReglaFalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xInferiorResultadosReglaFalsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xInferiorResultadosReglaFalsaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresarResultadosReglaFalsa;
    private javax.swing.JTextField iteracionesResultdosReglaFalsa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableReglaFalsa;
    private javax.swing.JTextArea textResultado;
    private javax.swing.JTextField toleranciaResultadosReglaFalsa;
    private javax.swing.JTextField xInferiorResultadosReglaFalsa;
    private javax.swing.JTextField xSuperiorResultadosReglaFalsa;
    // End of variables declaration//GEN-END:variables
}
