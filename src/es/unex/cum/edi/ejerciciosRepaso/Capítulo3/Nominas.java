package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class Nominas {

  double numHorasSemanales = 0;
  double salarioHora = 0;
  
  public Nominas(double numHoras, double salario) {
	numHorasSemanales = numHoras;
  	salarioHora = salario;
  }
  
  
  public double salarioSemanal() {
	double salarioSemanal;

	if (numHorasSemanales > 45) {
		salarioSemanal = (40 * salarioHora) + (5 * salarioHora * 1.5) + ((numHorasSemanales - 45) * salarioHora * 2);
	}
	else if (numHorasSemanales > 40) {
		salarioSemanal = (40 * salarioHora) + ((numHorasSemanales - 40) * salarioHora * 1.5);
	} 
	else {
		salarioSemanal = numHorasSemanales * salarioHora;
	}

	return salarioSemanal;
  }
  
  public double salarioBrutoMensual() {
	return salarioSemanal() * 4;
  }
  
  public double salarioNetoMensual() {
	return salarioBrutoMensual() - descuentos();
  }
  
  public double descuentos() {
	double descuentos;

	if (salarioBrutoMensual() <= 1000)
		descuentos = salarioBrutoMensual() * 0.1;
	else
		descuentos = salarioBrutoMensual() * 0.15;

	return descuentos;
  }

}
    
