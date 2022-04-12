package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class NumSecreto {
  
    private int num;
    
    // Elige el número secreto al azar entre 1 y 100
    public void eligeNumSecreto() {
      num = (int)((Math.random() * 100) + 1);
    }
    
    // Compara un número n con el número secreto
    // Devuelve -1 si n es menor que el número secreto
    // Devuelve +1 si n es mayor
    // Devuelve 0 si son iguales
    public int comparaNum(int n) {
      int resultado;
      if (n < num)
	resultado = -1;
      else if (n > num)
	resultado = 1;
      else 
	resultado = 0;
	
      return resultado;
    }


}
    
