package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class AcumuladorInteractivoPrueba {

  public static void main(String[] args) {
	AcumuladorInteractivo acum = new AcumuladorInteractivo();
	int n;
	
	do {
	  System.out.print("Introduzca un número (negativo para terminar): ");
	  n = Integer.parseInt(System.console().readLine());
	  if (n >= 0) acum.anadirNumero(n);
	}
	while (n >= 0);

        System.out.println("La suma es: " + acum.getSuma());
        System.out.println("La media es: " + acum.getMedia());
  }
}
