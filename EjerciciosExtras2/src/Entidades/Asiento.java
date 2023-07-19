/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Asiento {
    
    private ArrayList<Integer> fila;
    private ArrayList<Integer> columna;
    private String ocupado;

    public Asiento() {
        this.fila = new ArrayList(8);
        this.columna = new ArrayList(6);
    }

    public Asiento(int fila, int columna, String ocupado) {
        this.fila = new ArrayList(8);
        this.columna = new ArrayList(6);
        this.ocupado = ocupado;
    }

    public ArrayList<Integer> getFila() {
        return fila;
    }

    public void setFila(ArrayList<Integer> fila) {
        this.fila = fila;
    }

    public ArrayList<Integer> getColumna() {
        return columna;
    }

    public void setColumna(ArrayList<Integer> columna) {
        this.columna = columna;
    }

    
    
    
    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }
    
    
    
}
