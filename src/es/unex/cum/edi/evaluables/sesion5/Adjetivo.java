package es.unex.cum.edi.evaluables.sesion5;

public class Adjetivo extends Palabra{
    private int genero;
    public Adjetivo(){
        super();
    }
    public Adjetivo(Palabra p, int genero){
        super(p.texto, p.pista);
        this.genero=genero;
    }
    public void setGenero(int genero)
    {
        this.genero=genero;
    }
    public int getGenero()
    {
        return genero;
    }
//    public String getGenero()
//    {
//        String n = switch (genero) {
//            case 1 -> "masculino";
//            case 2 -> "femenino";
//            case 3 -> "neutro";
//            default -> "desconocido";
//        };
//        return n;
//    }
    public String toString()
    {
        return super.toString()+" Adjetivo[Genero="+getGenero()+"]";
    }
}
