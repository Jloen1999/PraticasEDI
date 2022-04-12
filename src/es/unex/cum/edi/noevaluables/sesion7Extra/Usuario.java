package es.unex.cum.edi.noevaluables.sesion7Extra;

import java.util.Vector;

/**
 * Se deberá implementar los métodos habituales y con respecto al Vector, al ser
 * en definitiva una composición Naria, se deberá realizar la operación
 * addContact(Contact c) .
 * 
 * @author alfon
 *
 */
public class Usuario {
	private String id;
	private String password;
	private Vector v;

	public Usuario() {
		id = new String();
		password = new String();
		v = new Vector<Contact>();
	}

	public Usuario(String id, String pass) {
		this.id = id;
		password = pass;
		v = new Vector<Contact>();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public String getPassword() {
		return password;
	}

	public boolean addContact(Contact c) {
		return v.add(c);
	}

	public Vector getVector() {
		return v;
	}

	public boolean equals(Object o) {
		Usuario u = (Usuario) o;
		return id.equals(u.id) && password.equals(u.password) && v.equals(u.v);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Usuario [identificador = " + id + ", password = " + password + " ");
		// sb.append(v.toString());
		for (int i = 0; i < v.size(); i++) {
			Contact c = (Contact) v.get(i);
			sb.append(c + "\n");
			// System.out.print(x + " ");
		}
		return sb.toString();
	}

}
