public class Palabra{
    protected String texto;
    protected String pista;
    protected int longitud;

    public Palabra(){
        texto=new String();
        pista=new String();
        longitud=0;
    }
    public Palabra(String t,String p){
        texto=t;
        pista=p;
        longitud=texto.length();
    }
    

}