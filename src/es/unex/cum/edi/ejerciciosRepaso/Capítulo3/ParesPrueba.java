package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class ParesPrueba {

  public static void main(String[] args) {
    Pares pares = new Pares();
    int n1 = pares.leerNumero();
    int n2 = pares.leerNumero();
    pares.mostrarPares(n1, n2);
  }
  
}