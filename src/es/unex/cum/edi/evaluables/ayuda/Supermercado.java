package es.unex.cum.edi.evaluables.ayuda;

import es.unex.cum.edi.evaluables.sesion2.Libro;

public class Supermercado {
    protected String alimentos;
    protected String pLimpieza;
    protected int numProductos;

    public Supermercado(String alimentos, String pLimpieza, int numProductos) {
        this.alimentos = alimentos;
        this.pLimpieza = pLimpieza;
        this.numProductos = numProductos;
    }
    public Supermercado(){
        alimentos=new String();
        pLimpieza="escoba";
        numProductos=0;
    }

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }

    public String getpLimpieza() {
        return pLimpieza;
    }

    public void setpLimpieza(String pLimpieza) {
        this.pLimpieza = pLimpieza;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    @Override
    public String toString() {
        return "[" +getAlimentos()+','+getpLimpieza()+','+getNumProductos()+"]";
    }
    @Override
    public boolean equals(Object o){
        Supermercado sup=(Supermercado) o;
        return this.getpLimpieza().equals(sup.pLimpieza) && this.getAlimentos().equals(sup.alimentos) && numProductos==sup.numProductos;
    }


}
