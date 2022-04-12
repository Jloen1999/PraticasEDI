package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

public class FibonacciPrueba {
	public static void main(String[] args){

		System.out.print("Introduzca el numero para calcular su sucesión de es.unex.cum.edi.ejerciciosRepaso.Capítulo3.Fibonacci: ");
		int num = Integer.parseInt(System.console().readLine());

		while (num <= 1) {
			System.out.print("ERROR!!!!!\nEl numero introducido debe ser mayor que 0 y 1. Introduzca un nuevo numero: ");
			num=Integer.parseInt(System.console().readLine());
		}
		Fibonacci fib = new Fibonacci(num);

		long[] sucesion;
		sucesion = fib.calcularFibonacci();
		
		for (int i = 0; i < num; i++) {
		    System.out.print(sucesion[i] + " ");
	  	}
	  	System.out.println();
	}
}