/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.Line2D;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;
import org.nfunk.jep.JEP;
import org.nfunk.jep.type.Complex;

/**
 *
 * @author carlosruiz
 */
public class ResultadoInterpolacion extends javax.swing.JFrame {

    public static String funRes = "";
    
    private    JEP miEvaluador;
    
    //Si hay error de sintaxis en la función
    boolean    errorEnExpresion;
    
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
     * Creates new form ResultadoInterpolacion
     */
    public static String tabla;
    public static String resultado;
    public static String polinomio;
    public static boolean isNewton;
    public ResultadoInterpolacion(String tab, String res, String pol, boolean isN) {
        initComponents();
        tabla = tab;
        resultado = res;
        polinomio = pol;
        jTextArea1.setText(resultado);
        funRes=pol;
        isNewton = isN;
        if(isNewton){
            botonVerTabla.setVisible(true);
        }else{
            botonVerTabla.setVisible(false);
        }
        
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
 
        escalaX=30;
        escalaY=30;
        x0=Gancho/2;
        y0=Galto/2;
        aumento1=7;
        
        graficadorClasico.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graficadorClasico = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonVerTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        graficadorClasico = new ZonaGrafica();
        graficadorClasico.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(graficadorClasico);
        graficadorClasico.setBounds(90, 110, 880, 370);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Regresar.png"))); // NOI18N
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(240, 20, 80, 80);

        botonVerTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonVerTabla.png"))); // NOI18N
        botonVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerTablaActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerTabla);
        botonVerTabla.setBounds(740, 670, 240, 70);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 540, 880, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ResultadoInterpolacion.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        Interpolacion in = new Interpolacion();
        in.setVisible(true);
        in.setSize(1024,768);
        in.setResizable(false);
        in.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerTablaActionPerformed
        // TODO add your handling code here:
        ResultadoTablaNewton tablaNewton = new ResultadoTablaNewton(tabla, resultado, polinomio,isNewton);
        tablaNewton.setVisible(true);
        tablaNewton.setSize(1024,768);
        tablaNewton.setResizable(false);
        tablaNewton.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonVerTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVerTabla;
    private javax.swing.JPanel graficadorClasico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


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
        
        miEvaluador.parseExpression(funRes);
        errorEnExpresion = miEvaluador.hasError(); //hay error?
        
        if(!errorEnExpresion){   
            //CICLO QUE PINTA LA FUNCION
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
        
    }//Graficar
 
    double dist(double xA,double yA, double xB,double yB)
    {
        return (xA - xB)*(xA - xB)+(yA - yB)*(yA - yB);
    }//
 
} // class
}