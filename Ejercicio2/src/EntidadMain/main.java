/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadMain;

import EntidadJuego.Juego;
import EntidadJugador.Jugador;

import EntidadRevolver.Revolver;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego game = new Juego();       
        Jugador j = new Jugador();
        Revolver sr = new Revolver();
        ArrayList<Jugador> jugadores= new ArrayList();
        
        String CJ = JOptionPane.showInputDialog("Indique cantidad de Jugadores");
        int CantJug = Integer.parseInt(CJ);
        
        for(int i=0; i<CantJug;i++){
            j.crearJugador();
            jugadores.add(j);
        }
        game.llenarJuego(jugadores,sr);
        game.ronda();
        

    }
    
}
