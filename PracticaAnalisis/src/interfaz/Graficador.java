/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import org.nfunk.jep.*;  
import org.nfunk.jep.type.*;
import practicaanalisis.Funcion;
/**
 *
 * @author Daniel Rendon M
 */
public class Graficador extends javax.swing.JFrame {

    public static String fun1 = "";
    public static String fun2 = "";
    public static String fun3 = "";
    
    private    JEP miEvaluador;
    private    JEP miEvaluador2;
    private    JEP miEvaluador3;
    private    JEP miEvaluador4;
    private    JEP miEvaluador5;
    private    JEP miEvaluador6;
    private    JEP miEvaluador7;
    
    //Si hay error de sintaxis en la función
    boolean    errorEnExpresion;
    boolean    errorEnExpresion2;
    boolean    errorEnExpresion3;
    boolean    errorEnExpresion4;
    boolean    errorEnExpresion5;
    boolean    errorEnExpresion6;
    boolean    errorEnExpresion7;
    
    boolean    errorEnNumero   ;
    
    // Cantidad de puntos que grafica
    int puntosInt = 99;
    
    int Gancho = 1000;
    int Galto = 450;
    //Origen
    int x0,y0;
    int escalaX,escalaY;
    int aumento1 = 7;
    int intervaloA = -100;
    int intervaloB = 100;
    double xmin,xmax,imgx;
    //VARIABLES PARA GROSOR DE LAS LINEAS
    final static BasicStroke grosor1 = new BasicStroke(1.5f); //thickness
    final static float dash1[] = {5.0f};
    final static BasicStroke dashed = new BasicStroke(1.0f,
                                                      BasicStroke.CAP_BUTT, 
                                                      BasicStroke.JOIN_MITER, 
                                                      5.0f, dash1, 0.0f);
    ImageIcon imageIcon;
    
    
    /**
     * Creates new form Graficador
     */
    public Graficador() {
        initComponents();
        fA1.setEnabled(false);
        fA2.setEnabled(false);
        fA3.setEnabled(false);
        if(Funcion.f.equals("")){
            fX.setEnabled(false);
        }else{
            fX.setEnabled(true);
        }
        if(Funcion.df.equals("")){
            dfX.setEnabled(false);
        }else{
            dfX.setEnabled(true);
        }
        if(Funcion.ddf.equals("")){
            ddfX.setEnabled(false);
        }else{
            ddfX.setEnabled(true);
        }
        if(Funcion.g.equals("")){
            gX.setEnabled(false);
        }else{
            gX.setEnabled(true);
        }
        //imagen de fondo
        imageIcon = new ImageIcon(getClass().getResource("/imagenes/background.jpg"));

        //BORDES
        Border colorline = BorderFactory.createLineBorder(new Color(220,220,220));
	 
        //EVALUADOR DE FUNCIONES
        miEvaluador = new JEP();
        miEvaluador.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador.addStandardConstants();
        miEvaluador.addComplex();
        miEvaluador.addVariable("x", 0);
        miEvaluador.setImplicitMul(true); //permite 2x en vez de 2*x
 
        miEvaluador2 = new JEP();
        miEvaluador2.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador2.addStandardConstants();
        miEvaluador2.addComplex();
        miEvaluador2.addVariable("x", 0);
        miEvaluador2.setImplicitMul(true); 
        
        miEvaluador3 = new JEP();
        miEvaluador3.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador3.addStandardConstants();
        miEvaluador3.addComplex();
        miEvaluador3.addVariable("x", 0);
        miEvaluador3.setImplicitMul(true); //permite 2x en vez de 2*x
        
        miEvaluador4 = new JEP();
        miEvaluador4.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador4.addStandardConstants();
        miEvaluador4.addComplex();
        miEvaluador4.addVariable("x", 0);
        miEvaluador4.setImplicitMul(true); //permite 2x en vez de 2*x
        
        miEvaluador5 = new JEP();
        miEvaluador5.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador5.addStandardConstants();
        miEvaluador5.addComplex();
        miEvaluador5.addVariable("x", 0);
        miEvaluador5.setImplicitMul(true); //permite 2x en vez de 2*x
        
        miEvaluador6 = new JEP();
        miEvaluador6.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador6.addStandardConstants();
        miEvaluador6.addComplex();
        miEvaluador6.addVariable("x", 0);
        miEvaluador6.setImplicitMul(true); //permite 2x en vez de 2*x
        
        miEvaluador7 = new JEP();
        miEvaluador7.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador7.addStandardConstants();
        miEvaluador7.addComplex();
        miEvaluador7.addVariable("x", 0);
        miEvaluador7.setImplicitMul(true); //permite 2x en vez de 2*x
        
        escalaX=30;
        escalaY=30;
        x0=Gancho/2;
        y0=Galto/2;
        aumento1=7;	
        
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
        ayudaGraficador = new javax.swing.JButton();
        fX = new javax.swing.JCheckBox();
        botonMisFunciones = new javax.swing.JButton();
        gX = new javax.swing.JCheckBox();
        dfX = new javax.swing.JCheckBox();
        ddfX = new javax.swing.JCheckBox();
        funcionAdicional1 = new javax.swing.JTextField();
        botonGraficar = new javax.swing.JButton();
        funcionAdicional2 = new javax.swing.JTextField();
        funcionAdicional3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fA1 = new javax.swing.JCheckBox();
        fA2 = new javax.swing.JCheckBox();
        fA3 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        graficadorClasico = new javax.swing.JPanel();
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
        jButton1.setBounds(70, 70, 80, 80);

        ayudaGraficador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ayuda.png"))); // NOI18N
        ayudaGraficador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaGraficadorActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaGraficador);
        ayudaGraficador.setBounds(870, 30, 110, 110);

        fX.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        fX.setText("F(x)");
        fX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fXActionPerformed(evt);
            }
        });
        getContentPane().add(fX);
        fX.setBounds(30, 620, 65, 27);

        botonMisFunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonMisFunciones.png"))); // NOI18N
        botonMisFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMisFuncionesActionPerformed(evt);
            }
        });
        getContentPane().add(botonMisFunciones);
        botonMisFunciones.setBounds(20, 660, 300, 80);

        gX.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        gX.setText("G(x)");
        getContentPane().add(gX);
        gX.setBounds(240, 620, 68, 27);

        dfX.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        dfX.setText("F'(x)");
        dfX.setToolTipText("");
        getContentPane().add(dfX);
        dfX.setBounds(100, 620, 70, 27);

        ddfX.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ddfX.setText("F''(x)");
        getContentPane().add(ddfX);
        ddfX.setBounds(170, 620, 73, 27);

        funcionAdicional1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        funcionAdicional1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionAdicional1ActionPerformed(evt);
            }
        });
        getContentPane().add(funcionAdicional1);
        funcionAdicional1.setBounds(380, 640, 320, 32);

        botonGraficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonGraficar.png"))); // NOI18N
        botonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGraficar);
        botonGraficar.setBounds(710, 660, 300, 80);

        funcionAdicional2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        getContentPane().add(funcionAdicional2);
        funcionAdicional2.setBounds(380, 670, 320, 32);

        funcionAdicional3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        getContentPane().add(funcionAdicional3);
        funcionAdicional3.setBounds(380, 703, 320, 26);

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(174, 10, 5));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Funciones Adicionales");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 616, 300, 20);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(174, 10, 5));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 640, 20, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(174, 10, 5));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 670, 20, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(174, 10, 5));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 700, 20, 30);

        fA1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        fA1.setText("F.A.1");
        fA1.setToolTipText("");
        getContentPane().add(fA1);
        fA1.setBounds(730, 620, 80, 27);

        fA2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        fA2.setText("F.A.2");
        getContentPane().add(fA2);
        fA2.setBounds(820, 620, 77, 27);

        fA3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        fA3.setText("F.A.3");
        getContentPane().add(fA3);
        fA3.setBounds(910, 620, 80, 27);

        graficadorClasico = new ZonaGrafica();
        jScrollPane1.setViewportView(graficadorClasico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 1000, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Graficador.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Ecuaciones1Var ec = new Ecuaciones1Var();
        ec.setVisible(true);
        ec.setSize(1024,768);
        ec.setResizable(false);
        ec.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fXActionPerformed

    private void ayudaGraficadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaGraficadorActionPerformed
        // TODO add your handling code here:
          JOptionPane.showMessageDialog(null, null, "AYUDA - Graficador", HEIGHT, new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayudaGraficador.png")));
    }//GEN-LAST:event_ayudaGraficadorActionPerformed

    private void funcionAdicional1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionAdicional1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionAdicional1ActionPerformed

    private void botonMisFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMisFuncionesActionPerformed
        // TODO add your handling code here:
        Funciones func = new Funciones("graficador");
        func.setVisible(true);
        func.setSize(1024,768);
        func.setResizable(false);
        func.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonMisFuncionesActionPerformed

    private void botonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficarActionPerformed
        // TODO add your handling code here:
        String funA1 = funcionAdicional1.getText();
        String funA2 = funcionAdicional2.getText();
        String funA3 = funcionAdicional3.getText();
        fun1 = funA1;
        fun2 = funA2;
        fun3 = funA3;
        if(fun1.equals("")){
            fA1.setEnabled(false);
            fA1.setSelected(false);
        }else{
            fA1.setEnabled(true);
        }
        if(fun2.equals("")){
            fA2.setEnabled(false);
            fA2.setSelected(false);
        }else{
            fA2.setEnabled(true);
        }
        if(fun3.equals("")){
            fA3.setEnabled(false);
            fA3.setSelected(false);
        }else{
            fA3.setEnabled(true);
        }
        
        graficadorClasico.repaint();
        
    }//GEN-LAST:event_botonGraficarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayudaGraficador;
    private javax.swing.JButton botonGraficar;
    private javax.swing.JButton botonMisFunciones;
    private javax.swing.JCheckBox ddfX;
    private javax.swing.JCheckBox dfX;
    private javax.swing.JCheckBox fA1;
    private javax.swing.JCheckBox fA2;
    private javax.swing.JCheckBox fA3;
    private javax.swing.JCheckBox fX;
    private javax.swing.JTextField funcionAdicional1;
    private javax.swing.JTextField funcionAdicional2;
    private javax.swing.JTextField funcionAdicional3;
    private javax.swing.JCheckBox gX;
    private javax.swing.JPanel graficadorClasico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /////// CLASE QUE DE LA ZONA GRçFICA ///////////////////////////////////////////
public class ZonaGrafica extends JPanel  implements MouseListener, MouseMotionListener, MouseWheelListener
{
    int     offsetX, offsetY;
    boolean dragging;
    
    ZonaGrafica() 
    {
        setBackground(Color.white);             
        offsetX=x0; offsetY=y0;
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }
    
    
    @Override
    public void mousePressed(MouseEvent evt)
    {
        if (dragging)
            return;
        int x = evt.getX();  // clic inicial
        int y = evt.getY();
        offsetX = x - x0;
        offsetY = y - y0;
        dragging = true;
    }

    @Override
    public void mouseReleased(MouseEvent evt)
    {
        dragging = false;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent evt)
    {
        if (dragging == false)
            return;
        int x = evt.getX();   // posici—n del mouse
        int y = evt.getY();
        x0 = x - offsetX;     // mover origen
        y0 = y - offsetY;
        repaint();
    }
    
    @Override
    public void mouseWheelMoved(MouseWheelEvent evt) {
        int zoom = evt.getWheelRotation();
        escalaY += -zoom;
        escalaX += -zoom;
        repaint();
    }

           //el resto hace nada 
    @Override
    public void mouseMoved(MouseEvent evt) {}
    @Override
    public void mouseClicked(MouseEvent evt) { }
    @Override
    public void mouseEntered(MouseEvent evt) { }
    @Override
    public void mouseExited(MouseEvent evt) { }

    @Override
    public void paintComponent(Graphics g)
    {
         super.paintComponent(g);
         Graficar(g, x0, y0);                      
    }
 
    //METODO QUE PINTA TODA LA GRAFICA
    void Graficar(Graphics ap, int xg, int yg){
        ap.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), null);
        //setBackground(new Color(36,85,102)); //COLOR FONDO/////////////////////////////////////////////////
        int xi=0,yi=0,xi1=0,yi1=0,numPuntos=1;
        
        int cxmin,cxmax,cymin,cymax;
        double valxi=0.0, valxi1=0.0, valyi=0.0,valyi1=0.0;
        Thread animation;

        //convertimos el objeto ap en un objeto Graphics2D para usar los mŽtodos Java2D
        Graphics2D g = (Graphics2D) ap;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        

        //PINTAMOS EL EJE X Y EL EJE Y
        g.draw(new Line2D.Double(xg, 10, xg, Galto-10)); //EJE Y
        g.draw(new Line2D.Double(10, yg, Gancho-10, yg));//EJE X

        xmin=-1.0*xg/escalaX;
        xmax=(1.0*(Gancho-xg)/escalaX);
        cxmin=(int)Math.round(xmin); //pantalla
        cxmax=(int)Math.round(xmax);

        //intervalos para pintar funci—n
        cymin=(int)Math.round(1.0*(yg-Galto)/escalaY);
        cymax=(int)Math.round(1.0*yg/escalaY);

        numPuntos=Gancho; //num pixels

        g.setPaint(new Color(49,173,215)); //COLOR CUADRICULA

        //PINTAMOS TODOS LOS EJES PARA FORMAR LA CUADRICULA
        if(escalaX>5)
        {
            for(int i=cxmin;i<=cxmax;i++)
            {   //EJES PARALELOS AL EJE Y
                g.setPaint(new Color(49,173,215)); //COLOR CUADRICULA
                g.draw(new Line2D.Double(xg+i*escalaX, yg-2, xg+i*escalaX , yg+2));
                if( (xg+i*escalaX) != xg )
                    g.draw(new Line2D.Double(xg+i*escalaX, 10, xg+i*escalaX, Galto-10));
                
                if(i>0){
                    g.setPaint(new Color(0,0,0));//COLOR NUMEROS
                    g.drawString(""+i, xg+i*escalaX-aumento1, yg+12);
                }
                if(i<0){
                    g.setPaint(new Color(0,0,0));//COLOR NUMEROS
                    g.drawString(""+i, xg+i*escalaX-8, yg+12);
                }
            }
        }

        if(escalaY>5)
        {
            for(int i=cymin+1;i<cymax;i++)
            {   //EJES PARALELOS AL EJE X
                g.setPaint(new Color(49,173,215)); //COLOR CUADRICULA
                g.draw(new Line2D.Double(xg-2, yg-i*escalaY, xg+2 , yg-i*escalaY));
                if( (yg-i*escalaY) != yg )
                    g.draw(new Line2D.Double(10, yg-i*escalaY, Gancho-10, yg-i*escalaY));
                if(i>0){
                    g.setPaint(new Color(0,0,0));//COLOR NUMEROS
                    g.drawString(""+i, xg-12,yg-i*escalaY+8 );
                }
                if(i<0){
                    g.setPaint(new Color(0,0,0));//COLOR NUMEROS
                    g.drawString(""+i, xg-14,yg-i*escalaY+8 );
                }
            }
        }
        
        //g.setPaint(new Color(29,220,248));//COLOR DE LA FUNCION
        
        //g.setStroke(grosor1);
  
        //miEvaluador.parseExpression(Graficador.fun1);
        //miEvaluador2.parseExpression(Graficador.fun2);
        
        
        
        
        //errorEnExpresion = miEvaluador.hasError(); //hay error?
        //errorEnExpresion2 = miEvaluador2.hasError(); //hay error?
        
        
        
        if (fA1.isSelected()){
            miEvaluador.parseExpression(Graficador.fun1);
            errorEnExpresion = miEvaluador.hasError(); //hay error?
        }
        if (fA2.isSelected()){
            miEvaluador2.parseExpression(Graficador.fun2);
            errorEnExpresion2 = miEvaluador2.hasError(); //hay error?
        }
        if (fA3.isSelected()){
            miEvaluador3.parseExpression(Graficador.fun3);
            errorEnExpresion3 = miEvaluador3.hasError(); //hay error?
        }
        if (fX.isSelected()){
            miEvaluador4.parseExpression(Funcion.f);
            errorEnExpresion4 = miEvaluador4.hasError(); //hay error?
        }
        if (dfX.isSelected()){
            miEvaluador5.parseExpression(Funcion.df);
            errorEnExpresion5 = miEvaluador5.hasError(); //hay error?
        }
        if (ddfX.isSelected()){
            miEvaluador6.parseExpression(Funcion.ddf);
            errorEnExpresion6 = miEvaluador6.hasError(); //hay error?
        }
        if (gX.isSelected()){
            miEvaluador7.parseExpression(Funcion.g);
            errorEnExpresion7 = miEvaluador7.hasError(); //hay error?
        }

        if(!errorEnExpresion && !errorEnExpresion2 && !errorEnExpresion3
                 && !errorEnExpresion4 && !errorEnExpresion5
                 && !errorEnExpresion6 && !errorEnExpresion7){   
            //CICLO QUE PINTA LA FUNCION
            
            if (fA1.isSelected()){
                g.setPaint(new Color(231,76,60));
                g.setStroke(grosor1);
                for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
                {
                    valxi =xmin +i*1.0/escalaX;
                    valxi1=xmin+(i+1)*1.0/escalaX;
                    miEvaluador.addVariable("x", valxi);
                    valyi=miEvaluador.getValue();  
                    miEvaluador.addVariable("x", valxi1);
                    valyi1 =  miEvaluador.getValue();
                    xi =(int)Math.round(escalaX*(valxi));
                    yi =(int)Math.round(escalaY*valyi); 
                    xi1=(int)Math.round(escalaX*(valxi1));
                    yi1=(int)Math.round(escalaY*valyi1); 

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if(i%(100-puntosInt)==0){
                        Complex valC = miEvaluador.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double)Math.abs(valC.im()); 
                        if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                        {
                            g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                        }
                    }
                }//fin del for
            }
            if (fA2.isSelected()){
                g.setPaint(new Color(142,68,173));
                g.setStroke(grosor1);
                for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
                {
                    valxi =xmin +i*1.0/escalaX;
                    valxi1=xmin+(i+1)*1.0/escalaX;
                    miEvaluador2.addVariable("x", valxi);
                    valyi=miEvaluador2.getValue();  
                    miEvaluador2.addVariable("x", valxi1);
                    valyi1 =  miEvaluador2.getValue();
                    xi =(int)Math.round(escalaX*(valxi));
                    yi =(int)Math.round(escalaY*valyi); 
                    xi1=(int)Math.round(escalaX*(valxi1));
                    yi1=(int)Math.round(escalaY*valyi1); 

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if(i%(100-puntosInt)==0){
                        Complex valC = miEvaluador2.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double)Math.abs(valC.im()); 
                        if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                        {
                            g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                        }
                    }
                }//fin del for
            }
            if (fA3.isSelected()){
                g.setPaint(new Color(46,204,113));
                g.setStroke(grosor1);
                for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
                {
                    valxi =xmin +i*1.0/escalaX;
                    valxi1=xmin+(i+1)*1.0/escalaX;
                    miEvaluador3.addVariable("x", valxi);
                    valyi=miEvaluador3.getValue();  
                    miEvaluador3.addVariable("x", valxi1);
                    valyi1 =  miEvaluador3.getValue();
                    xi =(int)Math.round(escalaX*(valxi));
                    yi =(int)Math.round(escalaY*valyi); 
                    xi1=(int)Math.round(escalaX*(valxi1));
                    yi1=(int)Math.round(escalaY*valyi1); 

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if(i%(100-puntosInt)==0){
                        Complex valC = miEvaluador3.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double)Math.abs(valC.im()); 
                        if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                        {
                            g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                        }
                    }
                }//fin del for
            }
            if (fX.isSelected()){
                g.setPaint(new Color(244,208,63));
                g.setStroke(grosor1);
                for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
                {
                    valxi =xmin +i*1.0/escalaX;
                    valxi1=xmin+(i+1)*1.0/escalaX;
                    miEvaluador4.addVariable("x", valxi);
                    valyi=miEvaluador4.getValue();  
                    miEvaluador4.addVariable("x", valxi1);
                    valyi1 =  miEvaluador4.getValue();
                    xi =(int)Math.round(escalaX*(valxi));
                    yi =(int)Math.round(escalaY*valyi); 
                    xi1=(int)Math.round(escalaX*(valxi1));
                    yi1=(int)Math.round(escalaY*valyi1); 

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if(i%(100-puntosInt)==0){
                        Complex valC = miEvaluador4.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double)Math.abs(valC.im()); 
                        if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                        {
                            g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                        }
                    }
                }//fin del for
            }
            if (ddfX.isSelected()){
                g.setPaint(new Color(230,77,255));
                g.setStroke(grosor1);
                for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
                {
                    valxi =xmin +i*1.0/escalaX;
                    valxi1=xmin+(i+1)*1.0/escalaX;
                    miEvaluador5.addVariable("x", valxi);
                    valyi=miEvaluador5.getValue();  
                    miEvaluador5.addVariable("x", valxi1);
                    valyi1 =  miEvaluador5.getValue();
                    xi =(int)Math.round(escalaX*(valxi));
                    yi =(int)Math.round(escalaY*valyi); 
                    xi1=(int)Math.round(escalaX*(valxi1));
                    yi1=(int)Math.round(escalaY*valyi1); 

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if(i%(100-puntosInt)==0){
                        Complex valC = miEvaluador5.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double)Math.abs(valC.im()); 
                        if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                        {
                            g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                        }
                    }
                }//fin del for
            }
            if (gX.isSelected()){
                g.setPaint(new Color(255,146,57));
                g.setStroke(grosor1);
                for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
                {
                    valxi =xmin +i*1.0/escalaX;
                    valxi1=xmin+(i+1)*1.0/escalaX;
                    miEvaluador6.addVariable("x", valxi);
                    valyi=miEvaluador6.getValue();  
                    miEvaluador6.addVariable("x", valxi1);
                    valyi1 =  miEvaluador6.getValue();
                    xi =(int)Math.round(escalaX*(valxi));
                    yi =(int)Math.round(escalaY*valyi); 
                    xi1=(int)Math.round(escalaX*(valxi1));
                    yi1=(int)Math.round(escalaY*valyi1); 

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if(i%(100-puntosInt)==0){
                        Complex valC = miEvaluador6.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double)Math.abs(valC.im()); 
                        if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                        {
                            g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                        }
                    }
                }//fin del for
            }
            if (dfX.isSelected()){
                g.setPaint(new Color(18,25,178));
                g.setStroke(grosor1);
                for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
                {
                    valxi =xmin +i*1.0/escalaX;
                    valxi1=xmin+(i+1)*1.0/escalaX;
                    miEvaluador7.addVariable("x", valxi);
                    valyi=miEvaluador7.getValue();  
                    miEvaluador7.addVariable("x", valxi1);
                    valyi1 =  miEvaluador7.getValue();
                    xi =(int)Math.round(escalaX*(valxi));
                    yi =(int)Math.round(escalaY*valyi); 
                    xi1=(int)Math.round(escalaX*(valxi1));
                    yi1=(int)Math.round(escalaY*valyi1); 

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if(i%(100-puntosInt)==0){
                        Complex valC = miEvaluador7.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double)Math.abs(valC.im()); 
                        if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                        {
                            g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                        }
                    }
                }//fin del for
            }
        }
        
    }//Graficar
 
    double dist(double xA,double yA, double xB,double yB)
    {
        return (xA - xB)*(xA - xB)+(yA - yB)*(yA - yB);
    }//
 
} // class
}


