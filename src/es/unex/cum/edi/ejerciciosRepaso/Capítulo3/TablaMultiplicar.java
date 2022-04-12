package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Tabla de multiplicar de un número N

public class TablaMultiplicar {

    private int n;    

    public void setNumero(int num) { n = num; }

    public int getNumero() { return n; }

    public void showTable() {
       for (int i = 1; i <= 10; i++) {
          System.out.println(n + " x " + i + " = " + n*i);
       }
    }
}
