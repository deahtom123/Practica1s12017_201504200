/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201504200;
import extras.LectorXML;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 *
 * @author Dénilson Argueta
 */
public class EDDPractica1_201504200 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Se crea un SAXBuilder para poder parsear el archivo
       LeerArchivo hola= new LeerArchivo();
       hola.setVisible(true);
    }
    
}
