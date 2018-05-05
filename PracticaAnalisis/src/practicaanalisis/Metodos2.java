/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanalisis;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.python.core.PyInstance;
import org.python.core.PyObject;
import org.python.core.PyArray;
import org.python.core.PyInteger;
/**
 *
 * @author Daniel Rendon M
 */
public class Metodos2 {
    public static PyInstance me;
    public static Double[][] a = null;
    public static Double[] b = null;
    public static int tam = 0;
    public static Double[][] matizFinal = null;
    public static String resX= "";
    
    public static BufferedReader stdOutput = null;
    public static BufferedReader stdError = null;
    
    public static void pivoteoParcial(Double[][] a, Double[] b, int n) {
        //init();
        /*
        PyArray pa = new PyArray(Double.class,a);
        PyArray pb = new PyArray(Double.class,b);
        PyInteger ptam = new PyInteger(n);
        PyObject[] po = new PyObject[3];
        po[0] = pa;
        po[1] = pb;
        po[2] = ptam;
        PyObject res = me.invoke("metodoPivoteoParcial", po);
        */
        String matrizA = "[";
        for (Double[] a1 : a) {
            String mtemp = Arrays.toString(a1) + ":";
            mtemp = mtemp.replace(" ", "");
            matrizA = matrizA + mtemp ;
        }
        matrizA = matrizA.substring(0,matrizA.length()-1);
        matrizA = matrizA + "]";
        String matrizB = Arrays.toString(b);
        matrizB = matrizB.replace(" ", "");
        System.out.println(matrizA);
        System.out.println(Arrays.toString(b));
        System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        String ruta = new File(".").getAbsolutePath();
        ruta = "\"" + ruta.substring(0,ruta.length()-1) + "build/classes/";
        ruta = ruta + "metodos/pivoteoParcial.py"+"\"";
        String comando = "python3 " + ruta + " " + args;
        System.out.println(comando);
        
        try {
            Process p = Runtime.getRuntime().exec(comando);
            stdOutput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));

            stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));
            //Interpretar res
        } catch (IOException ex) {
            Logger.getLogger(Metodos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Tenemos salida y salidaError
        
        
    }
    
    
    /*
    public static void init(){
        PythonConnection pc = new PythonConnection();  
        pc.execfile("src/metodos/Metodos2.py");  
        me = pc.createClass("Metodos2", "None"); 
    }
    */
}
