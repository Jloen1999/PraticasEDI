package es.unex.cum.edi.noevaluables.sesion1;

public class HolaMundo{
    String saludo;
    public HolaMundo(){
        saludo="Hola Mundoooo";
        System.out.println(mostrarSaludo(saludo));
    }
    public String mostrarSaludo(String saludo){
        return saludo;
    }
    
    public static void main(String[] args){
        new HolaMundo();
    }
}