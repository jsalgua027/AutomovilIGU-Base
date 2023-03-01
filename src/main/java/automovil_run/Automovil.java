/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil_run;

import automovil_igu.Principal;

/**
 *
 * @author Windows10
 */
public class Automovil {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        Principal princ = new Principal();
        //hago visible el objeto principal
        princ.setVisible(true);
        // uso este metodo para que me aparezca centrado en la pantalla; lo ponemos a null  para que no se posicione relativo a nada
         princ.setLocationRelativeTo(null);
    }
    
}
