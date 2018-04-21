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
    
     public static void raicesMultiples(double x0, int iter, double tol, int err){
        init();
        PyFloat px0 = new PyFloat(x0);
        PyInteger piter = new PyInteger(iter);
        PyFloat ptol = new PyFloat(tol);
        PyString pfun = new PyString(Funcion.f);
        PyString pdfun = new PyString(Funcion.df);
        PyString pddfun = new PyString(Funcion.ddf);
        PyInteger perr = new PyInteger(err);
        PyObject[] po = new PyObject[7];
        po[0] = pfun;
        po[1] = pdfun;
        po[2] = pddfun;
        po[3] = px0;
        po[4] = ptol;
        po[5] = piter;
        po[6] = perr;
        PyObject res = me.invoke("raicesMultiples", po);
        
        Iterator<PyObject> it = res.asIterable().iterator();
        mens = it.next().asString();
        
        Iterable<PyObject> itData = it.next().asIterable();
        ArrayList<Double[]> matrix = new ArrayList<>();
        for(PyObject i: itData){
            int contj = 0;
            Double[] fila = new Double[6];
            for(PyObject j:i.asIterable()){
                System.out.println(contj);
                System.out.println(j.asDouble());
                fila[contj] = j.asDouble();
                contj++;
            }
            matrix.add(fila);
        }
        data = matrix.toArray(new Double[matrix.size()][]);
     
     }
    
     public static void newton(double xi, int iter, double tol, int err){
        init();
        PyFloat pxi = new PyFloat(xi);
        PyInteger piter = new PyInteger(iter);
        PyFloat ptol = new PyFloat(tol);
        PyString pfun = new PyString(Funcion.f);
        PyString pdfun = new PyString(Funcion.df);
        PyInteger perr = new PyInteger(err);
        PyObject[] po = new PyObject[6];
        po[0] = pfun;
        po[1] = pdfun;
        po[2] = pxi;
        po[3] = ptol;
        po[4] = piter;
        po[5] = perr;
        PyObject res = me.invoke("newton", po);
        Iterator<PyObject> it = res.asIterable().iterator();
        mens = it.next().asString();
        
        Iterable<PyObject> itData = it.next().asIterable();
        ArrayList<Double[]> matrix = new ArrayList<>();
        for(PyObject i: itData){
            int contj = 0;
            Double[] fila = new Double[5];
            for(PyObject j:i.asIterable()){
                fila[contj] = j.asDouble();
                contj++;
            }
            matrix.add(fila);
        }
        data = matrix.toArray(new Double[matrix.size()][]);
    }
     
     public static void PuntoFijo(double x0, int iter, double tol, int err){
        init();
        PyFloat px0 = new PyFloat(x0);        
        PyInteger piter = new PyInteger(iter);
        PyFloat ptol = new PyFloat(tol);
        PyString pfun = new PyString(Funcion.f);
        PyString pgfun = new PyString(Funcion.g);
        PyInteger perr = new PyInteger(err);
        PyObject[] po = new PyObject[6];
        po[0] = pfun;
        po[1] = pgfun;
        po[2] = px0;   
        po[3] = piter;
        po[4] = ptol;
        po[5] = perr;
        
        PyObject res = me.invoke("punto_fijo", po);
        //Iterable<PyObject> it = res.asIterable();
        Iterator<PyObject> it = res.asIterable().iterator();
        mens = it.next().asString();
        
        Iterable<PyObject> itData = it.next().asIterable();
        ArrayList<Double[]> matrix = new ArrayList<>();
        for(PyObject i: itData){
            int contj = 0;
            Double[] fila = new Double[4];
            for(PyObject j:i.asIterable()){                
                fila[contj] = j.asDouble();
                contj++;
            }
            matrix.add(fila);
        }
        data = matrix.toArray(new Double[matrix.size()][]);
        
    }
     
     public static void busquedas_incrementales(double x0, double delta, int iter){
        init();
        PyFloat px0 = new PyFloat(x0);        
        PyInteger piter = new PyInteger(iter);
        PyFloat pdel = new PyFloat(delta);
        PyString pfun = new PyString(Funcion.f);                
        PyObject[] po = new PyObject[4];
        po[0] = pfun;
        po[1] = px0;
        po[2] = pdel;   
        po[3] = piter;        
        
        PyObject res = me.invoke("busquedas_incrementales", po);
        //Iterable<PyObject> it = res.asIterable();
        Iterator<PyObject> it = res.asIterable().iterator();
        mens = it.next().asString();
        
        Iterable<PyObject> itData = it.next().asIterable();
        ArrayList<Double[]> matrix = new ArrayList<>();
        for(PyObject i: itData){
            int contj = 0;
            Double[] fila = new Double[4];
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
        pc.execfile("src/metodos/Metodos.py");  
        me = pc.createClass("Metodos", "None"); 
    }
}
