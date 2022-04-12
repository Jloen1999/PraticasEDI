package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

public class Factorial {
	
	public long calcularFactorial(long i){
	
		long f = 0;

		if (i == 0) {		// El factorial de 0 es 1 (caso particular)
		  f = 1;
		}
		else {			// Para el resto 
		    i = (long)Math.abs(i);	// Si es negativo, le quitamos el signo
		    f = i;
		    while (i != 1) {
			    i--;
			    f = f * i;
		    }
		  }
		}
		
		return f;
	}
}