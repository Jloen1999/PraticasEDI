package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Esta clase resuelve el ejercicio del array creciente
 * utilizando ArrayLists
 */
public class MiArrayList {
    
  public static ArrayList generar(int tam, int min, int max) {
    // Generamos un array con valores aleatorios
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < tam; i++) {
      int n = (int)(Math.random()*(max-min+1)) + min;
      a.add(n);
    }
    return a;
  }
  
  public static String toString(ArrayList<Integer> a) {
    // Devuelve el contenido del array convertido en un String
    String str = "";
    for (int i = 0; i < a.size(); i++) {
      str = str + a.get(i) + "\n";
    }
    return str;
  }
 
  // Ordena el array
  public static void ordenar(ArrayList<Integer> a) {
    //a = Collections.sort(a);
  }  
 
  // Busca el número n en el array. Devuelve la posición de la primera ocurrencia,
  // o -1 si no lo encuentra.
  public static int buscar(ArrayList<Integer> a, int n) {
    return a.indexOf(n);
  }
  
  public static void insertarOrdenado(ArrayList<Integer> a, int n) {
      int pos = buscarPosicionInsercion(a, n);
      a.add(pos, n);
      a.remove(a.size()	-1);
  }
  
  private static int buscarPosicionInsercion(ArrayList<Integer> a, int n) {
      int i = a.size() - 1;
      int posicion = 0;
      while (i >= 0 && posicion == 0) {
         if (a.get(i) < n) posicion = i+1;
         i--;
      }
      return posicion;
      
  }
    
}
