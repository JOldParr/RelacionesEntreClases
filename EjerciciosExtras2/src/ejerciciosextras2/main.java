/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras2;

import Entidades.*;
import java.util.*;


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
        Pelicula p1 = new Pelicula("piratas del caribe 1",2,12,"Jack Sparrow");
        Pelicula p2 = new Pelicula("Shrek",2,8,"Burro");
        Pelicula p3 = new Pelicula("La lista Schindler",4,18,"Schindler");
        
        ArrayList<Espectador> espectadores = new ArrayList<>();
        Espectador e1 = new Espectador("Vicky",15,20);
        espectadores.add(e1);
        Espectador e2 = new Espectador("Robert",30,30);
        espectadores.add(e2);
        Espectador e3 = new Espectador("Julian",28,10);
        espectadores.add(e3);
        Espectador e4 = new Espectador("Albert",12,5);
        espectadores.add(e4);
        
        Cine c = new Cine(p1, espectadores,15);
        //System.out.println(c.getSala().length);
        //Random random = new Random();
        //System.out.println(random.ints().distinct());
        //System.out.println(c.getSala().size());
        //c.crearCine();
        c.CineAPP();
        c.mostrarCine();
        c.llenarSala();
        c.mostrarCine();
        
        
        
    }
    
}
