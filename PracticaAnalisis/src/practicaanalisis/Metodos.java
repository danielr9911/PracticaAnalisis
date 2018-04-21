/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanalisis;

import java.util.ArrayList;
import java.util.Iterator;
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
    public static Double[][] data = null;
    public static String mens = "";
    
    public static void biseccion(double xi, double xs, int iter, double tol, int err){
        init();
        PyFloat pxi = new PyFloat(xi);
        PyFloat pxs = new PyFloat(xs);
        PyInteger piter = new PyInteger(iter);
        PyFloat ptol = new PyFloat(tol);
        PyString pfun = new PyString(Funcion.f);
        PyInteger perr = new PyInteger(err);
        PyObject[] po = new PyObject[6];
        po[0] = pfun;
        po[1] = pxi;
        po[2] = pxs;
        po[3] = ptol;
        po[4] = piter;
        po[5] = perr;
        PyObject res = me.invoke("biseccion", po);
        //Iterable<PyObject> it = res.asIterable();
        Iterator<PyObject> it = res.asIterable().iterator();
        mens = it.next().asString();
        
        Iterable<PyObject> itData = it.next().asIterable();
        ArrayList<Double[]> matrix = new ArrayList<>();
        for(PyObject i: itData){
            int contj = 0;
            Double[] fila = new Double[6];
            for(PyObject j:i.asIterable()){
                fila[contj] = j.asDouble();
                contj++;
            }
            matrix.add(fila);
        }
        data = matrix.toArray(new Double[matrix.size()][]);
    }
    
    public static void init(){
        PythonConnection pc = new PythonConnection();  
        pc.execfile("src\\metodos\\Metodos.py");  
        me = pc.createClass("Metodos", "None"); 
    }
}
