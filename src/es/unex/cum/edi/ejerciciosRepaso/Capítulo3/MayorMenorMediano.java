package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Determina el orden de tres números enteros.

class MayorMenorMediano {

   private int x, y, z;

   // Constructor sin parámetros. Asigna valor 0 a x, y, z
   MayorMenorMediano() {
      x = 0;
      y = 0;
      z = 0;
   }

   // Constructor parametrizado para establecer valor de x, y, z
   MayorMenorMediano(int a, int b, int c) {
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

   // Devuelve el menor de los tres números
   public int getMenor() {
      int menor = 0;
      if ((x <= y) && (x <= z)) menor = x;
      if ((y <= x) && (y <= z)) menor = y;
      if ((z <= x) && (z <= y)) menor = z;
      return menor;
   }

   // Devuelve el mediano de los tres números
   public void getMediano() {
      int mediano = 0;
      
      if ( ((x >= y) && (x <= z)) || ((x >= z) && (x <= y)) ) {
	mediano = x;
      }
      else if ( ((y >= x) && (y <= z)) || ((y >= z) && (y <= x)) ) {
	mediano = y;
      }
      else if ( ((z >= x) && (z <= y)) || ((z >= y) && (z <= x)) ) {
	mediano = z;
      }
      
      return mediano;
   }

   // Devuelve el mayor de los tres números
   public int getMayor() {
      int mayor = 0;
      if ((x >= y) && (x >= z)) mayor = x;
      if ((y >= x) && (y >= z)) mayor = y;
      if ((z >= x) && (z >= y)) mayor = z;
      return mayor; 
   }

   
}
