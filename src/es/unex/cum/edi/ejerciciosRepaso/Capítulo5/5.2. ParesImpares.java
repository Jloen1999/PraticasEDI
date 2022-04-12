package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;// Solución con ARRAYS CONVENCIONALES

public class ParesImpares {

  private final static int TAM = 10;

  public static void main(String[] args) {

    int[] aPares = new int[TAM];
    int[] aImpares = new int[TAM];
    
    int valor = 1;
    for (int i = 0; i < TAM; i++) {
      aPares[i] = valor+1;
      aImpares[i] = valor;
      valor = valor + 2;
    }
    
    System.out.println("PARES   IMPARES");
    for (int i = 0; i < TAM; i++) {
      System.out.format("%5d %5d %2.3f\n", 
                         aPares[i], aImpares[i]);
    }
  }
}
