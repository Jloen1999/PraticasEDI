package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

public class PositivoNegativo {
    
    public static void main(String[] args) {
	int n;
	System.out.print("Escriba un número entero: ");
	n = Integer.parseInt(System.console().readLine());

	if (n > 0) {
	  System.out.println("El número " + n + " es POSITIVO");
        }
	if (n < 0) {
	    System.out.println("El número " + n + " es NEGATIVO");
	}
	else {
	    System.out.println("El número " + n + " es CERO");
	}
	
    }
    
}







