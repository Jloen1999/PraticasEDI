package es.unex.cum.edi.noevaluables.sesion8Extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Se deberá implementar los métodos habituales y con respecto a la Lista, al
 * ser en definitiva una composición Naria, se deberá realizar la operación
 * addContact(Contact c) .
 * 
 * @author alfon
 *
 */
public class Usuario {
	private String id;
	private String password;
	private List<Contact> l;

	public Usuario() {
		id = new String();
		password = new String();
		l = new ArrayList<Contact>();
	}

	public Usuario(String id, String pass) {
		this.id = id;
		password = pass;
		l = new ArrayList<Contact>();
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
		return l.add(c);
	}

	public void addContact(String id, String name) {
		Contact c = new Contact(id, name);
		l.add(c);

	}

	public List<Contact> getVector() {
		return l;
	}

	public boolean equals(Object o) {
		Usuario u = (Usuario) o;
		return id.equals(u.id) && password.equals(u.password) && l.equals(u.l);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Usuario [identificador: " + id + ", password: " + password + "]");
		// sb.append(v.toString());
		/*
		 * for (int i = 0; i < l.size(); i++) { Mensaje x = (Mensaje) l.get(i);
		 * sb.append(x + "\n"); // System.out.print(x + " "); }
		 */
		return sb.toString();
	}

	public void listarContactos() {
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Contact x = (Contact) it.next(); // Always upcasting
			System.out.println("Identificador: " + x.getId() + ", Nombre: " + x.getName());
		}
	}

	public Contact  getContactId(String id) {
		boolean enc = false;
		Contact c = new Contact();
		Iterator it = l.iterator();
		while (it.hasNext() && !enc) {
			Contact x = (Contact) it.next(); // Always upcasting
			if (x.getId().equals(id)) {
				enc = true;
				c = x;
			}
		}
		return c;
	}

	public Contact getContactName(String name) {
		boolean enc = false;
		Contact c = new Contact();
		Iterator it = l.iterator();
		while (it.hasNext() && !enc) {
			Contact x = (Contact) it.next(); // Always upcasting
			if (x.getName().equals(name)) {
				enc = true;
				c = x;
			}
		}
		return c;
	}
}
