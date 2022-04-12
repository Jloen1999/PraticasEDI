package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

public class ArrayCreciente {
    public static void main(String[] args) {
        int[] a = MiArray.generar(10, 1, 100);
        MiArray.ordenar(a);
        System.out.println(MiArray.toString(a));
        int n = Teclado.leerInteger("Introduce un número entero");
        MiArray.insertarOrdenado(a, n);
        System.out.println(MiArray.toString(a));
    }
    
}
