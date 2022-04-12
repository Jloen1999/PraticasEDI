package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Determina si un año es bisiesto o no
// IMPORTANTE: se ofrecen tres versiones del método esBisiesto().
// Para que el programa compile, tendrás que elegir con cuál te quedas y eliminar las otras.

public class Bisiesto {
    
    // Devuelve true si el año a es bisiesto
    // VERSION 1
    public boolean esBisiesto(int a) {
    
	boolean bisiesto = false;

	if (a % 4   == 0) bisiesto = true;
	if (a % 100 == 0) bisiesto = false;
	if (a % 400 == 0) bisiesto = true;

	return bisiesto;
    }


    // Devuelve true si el año a es bisiesto
    // VERSION 2
    public boolean esBisiesto(int a) {
    
	boolean bisiesto = false;

	if (a % 400 == 0) {
	   if (a % 100 == 0) bisiesto = false;
	   else bisiesto = true;
	}
	else {
	   if (a % 4 == 0) bisiesto = true;
	   else bisiesto = false;
	}
   
	return bisiesto;
    }
    
    // Devuelve true si el año a es bisiesto
    // VERSION 3
    public boolean esBisiesto(int a) {
        
        boolean bisiesto = (((a % 400 == 0) || (a % 100 != 0)) && (a % 4 == 0));
        return bisiesto;
    }
    
}







