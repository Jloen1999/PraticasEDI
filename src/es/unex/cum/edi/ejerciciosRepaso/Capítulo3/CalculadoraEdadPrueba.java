package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

import java.util.Calendar;

public class CalculadoraEdadPrueba {
	public static void main(String [] args){
		CalculadoraEdad c= new CalculadoraEdad();
		Calendar ahora = Calendar.getInstance();
		int diaA = ahora.get(Calendar.DAY_OF_MONTH);
		int mesA = ahora.get(Calendar.MONTH) + 1;
		int anoA = ahora.get(Calendar.YEAR);
		System.out.println("Fecha actual: " + diaA + "/" + mesA + "/" + anoA);
		
		System.out.println("Introduce tu dia de nacimiento");
		int diaN=Integer.parseInt(System.console().readLine());
		System.out.println("Introduce tu mes de nacimiento");
		int mesN=Integer.parseInt(System.console().readLine());
		System.out.println("Introduce tu año de nacimiento");
		int anoN =Integer.parseInt(System.console().readLine());

		System.out.println("Tu edad es de: ");
		System.out.println(c.ano(anoN,anoA,mesN,mesA,diaN,diaA) + " años ");
		System.out.println(c.mes(anoN,anoA,mesN,mesA,diaN,diaA) + " meses ");
		System.out.println(c.dia(anoN,anoA,mesN,mesA,diaN,diaA) + " días ");
		System.out.println(c.hora(anoN,anoA,mesN,mesA,diaN,diaA) + " horas ");
		System.out.println(c.minuto(anoN,anoA,mesN,mesA,diaN,diaA) + " minutos ");
		System.out.println(c.segundo(anoN,anoA,mesN,mesA,diaN,diaA) + " segundos ");
	}
}