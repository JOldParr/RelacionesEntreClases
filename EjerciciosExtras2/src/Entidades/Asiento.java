/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Julian
 */
public class Asiento implements Comparable<Asiento>{
    
    private int fila;
    private String columna;
    private String ocupado;

    public Asiento() {
        
    }

    public Asiento(int fila, String columna, String ocupado) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    

    

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + '}';
    }

    @Override
    public int compareTo(Asiento silla) {
        return this.fila - silla.getFila();
        
    }
    
    
}
