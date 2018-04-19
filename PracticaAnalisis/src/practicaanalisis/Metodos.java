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
    
    public static void biseccion(double xi, double xs, int iter, double tol){
        init();
        PyFloat pxi = new PyFloat(xi);
        PyFloat pxs = new PyFloat(xs);
        PyInteger piter = new PyInteger(iter);
        PyFloat ptol = new PyFloat(tol);
        PyString pfun = new PyString(Funcion.f);
        PyObject[] po = new PyObject[5];
        po[0] = pfun;
        po[1] = pxi;
        po[2] = pxs;
        po[3] = ptol;
        po[4] = piter;
        System.out.println("Voy a invoke");
        PyObject res = me.invoke("biseccion", po);
        System.out.println("Voy a ver result");
        //Iterable<PyObject> it = res.asIterable();
        Iterator<PyObject> it = res.asIterable().iterator();
        mens = it.next().asString();
        
        System.out.println("MENSAJE: "+mens);
        Iterable<PyObject> itData = it.next().asIterable();
        ArrayList<Double[]> matrix = new ArrayList<>();
        System.out.println("Voy para el iter");
        for(PyObject i: itData){
            System.out.println("iterooo");
            int contj = 0;
            Double[] fila = new Double[6];
            for(PyObject j:i.asIterable()){
                //System.out.println("Iterooo JJJ");
                //System.out.println(Double.parseDouble(j.asString()));
                System.out.println(j.asDouble());
                fila[contj] = j.asDouble();
                contj++;
            }
            //('3.144531 es aproximaci\xc3\xb3n a una ra\xc3\xadz con una tolerancia de 0.005000', [[0, 3.0, 4.0, 3.5, -0.35078322768961984, 0], [1, 3.0, 3.5, 3.25, -0.10819513453010837, 0.25], [2, 3.0, 3.25, 3.125, 0.016591892229347906, 0.125], [3, 3.125, 3.25, 3.1875, -0.045891223272779696, 0.0625], [4, 3.125, 3.1875, 3.15625, -0.014656821590492326, 0.03125], [5, 3.125, 3.15625, 3.140625, 0.0009676534387822795, 0.015625], [6, 3.140625, 3.15625, 3.1484375, -0.0068447929612965195, 0.0078125], [7, 3.140625, 3.1484375, 3.14453125, -0.0029385921809077266, 0.00390625]])
            matrix.add(fila);
        }
        data = matrix.toArray(new Double[matrix.size()][]);
        //Iterable<PyObject> listRes = res.asIterable();
        //for(PyObject i : listRes){
        //    i.asIterable()
        //}
        System.out.println("Ejecutooo!!");
    }
    
    public static void init(){
        PythonConnection pc = new PythonConnection();  
        pc.execfile("src\\metodos\\Metodos.py");  
        me = pc.createClass("Metodos", "None"); 
    }
}
