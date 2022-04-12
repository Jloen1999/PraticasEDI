 class Cuadrado extends Rectangulo {

	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado) {
		super(lado, lado);
	}

	public Cuadrado(double lado, String color, boolean relleno) {
		super(lado, lado, color, relleno);
	}

	public void setAncho(double a) {
		super.setAncho(a);
		super.setAlto(a);
	}

	public void setAlto(double a) {
		super.setAncho(a);
		super.setAlto(a);
	}

	public String toString() {
		return "Soy un cuadrado de lado " + super.getAncho() + " y esta es mi superclase: " + super.toString();
	}
	
}
