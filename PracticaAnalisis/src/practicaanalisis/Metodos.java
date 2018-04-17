/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanalisis;

import org.python.core.PyFloat;
import org.python.core.PyInstance;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.core.PyString;

/**
 *
 * @author Daniel Rendon M
 */
public class Metodos {
    public static PyInstance me;
    
    public static void biseccion(double xi, double xs, int iter, int tol){
        init();
        PyFloat pxi = new PyFloat(xi);
        PyFloat pxs = new PyFloat(xs);
        PyInteger piter = new PyInteger(iter);
        PyInteger ptol = new PyInteger(tol);
        PyString pfun = new PyString(Funcion.f);
        PyObject[] po = new PyObject[5];
        po[0] = pfun;
        po[1] = pxi;
        po[2] = pxs;
        po[3] = ptol;
        po[4] = piter;
        PyObject res = me.invoke("biseccion", po);
        //Iterable<PyObject> listRes = res.asIterable();
        //for(PyObject i : listRes){
        //    i.asIterable()
        //}
    }
    
    public static void init(){
        PythonConnection pc = new PythonConnection();  
        pc.execfile("src\\metodos\\Metodos.py");  
        me = pc.createClass("Metodos", "None"); 
    }
}
