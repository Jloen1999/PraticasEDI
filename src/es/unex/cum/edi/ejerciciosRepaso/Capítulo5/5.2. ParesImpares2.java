package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;// Solución con ArrayList

public class ParesImpares {

  public static void main(String[] args) {

    ArrayList<Integer> aPares = new ArrayList<Integer>();
    ArrayList<Integer> aImpares = new ArrayList<Integer>();
    
    int valor = 1;
    for (int i = 0; i < 10; i++) {
      aPares.add( valor+1); // Inserta en array aPares
      aImpares.add(valor);  // Inserta en array aImpares
      valor = valor + 2;
    }
    
    System.out.println("PARES   IMPARES");
    for (int i = 0; i < aPares.size(); i++) {
      System.out.format("%5d %5d %2.3f\n", 
                         aPares.get(i), aImpares.get(i));
    }
  }
}
