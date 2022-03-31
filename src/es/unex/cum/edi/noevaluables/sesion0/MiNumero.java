package es.unex.cum.edi.noevaluables.sesion0;

public class MiNumero {
    private int numero;
    public MiNumero(){
        numero=0;
    }
    public MiNumero(int num){
        this.numero=num;
    }
    public void setNumero(int num){
        this.numero=num;
    }
    public int getNumero(){
        return numero;
    }

    public void suma(int num2){
        System.out.println(numero+num2);
    }
    public void resta(int num2){
        System.out.println(numero-num2);
    }
    public int getDouble(){
        return numero*2;
    }
    public int getTriple(){
        return numero*3;
    }
    public int getCuadruple(){
        return numero*4;
    }

    @Override
    public String toString(){
       return "Numeros{" +
               " Doble: " +getDouble()+
               " Triple: " +getTriple()+
               " Cuadruple: "+getCuadruple()+
               "}" ;
    }
}
