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
import javax.swing.JOptionPane;
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
    public static Double[] x = null;
    public static int tam = 0;
    public static int nPuntos = 0;
    public static Double[][] puntos = null;
    public static double valorX = 0;
    public static Double[][] matizFinal = null;
    public static String resX= "";
    public static int[] vectorMarcas = null;
    
    public static BufferedReader stdOutput = null;
    public static BufferedReader stdError = null;
    
    public static void gaussianaSimple(Double[][] a, Double[] b, int n) {        
        
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
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/gaussianaSimple.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "gaussianaSimple.py";
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
        
    }
    
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
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/pivoteoParcial.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "pivoteoParcial.py";
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    
    public static void pivoteoEscalonado(Double[][] a, Double[] b, int n) {
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
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/pivoteoEscalonado.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "pivoteoEscalonado.py";
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    
    public static void pivoteoTotal(Double[][] a, Double[] b, int n) {        
        
        /*for (int i = 1; i < n; i++){
            vectorMarcas[i-1] = i;
        }*/
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
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/pivoteoTotal.py";
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "pivoteoTotal.py";
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    
    public static void crout(Double[][] a, Double[] b, int n) { 
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
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/Crout.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "Crout.py";
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    public static void doolittle(Double[][] a, Double[] b, int n) { 
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
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/Doolittle.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "Doolittle.py";
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    
    public static void cholesky(Double[][] a, Double[] b, int n) {    
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
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/Cholesky.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "Cholesky.py";
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    public static void jacobiRelajado(Double[][] a, Double[] b, int n, 
            Double tol, int iter, Double relajacion, Double[] xValues, int norma) {    
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
        String matrizX = Arrays.toString(xValues);
        matrizX = matrizX.replace(" ", "");
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA+" "+tol+" "+iter+" "+norma+" "+relajacion+" "+matrizX;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/jacobiRelajado.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "jacobiRelajado.py";
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    public static void gaussSeidelRelajado(Double[][] a, Double[] b, int n, 
            Double tol, int iter, Double relajacion, Double[] xValues, int norma) {        
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
        String matrizX = Arrays.toString(xValues);
        matrizX = matrizX.replace(" ", "");
        //System.out.println(matrizA);
        //System.out.println(Arrays.toString(b));
        //System.out.println(n);
        String args = n +" "+matrizB+" "+matrizA+" "+tol+" "+iter+" "+norma+" "+relajacion+" "+matrizX;
        
        //String ruta = "\"" +Metodos2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/gaussSeidelRelajado.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "gaussSeidelRelajado.py";
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    
    
    public static void newtonDifDiv(int n, double val, Double[] x, Double[] y) {
        String xVal = "";
        String yVal = "";
        for (int i = 0; i < x.length; i++) {
            if(i!=x.length-1){
                xVal = xVal + x[i] + ";";
                yVal = yVal + y[i] + ";";
            }else{
                xVal = xVal + x[i];
                yVal = yVal + y[i];
            }
        }
        
        String args = n +" "+ val+" " + xVal+" " + yVal;
        
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta.substring(0,ruta.length()-1);
        
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "NewtonDifDiv.py";
        //Hasta .jar
        //String ruta = Metodos2.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        //ruta = ruta + "/metodos/NewtonDifDiv.py"; 
        
        //String ruta = "./metodos/NewtonDifDiv.py";
        
        
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    }
    
    public static void lagrange(int n, double val, Double[] x, Double[] y) {
        String xVal = "";
        String yVal = "";
        for (int i = 0; i < x.length; i++) {
            if(i!=x.length-1){
                xVal = xVal + x[i] + ";";
                yVal = yVal + y[i] + ";";
            }else{
                xVal = xVal + x[i];
                yVal = yVal + y[i];
            }
        }
        
        String args = n +" "+ val+" " + xVal+" " + yVal;
        
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/Lagrange.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "Lagrange.py";
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    }
    public static void neville(int n, double val, Double[] x, Double[] y) {
        String xVal = "";
        String yVal = "";
        for (int i = 0; i < x.length; i++) {
            if(i!=x.length-1){
                xVal = xVal + x[i] + ";";
                yVal = yVal + y[i] + ";";
            }else{
                xVal = xVal + x[i];
                yVal = yVal + y[i];
            }
        }
        
        String args = n +" "+ val+" " + xVal+" " + yVal;
        
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/Neville.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "Neville.py";
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    }
    public static void splineLineal(int n, double val, Double[] x, Double[] y) {
        String xVal = "";
        String yVal = "";
        for (int i = 0; i < x.length; i++) {
            if(i!=x.length-1){
                xVal = xVal + x[i] + ";";
                yVal = yVal + y[i] + ";";
            }else{
                xVal = xVal + x[i];
                yVal = yVal + y[i];
            }
        }
        
        String args = n +" "+ val+" " + xVal+" " + yVal;
        
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/splineCubico.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "splineLineal.py";
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    }
    
    public static void splineCuadratico(int n, double val, Double[] x, Double[] y) {
        String xVal = "";
        String yVal = "";
        for (int i = 0; i < x.length; i++) {
            if(i!=x.length-1){
                xVal = xVal + x[i] + ";";
                yVal = yVal + y[i] + ";";
            }else{
                xVal = xVal + x[i];
                yVal = yVal + y[i];
            }
        }
        
        String args = n +" "+ val+" " + xVal+" " + yVal;
        
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/splineCubico.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "splineCuadratico.py";
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    }
    
    public static void splineCubico(int n, double val, Double[] x, Double[] y) {
        String xVal = "";
        String yVal = "";
        for (int i = 0; i < x.length; i++) {
            if(i!=x.length-1){
                xVal = xVal + x[i] + ";";
                yVal = yVal + y[i] + ";";
            }else{
                xVal = xVal + x[i];
                yVal = yVal + y[i];
            }
        }
        
        String args = n +" "+ val+" " + xVal+" " + yVal;
        
        //String ruta = new File(".").getAbsolutePath();
        //ruta = ruta.substring(0,ruta.length()-1) + "build/classes/";
        //ruta = ruta + "metodos/splineCubico.py"; 
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "/lib/metodos/";
        ruta = ruta + "splineCubico.py";
        if(PracticaAnalisis.os.equals("win")){
            ruta = "\""+ruta+"\""; 
        }
        String comando = "python " + ruta + " " + args;
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
    }
}
