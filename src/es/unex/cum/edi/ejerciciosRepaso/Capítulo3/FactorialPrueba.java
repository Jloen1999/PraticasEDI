package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

public class FactorialPrueba{

	public static void main (String [] args){
	
		Factorial f = new Factorial();
		System.out.println("FACTORIAL");
		System.out.println("Introduce el numero con el que quieres operar:");
		long n = Long.parseLong(System.console().readLine());
		
		System.out.println(n + "! = " + f.calcularFactorial(n)); 
		
	}
}