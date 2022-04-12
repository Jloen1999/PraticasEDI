 /**
  * Clase TestFigura
  * Prueba la jerarquía de clases con raíz en Figura
  */
class TestFigura {

	public static void main(String[] args) {
	
		Figura fig1, fig2;
		Circulo circulo1, circulo2;
		Rectangulo rect1, rect2;
		Cuadrado cuadrado1, cuadrado2;

		// Creamos una figura con cada constructor y llamamos a toString()
		fig1 = new Figura();
		System.out.println(fig1.toString());

		circulo1 = new Circulo();
		System.out.println(circulo1.toString());

		rect1 = new Rectangle();
		System.out.println(rect1.toString());

		cuadrado1 = new Cuadrado();
		System.out.println(cuadrado1.toString());

		System.out.println("\n\n\n");

		// Probamos algunos métodos sobre los objetos anteriores y volvemos a llamar a toString()
  		// para comprobar que los atributos han cambiado como se esperaba
		fig1.setColor("white");
		System.out.println(fig1.toString());

		circulo1.setRadio(2.5);
		System.out.println("El área del círculo es " + circulo1.getArea());
		System.out.println(circulo1.toString());

		rect1.setAlto(3.0);
		System.out.println("El perímetro del rectángulo es " + rect1.getPerimetro());
		System.out.println(rect1.toString());

		cuadrado1.setAncho(5.1);
		System.out.println("La base del cuadrado es " + cuadrado1.getAlto() + " y su altura es " + cuadrado1.getAncho());
		System.out.println("El área del cuadrado es " + cuadrado1.getArea());
		System.out.println(cuadrado1.toString());

		System.out.println("\n\n\n");

		
		// Redoble de tambores.....
		// Probamos ahora algunas conversiones de tipo
		fig2 = (Shape)circulo1;
		//circulo2 = (circulo)fig1;  // **Error**
		circulo2 = (circulo)fig2;    // Esto no es un error (proque fig2 es en realidad un círculo)
		rect2 = (Rectangle)cuadrado1;
		cuadrado2 = (cuadrado)fig1;  // Y esto, ¿funcionará? ¿Qué crees?

		System.out.println(fig2.toString());
		System.out.println("Mi área es " + ((circulo)fig2).getArea());
		System.out.println("Mi color es " + fig2.getColor());
		System.out.println(circulo2.toString());
		System.out.println(rect2.toString());
		System.out.println(cuadrado2.toString());
	
		 
	}	
}
