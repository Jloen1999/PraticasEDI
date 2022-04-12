package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class MaquinaExpendedoraPrueba {
  public static void main(String[] args) {
    MaquinaExpendedora m = new MaquinaExpendedora();
    int[] devolucion = m.calcularMonedasDevueltas(14.45);
    
    for (int i = 9; i >= 0; i--) {
      System.out.println(devolucion[i]);
    }
  
  }
}