/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201504200;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dénilson Argueta
 */
public class Graficas {
    public Graficas()
    {
        
    }
    private void ejecutar(String ruta, String ruta2)
    {
         try {
      
          String dotPath = "C:\\Graphviz2.30\\bin\\dot.exe";

          String fileInputPath = "C:\\imagenes\\archivo.txt";
          String fileOutputPath = "C:\\imagenes\\grafo.jpg";

          String tParam = "-Tjpg";
          String tOParam = "-o";

          String[] cmd = new String[5];
          cmd[0] = dotPath;
          cmd[1] = tParam;
          cmd[2] = fileInputPath;
          cmd[3] = tOParam;
          cmd[4] = fileOutputPath;

          Runtime rt = Runtime.getRuntime();
          rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
    }
    public void txt(ListaCircular jugadores) throws IOException
    {
        String ruta = "C:\\imagenes\\archivo.txt"; 
        File archivo = new File(ruta);
        BufferedWriter bw;

        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("digraph G {");
        NodoCircular actual;
        for (actual = jugadores.getCabeza().getSiguiente(); actual != jugadores.getCabeza(); actual = actual.getSiguiente()) {
            bw.write(actual.getNombre()+"->"+actual.getSiguiente().getNombre()+" ");
        }
        bw.write(actual.getNombre()+"->"+actual.getSiguiente().getNombre());
        bw.write("}");
        bw.close();
        ejecutar("hol","aqw");
    }
    public void txt(ListaSimple lista) throws IOException
    {
        String ruta = "C:\\imagenes\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;

        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("digraph G {");
        int i=0;
        for(NodoSimple actual=lista.getCabeza();actual!=null; actual=actual.getSiguiente())
        {
            bw.write("A"+i+"[label="+actual.getPalabra()+"] ");
            i=i+1;
//                bw.write(actual.getPalabra()+"->"+actual.getSiguiente().getPalabra()+" ");
        }
        for(int j=0; j<i-1;j++)
        {
            bw.write("A"+j+"->A"+String.valueOf(j+1)+" ");
        }
        bw.write("}");
        bw.close();
        ejecutar("hol","aqw");
    }
    
    
}
