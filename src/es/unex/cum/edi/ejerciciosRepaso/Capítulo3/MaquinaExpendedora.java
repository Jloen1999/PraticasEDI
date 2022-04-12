package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class MaquinaExpendedora {

  public int[] calcularMonedasDevueltas(double cantidad) {
  
      int[] devolucion = new int[10];
      double[] valores = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10};
      
      int i = 9;
      
      for (i = 9; i >= 0; i--) {
	devolucion[i] = (int)(cantidad / valores[i]);
	cantidad = cantidad - (devolucion[i] * valores[i]);
	i--;
      }	

      return devolucion;
      
      

  
  }
  
  
}
    
