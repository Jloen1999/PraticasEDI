package es.unex.cum.edi.ejerciciosRepaso.Capítulo4;

class Perro extends Animal
{
    private String raza;
    
    public Perro(String n, int e, String r) {
      super(n, e);
      raza = r;
    }
    
    public int getRaza() { return raza; }
    public void setRaza(String r) { raza = r; }
    public String toString() {
      return "Hola, soy un PERRO, me llamo " + nombre + ", tengo " + edad + " años y soy un " + raza;
    }
      
}
