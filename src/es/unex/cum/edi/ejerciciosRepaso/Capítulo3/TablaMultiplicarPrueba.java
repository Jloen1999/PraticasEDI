package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class TablaMultiplicarPrueba {

  public static void main(String[] args) {
	int n;
	System.out.print("Escriba un número entero: ");
	n = Integer.parseInt(System.console().readLine());
	
	TablaMultiplicar tabla = new TablaMultiplicar();
	tabla.setNumero(n);

        System.out.println("Tabla de multiplicar del número " + tabla.getNumero());
        tabla.showTable();
  }
}
