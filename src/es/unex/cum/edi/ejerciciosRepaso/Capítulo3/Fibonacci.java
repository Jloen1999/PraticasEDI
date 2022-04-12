package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

public class Fibonacci {

	int numElementos;
	
	Fibonacci(int n){
		numElementos = n;
	}
	
	public long[] calcularFibonacci(){
		long a = 0;
		long b = 1;
		long[] sucesion = new long[numElementos];
		
		sucesion[0] = a;
		sucesion[1] = b;
		
		for (int i = 2; i < numElementos; i++){
			sucesion[i] = a + b; 
			a = b;
			b = sucesion[i];
		}
		return sucesion;
	}
}