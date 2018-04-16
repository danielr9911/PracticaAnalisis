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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting...");
        Home home = new Home();
        home.setVisible(true);
        home.setSize(1024,768);
        home.setResizable(false);
        home.setLocationRelativeTo(null);
    }
    
}
