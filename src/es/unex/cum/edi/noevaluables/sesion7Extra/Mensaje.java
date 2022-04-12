package es.unex.cum.edi.noevaluables.sesion7Extra;

import java.util.Date;

public class Mensaje {
	protected Date fecha;

	/**
	 * Constructor por Defecto
	 */
	public Mensaje() {
		fecha = new Date();
	}

	/**
	 * COnstructor Parametrizado
	 * 
	 * @param fecha
	 *            Recibe un valor de tipo fecha
	 */
	public Mensaje(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Modifica el valor de la fecha
	 * 
	 * @param fecha
	 *            Es un valor de tipo fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Recupera el valor de la fecha
	 * 
	 * @return fecha Devuelve el valor de la fecha
	 */
	public Date getFecha() {
		return this.fecha;
	}

	public boolean equals(Date fecha) {
		return (this.fecha.equals(fecha));
	}

	public String toString() {
		return ("[Mensaje fecha = " + this.fecha + "] ");
	}

}
