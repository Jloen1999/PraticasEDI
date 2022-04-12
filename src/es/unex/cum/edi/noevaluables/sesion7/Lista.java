package es.unex.cum.edi.noevaluables.sesion7;

import java.util.Iterator;

public class Lista {

    Nodo inicio;
    Nodo actual;
    int _nelementos = 0;
    public Lista() {
        inicio = null;
        actual = null;
    }

    public boolean isEmpty() {
        return (inicio == null);
    }

    public boolean addFirst(Object info) {
        Nodo nuevo = new Nodo(info, inicio);
        inicio = nuevo;
        _nelementos += 1;
        return true;
    }

    public int size(){
        return _nelementos;
    }
    public void iterator() { actual = inicio;
    }

    public boolean hasNext() {return (actual != null); }    

    public Object next() {
        if (actual==null) return null;
        Object o = actual.getData();
        actual = actual.getEnlace();
        return o;
    } 
}
