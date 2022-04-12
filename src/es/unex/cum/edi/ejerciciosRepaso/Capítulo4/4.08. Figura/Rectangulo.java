
class Rectangulo extends Figura {

	private double ancho;
	private double alto;

	public Rectangulo() {
		ancho = 1.0;
		alto = 1.0;
	}

	public Rectangulo(double an, double al) {
		ancho = an;
		alto = al;
	}

	public Rectangulo(double an, double al, String color, boolean relleno) {
		super(color, relleno);
		ancho = an;
		alto = al;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double an) {
		ancho = an;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double al) {
		alto = al;
	}


	public double getArea() {
		return ancho * alto;
	}

	public double getPerimetro() {
		return 2 * ancho + 2 * alto;
	}

	public String toString() {
		return "Soy un rectángulo de base " + ancho + " y altura " + alto + " y esta es mi superclase: " + super.toString();
	}
	
}
