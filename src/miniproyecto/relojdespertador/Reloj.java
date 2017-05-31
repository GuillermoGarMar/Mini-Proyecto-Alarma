/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto.relojdespertador;

import java.time.LocalTime;

/**
 *
 * @author ggarciamartinez
 */
public class Reloj {
    static LocalTime hrActual,alarm;
    
    public LocalTime HRact(){
        hrActual= LocalTime.now();
        return hrActual;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hardware w = new Hardware();
        w.setVisible(true);
    }
    
}
