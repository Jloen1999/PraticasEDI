package unex.cum.edi.sesion5;

import java.io.IOException;

public class Main {
    private Ahorcado a;
    private Teclado t= new Teclado();

    public static void main(String []args) throws IOException{
        Main s4= new Main();
        s4.inicializarAhorcado();
        s4.rellenar();
        s4.mostrar();
    }

    private void inicializarAhorcado() throws IOException{
        a=new Ahorcado(5,6);
    }
    private void mostrar() throws IOException{
        System.out.println("Ahorcado "+a.toString());

        System.out.println(a.seleccionada.toString());

        for(int i=0;i<a.lista.length;i++){
            System.out.println(a.lista[i].toString());
        }

        int lon=0;
        for(int i=0;i<a.lista.length;i++){
            lon=lon+a.lista[i].getLongitud();
        }
        System.out.println("Longitud Total: "+lon);

        for(int i=0;i<a.lista.length;i++){
            if(a.lista[i].getClass().getSimpleName().equals("Verbo")){
                Verbo v = (Verbo)a.lista[i];
                System.out.println("Verbo[Conjugacion: "+v.getConjugacion()+"]");
            }
            else if(a.lista[i].getClass().getSimpleName().equals("Sustantivo")){
                Sustantivo s=(Sustantivo)a.lista[i];
                System.out.println("Sustantivo[Numero: "+s.getNumero()+"]");
            }
            else{
                Adjetivo ad=(Adjetivo)a.lista[i];
                System.out.println("Adjetivo[Genero: "+ad.getGenero()+"]");
            }
        }
    }
    public void rellenar() throws IOException {
        for(int i=0;i<a.lista.length;i++)
        {
            int tipo=t.leerEntero();

            if(tipo==1){
                a.addPalabra(new Sustantivo(t.leerLinea(),t.leerLinea(),t.leerEntero()));
            }
            else if(tipo==2){
                a.addPalabra(new Verbo(t.leerLinea(),t.leerLinea(),t.leerEntero()));
            }
            else if(tipo==3){
                a.addPalabra(new Adjetivo(t.leerLinea(),t.leerLinea(),t.leerEntero()));
            }
        }
        int i=t.leerEntero();;
        a.setSeleccionada(a.lista[i]);
    }
}