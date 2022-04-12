package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Muestra todos los números impares entre A y B. Da igual si A es menor que B o al revés.
// Usará la clase MayorMenorMediano que implementamos en un ejercicio anterior.

public class Impares {
    
    // Lee un número por teclado y lo devuelve
    public int leerNumero() {
	int n;
	System.out.print("Escriba un número entero: ");
	n = Integer.parseInt(System.console().readLine());
	return n;
    }

    // Muestra por la consola los números impares entre a y b
    public void mostrarImpares(int a, int b) {
        int i;
        
	MayorMenorMediano mmm = new MayorMenorMediano(a, b, b);
        int inicio = getMenor(a, b);
	int fin = getMayor(a, b);

	if (inicio % 2 == 0)  // Si inicio es un número par...
	   i = inicio + 1;    // ...le sumo 1 para convertirlo en impar
	else                  // Si inicio es un número impar...
	   i = inicio;        // ...comenzamos por él sin modificarlo.
	    
	while (i <= fin) {
	      System.out.println(i);
	      i = i + 2;
	}
    }
    
}







