/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201504200;

import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author Dénilson Argueta
 */
public class NodoSimple {
    private String palabra;
    private String x;
    private String y;
    private Icon icono;
    private JButton boton;
    private NodoSimple siguiente;
    
    public NodoSimple(String palabra)
    {
        this.palabra=palabra;
        siguiente=null;
    }
    public NodoSimple(String x, String y)
    {
        this.x=x;
        this.y=y;
        siguiente=null;
    }
    public NodoSimple(String x, String y, JButton boton, String palabra)
    {
        this.x=x;
        this.y=y;
        this.boton=boton;
        this.palabra=palabra;
        siguiente=null;
  
    }

 
    /**
     * @return the siguiente
     */
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
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
     * @return the x
     */
    public String getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(String x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public String getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(String y) {
        this.y = y;
    }

    /**
     * @return the icono
     */
    public Icon getIcono() {
        return icono;
    }

    /**
     * @param icono the icono to set
     */
    public void setIcono(Icon icono) {
        this.icono = icono;
    }

    /**
     * @return the boton
     */
    public JButton getBoton() {
        return boton;
    }

    /**
     * @param boton the boton to set
     */
    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
    
}
