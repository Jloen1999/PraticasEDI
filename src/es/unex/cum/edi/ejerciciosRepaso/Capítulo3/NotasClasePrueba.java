package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class NotasClasePrueba {

  public static void main(String[] args) {
	int i, n;
        NotasClase notas = new NotasClase();

	for (i = 1; i <= 4; i++) {
		System.out.println("Por favor, introduzca una calificación: ");
		do {
		        n = Integer.parseInt(System.console().readLine());
		        if ((n < 0) || (n > 10))
			  System.out.println("El número debe de estar entre 0 y 10. Introduzcalo de nuevo:");
		}
		while ((n < 0) || (n > 10));
		notas.addNota(n);
        }
        System.out.println("Número de suspensos: " + notas.getNumSuspensos());	
        System.out.println("Número de aprobados: " + notas.getNumAprobados());	
  }
}
