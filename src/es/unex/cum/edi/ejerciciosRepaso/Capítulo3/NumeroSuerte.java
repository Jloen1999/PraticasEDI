package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;
public class NumeroSuerte {
	int suma;

	public NumeroSuerte(int d, int m, int a){
		suma = d + m + a;
	}

	private int sumaCifras(int n) {
		int cifra = 0, acum = 0;
	    
		do {
		    cifra = n % 10;
		    acum = acum + cifra;
		    n = n / 10;
		}	
		while ((n != 0);
		
		return n;
	}
	
	public int getNumeroSuerte(){
	
		int acum = sumaCifras(suma);
		
		if (acum > 10) {
		  acum = sumaCifras(acum);
		}
		
		return acum;
	}	
	

}





