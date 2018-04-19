/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanalisis;
import java.util.Properties;
import org.python.core.PyInstance; 
import org.python.util.PythonInterpreter; 

/**
 *
 * @author Daniel Rendon M
 */
public class PythonConnection {
    PythonInterpreter interpreter = null;  

   public PythonConnection(){
      PythonInterpreter.initialize(System.getProperties(),  
                                   System.getProperties(), new String[0]);  

      this.interpreter = new PythonInterpreter();  
   }  

   void execfile( final String fileName ){  
      this.interpreter.execfile(fileName);  
   }  

   PyInstance createClass( final String className, final String opts ){  
      return (PyInstance) this.interpreter.eval(className + "(" + opts + ")");  
   }  
   
}
