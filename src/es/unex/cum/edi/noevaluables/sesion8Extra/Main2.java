package es.unex.cum.edi.noevaluables.sesion8Extra;

public class Main2 {

	public static void main(String[] args) {

		Usuario u = new Usuario("aelanang", "pepe");
		System.out.println(u.toString() + " \n");

		Contact c = new Contact("adiaz", "Antonio Diaz");
		// add de un contacto
		u.addContact(c);
		u.addContact(new Contact("an", "Alfonso Nguema"));

		// add de un id con pass
		u.addContact("adoming", "Aurora");
		u.addContact("irxil", "Úrsula");
		// ¿Qué sucede?
		u.addContact(new Contact("jm", "Jose Manuel"));

		// Listar contacto
		System.out.println("---------LISTADO DE CONTACTOS-------");
		u.listarContactos();

		// llamada a getContact con id
		System.out.print("\n El contacto con el id (jm) es: ");
		c = u.getContactId("jm");
		System.out.println(c.toString());

		// llamada a getConatactName con name
		System.out.print("\n El contacto con el nombre (Jose Manuel) es: ");
		c = u.getContactName("Jose Manuel");
		System.out.println(c.toString());

	}

}
