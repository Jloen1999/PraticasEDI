package es.unex.cum.edi.noevaluables.sesion8Extra;

import java.util.Date;

/**
 * Estará formada por: MensajeTexto que hereda de Mensaje
 * 
 * @author alfon
 *
 */
public class MensajeTexto extends Mensaje {
	private String texto;

	public MensajeTexto() {
		super();
		texto = new String();
	}

	public MensajeTexto(Date fecha, String texto) {
		super(fecha);
		this.texto = texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public boolean equals(Object o) {
		MensajeTexto mTexto = (MensajeTexto) o;
		return super.equals(o) && this.texto.equals(mTexto.texto);
	}

	public String toString() {
		return super.toString() + " Texto[texto = " + texto + "]";
	}

}
