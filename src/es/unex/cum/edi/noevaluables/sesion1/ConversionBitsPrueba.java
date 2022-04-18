package es.unex.cum.edi.noevaluables.sesion1;

import es.unex.cum.edi.repaso.Teclado;

import java.io.IOException;

public class ConversionBitsPrueba {
    private static ConversionBits ex=new ConversionBits();
    private static Teclado t=new Teclado();
    public static void main(String[] args) throws IOException{
        ex=new ConversionBits(23,"Gbit");
        ex.setUnidad(ex.getUnidad());
        System.out.println(ex.getUnidad());
        ex.getBit(ex.getCantidad());
        System.out.println(ex.getCantidad());
        System.out.println("Convertir de Megabites: "+(ex.getMegaBit(2))+" "+ex.getUnidad());
    }
}