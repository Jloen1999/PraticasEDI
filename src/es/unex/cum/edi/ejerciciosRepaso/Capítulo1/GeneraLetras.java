package es.unex.cum.edi.ejerciciosRepaso.Cap�tulo1;

public class GeneraLetras {
  
  public static char getLetra() {
    char caracterAleatorio;
    caracterAleatorio = (char) (Math.random()*26 + 'A');
    return caracterAleatorio;
  }

  public static void main(String[] args) {
    char c;
    System.out.println(getLetra());
    System.out.println(getLetra());
    System.out.println(getLetra());
    System.out.println(getLetra());
    System.out.println(getLetra());
  }
}
