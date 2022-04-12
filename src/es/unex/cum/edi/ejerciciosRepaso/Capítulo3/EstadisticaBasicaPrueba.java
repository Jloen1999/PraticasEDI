package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class EstadisticaBasicaPrueba {

  public static void main(String[] args) {
	int n, i;
        EstadisticaBasica est = new EstadisticaBasica();

	System.out.println("Por favor, introduzca 10 números enteros: ");
        for (i = 1; i <= 10; i++) {
		System.out.print("Número " + i + ": ");
	        n = Integer.parseInt(System.console().readLine());
		est.addNumero(n);
        }
        System.out.println("Máximo:     " + est.getMaximo());	
        System.out.println("Mínimo:     " + est.getMinimo());	
        System.out.println("Media:      " + est.getMedia());	
        System.out.println("Mediana:    " + est.getMediana());	
        System.out.println("Desviación: " + est.getDesviacion());	
  }
}
