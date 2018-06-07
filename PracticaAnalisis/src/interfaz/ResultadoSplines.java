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
public class ResultadoSplines extends javax.swing.JFrame {
    public static String res, tabIni, tabFin, ecua, titIni, titFin;
    public static boolean esLineal;

    /**
     * Creates new form ResultadoSplines
     */
    public ResultadoSplines(String resultado, String tablaIni, String tablaFin, String ecuaciones, String titulosIni, String titulosFin, boolean isLineal) {
        res = resultado;
        tabIni = tablaIni;       
        tabFin = tablaFin;
        ecua = ecuaciones;
        titIni = titulosIni;
        titFin = titulosFin;
        esLineal = isLineal;
        
        if (esLineal){
            botonVerDetalle.setVisible(false);
        }else{
            botonVerDetalle.setVisible(true);
        }
        
        jTextArea1.setText(res);
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
        botonVerDetalle = new javax.swing.JButton();
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
        botonRegresar.setBounds(170, 30, 80, 80);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 970, 510);

        botonVerDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonVerDetalle.png"))); // NOI18N
        botonVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDetalleActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerDetalle);
        botonVerDetalle.setBounds(700, 660, 300, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ResultadoSplines.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);
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

    private void botonVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDetalleActionPerformed
        // TODO add your handling code here:
        DetalleSplines detalleSplines = new DetalleSplines(res, tabIni, tabFin, ecua, titIni, titFin, esLineal);
        detalleSplines.setVisible(true);
        detalleSplines.setSize(1024,768);
        detalleSplines.setResizable(false);
        detalleSplines.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonVerDetalleActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVerDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
