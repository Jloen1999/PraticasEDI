package es.unex.cum.edi.noevaluables.sesion0;// Prácticar variables índice y acumulador

public class Suma100numeros
{
	public static void main( String args[] )
	{
		int suma=0;
		int cuantos=0;	
		// iterar 100 veces
		for ( int contador = 1; contador <= 100; contador++ )
		{
			if (contador % 3 ==0) {
			  suma= suma+ contador; //Contador
			  cuantos = cuantos +1; //Sumador
			}
		} // fin de instrucción for
		System.out.println("La suma de los 100 primeros números múltiplos de tres es: "+suma+" de un total de: "+ cuantos);
	} // fin de main
} // fin de la clase Suma100numeros
