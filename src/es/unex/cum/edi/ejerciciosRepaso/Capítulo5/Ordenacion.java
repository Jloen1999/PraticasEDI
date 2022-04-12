package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

public class Ordenacion {

  public static void main(String[] args) {

    int[] a;
    a = MiArray.generar(1000);
    MiArray.mostrar(a);
    MiArray.ordenar(a);
    MiArray.mostrar(a);

    int n = 500;
    int posicion = MiArray.buscar(a, n);
    if (posicion != -1) {
      System.out.println("El número estaba en la posición " + posicion);
    }
    else {
      System.out.println("Numero no encontrado");
    }
    
  }
  
  

  
  
}
