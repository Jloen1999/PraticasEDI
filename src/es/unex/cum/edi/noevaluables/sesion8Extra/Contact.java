package es.unex.cum.edi.noevaluables.sesion8Extra;

import java.util.Vector;

/**
 * Se deberá implementar los métodos habituales y con respecto al Vector, al ser
 * en definitiva una composición Naria, se deberá realizar la operación
 * addMensaje(Mensaje m).
 * 
 * @author alfon
 *
 */
public class Contact {

	private String id;
	private String name;
	private Vector<Mensaje> v;

	public Contact() {
		v = new Vector<Mensaje>();
		id = new String();
		name = new String();
	}

	public Contact(String id, String name) {
		this.id = id;
		this.name = name;
		v = new Vector<Mensaje>();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addMensaje(Mensaje m) {
		return v.add(m);
	}

	public boolean equals(Object o) {
		Contact c = (Contact) o;
		return id.equals(c.id) && v.equals(c.v) && name.equals(c.name);
	}

	public Vector<Mensaje> getVector() {
		return v;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Contact [identificador: " + id + ", nombre: "+name+"] ");
		// sb.append(v.toString());
		/*for (int i = 0; i < v.size(); i++) {
			Mensaje x = (Mensaje) v.get(i);
			sb.append(x + "\n");
			// System.out.print(x + " ");
		}*/
		return sb.toString();
	}
}
