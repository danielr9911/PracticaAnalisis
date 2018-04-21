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
public class ResultadosNewton extends javax.swing.JFrame {

    /**
     * Creates new form ResultadosNewton
     */
    public ResultadosNewton(double x0, int iter, double tol, Double[][] dat, String res) {
        initComponents();
        tableNewton.setModel(new javax.swing.table.DefaultTableModel(
            dat,
            new String [] {
                "n", "Xn", "f(Xn)","f'(Xn)", "Error"
            } 
        ));
        textResultado.setText(res);
        xInicialNewton.setText(String.valueOf(x0));
        iteracionesNewton.setText(String.valueOf(iter));
        toleranciaNewton.setText(String.valueOf(tol));
        xInicialNewton.setEditable(false);
        iteracionesNewton.setEditable(false);
        toleranciaNewton.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xInicialNewton = new javax.swing.JTextField();
        iteracionesNewton = new javax.swing.JTextField();
        toleranciaNewton = new javax.swing.JTextField();
        botonRegresarResultadosNewton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNewton = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        xInicialNewton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        xInicialNewton.setSize(new java.awt.Dimension(240, 50));
        getContentPane().add(xInicialNewton);
        xInicialNewton.setBounds(240, 100, 240, 50);

        iteracionesNewton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(iteracionesNewton);
        iteracionesNewton.setBounds(360, 160, 120, 50);

        toleranciaNewton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        toleranciaNewton.setSize(new java.awt.Dimension(240, 50));
        toleranciaNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranciaNewtonActionPerformed(evt);
            }
        });
        getContentPane().add(toleranciaNewton);
        toleranciaNewton.setBounds(690, 160, 240, 50);

        botonRegresarResultadosNewton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresarResultadosNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarResultadosNewtonActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarResultadosNewton);
        botonRegresarResultadosNewton.setBounds(50, 40, 80, 80);

        tableNewton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableNewton.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableNewton);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 270, 790, 310);

        textResultado.setColumns(20);
        textResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textResultado.setRows(5);
        jScrollPane2.setViewportView(textResultado);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 600, 790, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ResultadoNewton.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarResultadosNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarResultadosNewtonActionPerformed
        // TODO add your handling code here:
        Newton newton = new Newton();
        newton.setVisible(true);
        newton.setSize(1024,768);
        newton.setResizable(false);
        newton.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarResultadosNewtonActionPerformed

    private void toleranciaNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranciaNewtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toleranciaNewtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresarResultadosNewton;
    private javax.swing.JTextField iteracionesNewton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableNewton;
    private javax.swing.JTextArea textResultado;
    private javax.swing.JTextField toleranciaNewton;
    private javax.swing.JTextField xInicialNewton;
    // End of variables declaration//GEN-END:variables
}
