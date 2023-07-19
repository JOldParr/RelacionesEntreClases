/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadJugador;

import EntidadRevolver.Revolver;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Jugador {
    
    private String id;
    private String nombre;
    private boolean mojado;

    public Jugador(String id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre + id;
        this.mojado = mojado;
    }

    public Jugador() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public void crearJugador(){
        id= JOptionPane.showInputDialog("Indique el ID");
        nombre= JOptionPane.showInputDialog("Indique el nombre");
        mojado=false;
    }
    
    public void disparo(Revolver r){
        Revolver sr = new Revolver();
    mojado=sr.mojar();        
    sr.siguienteChorro();
    }
          
}
