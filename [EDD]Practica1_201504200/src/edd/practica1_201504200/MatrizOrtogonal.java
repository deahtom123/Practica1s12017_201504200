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
public class MatrizOrtogonal {
    private NodoMatriz cabeza;
    public MatrizOrtogonal()
    {
        setCabeza(null);
    }
    public void insertar(String nombre)
    {
        NodoMatriz nuevo=new NodoMatriz(nombre);
        
    }

    /**
     * @return the cabeza
     */
    public NodoMatriz getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoMatriz cabeza) {
        this.cabeza = cabeza;
    }
    
    
    
}
