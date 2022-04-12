package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Una clase para calcular el máximo, el mínimo, la media y la mediana de un conjunto de 10 números
// Versión SIN ARRAYS (¡una locura, cuidado!)

public class EstadisticaBasica {

    private int suma = 0;    
    private int max = -999999;
    private int min = 999999;
    private int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
    private int numValores = 1;
    

    public void addNumero(int num) { 
        suma = suma + num;
        if (num > max) max = num;
        if (num < min) min = num; 
        
        switch (numValores) {
	  case 1: n1 = num; break;
          case 2: n2 = num; break;
          case 3: n3 = num; break;
          case 4: n4 = num; break;
          case 5: n5 = num; break;
          case 6: n6 = num; break;
          case 7: n7 = num; break;
          case 8: n8 = num; break;
          case 9: n9 = num; break;
          case 10: n10 = num; break;
        }
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
        
        media = getMedia();
        desv  = Math.pow(n1 - media, 2);
        desv += Math.pow(n2 - media, 2);
        desv += Math.pow(n3 - media, 2);
        desv += Math.pow(n4 - media, 2);
        desv += Math.pow(n5 - media, 2);
        desv += Math.pow(n6 - media, 2);
        desv += Math.pow(n7 - media, 2);
        desv += Math.pow(n8 - media, 2);
        desv += Math.pow(n9 - media, 2);
        desv += Math.pow(n10 - media, 2);
        desv = desv / 10;
        desv  = Math.sqrt(desv);
        
        return desv;
    }

    public double getMediana() {
        // ¡¡CALCULAR LA MEDIANA SIN ARRAYS ES MUY COMPLICADO!!
        int primero, segundo, tercero, cuarto, quinto, sexto;
        
        primero = getMinimo();
        
        // Buscamos el siguiente más pequeño (será el segundo)
        segundo = 99999;
        if ((n1 > primero) && (n1 < segundo)) segundo = n1;
        if ((n2 > primero) && (n2 < segundo)) segundo = n2;
        if ((n3 > primero) && (n3 < segundo)) segundo = n3;
        if ((n4 > primero) && (n4 < segundo)) segundo = n4;
        if ((n5 > primero) && (n5 < segundo)) segundo = n5;
        if ((n6 > primero) && (n6 < segundo)) segundo = n6;
        if ((n7 > primero) && (n7 < segundo)) segundo = n7;
        if ((n8 > primero) && (n8 < segundo)) segundo = n8;
        if ((n9 > primero) && (n9 < segundo)) segundo = n9;
        if ((n10 > primero) && (n10 < segundo)) segundo = n8;
        if (segundo == 99999) segundo = primero;
        
        // Buscamos el siguiente más pequeño (el tercero)
        tercero = 99999;
        if ((n1 > segundo) && (n1 < tercero)) tercero = n1;
        if ((n2 > segundo) && (n2 < tercero)) tercero = n2;
        if ((n3 > segundo) && (n3 < tercero)) tercero = n3;
        if ((n4 > segundo) && (n4 < tercero)) tercero = n4;
        if ((n5 > segundo) && (n5 < tercero)) tercero = n5;
        if ((n6 > segundo) && (n6 < tercero)) tercero = n6;
        if ((n7 > segundo) && (n7 < tercero)) tercero = n7;
        if ((n8 > segundo) && (n8 < tercero)) tercero = n8;
        if ((n9 > segundo) && (n9 < tercero)) tercero = n9;
        if ((n10 > segundo) && (n10 < tercero)) tercero = n8;
        if (tercero == 99999) tercero = segundo;
        
        // Buscamos el siguiente más pequeño (el cuarto)
        cuarto = 99999;
        if ((n1 > tercero) && (n1 < cuarto)) cuarto = n1;
        if ((n2 > tercero) && (n2 < cuarto)) cuarto = n2;
        if ((n3 > tercero) && (n3 < cuarto)) cuarto = n3;
        if ((n4 > tercero) && (n4 < cuarto)) cuarto = n4;
        if ((n5 > tercero) && (n5 < cuarto)) cuarto = n5;
        if ((n6 > tercero) && (n6 < cuarto)) cuarto = n6;
        if ((n7 > tercero) && (n7 < cuarto)) cuarto = n7;
        if ((n8 > tercero) && (n8 < cuarto)) cuarto = n8;
        if ((n9 > tercero) && (n9 < cuarto)) cuarto = n9;
        if ((n10 > tercero) && (n10 < cuarto)) cuarto = n8;
        if (cuarto == 99999) cuarto = tercero;

        // Buscamos el siguiente más pequeño (el quinto)
        quinto = 99999;
        if ((n1 > cuarto) && (n1 < quinto)) quinto = n1;
        if ((n2 > cuarto) && (n2 < quinto)) quinto = n2;
        if ((n3 > cuarto) && (n3 < quinto)) quinto = n3;
        if ((n4 > cuarto) && (n4 < quinto)) quinto = n4;
        if ((n5 > cuarto) && (n5 < quinto)) quinto = n5;
        if ((n6 > cuarto) && (n6 < quinto)) quinto = n6;
        if ((n7 > cuarto) && (n7 < quinto)) quinto = n7;
        if ((n8 > cuarto) && (n8 < quinto)) quinto = n8;
        if ((n9 > cuarto) && (n9 < quinto)) quinto = n9;
        if ((n10 > cuarto) && (n10 < quinto)) quinto = n8;
        if (quinto == 99999) quinto = cuarto;
        
        // Buscamos el siguiente más pequeño (el sexto)
        sexto = 99999;
        if ((n1 > quinto) && (n1 < sexto)) sexto = n1;
        if ((n2 > quinto) && (n2 < sexto)) sexto = n2;
        if ((n3 > quinto) && (n3 < sexto)) sexto = n3;
        if ((n4 > quinto) && (n4 < sexto)) sexto = n4;
        if ((n5 > quinto) && (n5 < sexto)) sexto = n5;
        if ((n6 > quinto) && (n6 < sexto)) sexto = n6;
        if ((n7 > quinto) && (n7 < sexto)) sexto = n7;
        if ((n8 > quinto) && (n8 < sexto)) sexto = n8;
        if ((n9 > quinto) && (n9 < sexto)) sexto = n9;
        if ((n10 > quinto) && (n10 < sexto)) sexto = n8;
        if (sexto == 99999) sexto = quinto;

        System.out.println("Primero: " + primero);
        System.out.println("Segundo: " + segundo);
        System.out.println("Tercero: " + tercero);
        System.out.println("Cuarto: " + cuarto);
        System.out.println("Quinto: " + quinto);
        System.out.println("Sexto: " + sexto);
        
        // Calculamos la mediana (la media entre el quinto y el sexto)
        return ((double)(quinto+sexto))/2;
    }

    
}
