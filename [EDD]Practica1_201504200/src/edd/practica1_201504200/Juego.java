/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201504200;
//import edd.practica1_201504200.LeerArchivo;
import extras.LectorXML;
import static java.awt.Image.SCALE_DEFAULT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Dénilson Argueta
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        cambiar=false;
    }
    public void actualizar(ListaSimple lista)
    {
        NodoSimple actualsimple=lista.getCabeza();
        jButton5.setText(actualsimple.getPalabra());
        checkbox1.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton6.setText(actualsimple.getPalabra());
        checkbox2.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton7.setText(actualsimple.getPalabra());
        checkbox3.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton8.setText(actualsimple.getPalabra());
        checkbox4.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton9.setText(actualsimple.getPalabra());
        checkbox5.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton10.setText(actualsimple.getPalabra());
        checkbox6.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton11.setText(actualsimple.getPalabra());
        checkbox7.setLabel(actualsimple.getPalabra());
        
    }
    public void empezar(ListaCircular b, Cola letras)
    {
        //jugadores=b;
        this.letras=letras;
        actual=jugadores.getCabeza();
        ListaSimple lista=actual.getLetras();
        String nombre=actual.getNombre();
        jLabel2.setText(nombre);
        lista.imprimir();
        ListaSimple diccionario=new ListaSimple();
        diccionario.imprimir();
        actualizar(lista);
        crear2();
    }
    MatrizOrtogonal m;
    public void crear2()
    {
        int tamano=600/dimension;
        int x=0, y=0;
        m=new MatrizOrtogonal(dimension);
        m.insertar();
        NodoMatriz auxiliar;
        ImageIcon fot = new ImageIcon("C:\\imagenes\\graficos\\2.png");
        Icon dobl = new ImageIcon(fot.getImage().getScaledInstance(tamano, tamano, SCALE_DEFAULT));
        ImageIcon fot2 = new ImageIcon("C:\\imagenes\\graficos\\3.png");
        Icon tripl = new ImageIcon(fot2.getImage().getScaledInstance(tamano, tamano, SCALE_DEFAULT));
        ActionListener myButtonListener = new MyButtonListener();
          for (int posY=0 ; posY<dimension; posY++)
          {
                auxiliar = m.buscar(0, posY);
                x=0;
                for (int posX=0 ; posX<dimension; posX++)
                {
                    JButton boton=new JButton();
                    String palabra="";
                    //JLabel boton=new JLabel();
                    jPanel3.add(boton);
                    boton.setVisible(true);       
                    boton.setBounds(x,y,tamano,tamano);
                    //boton.setText(letraselect);
                    if(verificardob(posX,posY)==true)
                    {
                        boton.setIcon(dobl);
                        palabra="2";
                        
                    }
                    if(verificartrip(posX,posY)==true)
                    {
                        boton.setIcon(tripl);
                        palabra="3";
                    }
                    auxiliar.setBoton(boton);
                    auxiliar.setPalabra(palabra);

                    auxiliar=auxiliar.getDerecha();
                    x=x+tamano;
                }
                y=y+tamano;
          }
    }

    public boolean verificardob(int x, int y)
    {
        for(NodoSimple actual=LectorXML.doble.getCabeza();actual!=null;actual=actual.getSiguiente())
        {
            int posx=Integer.parseInt(actual.getX());
            int posy=Integer.parseInt(actual.getY());
            if(posx==x+1 && posy==y+1)
            {
                return true;
            }      
        }
        return false;
    }
    public boolean verificartrip(int x, int y)
    {
        for(NodoSimple actual=LectorXML.triple.getCabeza();actual!=null;actual=actual.getSiguiente())
        {
            int posx=Integer.parseInt(actual.getX());
            int posy=Integer.parseInt(actual.getY());
            if(posx==x+1 && posy==y+1)
            {
                return true;
            }      
        }
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        checkbox1 = new java.awt.Checkbox();
        checkbox5 = new java.awt.Checkbox();
        checkbox6 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        checkbox7 = new java.awt.Checkbox();
        checkbox4 = new java.awt.Checkbox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addTab("Mano Jugador", jLabel7);
        jTabbedPane1.addTab("Lista Jugadores", jLabel10);
        jTabbedPane1.addTab("Cola de fichas", jLabel11);
        jTabbedPane1.addTab("Matriz Tablero", jLabel12);
        jTabbedPane1.addTab("Lista Diccionario", jLabel13);

        jButton3.setText("Validar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Letras Activas");

        jButton5.setText("jButton5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton12.setText("Crear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Actualizar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jButton14.setText("Matriz");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Terminar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel14.setText("        ");
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel14MouseDragged(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });

        jLabel15.setText("        ");
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel15MouseDragged(evt);
            }
        });
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel15MouseReleased(evt);
            }
        });

        jLabel16.setText("        ");
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel16MouseDragged(evt);
            }
        });
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel16MouseReleased(evt);
            }
        });

        jLabel17.setText("        ");
        jLabel17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel17MouseDragged(evt);
            }
        });
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel17MouseReleased(evt);
            }
        });

        jLabel18.setText("        ");
        jLabel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel18MouseDragged(evt);
            }
        });
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
        });

        jLabel19.setText("        ");
        jLabel19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel19MouseDragged(evt);
            }
        });
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel19MouseReleased(evt);
            }
        });

        jLabel20.setText("        ");
        jLabel20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel20MouseDragged(evt);
            }
        });
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel20MouseReleased(evt);
            }
        });

        jLabel1.setText("Turno de");

        jLabel2.setText("jLabel2");

        jLabel3.setText("Puntuacion");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Nueva Palabra");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cambiar Letras");

        checkbox1.setLabel("a");

        checkbox5.setLabel("a");

        checkbox6.setLabel("a");

        checkbox2.setLabel("a");

        checkbox3.setLabel("a");

        checkbox7.setLabel("a");

        checkbox4.setLabel("a");

        jButton2.setText("cambiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(58, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(checkbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))
                        .addGap(29, 29, 29)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(45, 45, 45)
                                .addComponent(jButton3)
                                .addGap(33, 33, 33)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton15)
                                .addGap(28, 28, 28)
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton14)
                                    .addComponent(jButton15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9)
                                    .addComponent(jButton10)
                                    .addComponent(jButton11)
                                    .addComponent(jButton5)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4))
                                .addGap(14, 14, 14))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public ListaCircular jugadores=LeerArchivo.jugadores;
    public NodoCircular actual;
    public LeerArchivo b= new LeerArchivo();
    public ListaSimple diccionario=LectorXML.Diccionario;
    public Cola letras;
    public int [][] hola=new int[4][4];
    public JButton [][] holu;
    public int dimension=Integer.parseInt(LectorXML.dimensiones);
    boolean select=false;
    JButton butonselect;
    String letraselect;
    
    public class MyButtonListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
                int x=source.getX();
                int y=source.getY();
		//JOptionPane.showMessageDialog(source, source.getText() + " button has been pressed" +source.getX
                cambiar(x,y);
                //Juego cambiar(source.getX(),source.getY());
	}
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String palabra=jTextField1.getText();
        diccionario.insertar(palabra);
        jTextField1.setText("");
        diccionario.imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean valido=true;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        verificar();
        if(valido==true)
        {
            ListaSimple hola=new ListaSimple();
            for(int i=0; i<7; i++)
            {
                hola.insertar(letras.sacar());
                if(letras.cantidad()<0)
                 {
                 terminar();
                 }
            }
            actual.setLetras(hola);
            
            actual=actual.getSiguiente();
            jLabel2.setText(actual.getNombre());
            ListaSimple lista=actual.getLetras();
            actualizar(lista);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"MOVIMIENTO INVALIDO");
            quitar();   
        }
            jButton5.setVisible(true);
            jButton6.setVisible(true);
            jButton7.setVisible(true);
            jButton8.setVisible(true);
            jButton9.setVisible(true);
            jButton10.setVisible(true);
            jButton11.setVisible(true);
            valido=true;
            cambiar=false; 
        
    }//GEN-LAST:event_jButton3ActionPerformed
    public void verificar()
    {
        NodoMatriz auxiliar;
        boolean horizontal=true;
        boolean vertical=true;
                
          for(NodoSimple aqui=prueba.getCabeza();aqui.getSiguiente()!=null; aqui=aqui.getSiguiente())
          {
              if(!(aqui.getX().equals(aqui.getSiguiente().getX())))
              {
                  vertical=false;
              }
              if(!(aqui.getY().equals(aqui.getSiguiente().getY())))
              {
                  horizontal=false;
              }
          }
          if (vertical==true)
          {
              int columna=0;
              int menor=100;int mayor=-1;
              for(NodoSimple aqui=prueba.getCabeza();aqui!=null; aqui=aqui.getSiguiente())
              {
                  int y=Integer.parseInt(aqui.getY());
                  columna=Integer.parseInt(aqui.getX());
                  if(y<menor)
                  {
                      menor=y;
                  }
                  if(y>mayor)
                  {
                      mayor=y;
                  }
              }
              validarv(menor, mayor,columna);
              
          }
          if(horizontal==true)
          {
              int fila=0;
              int menor=100;int mayor=-1;
              for(NodoSimple aqui=prueba.getCabeza();aqui!=null; aqui=aqui.getSiguiente())
              {
                  fila=Integer.parseInt(aqui.getY());
                  int x=Integer.parseInt(aqui.getX());
                  if(x<menor)
                  {
                      menor=x;
                  }
                  if(x>mayor)
                  {
                      mayor=x;
                  }
              }
              validarh(menor, mayor,fila);
          }
          if(horizontal==false&&vertical==false)
          {
              valido=false;
          }
    }
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        Graficas g=new Graficas();
        try {
            g.txt(actual.getLetras(),actual.getNombre());
            g.txt(jugadores);
            g.txt(letras);
            g.txt(diccionario);
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
//        jLabel8.setText(jTabbedPane1.getWidth() +" "+jTabbedPane1.getHeight());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ListaSimple auxiliar=new ListaSimple();
        int contar=7;
        if(checkbox1.getState()==false)
        {
             auxiliar.insertar(checkbox1.getLabel());
             contar--;
        }
        else
        {
            letras.add(checkbox1.getLabel());
        }
        if(checkbox2.getState()==false)
        {
             auxiliar.insertar(checkbox2.getLabel());
             contar--;
        }
        else
        {
            letras.add(checkbox2.getLabel());
        }
        if(checkbox3.getState()==false)
        {
             auxiliar.insertar(checkbox3.getLabel());
             contar--;
        }
        else
        {
            letras.add(checkbox3.getLabel());
        }
        if(checkbox4.getState()==false)
        {
             auxiliar.insertar(checkbox4.getLabel());
             contar--;
        }
        else
        {
            letras.add(checkbox4.getLabel());
        }
        if(checkbox5.getState()==false)
        {
             auxiliar.insertar(checkbox5.getLabel());
             contar--;
        }
        else
        {
            letras.add(checkbox5.getLabel());
        }
        if(checkbox6.getState()==false)
        {
             auxiliar.insertar(checkbox6.getLabel());
             contar--;
        }
        else
        {
            letras.add(checkbox6.getLabel());
        }
        if(checkbox7.getState()==false)
        {
             auxiliar.insertar(checkbox7.getLabel());
             contar--;
        }
        else
        {
            letras.add(checkbox7.getLabel());
        }
//        //aqui
//        if(letras.cantidad()>=contar)
//        {
//            
//        }
        
        for(int i=0; i<contar; i++)
        {
            auxiliar.insertar(letras.sacar());
            if(letras.cantidad()<0)
             {
                 terminar();
             }
        }
        
        checkbox1.setState(false);
        checkbox2.setState(false);
        checkbox3.setState(false);
        checkbox4.setState(false);
        checkbox5.setState(false);
        checkbox6.setState(false);
        checkbox7.setState(false);
        
        actual.setLetras(auxiliar);
        letras.mostrar();
        actualizar(auxiliar);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        actualizarimagenes();
    }//GEN-LAST:event_jButton13ActionPerformed
    public void actualizarimagenes()
    {
        jLabel7.setBounds(0, 0, 240, 600);
        ImageIcon fot = new ImageIcon("C:\\imagenes\\graficos\\mano.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel7.setIcon(icono);
        
        jLabel10.setBounds(0, 0, 240, 600);
        ImageIcon fot2 = new ImageIcon("C:\\imagenes\\graficos\\jugadores.jpg");
        Icon icono2 = new ImageIcon(fot2.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel10.setIcon(icono2);
        
        jLabel11.setBounds(0, 0, 240, 600);
        ImageIcon fot3 = new ImageIcon("C:\\imagenes\\graficos\\fichas.jpg");
        Icon icono3 = new ImageIcon(fot3.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel11.setIcon(icono3);
        
         jLabel13.setBounds(0, 0, 240, 600);
        ImageIcon fot4 = new ImageIcon("C:\\imagenes\\graficos\\diccionario.jpg");
        Icon icono4 = new ImageIcon(fot4.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel13.setIcon(icono4);
        
         jLabel12.setBounds(0, 0, 240, 600);
        ImageIcon fot5 = new ImageIcon("C:\\imagenes\\graficos\\tablero.jpg");
        Icon icono5 = new ImageIcon(fot5.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel12.setIcon(icono5);
        
    }
        int x1,x2;    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
         Graficas g=new Graficas();
        try {
//            g.txt(actual.getLetras(),0);
            g.txt(jugadores);
            //g.txt(letras);
            g.txt(diccionario);
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        jLabel7=new JLabel();
//        jLabel7.setIcon(new ImageIcon("C:\\imagenes\\grafo.jpg"));
//        jLabel7.setBounds(0, 0, 174, 344);
        //System.out.println("si");
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        jButton5.setLocation(20,618);
//        jButton6.setLocation(89,618);
//        jButton7.setLocation(162,618);
//        jButton8.setLocation(227,618);
//        jButton9.setLocation(286,618);
//        jButton10.setLocation(354,618);
//        jButton11.setLocation(423,618);
          jButton5.setVisible(true);
          jButton6.setVisible(true);
          jButton7.setVisible(true);
          jButton8.setVisible(true);
          jButton9.setVisible(true);
          jButton10.setVisible(true);
          jButton11.setVisible(true);
          
 
//          NodoMatriz auxiliar;
//          for (int posY=0 ; posY<dimension; posY++)
//          {
//              auxiliar = m.buscar(0,posY);
//                for (int posX=0 ; posX<dimension; posX++){
//                    System.out.print("<-"+auxiliar.getPalabra()+"->");
//                    auxiliar=auxiliar.getDerecha();
//            }
//                System.out.println("");
//          }
          
          quitar();
          cambiar=false;        

    }//GEN-LAST:event_jButton4ActionPerformed

    public void quitar()
    {
        NodoMatriz auxiliar;
          for(NodoSimple aqui=prueba.getCabeza();aqui!=null; aqui=aqui.getSiguiente())
          {
              auxiliar=m.buscar(Integer.parseInt(aqui.getX()), Integer.parseInt(aqui.getY()));
              Icon actual2=aqui.getBoton().getIcon();
              JButton pre=auxiliar.getBoton();
              pre.setIcon(null);
              auxiliar.setBoton(pre);
              auxiliar.setPalabra("");
          }
    }
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Graficas g=new Graficas();
        try {
            g.txt(m,dimension);
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed
    public void cambiar(int posx, int posy)
    {
        if(select=true)
        {
        int tamano=600/dimension;
        int x=posx/tamano;
        int y=posy/tamano;
        NodoMatriz actual=m.buscar(x, y);
        
        ImageIcon fot = new ImageIcon("C:\\imagenes\\graficos\\2.png");
        Icon dobl = new ImageIcon(fot.getImage().getScaledInstance(600/dimension, 600/dimension, SCALE_DEFAULT));
        
            JButton nuevo=actual.getBoton();
            nuevo.setIcon(dobl);
            actual.setBoton(nuevo);
            JOptionPane.showMessageDialog(null,""+butonselect.getText()); 
        }
        
//        jPanel3.add(nuevo);
//        nuevo.setVisible(true);       
//        nuevo.setBounds(0,0,600/dimension,600/dimension);
        
        
    }
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
         int x= evt.getX(); 
        int y = evt.getY();
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        terminar();
    }//GEN-LAST:event_jButton15ActionPerformed
    public void terminar()
    {
        int puntos=-2;
        String nombre="";
        for (actual = jugadores.getCabeza().getSiguiente(); actual != jugadores.getCabeza(); actual = actual.getSiguiente()) {
            if(actual.getPuntos()>puntos)
            {
                puntos=actual.getPuntos();
                nombre=actual.getNombre();
            }
        }
        if(actual.getPuntos()>puntos)
        {
            puntos=actual.getPuntos();
            nombre=actual.getNombre();
        }
        JOptionPane.showMessageDialog(null, "EL GANADOR ES: "+nombre+" CON "+puntos+" PUNTOS");
    }
    public void validarv(int menor, int mayor,int columna)
    {
        int puntuacion=0;
        String palabra="";
        for(int i=menor; i<=mayor; i++)
        {
            puntuacion=puntuacion+puntos(m.buscar(columna, i).getPalabra());
            palabra=palabra+m.buscar(columna, i).getPalabra();
            if(m.buscar(columna, i).getPalabra().equalsIgnoreCase(""))
            {
                palabra=palabra+"!3231";
            }
        }
        if(buscarpalabra(palabra))
        {
            actual.setPuntos(actual.getPuntos()+puntuacion);
            String texto=jTextArea1.getText();
            jTextArea1.setText(jTextArea1.getText()+actual.getNombre()+"="+actual.getPuntos());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ESA PALABRA NO EXISTE");
            valido=false;
        }
    }
    public void validarh(int menor, int mayor,int fila)
    {
        int puntuacion=0;
        String palabra="";
        for(int i=menor; i<=mayor; i++)
        {
            puntuacion=puntuacion+puntos(m.buscar(i,fila).getPalabra());
            palabra=palabra+m.buscar(i,fila).getPalabra();
            if(m.buscar(i,fila).getPalabra().equalsIgnoreCase(""))
            {
                palabra=palabra+"!3231";
            }
        }
        if(buscarpalabra(palabra))
        {
            actual.setPuntos(actual.getPuntos()+puntuacion);
            String texto=jTextArea1.getText();
            jTextArea1.setText(jTextArea1.getText()+actual.getNombre()+"="+actual.getPuntos());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ESA PALABRA NO EXISTE");
            valido=false;
        }
    }
    public int puntos(String letra)
    {
        int cantidad=0;
        if(letra.equalsIgnoreCase("a")|letra.equalsIgnoreCase("e")|letra.equalsIgnoreCase("o")|letra.equalsIgnoreCase("i")|letra.equalsIgnoreCase("s")|letra.equalsIgnoreCase("n")|letra.equalsIgnoreCase("l")|letra.equalsIgnoreCase("r")|letra.equalsIgnoreCase("u")|letra.equalsIgnoreCase("t"))
        {
            cantidad=1;
        }
        if(letra.equalsIgnoreCase("d")|letra.equalsIgnoreCase("g"))
        {
            cantidad=2;
        }
        if(letra.equalsIgnoreCase("c")|letra.equalsIgnoreCase("b")|letra.equalsIgnoreCase("m")|letra.equalsIgnoreCase("p"))
        {
            cantidad=3;
        }
        if(letra.equalsIgnoreCase("h")|letra.equalsIgnoreCase("f")|letra.equalsIgnoreCase("v")|letra.equalsIgnoreCase("y"))
        {
            cantidad=4;
        }
        if(letra.equalsIgnoreCase("q"))
        {
            cantidad=5;
        }
        if(letra.equalsIgnoreCase("j")|letra.equalsIgnoreCase("ñ")|letra.equalsIgnoreCase("x"))
        {
            cantidad=8;
        }
        if(letra.equalsIgnoreCase("z"))
        {
            cantidad=10;
        }
        return cantidad;
    }
    public boolean buscarpalabra(String palabra)
    {
        for(NodoSimple aqui=diccionario.getCabeza();aqui!=null; aqui=aqui.getSiguiente())
        {
            if(aqui.getPalabra().equalsIgnoreCase(palabra))
            {
                return true;
            }
        }
        return false;   
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        x1=jLabel14.getX();
        x2=jLabel14.getY();
        butonselect=jButton5;
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseDragged
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jButton5.setLocation(x+x1,y+x2);
    }//GEN-LAST:event_jLabel14MouseDragged

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        // TODO add your handling code here:
        int x=jButton5.getX();
        int y=jButton5.getY();
        cambiarficha(x,y);
        
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        x1=jLabel15.getX();
        x2=jLabel15.getY();
        butonselect=jButton6;
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseDragged
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jButton6.setLocation(x+x1,y+x2);
    }//GEN-LAST:event_jLabel15MouseDragged

    private void jLabel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseReleased
        // TODO add your handling code here:
        int x=jButton6.getX();
        int y=jButton6.getY();
        cambiarficha(x,y);
    }//GEN-LAST:event_jLabel15MouseReleased

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
        x1=jLabel16.getX();
        x2=jLabel16.getY();
        butonselect=jButton7;
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseDragged
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jButton7.setLocation(x+x1,y+x2);
    }//GEN-LAST:event_jLabel16MouseDragged

    private void jLabel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseReleased
        // TODO add your handling code here:
        int x=jButton7.getX();
        int y=jButton7.getY();
        cambiarficha(x,y);
    }//GEN-LAST:event_jLabel16MouseReleased

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        // TODO add your handling code here:
        x1=jLabel17.getX();
        x2=jLabel17.getY();
        butonselect=jButton8;
    }//GEN-LAST:event_jLabel17MousePressed

    private void jLabel17MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseDragged
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jButton8.setLocation(x+x1,y+x2);
    }//GEN-LAST:event_jLabel17MouseDragged

    private void jLabel17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseReleased
        // TODO add your handling code here:
        int x=jButton8.getX();
        int y=jButton8.getY();
        cambiarficha(x,y);
    }//GEN-LAST:event_jLabel17MouseReleased

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        // TODO add your handling code here:
         x1=jLabel18.getX();
        x2=jLabel18.getY();
        butonselect=jButton9;
    }//GEN-LAST:event_jLabel18MousePressed

    private void jLabel18MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseDragged
        // TODO add your handling code here:
         int x= evt.getX(); 
        int y = evt.getY();
        jButton9.setLocation(x+x1,y+x2);
    }//GEN-LAST:event_jLabel18MouseDragged

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
        // TODO add your handling code here:
         int x=jButton9.getX();
        int y=jButton9.getY();
        cambiarficha(x,y);
    }//GEN-LAST:event_jLabel18MouseReleased

    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
        // TODO add your handling code here:
       x1=jLabel19.getX();
        x2=jLabel19.getY();
        butonselect=jButton10;
    }//GEN-LAST:event_jLabel19MousePressed

    private void jLabel19MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseDragged
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jButton10.setLocation(x+x1,y+x2);
    }//GEN-LAST:event_jLabel19MouseDragged

    private void jLabel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseReleased
        // TODO add your handling code here:
        int x=jButton10.getX();
        int y=jButton10.getY();
        cambiarficha(x,y);
    }//GEN-LAST:event_jLabel19MouseReleased

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        // TODO add your handling code here:
        x1=jLabel20.getX();
        x2=jLabel20.getY();
        butonselect=jButton11;
        butonselect=jButton11;
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel20MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseDragged
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jButton11.setLocation(x+x1,y+x2);
    }//GEN-LAST:event_jLabel20MouseDragged

    private void jLabel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseReleased
        // TODO add your handling code here:
        int x=jButton11.getX();
        int y=jButton11.getY();
        cambiarficha(x,y);
    }//GEN-LAST:event_jLabel20MouseReleased
//    public MatrizOrtogonal n=new MatrizOrtogonal(dimension);
    public boolean cambiar;
    public ListaSimple prueba=new ListaSimple();
    public void cambiarficha(int posx, int posy)
    {
        if(cambiar==false)
        {
            prueba=new ListaSimple();
            cambiar=true;
        }
        posx=posx-51;
        posy=posy-12;
        int tamano=600/dimension;
        int x=posx/tamano;
        int y=posy/tamano;
        NodoMatriz actual=m.buscar(x, y);
        JButton nuevo=actual.getBoton();
        prueba.insertar(String.valueOf(x),String.valueOf(y),actual.getBoton(),actual.getPalabra());
        nuevo.setIcon(imagenletra(butonselect.getText()));
        actual.setBoton(nuevo);
        actual.setPalabra(butonselect.getText());
        butonselect.setVisible(false);
        
    }
    public Icon imagenletra(String letra)
    {
        letra=letra.toLowerCase();
        ImageIcon fot = new ImageIcon("C:\\imagenes\\graficos\\letras\\"+letra+".png");
        Icon a = new ImageIcon(fot.getImage().getScaledInstance(600/dimension, 600/dimension, SCALE_DEFAULT));
        return a;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private java.awt.Checkbox checkbox5;
    private java.awt.Checkbox checkbox6;
    private java.awt.Checkbox checkbox7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
