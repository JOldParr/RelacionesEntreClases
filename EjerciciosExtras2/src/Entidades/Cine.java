/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        int puesto;
        Asiento a;
        for (Espectador aux : espectadores) {
            if (aux.getDinero() >= precioEntrada && aux.getEdad() >= pelicula.getEdadMinima()) {
                puesto = asignarAsiento();
                a = sala.get(puesto);
                a.setOcupado("Ocupado");
            }
        }
    }

    public int asignarAsiento() {
        Random ramdon = new Random();
        Asiento a;
        int asientoAsignado = 0;
        if (asientoLibre > 0) {
            int posicion = ramdon.nextInt(48) + 1;
            a = sala.get(posicion);
            if (a.getOcupado().equalsIgnoreCase("ocupado")) {
                asignarAsiento();
            } else {
                a.setOcupado("ocupado");
                sala.set(posicion, a);
                asientoLibre--;
            }
        }
        return asientoAsignado;
    }

    public Asiento crearCine() {
        Asiento a = new Asiento();
        for (int fila = 1; fila <= 8; fila++) {
            for (int columna = 1; columna <= 6; columna++) {
                switch (columna) {
                    case 1:
                        a = new Asiento(fila, "A", "vacio");
                        sala.add(a);
                        break;
                    case 2:
                        a = new Asiento(fila, "B", "vacio");
                        sala.add(a);
                        break;
                    case 3:
                        a = new Asiento(fila, "C", "vacio");
                        sala.add(a);
                        break;
                    case 4:
                        a = new Asiento(fila, "D", "vacio");
                        sala.add(a);
                        break;
                    case 5:
                        a = new Asiento(fila, "E", "vacio");
                        sala.add(a);
                        break;
                    case 6:
                        a = new Asiento(fila, "F", "vacio");
                        sala.add(a);
                        break;
                }
            }
        }

        return a;
    }

    public void CineAPP() {
        Asiento a = crearCine();
        for (int i = 0; i < 48; i += 2) {
            a = sala.get(i);
            a.setOcupado("ocupado");
            sala.set(i, a);
            asientoLibre--;
        }
    }
    
    public void mostrarCine(){
        Collections.sort(sala, (x, y) -> x.getColumna().compareTo(y.getColumna()));
        Collections.sort(sala);
        int i = 1;
        for (Asiento aux : sala) {

            System.out.println((i++) + " " + aux.toString());
        }
        System.out.println("");
        System.out.println("asientos libres:" + asientoLibre);
    
    }

}
