package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Cuenta el número de cifras de un número entero de hasta 5 dígitos
// Se ofrecen varias soluciones. Si quieres compilar la clase, tendrás que quedarte con una y eliminar el resto.

public class CuentaCifras {
    
    // SOLUCIÓN 1:
    // Devuelve el número de cifras del número por encadenamiento de ifs
    public int calculaNumCifras(int n) {

	int numCifras = 0;
    
	n = (int)(Math.abs(n));
	
	if (n >= 0 && n <= 9) numCifras = 1;
	if (n >= 10 && n <= 99) numCifras = 2;
	if (n >= 100 && n <= 999) numCifras = 3;
	if (n >= 1000 && n <= 9999) numCifras = 4;
	if (n >= 10000 && n <= 99999) numCifras = 5;
    
	return numCifras;
    }

    // SOLUCIÓN 2:
    // Devuelve el número de cifras del número por divisiones sucesivas
    public int calculaNumCifras(int n) {

	int numCifras = 1;

	if (numero / 10 != 0) numCifras = 2;
	if (numero / 100 != 0) numCifras = 3;
	if (numero / 1000 != 0) numCifras = 4;
	if (numero / 10000 != 0) numCifras = 5;

	return numCifras;
    }

    
    // SOLUCIÓN 3:
    // Devuelve el número de cifras del número utilizando un bucle para
    // hacer las divisiones sucesivas entre 10
    public int calculaNumCifras(int n) {

	int numCifras = 0;

	do {
	  n = n / 10;
	  numCifras++;
	}
	while (n != 0);
	 
	return numCifras;
    }
    
    
    // SOLUCIÓN 4:
    // Devuelve el número de cifras del número convirtiéndolo a cadena
    public int calculaNumCifras(int n) {
	String str = new String((int)(Math.abs(n)));
	return str.length();
    }
    
    
    
}







