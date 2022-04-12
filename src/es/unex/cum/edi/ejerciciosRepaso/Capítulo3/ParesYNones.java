package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Muestra todos los pares o impares que hay entre un número a y otro b.
// Reutiliza las clases Pares e es.unex.cum.edi.ejerciciosRepaso.Capítulo3.Impares que programamos en ejercicios anteriores.

import es.unex.cum.edi.ejerciciosRepaso.Capítulo3.Impares;

public class ParesYNones {
    
    // Muestra por la consola los números pares o impares a y b
    public void mostrar(int a, int b, String paresOImpares) {
    
      if (paresOImpares.equals("pares")) {
        Pares p = new Pares();
	p.mostrarPares(a,b);
      }
      if (paresOImpares.equals("impares")) {
        Pares p = new Impares();
	p.mostrarImpares(a,b);
      }
    
    }
    
}







