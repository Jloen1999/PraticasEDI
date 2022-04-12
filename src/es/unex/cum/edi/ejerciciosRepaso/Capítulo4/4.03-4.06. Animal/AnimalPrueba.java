public class AnimalPrueba
{
    public static void main(String[] args) 
    {
	// Vamos a crear 5 animales para probar la clase Animal
	Animal a1 = new Animal("Bobby", 4);	// A a1 le asignamos un nombre y una edad
	Animal a2 = new Animal("Rocky", 3);	// A a2 también
	Animal a3;
	Animal a4;
	Animal a5;
	
	System.out.println(a1.toString());
	System.out.println(a2.toString());
	if (a1.equals(a2)) {
	  System.out.println("Los animales a1 y a2 tienen los mismos valores");
	}
	else {
	  System.out.println("Los animales a1 y a2 tienen diferentes valores");
	}
	
	// El animal a3 lo crearemos clonando el animal a1. El resultado será un animal
	// diferente de a1 pero con los mismos valores en los atributos
	a3 = a1.clone();
	System.out.println(a1.toString());
	System.out.println(a3.toString());
	if (a1.equals(a3)) {
	  System.out.println("Los animales a1 y a3 tienen los mismos valores");
	}
	else {
	  System.out.println("Los animales a1 y a3 tienen diferentes valores");
	}
	
	// El animal a4 lo crearemos asignándole el animal a1. El resultado será un animal
	// idéntico a a1 (ambas variables referenciarán al mismo objeto)
	a4 = a1;
	System.out.println(a1.toString());
	System.out.println(a4.toString());
	if (a1.equals(a4)) {
	  System.out.println("Los animales a1 y a4 tienen los mismos valores");
	}
	else {
	  System.out.println("Los animales a1 y a4 tienen diferentes valores");
	}
	

	// El animal a5 lo crearemos copiando el animal a1 con el constructor copia. 
	// El resultado será un animal diferente de a1 pero con los mismos valores en los atributos
	a5 = new Animal(a1);
	System.out.println(a1.toString());
	System.out.println(a5.toString());
	if (a1.equals(a5)) {
	  System.out.println("Los animales a1 y a5 tienen los mismos valores");
	}
	else {
	  System.out.println("Los animales a1 y a5 tienen diferentes valores");
	}
	
    }
}
