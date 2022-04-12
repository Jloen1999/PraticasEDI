package es.unex.cum.edi.noevaluables.sesion8Extra;

import es.unex.cum.edi.evaluables.sesion5.Teclado;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
	// private Collection l;
	private List l;
	Teclado t = new Teclado();

	public Main() {
		l = new ArrayList();
	}

	public void fill() {
		Integer valor;
		Random rand = new Random();
		System.out.print("Añadiendo los valores: ");
		for (int i = 0; i < 10; i++) {
			valor = (rand.nextInt(100));
			System.out.print(valor.toString() + " ");
			l.add(valor);
		}
		System.out.println();
	}

	public void showCollection() {
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Integer x = (Integer) it.next(); // Always upcasting
			System.out.println(x);
		}
	}

	public int sum() {
		int suma = 0;
		Iterator it = l.iterator();
		while (it.hasNext()) {
			suma = suma + Integer.parseInt(it.next().toString());
		}
		return suma;
	}

	public void showMayor() {
		int mayor=0;
		Iterator it= l.iterator();
		while(it.hasNext()){
			Integer x=(Integer) it.next();
			if(mayor<x){
				mayor=x;
			}
		}
		System.out.println(mayor);
	}

	// Ejercicios
	// 1 Mostrar los numeros impares almacenados en la coleccion
	public void showStored() {
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Integer x = (Integer) it.next(); // Always upcasting
			if (x % 2 != 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
	}

	public void showPares()
	{
		int cont=0;
		Iterator it = l.iterator();
		while(it.hasNext()){
			Integer x=(Integer) it.next();
			if(x%2==0){
				cont=cont+1;
			}

		}
		System.out.println(cont);
	}

	// 2 Dado un valor entero compruebe si está en la lista
	public void showValue(int n) {
		boolean f;
		f = false;
		Iterator it = l.iterator();
		while (it.hasNext() && !f) {
			Integer x = (Integer) it.next(); // Always upcasting
			if (x == n && !f) {
				f = true;
				System.out.print(n + " SÍ está en la lista \n");
			}
		}
		if (!f) {
			System.out.println(n + " NO está en la lista \n");
		}
	}

	// 3 Compruebe si se produce algún valor de datos más de una vez
	public void moreValue() {
		int cont;
		for (int i = 0; i < (l.size() - 1); i++) {
			Integer x = (Integer) l.get(i); // Always upcasting
			cont = 1;
			for (int j = (i + 1); j < l.size(); j++) {
				Integer aux = (Integer) l.get(j);
				if (x.equals(aux)) {
					cont++;
				}
			}
			if (cont > 1) {
				System.out.println(x + " " + cont + " veces");
			}
		}
	}

	// ----------------------------------------------------------------------------------------------------------------------------------

	public void fillSet() {
		Integer valor;
		Random rand = new Random();
		System.out.print("Añadiendo los valores: ");
		for (int i = 0; i < 10; i++) {
			valor = (rand.nextInt(100));
			System.out.print(valor.toString() + " ");
			l.set(i, valor);
		}
		System.out.println();
	}

	public void showCollectionGet() {
		Integer x;
		for (int i = 0; i < l.size(); i++) {
			x = (Integer) l.get(i);
			System.out.print(x + " ");
		}
	}

	public boolean find(int x) {
		Integer y;
		boolean enc = false;
		Iterator it = l.iterator();
		while (it.hasNext() & (!enc)) {
			y = (Integer) it.next();
			if (y == x)
				enc = true;
		}
		return enc;
	}

	// -------------------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) throws IOException {
		Main m = new Main();
		// System.out.println("Llenando la lista");
		m.fill();

		m.showCollection();
		System.out.println("\nLa suma: " + m.sum());
		System.out.print("\nLos números impares de la colección son: ");
		m.showStored();
		System.out.print("\nLos números pares de la colección son: ");
		m.showPares();
		System.out.print("El numero mayor es: ");
        m.showMayor();
		int n = m.t.literalConEntero("\nIntroduce el número a buscar: ");
		m.showValue(n);
		m.moreValue();

		System.out.println("\n");
		m.fillSet();
		System.out.print("\nLos números de la lista son: ");
		m.showCollectionGet();


	}
}
