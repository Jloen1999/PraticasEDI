package es.unex.cum.edi.evaluables.ayuda;
public class Procesador{

    private String marca;
    private String tipo;
    private int capacidad;

    public Procesador(){

        marca= new String();
        tipo= new String();
        capacidad=0;

    }
    public Procesador(String marca,String tipo,int capacidad){

        this.marca=marca;
        this.tipo=tipo;
        this.capacidad=capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String toString(){
        return "["+marca+","+tipo+","+capacidad+"]";
    }

    public boolean equals(Object obj){
        Procesador p1=(Procesador)obj;
        return(this.marca.equals(p1.marca)&& this.tipo.equals(p1.tipo)&& capacidad==p1.capacidad);

    }

}