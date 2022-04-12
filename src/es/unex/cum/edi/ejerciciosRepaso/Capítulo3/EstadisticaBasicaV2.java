package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Una clase para calcular el máximo, el mínimo, la media y la mediana de un conjunto de 10 números
// Versión con ARRAYS. Compárala con la anterior y verás que esta solución es mucho más sencilla.
// (esta es una justificación de por qué los arrays son tan importantes)

import java.util.Arrays;

public class EstadisticaBasicaV2 {

    private int suma = 0;    
    private int max = -999999;
    private int min = 999999;
    private int[] n;
    private int numValores = 0;
  
    public EstadisticaBasicaV2() {
	n = new int[10];	  // Creamos un array de 10 números enteros
    }

    public void addNumero(int num) { 
        suma = suma + num;        // Calcula la suma (acumulador)
        if (num > max) max = num; // Calcula el mínimo
        if (num < min) min = num; // Calcula el máximo
	n[numValores] = num;      // Almacena el número en el array n
        numValores++;
    }

    public int getMaximo() {
        return max;
    }

    public int getMinimo() {
        return min;
    }

    public double getMedia() {
        return (double)suma/10;
    }

    public double getDesviacion() {
        double desv, media;
        
	// Gracias que tenemos todos los valores almacenados en el array n, podemos calcular la desviación fácilmente
        media = getMedia();
        desv = 0;

        for (i = 0; i < 10; i++) {
	  desv = desv + Math.pow(n[i] - media, 2);
	}
        
        desv  = desv / 10;
        desv  = Math.sqrt(desv);
        
        return desv;
    }

    public double getMediana() {

        Arrays.sort(n);  // Ordena el array
        
        // Calculamos la mediana (la media entre el quinto y el sexto números de la serie)
	// Gracias al array n es muy fácil: basta con acceder a n[4] (quinto) y n[5] (sexto)
        return ((double)(n[4] + n[5])) / 2;
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
