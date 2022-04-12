package es.unex.cum.edi.ejerciciosRepaso.Capítulo4;

class Gato extends Animal
{
    private int numVidas = 7;
    
    public Gato(String n, int e) {
      super(n, e);
    }
    
    public int getVidas() { return numVidas; }
    public void quitaVida() { numVidas--; }
    public String toString() {
      return "Hola, soy un GATO, me llamo " + nombre + ", tengo " + edad + " años y me quedan " + numVidas + " vidas";
    }
      
}
