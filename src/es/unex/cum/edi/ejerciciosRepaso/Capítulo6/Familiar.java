package es.unex.cum.edi.ejerciciosRepaso.Capítulo6;

public class Familiar extends Contacto {
    String domicilio;
    
    Familiar(int id, String nombre, String ap1, String ap2, String domicilio) {
        super(id, nombre, ap1, ap2);
        this.domicilio = domicilio;
    }
    
    public String getDomicilio() { return domicilio; }
    
    public String toString() {
        return "FAMILIAR: " + super.toString() + " Domicilio: " + domicilio;
    }
}
