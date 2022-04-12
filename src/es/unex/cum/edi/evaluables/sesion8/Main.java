package es.unex.cum.edi.evaluables.sesion8;

import java.util.*;

public class Main {
    private Collection l;

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Llenando la lista");
        m.fill();
        System.out.println("Lista con datos");
        m.showCollection();
        System.out.println(m.sum());
    }

    public Main() {
        l = new ArrayList();
    }

    public void fill() {
        Random rand = new Random();
        System.out.print("Añadiendo los valores: ");
        for (int i = 0; i < 10; i++) {
            Integer valor = (rand.nextInt(100));
            l.add(valor);
        }
    }

    public void
    showCollection() {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Integer x = (Integer) it.next(); // Always upcasting
            System.out.print(x.toString() + " ");
        }
        System.out.println();
    }

    public int sum() {
        int suma = 0;
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Integer aux = (Integer) it.next();
            suma = suma + aux;
        }
        return suma;
    }

}