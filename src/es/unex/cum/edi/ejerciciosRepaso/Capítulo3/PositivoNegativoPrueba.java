package es.unex.cum.edi.ejerciciosRepaso.Cap�tulo3;

import es.unex.cum.edi.ejerciciosRepaso.Cap�tulo3.PositivoNegativo;

class PositivoNegativoPrueba {

  public static void main(String[] args) {
    PositivoNegativo posneg = new PositivoNegativo();
    int n = posneg.leerPorTeclado();
    posneg.comprobarNumero(n);
  }
  
}