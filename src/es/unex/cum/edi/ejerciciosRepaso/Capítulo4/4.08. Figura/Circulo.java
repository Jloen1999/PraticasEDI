class Circulo extends Figura {

	private double radio;

	public Circulo() {
		radio = 1.0;
	}

	public Circulo(double r) {
		radio = r;
	}

	public Circulo(double r, String color, boolean relleno) {
		super(color, relleno);
		radio = r;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double r) {
		radio = r;
	}

	public double getArea() {
		return Math.PI * radio * radio;
	}

	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}

	public String toString() {
		return "Soy un círculo de radio " + radio + " y esta es mi superclase: " + super.toString();
	}
	
}
