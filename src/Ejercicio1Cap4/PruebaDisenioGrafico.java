package Ejercicio1Cap4;

import javax.swing.*;

/**
 * Created by marina on 12/02/18.
 */
public class PruebaDisenioGrafico {

  public static void main (String[] args){

    //crea un panel que contiene nuestro dibujo
    DisenioGrafico disenio = new DisenioGrafico();

    //crea un marco para contener el panel
    JFrame dibujo = new JFrame();

    // establece el marco para salir cuando se cierre
    dibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    dibujo.add(disenio); // agrega el disenio al marco
    dibujo.setSize(250,250); // establece el tamanio del marco
    dibujo.setVisible(true); // hace que el marco sea visible
  }
}
