package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;/*
 Calcular la raíz cuadrada de un número introducido por teclado. Hay que tener la precaución de
 comprobar que el número sea positivo.
*/

public class RaizCuadrada {

  public double calcularRaizCuadrada(double n) {
    if (n >= 0) {
      return Math.sqrt(n);
    }
    else {
      return -1;
    }
  }

}







