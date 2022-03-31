package es.unex.cum.edi.evaluables.Newsesion5;

public class Sustantivo extends Palabra {
    private int numero;

    public Sustantivo() {
        super();
    }

    public Sustantivo(String texto,String pista, int numero) {
        super(texto, pista);
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
public int getNumero()
{
    return numero;
}
//    public String getNumero() {
//        String n = switch (numero) {
//            case 1 -> "singular";
//            case 2 -> "plural";
//            default -> "desconocido";
//        };
//        return n;
//    }

    public String toString() {
        return super.toString() + " Sustantivo[Numero=" + this.numero + "]";
    }


}
