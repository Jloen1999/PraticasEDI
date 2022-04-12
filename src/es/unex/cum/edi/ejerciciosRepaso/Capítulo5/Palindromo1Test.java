package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

public class PalindromoTest {

   public static void main(String[] args) {
      private Palindromo1 palindro1;
      private Palindromo1 palindro2;

      palindro1 = new Palindromo1();
      palindro1.leer();
      palindro1.mostrar();
      palindro1.quitarEspacios();
      palindro1.mostrar();
      palindro1.esPalindromo();

      palindro2 = new Palindromo2();
      palindro2.leer();
      palindro2.mostrar();
      palindro2.quitarEspacios();
      palindro2.mostrar();
      palindro2.esPalindromo();
   }

}
