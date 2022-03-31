package es.unex.cum.edi.noevaluables.sesion2;

import evaluables.sesion5.Palabra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainS3 {
    private Palabra[] lista;
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String []args) throws IOException{
		MainS3 s3= new MainS3();
		s3.inicializarTeclado();
		s3.mostrar();
				
	}
	public MainS3() {
		lista= new Palabra[3];
	}
	public void inicializarTeclado() throws IOException {
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Introduce una palabra: ");
			String linea = input.readLine();
			System.out.print("Introduce su pista: ");
			String linea2 = input.readLine();
			lista[i]= new Palabra(linea, linea2);
		}
	}
	
	public void mostrar() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].toString());
		}
	}
}
