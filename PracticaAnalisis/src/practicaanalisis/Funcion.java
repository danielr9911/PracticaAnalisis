/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanalisis;

import org.python.core.PyFloat;
import org.python.core.PyInstance;
import org.python.core.PyObject;
import org.python.core.PyString;

/**
 *
 * @author Daniel Rendon M
 */
public class Funcion {
    public static String f = "";
    public static String df = "";
    public static String ddf = "";
    public static String g = "";   
    public static PyInstance ee;
    
    public static void setF(String fun){
        f = fun;
    }
    public static void setDF(String fun){
        df = fun;
    }
    public static void setDDF(String fun){
        ddf = fun;
    }
    public static void setG(String fun){
        g = fun;
    }
    
    public static double callFunction(String fun, double x){
        init();
        double result;
        switch(fun){
            case "f":
                result = funcion(f,x);
                break;
            case "df":
                result = funcion(df,x);
                break;
            case "ddf":
                result = funcion(ddf,x);
                break;
            case "g":
                result = funcion(g,x);
                break;
            default:
                result = 0;
                System.err.println("Funcion desconocida");
        }
        return result;
    }
    
    public static double funcion(String fun, double x){
        PyString pfun = new PyString(fun);
        PyFloat px = new PyFloat(x);
        PyObject res = ee.invoke("funcion", pfun, px);
        double resp = res.asDouble();
        return resp;
    }
    
    public static void init(){
        PythonConnection pc = new PythonConnection();  
        String ruta = System.getProperty("user.dir");
        //System.out.println(ruta);
        ruta = ruta + "/lib/metodos/";
        //System.out.println(ruta);
        ruta = ruta + "Metodos.py";
        //System.out.println(ruta);
        
        //pc.execfile("src/metodos/Metodos.py");  
        pc.execfile(ruta);  
        
        ee = pc.createClass("Metodos", "None"); 
    }
}
