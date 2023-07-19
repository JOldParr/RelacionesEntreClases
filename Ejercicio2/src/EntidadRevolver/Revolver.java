/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadRevolver;

import java.util.Random;

/**
 *
 * @author Julian
 */
public class Revolver {
    
    private int PosicionActual;
    private int PosicionAgua;

    public Revolver() {
    }

    public Revolver(int PosicionActual, int PosicionAgua) {
        this.PosicionActual = PosicionActual;
        this.PosicionAgua = PosicionAgua;
    }
    
    public int getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(int PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }
   
    public void llenarRevolver(){
        
        Random PosActual = new Random();
        Random PosAgua = new Random();

        PosicionActual=PosActual.nextInt(6)+1;
        PosicionAgua=PosAgua.nextInt(6)+1;
        System.out.println("La posición de inicio del jugador es: "+ PosicionActual);
        System.out.println("La posición de la bala es: " + PosicionAgua);
    }
    
    public boolean mojar(){
        if(PosicionActual==PosicionAgua)
        {
            return true;
        }else{
            return false;
        }
    }
    
    public void siguienteChorro(){
        
        if(PosicionActual==6){
            PosicionActual=1;
        }else{
            PosicionActual++;
        }
    }
}
