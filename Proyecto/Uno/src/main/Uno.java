/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import objects.Partida;

/**
 *
 * @author honda
 */
public class Uno {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Partida p=new Partida();
        
        p.unirse("Raul");
        p.unirse("Christian");
        p.unirse("Cesar");
        
        
        //Iniciar partida
        p.repartirC();
        
        p.getJugador(0).showCartas();
        p.getJugador(1).showCartas();
        p.getJugador(2).showCartas();
        
        
        
        
        
    }
    
}
