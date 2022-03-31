package es.unex.cum.edi.evaluables.sesion5;

public class Verbo extends Palabra{
    private int conjugacion;
    public Verbo(){
        super();
    }
    public Verbo(Palabra p, int conjugacion){
        super(p.texto, p.pista);
        this.conjugacion=conjugacion;
    }
    public void setConjugacion(int conjugacion)
    {
        this.conjugacion=conjugacion;
    }

    public int getConjugacion(){
        return conjugacion;
    }

//    public String getConjugacion()
//    {
//        String n = switch (conjugacion) {
//            case 1 -> "Primera";
//            case 2 -> "Segunda";
//            case 3 -> "Tercera";
//            default -> "Desconocido";
//        };
//        return n;
//    }
    public String toString()
    {
        return super.toString()+" Verbo[Conjugacion="+getConjugacion()+"]";
    }
}
