/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto.relojdespertador;

/**
 *
 * @author ggarciamartinez
 */
public class Display {

    static boolean ledClock, ledAlarm, ledSET;

    /**
     *
     * @param showClock
     * @param showAlarm
     * @param showSET
     */
    public static void showLeds(boolean clock, boolean alarm, boolean set) {
        ledClock = clock;
        ledAlarm = alarm;
        ledSET = set;
    }
}
