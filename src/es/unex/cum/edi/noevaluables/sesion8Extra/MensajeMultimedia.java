package es.unex.cum.edi.noevaluables.sesion8Extra;

import java.util.Date;

/**
 * Estará formada por: MensajeMultimedia que hereda de Mensaje
 * 
 * @author alfon
 *
 */
public class MensajeMultimedia extends Mensaje {
	private String pathMultim;

	public MensajeMultimedia() {
		super();
		pathMultim = new String();
	}

	public MensajeMultimedia(Date fecha, String pathMultim) {
		super(fecha);
		this.pathMultim = pathMultim;
	}

	public void setPathMultim(String pathMultim) {
		this.pathMultim = pathMultim;
	}

	public String getPathMultim() {
		return pathMultim;
	}

	public boolean equals(Object o) {
		MensajeMultimedia mMultim = (MensajeMultimedia) o;
		return super.equals(o) && this.pathMultim.equals(mMultim.pathMultim);
	}

	public String toString() {
		return super.toString() + " Multimedia[path multimedia = " + pathMultim + "]";
	}
}
