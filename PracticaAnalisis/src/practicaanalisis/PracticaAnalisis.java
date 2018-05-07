/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanalisis;

import interfaz.Home;

/**
 *
 * @author Daniel Rendon M
 */
public class PracticaAnalisis {

    public static String os = "";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        os = System.getProperty("os.name");
        if (os.toLowerCase().contains("win")){
            os = "win";
        }else if(os.toLowerCase().contains("mac")){
            os = "mac";
        }else{
            os = "npi";
            System.err.println("Windows o Mac no encontrado. El software no ha "
                    + "sido probado en este sistema operativo");
        }
        System.out.println("Starting on " + System.getProperty("os.name") +" ...");
        Home home = new Home();
        home.setVisible(true);
        home.setSize(1024,768);
        home.setResizable(false);
        home.setLocationRelativeTo(null);
    }
    
}
