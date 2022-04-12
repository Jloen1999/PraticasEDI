package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class CalculadoraPrueba {

  public static void main(String[] args) {
  
    System.out.println("Bienvenido a la calculadora (negativo para salir)");
    double r = 0;
    double a = 0, b = 0;
    int op = 0;
    
    do {
	a = leerNumero("Escriba el primer operando");
	if (a >= 0) {
	  b = leerNumero("Escriba el segundo operando");
	  if (b >= 0) {
	    op = (int)leerNumero("Escriba la operación (1 = suma, 2 = resta, 3 = mult, 4 = div, 0 = salir:");
	    switch(op) {
	      case 0: break;
	      case 1: r = Calculadora.suma(a, b); break;
	      case 2: r = Calculadora.resta(a, b); break;
	      case 3: r = Calculadora.multiplica(a, b); break;
	      case 4: r = Calculadora.divide(a, b); break;
	      default: System.out.println("Operación no reconocida");
	    }
	    
	    System.out.println("Resultado: " + r);
	  }
	}
    }
    while ((a > 0) && (b > 0) && (op != 0));
    
  }
  
  
  public static double leerNumero(String texto) {
      double a = 0;
      boolean correcto;
      do {
	  correcto = true;
	  System.out.println(texto);
	  try {
	    a = Double.parseDouble(System.console().readLine());
	  }
	  catch (NumberFormatException ex) {
	    correcto = false;
	  }
      }
      while (!correcto);
      
      return a;
  }
  
}
    
