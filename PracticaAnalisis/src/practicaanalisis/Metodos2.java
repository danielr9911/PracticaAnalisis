/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanalisis;

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
    
    public static void pivoteoParcial(Double[][] a, double[] b, int n){
        init();
        PyArray pa = new PyArray(Double.class,a);
        PyArray pb = new PyArray(Double.class,b);
        PyInteger ptam = new PyInteger(n);
        PyObject[] po = new PyObject[3];
        po[0] = pa;
        po[1] = pb;
        po[2] = ptam;
        PyObject res = me.invoke("metodoPivoteoParcial", po);
        //Interpretar res
    }
    
    
    
    public static void init(){
        PythonConnection pc = new PythonConnection();  
        pc.execfile("src/metodos/Metodos2.py");  
        me = pc.createClass("Metodos", "None"); 
    }
}
