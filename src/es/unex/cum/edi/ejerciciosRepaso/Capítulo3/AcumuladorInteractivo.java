package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Calcula el sumatorio de los números pares entre 1 y 1000

public class AcumuladorInteractivo {

    int suma = 0;
    int numValores = 0;

    public void anadirNumero(int n) {
       suma = suma + n;
       numValores++;
    }
    
    public int getSuma() {
      return suma;
    }

    public double getMedia() {
      return (double)suma / numValores;
    }
    
}
