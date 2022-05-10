package es.unex.cum.edi.evaluables.sesion9;

public class Nodo {
    protected Object data;
    protected Nodo enlace; 
    public Nodo() { // Constructor por defecto
        this.data= null;
        this.enlace= null;
    }

    public Nodo(Object inf, Nodo enlace) { 
        this.data = inf;
        this.enlace= enlace;
    }

    public void setEnlace(Nodo n)   // Enlazar con el siguiente nodo
    {  this.enlace = n;}  

    public Nodo getEnlace() // Devuelve el apuntador al sig. nodo
    {  return this.enlace; }

    public void setData(Object e) // Carga el nodo con información
    {  this.data= e; }  

    public Object getData() // Devuelve la información
    {  return this.data;}
}