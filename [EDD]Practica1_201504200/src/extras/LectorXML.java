/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;
import edd.practica1_201504200.ListaSimple;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom.Document;         // |
import org.jdom.Element;          // |\ Librerías
import org.jdom.JDOMException;    // |/ JDOM
import org.jdom.input.SAXBuilder; // |

 
/**
 *
 * @author Dénilson Argueta
 */
public class LectorXML {
public static ListaSimple Diccionario= new ListaSimple();
public void cargarXml(String direccion)
{
    //Se crea un SAXBuilder para poder parsear el archivo
    SAXBuilder builder = new SAXBuilder();
    File xmlFile = new File( "entrada.xml"); //aqui vas a poner direccion
    try
    {
        Document document = (Document) builder.build( xmlFile );
        Element raiz = document.getRootElement();
        
         //OBTENGO LAS DIMENSIONES
        Element dimension = raiz.getChild("dimension");
        String dim = dimension.getTextTrim();
        System.out.println(dim);
        
        //OBTENGO TODO DEL TAG <DOBLES>
            List dobles = raiz.getChildren("dobles");
            Element casillaDoble = (Element) dobles.get(0);
            List coordenadasDoble = casillaDoble.getChildren();
          
            for ( int j = 0; j < coordenadasDoble.size(); j++ )
            {
                Element coordenada = (Element)coordenadasDoble.get( j );
                String x = coordenada.getChildTextTrim("x");
                String y = coordenada.getChildTextTrim("y");
                System.out.println(x+","+y);
            }
            
        //OBTENGO TODO DEL TAG TRIPLES
            List triples =  raiz.getChildren("triples");
            Element casillaTriples = (Element)triples.get(0);
            List coordenadasTriple = casillaTriples.getChildren();
          
            for ( int j = 0; j < coordenadasTriple.size(); j++ )
            {
                Element coordenada = (Element)coordenadasTriple.get( j );
                String x = coordenada.getChildTextTrim("x");
                String y = coordenada.getChildTextTrim("y");
                System.out.println(x+","+y);
            }
            

        //OBTENGO TODO DEL TAG <DICCIONARIO>
            Element diccionario = raiz.getChild("diccionario");
            List Palabras = diccionario.getChildren();
            
            for (int i = 0; i < Palabras.size(); i++) {
            Element Palabra = (Element)Palabras.get(i);
            String palabra = Palabra.getTextTrim();
            System.out.println(palabra);
            Diccionario.insertar(palabra);
            //AGREGO LAS PALABRAS A LA LISTA SIMPLE
        }
            Diccionario.imprimir();
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }catch ( JDOMException jdomex ) {
        System.out.println( jdomex.getMessage() );
    }
}
}