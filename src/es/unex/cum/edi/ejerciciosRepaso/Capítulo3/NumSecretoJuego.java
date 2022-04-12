package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class NumSecretoJuego {

  public static void main(String[] args) {
    System.out.println("Bienvenid@ al juego del número secreto");
    System.out.println("Trata de adivinar mi número (entre 1 y 100)");
    
    NumSecreto secreto = new NumSecreto();
    int n = 0;
    int intentos = 1;
    
    secreto.eligeNumSecreto();
    
    n = Integer.parseInt(System.console().readLine());

    do {
      n = Integer.parseInt(System.console().readLine());
      intentos++;
      if (secreto.comparaNum(n) == -1)
	System.out.println("Mi número es MAYOR");
      if (secreto.comparaNum(n) == 1)
	System.out.println("Mi número es MENOR");
    }
    while (secreto.comparaNum(n) != 0);

    System.out.println("Enhorabuena, ¡HAS ACERTADO!");
    System.out.println("Has necesitado " + intentos + " intentos");
  }
}






