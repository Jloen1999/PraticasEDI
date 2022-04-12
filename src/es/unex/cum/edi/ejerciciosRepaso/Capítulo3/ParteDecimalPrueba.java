package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class ParteDecimalPrueba {

  public static void main(String[] args) {
	int n;

	System.out.print("Escriba un numero: ");
	n = Integer.parseInt(System.console().readLine());
	
	ParteDecimal pd = new ParteDecimal();
	pd.setNumero(n);
    	if ( pd.tieneDecimales() )
		System.out.println("El numero " + pd.getNumero() + " tiene decimales");
	else
		System.out.println("El numero " + pd.getNumero() + " NO tiene decimales");
  }
  
}
