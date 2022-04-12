package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class NominasPrueba {

  public static void main(String[] args) {
  
	System.out.println("Introduzca el número de horas semanales trabajadas:");
	double numHoras = Double.parseDouble(System.console().readLine());
	System.out.println("Introduzca salario por hora trabajada:");
	double salario = Double.parseDouble(System.console().readLine());

	Nominas nominas = new Nominas(numHoras, salario);
	
	System.out.println("Salario bruto semanal:    " + nominas.salarioSemanal());
	System.out.println("Salario bruto mensual:    " + nominas.salarioBrutoMensual());
	System.out.println("Descuentos por impuestos: " + nominas.descuentos());
	System.out.println("Salario neto mensual:     " + nominas.salarioNetoMensual());
   }
}
    
