/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201504200;

/**
 *
 * @author Dénilson Argueta
 */
public class NodoCircular {
    private String nombre;
    private NodoCircular siguiente;
    private NodoCircular anterior;
    private ListaSimple letras;
    private int puntos;
    
    public NodoCircular(String nombre, ListaSimple letras,int puntos) {
        this.nombre = nombre;
        this.letras=letras;
        this.puntos=puntos;
        setSiguiente(this);
        setAnterior(this);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoCircular getAnterior() {
        return anterior;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoCircular anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the letras
     */
    public ListaSimple getLetras() {
        return letras;
    }

    /**
     * @param letras the letras to set
     */
    public void setLetras(ListaSimple letras) {
        this.letras = letras;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
