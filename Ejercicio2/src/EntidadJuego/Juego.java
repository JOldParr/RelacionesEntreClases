/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadJuego;


import EntidadJugador.Jugador;
import EntidadRevolver.Revolver;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Juego {
    Jugador j = new Jugador();
    private Revolver pistola;
    private ArrayList<Jugador> jugadores;
    
/*
    public Juego(ServiciosRevolver pistola, ArrayList<ServiciosJugador> jugadores) {
        this.pistola = pistola;
        this.jugadores = new ArrayList();
    }
*/
    public Juego() {
        this.pistola = pistola;
        
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores,Revolver pistola){
        this.jugadores = jugadores;
        pistola.llenarRevolver();
        this.pistola = pistola;
    }

    public void ronda(){
        System.out.println("La posicion actual de juego es: " + pistola.getPosicionActual());
        if ( pistola.mojar()==true){
            System.out.println("te mojaste");
        }else{
        pistola.siguienteChorro();
        ronda();
        }
    }
    
}
