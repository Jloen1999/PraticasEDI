package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Calcula el sumatorio de los números pares entre 1 y 1000

public class AcumuladorSimple {

    public int calcularSuma() {
       int suma = 0;

       for (int i = 2; i <= 1000; i = i + 2) {
          suma = suma + i;
       }
       return suma;
    }
}
