package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

/**
 * Clase EnteroGigante
 * Proporciona algunos métodos para aritmética básica con enteros gigantes.
 */

class EnteroGigante {

    private int[] numero;   // Los dígitos del entero gigante se guardan en un array
    private final int MAXIMO = 50;  // Número máximo de dígitos
    
    // El constructor inicializa el array de dígitos a 0 
    public EnteroGigante() {
      numero = new int[MAXIMO];
      for (int i = 0; i < MAXIMO; i++) {
	numero[i] = 0;
      }
    }
    
    // Recibe en entero gigante en un String y lo convierte a un array de dígitos enteros
    public void leer(String n) {
      int contArray = MAXIMO-1;
      for (int contString = n.length()-1; contString >= 0; contString--) {
	numero[contArray] = n.charAt(contString) - 48;
	contArray--;
      }
    }
    
    // Muestra el entero gigante por la consola
    public void imprimir() {
      for (int i = 0; i < MAXIMO; i++) {
	System.out.print(numero[i]);
      }
      System.out.println();
    }
    

    // Suma el entero gigante con otro, dígito a dígito
    public EnteroGigante sumar(EnteroGigante eg) {
      EnteroGigante egSuma = new EnteroGigante();
      int acarreo = 0;
      
      for (int i = MAXIMO-1; i >= 0; i--) {
	int s = numero[i] + eg.getDigito(i) + acarreo;
	if (s >= 10) {
	    egSuma.setDigito(s-10, i);
	    acarreo = 1;
	}
	else {
	    egSuma.setDigito(s, i);
	    acarreo = 0;
	}
      }
      
      return egSuma;
    }
    
    
    // Devuelve el dígito situado en una posición
    public int getDigito(int posicion) {
	return numero[posicion];
    }

    // Modifica el dígito situado en una posición
    public void setDigito(int valor, int posicion) {
	numero[posicion] = valor;
    }


}
