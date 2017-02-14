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
public class ListaCircular {
    private NodoCircular cabeza;
    public ListaCircular()
    {
        setCabeza(null);
    }
    public void insertar(String nombre)
    {
        NodoCircular nuevo=new NodoCircular(nombre);
        if(cabeza!=null)
        {
            nuevo.setSiguiente(cabeza.getSiguiente());
            cabeza.setSiguiente(nuevo);
            nuevo.setAnterior(cabeza);
        }
        setCabeza(nuevo);
        cabeza.getSiguiente().setAnterior(cabeza);
    }
    public void mostrar() {
        NodoCircular actual;
        System.out.println("Elementos de la lista");
        for (actual = getCabeza().getSiguiente(); actual != cabeza; actual = actual.getSiguiente()) {
            System.out.println(actual.getNombre());
        }
        System.out.println(actual.getNombre());
    }

    /**
     * @return the cabeza
     */
    public NodoCircular getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoCircular cabeza) {
        this.cabeza = cabeza;
    }
}
