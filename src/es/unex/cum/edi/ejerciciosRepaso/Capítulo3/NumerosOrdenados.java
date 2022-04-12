package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Comprueba si tres números están ordenados. También comprueba si son consecutivos.

class NumerosOrdenados {

   private int x, y, z;

   // Constructor sin parámetros. Asigna valor 0 a x, y, z
  NumerosOrdenados() {
      x = 0;
      y = 0;
      z = 0;
   }

   // Constructor parametrizado para establecer valor de x, y, z
   NumerosOrdenados(int a, int b, int c) {
      x = a;
      y = b;
      z = c;
   }

   // Asigna valores a los tres números
   public void setNumeros(int a, int b, int c) {
      x = a;
      y = b;
      z = c;
   }

   // Devuelve true si los números están ordenados de menor a mayor, false en otro caso
   boolean estanOrdenados() {
      boolean result;
      if ((x < y) && (y < z))
         result = true;
      else
         result = false;

      return result;
   }

   // Devuelve true si los números son consecutivos, false en otro caso
   boolean sonConsecutivos() {
      boolean result;
      if ((x == (y-1)) && (y == (z-1)))
         result = true;
      else
         result = false;

      return result;
   }
 
}
