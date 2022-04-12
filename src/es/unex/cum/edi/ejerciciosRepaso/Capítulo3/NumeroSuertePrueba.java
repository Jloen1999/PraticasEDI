package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class NumeroSuertePrueba {

  public static void main(String[] args) {
	System.out.println("Fecha: dia, mes , año");
	int d, m , a;
	System.out.println("Dia");
	d=Integer.parseInt(System.console().readLine());
	System.out.println("Mes");
	m=Integer.parseInt(System.console().readLine());
	System.out.println("Año");
	a=Integer.parseInt(System.console().readLine());
	NumeroSuerte nSuerte = new NumeroSuerte(d,m,a);
	System.out.print(nSuerte.getNumeroSuerte());
  }
  
}