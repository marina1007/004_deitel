package Ejercicio1Cap4;

/**
 * Created by marina on 12/02/18.
 */

import javax.swing.*;
import java.awt.*;

/**
 * Cree el disenio d la fig 4.20. este diseno dibuja lineas que parten desde la esquina superior izquierda, y se despliega
 * hasta cubrir la mitad superior izquierda del panel. Un metodo es dividir la anchura y la altura en un nuero equivalente
 * de pasos(15 pasos es una buena cantidad ). el primer punto final de una linea siempre estara en la esquina superior
 * izquierda(0,0). El segundo punto final puede encontrarse partiendo desde la esquina inferior izquierda, y avanzando
 * un paso vertical hacia arriba, y uno horizontal hacia la derecha. Dibuje una linea entre dos untos finales.
 * Continue avanzando un paso hacia arriba y a la derecha, para encontrar cada punto final sucesivo.
 * La figura debera escalarse de manera apropiada a medida ue usted cambie el tamano de la ventana.
 */
public class DisenioGrafico extends JPanel{

  public void paintComponent (Graphics g){

    //llamo a paintComponent para que se muestre el panel
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    //dibuja una linea de la esquina superior izquierda a la esquina inferior derecha
    g.drawLine(0, 0, anchura, altura);

  }

}
