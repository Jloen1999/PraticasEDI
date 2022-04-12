package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// es.unex.cum.edi.ejerciciosRepaso.Capítulo3.Primos, lista de primos y lista de omirps

public class Primos {

	// Devuelve true si el número n es primo, y false en caso contrario
	public boolean esPrimo(int n) {
	    boolean primo;  
	    int numDivisores;
	    
	    numDivisores = calculaNumDivisores(n);
	    
	    if (numDivisores > 2) primo = false;
	    else primo = true;
	    
	    return primo;
	}

	// Devuelve true si el número n es omirp, y false en caso contrario
	public boolean esOmirp(int n) {
	    
	    int inverso = invertir(n);
	    boolean omirp;
	    
	    if ((esPrimo(n)) && (esPrimo(inverso)))
		omirp = true;
	    else
		omirp = false;
	
	    return omirp;
	    // Podemos escribir todo el código anterior simplemente así:
	    // return ((esPrimo(n)) && (esPrimo(inverso)));
	}
		    
	
	// Devuelve los primeros n números primos
	public int[] listaPrimos(int n) {
	
	  int cont = 0; // Número de primos encontrados hasta ahora
	  int i = 1;
	  int[] primos = new int[n];
	  
	  while (cont < n) {
	      if (esPrimo(i)) {
	          primos[cont] = i;
		  cont++;
	      }
	      i++;
	  }
	  return primos;
 
	}

	// Devuelve los primeros n números omirps
	public int[] listaOmirps(int n) {
	
	  int cont = 0; // Número de omirps encontrados hasta ahora
	  int i = 1;
	  int[] omirps = new int[n];
	  
	  // Escribe los números de la barra de progreso
	  for (i = 0; i <= 100; i = i + 2) {
	      if (i % 10 == 0) System.out.print(i);
	      else if (i % 10 > 2) System.out.print(" ");
	  }
	  System.out.println();
	  
	  i = 1;
	  int porcentaje = 0;
	  int nuevoporcentaje = 0;
	  
	  while (cont < n) {
	      if (esOmirp(i)) {
	          omirps[cont] = i;
		  cont++;
		  // El siguiente código es para mostrar la barra de progreso
		  // (puedes quitarlo y todo funcionará bien)
		  nuevoporcentaje = cont * 100 / n;
		  if (nuevoporcentaje == porcentaje + 2) {
		    System.out.print("|");
		    porcentaje = nuevoporcentaje;
		  }
	      }
	      i++;
	  }
	  return omirps;
 
	}

	
	// Invierte el número n (p. ej., si n = 18, devuelve 81)
	private int invertir(int n) {
	
	    int numDigitos = contarDigitos(n);
	    int[] digitos = new int[numDigitos];
	    int inv = 0;

	    // Creamos un array de enteros que contiene los dígitos de n
	    for (int i = 0; i < numDigitos; i++) {
	      digitos[i] = (n / (int)Math.pow(10, i)) % 10;
	    }
	    
	    // Construimos el número invertido a partir del array
	    for (int i = 0; i < numDigitos; i++) {
	      inv = inv + digitos[i] * (int)Math.pow(10, (numDigitos - i - 1));
	    }
	    	    
	    return inv;

	    /* También se puede resolver mediante conversión del número
	       en String, así:
	    String str = String(n);
	    String inverso = str.reverse();
	    int nInvertido = Integer.parseInt(inverso);
	    return nInvertido;
	    */
	    
	}
	
	// Devuelve el número de digitos del número n (p. ej. si n = 378, devuelve 3)
	private int contarDigitos(int n) {
	    int cont = 0;
	    while (n >= 1) {
		cont++;
		n = n / 10;
	    }
	    return cont;
	}
	
	
	// Devuelve el número de divisores de un número entero
	private int calculaNumDivisores(int n) {

	    int numDivisores = 0;

	    n = (int)Math.abs(n);
	    for (int i = 1; i <= n; i++) {
		  if (n % i == 0) numDivisores++;
	    }

	    return numDivisores;
	}

    
}





