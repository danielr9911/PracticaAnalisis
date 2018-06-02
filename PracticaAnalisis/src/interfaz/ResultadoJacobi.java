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
public class ResultadoJacobi extends javax.swing.JFrame {

    /**
     * Creates new form ResultadoJacobi
     */
    public ResultadoJacobi(int iter, double tol, int norma, double relajacion, Object[][] tabla, String res) {
        initComponents();
        String[] titulos = new String[tabla[0].length];
        titulos[0] = "n";
        for (int i = 0; i < titulos.length-1; i++) {
            titulos[i+1] = "X"+(i+1);
        }
        titulos[titulos.length-1] = "norma";
        
        tablaJacobi.setModel(new javax.swing.table.DefaultTableModel(
            tabla,
            titulos
             ));
        resultado.setText(res);
        campoIteraciones.setText(String.valueOf(iter));
        campoTolerancia.setText(String.valueOf(tol));
        if(norma == 0){
            campoNorma.setText("Infinita");
        }else{
            campoNorma.setText("Euclidiana");
        }
        
        jTextField1.setText(String.valueOf(relajacion));
        
        resultado.setEditable(false);
        campoIteraciones.setEditable(false);
        campoTolerancia.setEditable(false);
        campoNorma.setEditable(false);
        jTextField1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJacobi = new javax.swing.JTable();
        campoIteraciones = new javax.swing.JTextField();
        campoTolerancia = new javax.swing.JTextField();
        campoNorma = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 20, 80, 80);

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 620, 910, 120);

        tablaJacobi.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        tablaJacobi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaJacobi);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 270, 910, 290);

        campoIteraciones.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(campoIteraciones);
        campoIteraciones.setBounds(325, 110, 200, 40);

        campoTolerancia.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(campoTolerancia);
        campoTolerancia.setBounds(325, 160, 200, 40);

        campoNorma.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(campoNorma);
        campoNorma.setBounds(655, 110, 200, 40);

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(560, 160, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Resultado Jacobi.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Jacobi jacobi = new Jacobi();
        jacobi.setVisible(true);
        jacobi.setSize(1024,768);
        jacobi.setResizable(false);
        jacobi.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoIteraciones;
    private javax.swing.JTextField campoNorma;
    private javax.swing.JTextField campoTolerancia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTable tablaJacobi;
    // End of variables declaration//GEN-END:variables
}
