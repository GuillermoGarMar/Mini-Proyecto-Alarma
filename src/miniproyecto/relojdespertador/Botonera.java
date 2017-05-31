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
public class Botonera {
    static boolean alarmActive,setHr,setAlarm;
    
    /**
     * Set the alarm ON
     */
    public void alarmON(){
        Display.showLeds(false,true,false);
    }
    
    /**
     * Set the alarm OFF
     */
    public void alarmOFF(){
        Display.showLeds(false,false,false);
    }
    
    /**
     * 
     */
    public void configHr(){
        Display.showLeds(true,false,true);
        //Botonera.setHr();
        
    }
    
    public void configAlarm(){
        
    }
    
    public void plusHr(LocalTime auxHr){
        auxHr.plusHours(1);
    }
    
    public void plusMin(){
        
    }
    
    public void stopAlarm(){
        
    }
}
