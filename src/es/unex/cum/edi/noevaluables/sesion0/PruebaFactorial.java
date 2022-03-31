package es.unex.cum.edi.noevaluables.sesion0;// M�todo recursivo para el factorial.
import java.io.*;   

public class PruebaFactorial
{
	public static void main(String Arg[ ]) throws IOException{
    		long numero;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      	System.out.print("Inserte numero a calcular factorial: ");
	      numero = Integer.parseInt(in.readLine( ));
      	numero = factorial(numero);
      	System.out.print("Facotial="+numero+"\n");
      }    

	
	// declaración recursiva del método factorial
	static long factorial( long numero )
	{
		// caso base
		if ( numero <= 1 )
			return 1;
		// paso recursivo
		else
			return numero * factorial( numero - 1 );
	} // fin del método factorial
} // fin de la clase PruebaFactorial

