package es.unex.cum.edi.noevaluables.sesion0;// Enteros aleatorios con desplazamiento y escala.

public class EnterosAleatorios
{
	public static void main( String args[] )
	{
		int valor;
		String salida = "";

		// iterar 20 veces
		for ( int contador = 1; contador <= 20; contador++ )
		{
			// elegir entero aleatorio entre 1 y 6
			valor = 1 + ( int ) ( Math.random() * 6 );

			salida += valor + "  ";  // anexar valor a salida

			// si el contador es divisible entre 5, anexar nueva línea a String salida
			if ( contador % 5 == 0 )
				salida += "\n";
		} // fin de instrucción for

		System.out.println("20 números aleatorios de 1 a 6\n"+salida);
	} // fin de main
} // fin de la clase EnterosAleatorios
