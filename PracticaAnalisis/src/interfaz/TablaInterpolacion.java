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
public class TablaInterpolacion extends javax.swing.JFrame {

    public static String tabla;
    public static String resultado;
    public static String polinomio;
    public static boolean isNewton;
    public static boolean neville;
    
    /**
     * Creates new form TablaInterpolacion
     */
    public TablaInterpolacion(String tab, String res, String pol, boolean isN, boolean nev) {
        initComponents();
        tabla = tab;
        resultado = res;
        polinomio = pol;
        isNewton = isN;
        neville = nev;
        jTextArea1.setText(tabla);
        
        
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
        botonRegresar.setBounds(90, 10, 80, 80);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 940, 610);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TablaInterpolacion.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        if(!neville){
            ResultadoInterpolacion resultadoInterpolacion = new ResultadoInterpolacion(tabla, resultado, polinomio,isNewton);
            resultadoInterpolacion.setVisible(true);
            resultadoInterpolacion.setSize(1024,768);
            resultadoInterpolacion.setResizable(false);
            resultadoInterpolacion.setLocationRelativeTo(null);        
            dispose();
        }else{
            Interpolacion in = new Interpolacion();
            in.setVisible(true);
            in.setSize(1024,768);
            in.setResizable(false);
            in.setLocationRelativeTo(null);
            dispose();
        }
        
        
    }//GEN-LAST:event_botonRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
