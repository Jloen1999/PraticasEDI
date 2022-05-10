package es.unex.cum.edi.evaluables.sesion9;
import java.util.*;

public class MainList {
    private List l;

    public static void main(String[] args) {
        MainList m = new MainList();
        System.out.println("Llenando la lista");
        m.fill();
        System.out.println("Lista con datos");
        m.showCollection();
        //Suma
        System.out.println(m.sum());
        //Impartes
        System.out.println(m.odd());
        //Buscar
        Random rand = new Random();
        if (m.find(rand.nextInt(100)))
            System.out.println("Encontrado");
        else System.out.println("No Encontrado");
    }

    public MainList() {
        l = new ArrayList();
    }

    public void fill() {
        Random rand = new Random();
        System.out.print("Añadiendo los valores: ");
        for (int i = 0; i < 10; i++) {
            Integer valor = new Integer(rand.nextInt(100));
            l.add(valor);
        }
    } 

    public void showCollection() {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Integer x= (Integer) it.next(); //Always upcasting
            System.out.print(x.toString()+" ");
        }   
        System.out.println();
    }

    public int sum() {
        int suma = 0;
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Integer aux=(Integer) it.next();
            suma = suma + aux;
        }
        return suma;
    }

    public int odd() {
        int suma = 0;
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Integer aux=(Integer) it.next();
            if (aux % 2 ==1)
                suma = suma + 1;
        }
        return suma;
    }
    public boolean find(Integer value) {
        int suma = 0;
        boolean enc=false;
        Iterator it = l.iterator();
        while (it.hasNext() && !enc) {
            Integer aux=(Integer) it.next();
            if (aux.equals(value)){
                enc=true;
            }
        }
        return enc;
    }
}