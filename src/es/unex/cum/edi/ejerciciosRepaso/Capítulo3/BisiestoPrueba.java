package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class BisiestoPrueba {

  public static void main(String[] args) {
	int n;
	System.out.print("Escriba un año: ");
	n = Integer.parseInt(System.console().readLine());
	
	Bisiesto bis = new Bisiesto();
    	if (bis.esBisiesto(n))
		System.out.println("El año " + n + " SI es bisiesto");
	else
		System.out.println("El año " + n + " NO es bisiesto");
  }
  
}
