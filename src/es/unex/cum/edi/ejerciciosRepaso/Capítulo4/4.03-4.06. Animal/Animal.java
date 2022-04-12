class Animal
{
    protected String nombre;
    protected int edad;
    protected static int numAnimales = 0;
    
    // Constructor sin parámetros
    public Animal() {
      nombre = "Desconocido";
      edad = 0;
      numAnimales++;
    }
    
    // Constructor con parámetros
    public Animal(String n, int e) {
      nombre = n;
      edad = e;
      numAnimales++;
    }
    
    // Constructor copia
    public Animal(Animal a) {
      this.nombre = a.getNombre();
      this.edad = a.getEdad();
      numAnimales++;
    }
    
    public void setEdad(int e) {
      edad = e;
    }
    
    public int getEdad() {
      return edad;
    }
    
    public void setNombre(String n) {
      nombre = n;
    }
    
    public String getNombre() {
      return nombre;
    }

    public String toString() {
      return "Hay " + this.numAnimales + " animales creados. Me llamo " + this.nombre + " y tengo " + this.edad + " años";
    }
    

    public Animal clone() {
      Animal a = new Animal(this.nombre, this.edad);
      return a;
    }
    
    public boolean equals(Animal a) {
      
       boolean result;
       
       if (a.getEdad() == this.edad && this.nombre.equals(a.getNombre()))
 	result = true;
       else
 	result = false;
 	
       return result;
       // Un programador/a experimentado resumiría lo anterior así:
       // return (a.getEdad() == this.edad && this.nombre.equals(a.getNombre()));
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

}
