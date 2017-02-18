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
public class NodoMatriz {
    private String palabra;
    private NodoMatriz derecha;
    private NodoMatriz izquierda;
    private NodoMatriz arriba;
    private NodoMatriz abajo;
    public NodoMatriz(String palabra)
    {
        this.palabra=palabra;
        derecha=null;
        izquierda=null;
        arriba=null;
        abajo=null;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the derecha
     */
    public NodoMatriz getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(NodoMatriz derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the izquierda
     */
    public NodoMatriz getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoMatriz izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the arriba
     */
    public NodoMatriz getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoMatriz arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public NodoMatriz getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoMatriz abajo) {
        this.abajo = abajo;
    }
    
    
}
