package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class RestaPrueba {

  public static void main(String[] args) {
	int n1, n2;
	System.out.println("Por favor, escriba dos números enteros y los restaré: ");
	n1 = Integer.parseInt(System.console().readLine());
	n2 = Integer.parseInt(System.console().readLine());
	
	Resta resta = new Resta();
    	int r = resta.calcularResta(n1, n2);
	System.out.println("El resultado es: " + r);    

  }
  
}
