package Ejercicio6Cap4;

/**
 * Created by marina on 19/02/18.
 */
/**
 * Combine las instrucciones que escribio en el ejercicio 4.5 para formar una aplicacion en Java que calcule e imprima la
 * suma de los enteros del 1 al 10. Use una instruccion while para iterar a traves de las instrucciones de calculo
 * e incremento
 */
public class SumaEnteros {

  public static void main (String [] args){
    int suma = 0;
    int x = 1;

    while (x <= 10){
      suma = x + suma;
      x = x + 1;

      System.out.println("El resultado de la suma es: " + suma);
    }
  }
}


