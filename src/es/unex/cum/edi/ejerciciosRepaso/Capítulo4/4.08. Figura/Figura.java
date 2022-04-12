 /**
  * Clase Figura (figura geométrica genérica)
  */
public class Figura {

	private String color;
	private boolean relleno;

	/**
	 * Constructor sin parámetros.
	 * Inicializa el color a rojo y el atributo relleno a true.
	 */
	public Figura() {
	  color = "rojo";
	  relleno = true;
	}

	/**
	 * Constructor con parámetros.
	 *
	 * @param c El color de la figura.
	 * @param r Indica si la figura está rellena (true) o no (false).
	 */
	public Figura(String c, boolean r) {
		color = c;
		relleno = r;
	}

	/**
	 * Determina el color de la figura.
	 *
	 * @return El color de la figura.
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * Establece el color de la figura.
	 *
	 * @param c El color de la figura.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Determina si la figura está o no rellena.
	 *
	 * @return True si la figura está rellena, false en caso contrario.
	 */
	public boolean estaRelleno() {
		return relleno;
	}

	/**
	 * Cambia el valor del relleno de la figura.
	 *
	 * @param r True para que la figura pase a estar rellena, false para que no lo esté.
	 */
	public void setRelleno(boolean r) {
		relleno = f;
	}

	/**
	 * Devuelve una cadena descriptiva del objeto actual.
	 * {@inheritDoc}
	 * @return La cadena con la descripción del objeto.
	 */
	public String toString() {
		String s = "Soy una figura de color " + color + " y ";
		if (relleno) s = s + "estoy rellena";
		else s = s + "no estoy rellena";
		return s;
	}
 
}
