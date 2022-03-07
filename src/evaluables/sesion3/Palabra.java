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
    public void setTexto(String texto){
        this.texto=texto;
    }
    public void setPista(String pista){
        this.pista=pista;
    }
    public void setLongitud(){
        this.longitud=texto.length();
    }
    public String getTexto(){
        return texto;
    }
    public String getPista(){
        return pista;
    }
    public int getLongitud(){
        return longitud;
    }

    

}