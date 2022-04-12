package es.unex.cum.edi.noevaluables.sesion8Extra;

import java.util.Date;

/**
 * Estará formada por: MensajeEmoticono que hereda de Mensaje
 * 
 * @author alfon
 *
 */
public class MensajeEmoticono extends Mensaje {
	private String emoticono;

	public MensajeEmoticono() {
		super();
		emoticono = new String();
	}

	public MensajeEmoticono(Date fecha, String emoticono) {
		super(fecha);
		this.emoticono = emoticono;
	}

	public void setEmoticono(String emoticono) {
		this.emoticono = emoticono;
	}

	public String getEmoticono() {
		return emoticono;
	}

	public boolean equals(Object o) {
		MensajeEmoticono mEmoticono = (MensajeEmoticono) o;
		return super.equals(mEmoticono.emoticono);
	}

	public String toString() {
		return super.toString() + " Emoticono[emoticono = " + emoticono + "]";
	}
}
