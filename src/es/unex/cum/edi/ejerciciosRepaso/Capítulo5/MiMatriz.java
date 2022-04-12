package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

public class MiMatriz {


  String str1, str2;
  


  public static int[][] inicializar(int filas, int cols, int valorInicial) {
    // Generamos un array asignando el mismo valor inicial a todas las posiciones
    int[][] m = new int[filas][cols];
    for (int f = 0; f < filas; f++) {
      for (int c = 0; c < cols; c++) {
         m[f][c] = valorInicial;
      }
    } 
    return m;
  }
  
  public static void mostrar(int[][] m) {
    // Mostramos el contenido de la matriz
    for (int f = 0; f < m.length; f++) {
      for (int c = 0; c < m[f].length; c++) {
          System.out.printf(m[f][c]);
      }
      System.out.println();
    }
  }
 

}
