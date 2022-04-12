package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

public class MiArray {

  public static int[] generar(int tam) {
    // Generamos un array con valores aleatorios
    int[] a = new int[tam];
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)(Math.random()*tam*2) + 1;
    }
    return a;
  
  }
  
  public static void mostrar(int[] a) {
    // Mostramos el contenido del array
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
 
  // Ordena por el método de la burbuja
  public static void ordenar(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length-1; j++) {
	if (a[j] > a[j+1]) {
	  int aux = a[j];
	  a[j] = a[j+1];
	  a[j+1] = aux;
	}
      } // for j
    } // for i
  }  
 
  // Busca el número n en el array. Devuelve la posición de la primera ocurrencia,
  // o -1 si no lo encuentra.
  public static int buscar(int[] a, int n) {
    int encontrado = -1;
    int i = 0;
    while (i < a.length && encontrado != -1) {
      if (a[i] == n) {
	encontrado = i;
      }
      i++;
    }
    
    return encontrado;
  }

}