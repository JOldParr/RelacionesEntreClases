/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Julian
 */
public class Cine {

    private Pelicula pelicula;
    private ArrayList<Asiento> sala;
    private ArrayList<Espectador> espectadores;
    private double precioEntrada;
    int asientoLibre = 48;

    public Cine() {
        this.sala = new ArrayList(48);
    }

    public Cine(Pelicula pelicula, ArrayList<Espectador> espectadores, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = new ArrayList(48);
        this.espectadores = espectadores;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Asiento> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Asiento> sala) {
        this.sala = sala;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void llenarSala() {
        for (Espectador aux : espectadores) {
            if (aux.getDinero() >= precioEntrada && aux.getEdad() >= pelicula.getEdadMinima()) {
                asignarAsiento(aux.getNombre());
            }
        }
    }

    public void asignarAsiento(String nombre) {
        if (asientoLibre > 0) {
            int posicion = new Random().nextInt(48) + 1;

        }
    }

    public void CineAPP() {
        for (int i = 0; i < sala.size(); i++) {
            
            
        }

    }

}
