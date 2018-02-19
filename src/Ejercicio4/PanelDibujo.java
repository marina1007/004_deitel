package Ejercicio4;

/**
 * Created by marina on 12/02/18.
 */

import javax.swing.*;
import java.awt.*;

/**
 * uso de drawLine para conectar las esquinas de un panel
 */
public class PanelDibujo extends JPanel{

  //dibuja una x desde las esquinas del panel
  public void paintComponent(Graphics g){

    //llama a paintcomponent para asegurar que el panel se muestre correctamente
    super.paintComponent(g);

    int anchura = getWidth(); //anchura total
    int altura = getHeight(); //altura total

    // dibuja una linea de la esquina superior izquierda a la esquina inferior derecha
    g.drawLine(0,0, anchura, altura);

    // dibuja una linea de la esquina inferior izquierda a la esquina superior derecha
    g.drawLine(0, altura, anchura,0);
  } // fin del metodo paintComponent
}// fin clase Paneldibujo
