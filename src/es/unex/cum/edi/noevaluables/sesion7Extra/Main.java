package es.unex.cum.edi.noevaluables.sesion7Extra;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Contact c = new Contact("Alfonso Nguema Ela");
		c.addMensaje(new MensajeTexto(new Date(), "Hola"));
		c.addMensaje(new MensajeTexto(new Date(), "Adios"));
		c.addMensaje(new MensajeTexto(new Date(), "Buenos dias"));
		System.out.println(c.toString());

		for (int i = 0; i < c.getVector().size(); i++) {
			Mensaje m = (Mensaje) c.getVector().get(i);
			System.out.println(m + "\n");
		}

		Usuario u = new Usuario("ljarevalo", "pepe");
		u.addContact(new Contact("jm"));
		u.addContact(new Contact("adoming"));
		u.addContact(new Contact("urxli"));
		System.out.println(u.toString());

	}

}
